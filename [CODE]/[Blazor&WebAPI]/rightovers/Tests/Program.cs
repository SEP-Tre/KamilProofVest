// See https://aka.ms/new-console-template for more information

using GrpcClient.DAOServices;
using Shared.Dtos;

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
Console.Write(createdDto.ToString());