using System.Collections;
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
        Console.Write("Food Post client:");
        Console.Write(dto);
        
        HttpResponseMessage response = await client.PostAsJsonAsync("/FoodPosts", dto);
        string result = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception("There was a problem in REST.");
        }

        FoodPostCreatedDto createdDto = 
            JsonSerializer.Deserialize<FoodPostCreatedDto>(result, new JsonSerializerOptions
        {
            PropertyNameCaseInsensitive = true
        })!;
        Console.Write(createdDto);
        return createdDto;
    }

    public async Task<IEnumerable<OverSimpleFoodPostDto>> GetAsync()
    {
        HttpResponseMessage response = await client.GetAsync("/FoodPosts");
        string content = await response.Content.ReadAsStringAsync();
        if (!response.IsSuccessStatusCode)
        {
            throw new Exception(content);
        }

        IEnumerable<OverSimpleFoodPostDto> foodPostDtos =
            JsonSerializer.Deserialize<IEnumerable<OverSimpleFoodPostDto>>(content)!;

        return foodPostDtos;
    }
}