using Shared.Dtos;
using Shared.models;

namespace Application.DAOInterfaces;

public interface IFoodPostDao
{
    public Task<FoodPostCreatedDto> CreateAsync(FoodPostCreationDto dto);
    public Task<IEnumerable<OverSimpleFoodPostDto>> GetAsync();
}