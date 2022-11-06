using Application.DAOInterfaces;
using Grpc.Core;
using Grpc.Net.Client;
using Shared.Dtos;
using Shared.models;

namespace GrpcClient.DAOServices;

public class FoodPostService : IFoodPostDao
{
    private static GrpcChannel channel = GrpcChannel.ForAddress("http://localhost:7171", new GrpcChannelOptions
    {
        UnsafeUseInsecureChannelCallCredentials = true
    });
    
    private static RightOversService.RightOversServiceClient client = new(channel);
    
    public async Task<FoodPostCreatedDto> CreateAsync(FoodPostCreationDto dto)
    {
        FoodPostCreatedResponse response =  await client.saveFoodPostAsync(new FoodPostRequest
        {
            Title = dto.title,
            Description = dto.description,
            DaysLeftToEat = dto.daysLeftToEat,
            CreatorUserName = dto.creatorUsername,
            Category = dto.creatorUsername,
            PictureUrl = dto.pictureUrl
        });
        FoodPostCreatedDto createdDto = new FoodPostCreatedDto
        {
         created   = response.Created,
         idInDB = response.IdInDB
        };
        return createdDto;
    }

    public async Task<IEnumerable<OverSimpleFoodPostDto>> GetAsync()
    {
        // Missing an await, but where?
        List<OverSimpleFoodPostDto> listHolder = new List<OverSimpleFoodPostDto>();
        AsyncServerStreamingCall<GetAllResponse> response = client.getAllFoodPosts(new GetAllRequest{
            Filler = true
        });
        // Because it is a stream, lets make a Dto for the current one we are on
        await foreach (var message in response.ResponseStream.ReadAllAsync())
        {
            if (message.Category != null && message.Title != null)
            {
                OverSimpleFoodPostDto simpleFoodPostDto = new OverSimpleFoodPostDto{
                    Title = message.Title,
                    Category = message.Category
                };
                listHolder.Add(simpleFoodPostDto);
                Console.WriteLine("I found a post: " + simpleFoodPostDto.Title + " : " + simpleFoodPostDto.Category);
            }
        }
        return listHolder;
    }
}