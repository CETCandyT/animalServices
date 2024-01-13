package animalServices;

public class PetTraining extends PetServices {

    private int privateCost;
    private int groupCost;

    public PetTraining(int price, int serviceTime, String typeofAnimal, int privateCost, int groupCost) {
        super(price, serviceTime, typeofAnimal);
        this.privateCost = privateCost;
        this.groupCost = groupCost;
    }

    public int getPrivateCost() {
        return privateCost;
    }

    public void setPrivateCost(int privateCost) {
        this.privateCost = privateCost;
    }

    public int getGroupCost() {
        return groupCost;
    }

    public void setGroupCost(int groupCost) {
        this.groupCost = groupCost;
    }

    @Override
    public String toString() {
        return super.toString() + "\n We offer private lessons and group lessons. Private lessons cost $" + privateCost + " and Group lessons cost $" + groupCost + ".";
    }
}

