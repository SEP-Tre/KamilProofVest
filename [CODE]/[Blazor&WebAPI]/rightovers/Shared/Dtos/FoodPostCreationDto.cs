namespace Shared.Dtos;

public class FoodPostCreationDto
{
    public string title { get; set; }
    public string description{ get; set; }
    public string daysLeftToEat{ get; set; }
    public string creatorUsername{ get; set; }
    public string category{ get; set; }
    public string pictureUrl{ get; set; }
}