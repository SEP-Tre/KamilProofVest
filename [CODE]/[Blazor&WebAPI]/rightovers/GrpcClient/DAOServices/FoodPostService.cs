using Application.DAOInterfaces;
using Grpc.Net.Client;
using Shared.Dtos;

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
}