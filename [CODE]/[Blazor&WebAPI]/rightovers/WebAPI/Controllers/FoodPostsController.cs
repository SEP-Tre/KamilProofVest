using Application.LogicInterfaces;
using Grpc.Core;
using Microsoft.AspNetCore.Mvc;
using Shared.Dtos;

namespace WebAPI.Controllers;
[ApiController]
[Route("[controller]")]
public class FoodPostsController : ControllerBase
{
    private readonly IFoodPostLogic foodPostLogic;

    public FoodPostsController(IFoodPostLogic foodPostLogic)
    {
        this.foodPostLogic = foodPostLogic;
    }
    
    [HttpPost]
    public async Task<ActionResult<FoodPostCreatedDto>> CreateAsync(FoodPostCreationDto dto)
    {
        try
        {
            FoodPostCreatedDto createdDto = await foodPostLogic.CreateAsync(dto);
            return Created($"/post/{createdDto.idInDB}", createdDto);
        }
        catch (Exception e)
        {
            Console.WriteLine(e);
            return StatusCode(500, e.Message);
        }
    }
}