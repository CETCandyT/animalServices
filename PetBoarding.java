package animalServices;
//extends petServices

public class PetBoarding extends PetServices {
    private int capacity;

    public PetBoarding(int price, int serviceTime, String typeofAnimal, int capacity) {
        super(price, serviceTime, typeofAnimal);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override // Polymorphism : method overridden
    public String toString() {
        return super.toString() + "\nWe offer pet boarding services daily and weekly. Our max capacity is " + capacity + ".";
        //                         
    }
}
