using Microsoft.AspNetCore.Components.Web;
using Microsoft.AspNetCore.Components.WebAssembly.Hosting;
using BlazorWASM;
using HttpClients.ClientInterfaces;
using HttpClients.Implementations;

var builder = WebAssemblyHostBuilder.CreateDefault(args);
builder.RootComponents.Add<App>("#app");
builder.RootComponents.Add<HeadOutlet>("head::after");

builder.Services.AddScoped<IFoodPostWebService, FoodPostHttpClient>();
builder.Services.AddScoped(sp => new HttpClient 
    { BaseAddress = new Uri("https://localhost:7080") });

await builder.Build().RunAsync();