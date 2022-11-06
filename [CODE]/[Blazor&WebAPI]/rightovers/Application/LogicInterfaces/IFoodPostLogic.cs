using Shared.Dtos;
using Shared.models;

namespace Application.LogicInterfaces;

public interface IFoodPostLogic
{
    Task<FoodPostCreatedDto> CreateAsync(FoodPostCreationDto dto);
    Task<IEnumerable<OverSimpleFoodPostDto>> GetAsync();
}