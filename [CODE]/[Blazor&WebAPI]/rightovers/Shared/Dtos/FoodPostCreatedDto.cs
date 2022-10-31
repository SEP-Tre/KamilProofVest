namespace Shared.Dtos;

public class FoodPostCreatedDto
{
    public bool created{ get; set; }
    public int idInDB{ get; set; }
    public override string ToString()
    {
        if (created)
            return $"The post has been successfully created with ID: {idInDB}";
        return "There was an error when saving your food post. We are sorry.";
    }
}