package animalServices;
//main class
public class PetServices {

    public int prices;
    public int serviceHours;
    private String animalType;
    
  	// Default constructor
    public PetServices() { }
  
  	// Polymorphism 
    
  	public PetServices (int price, int serviceTime, String typeofAnimal){
        this.prices = price;
        this.serviceHours = serviceTime;
        this.animalType = typeofAnimal;
    }

    public int getPrices() {
        return prices;
    }
  
    public void setPrices(int prices) {
        this.prices = prices;
    }
  
    public int getServiceHours() {
        return serviceHours;
    }
  
    public void setServiceHours(int serviceHours) {
        this.serviceHours = serviceHours;
    }
  
    public String getAnimalType() {
        return animalType;
    }
  
    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    //for the override 
    public String toString(){
        return "This pet Service has " + serviceHours + " hours of service. It charges $"+ prices+" per hour. "
                + "The type of animal it serves is a: "+ animalType + ".";
    }
}