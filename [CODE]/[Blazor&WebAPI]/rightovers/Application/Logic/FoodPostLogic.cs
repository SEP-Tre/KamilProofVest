using Application.DAOInterfaces;
using Application.LogicInterfaces;
using Shared.Dtos;

namespace Application.Logic;

public class FoodPostLogic : IFoodPostLogic
{
    private readonly IFoodPostDao foodPostDaoService;

    public FoodPostLogic(IFoodPostDao foodPostDaoService)
    {
        this.foodPostDaoService = foodPostDaoService;
    }

    public async Task<FoodPostCreatedDto> CreateAsync(FoodPostCreationDto dto)
    {
        FoodPostCreatedDto createdDto = await foodPostDaoService.CreateAsync(dto);
        Console.Write(createdDto.ToString());
        return createdDto;
    }
}