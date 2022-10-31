using Shared.Dtos;

namespace Application.DAOInterfaces;

public interface IFoodPostDao
{
    public Task<FoodPostCreatedDto> CreateAsync(FoodPostCreationDto dto);
}