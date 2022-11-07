using Shared.Dtos;

namespace HttpClients.ClientInterfaces;

public interface IFoodPostWebService
{
    Task<FoodPostCreatedDto> CreateAsync(FoodPostCreationDto dto);
    Task<ICollection<OverSimpleFoodPostDto>> GetAsync();
}