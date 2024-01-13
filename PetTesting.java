package animalServices;

public class PetTesting {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        PetServices pet = new PetServices(12,15,"turtle");
        System.out.println(pet);
        System.out.println();

        PetBoarding pet2 = new PetBoarding (12, 13, "cat", 15);
        System.out.println(pet2);
        System.out.println();

        PetCare pet3 = new PetCare (14, 16, "bird", "Dr. Amy Pond", 50);
        System.out.println(pet3);
        System.out.println();
        
        PetTraining pet4 = new PetTraining(15, 20, "dog", 30, 15);
        System.out.println(pet4);
        System.out.println();
    }

}
