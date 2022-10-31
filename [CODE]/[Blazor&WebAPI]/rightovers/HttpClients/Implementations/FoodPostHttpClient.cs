using System.Net.Http.Json;
using System.Text.Json;
using HttpClients.ClientInterfaces;
using Shared.Dtos;

namespace HttpClients.Implementations;

public class FoodPostHttpClient : IFoodPostWebService
{
    private readonly HttpClient client;

    public FoodPostHttpClient(HttpClient client)
    {
        this.client = client;
    }
    public async Task<FoodPostCreatedDto> CreateAsync(FoodPostCreationDto dto)
    {
        HttpResponseMessage response = await client.PostAsJsonAsync("/posts", dto);
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(result);
        }

        FoodPostCreatedDto createdDto = 
            JsonSerializer.Deserialize<FoodPostCreatedDto>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        return createdDto;
    }
}