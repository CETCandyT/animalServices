package animalServices;

public class PetCare extends PetServices {

    private String vet;
    private int examCost;

    public PetCare(int price, int serviceTime, String typeofAnimal, String vet, int examCost) {
        super(price, serviceTime, typeofAnimal);
        this.vet = vet;
        this.examCost = examCost;
    }

    public String getVet() {
        return vet;
    }

    public void setVet(String vet) {
        this.vet = vet;
    }

    public int getExamCost() {
        return examCost;
    }

    public void setExamCost(int examCost) {
        this.examCost = examCost;
    }

    public String toString(){
    	return super.toString() + "\nWe offer Physical Exams and Pet Grooming sessions. A physical exam costs $" + examCost + ". The vet on duty is " + vet;
    }
}

