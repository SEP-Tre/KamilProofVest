using System.Security.AccessControl;
using GrpcClient.DAOServices;
using Shared.Dtos;

namespace GrpcClient;

public class Program
{
    public static async void Main(string[] args)
    {
        FoodPostService service = new FoodPostService();
        FoodPostCreationDto dto = new FoodPostCreationDto
        {
            title = "Chicken taki masali",
            description = "mmm yummy made by kamilo",
            daysLeftToEat = "3",
            creatorUsername = "Kamilo11",
            category = "chicken, indian",
            pictureUrl = ""
        };
        FoodPostCreatedDto createdDto = await service.CreateAsync(dto);
        Console.Write(createdDto);
    }
}