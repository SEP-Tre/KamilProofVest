using Shared.Dtos;

namespace Application.LogicInterfaces;

public interface IFoodPostLogic
{
    Task<FoodPostCreatedDto> CreateAsync(FoodPostCreationDto dto);
}