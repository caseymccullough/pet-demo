public class PetDemo {

    public static void main(String[] args) {

        Pet pet1 = new Pet ("Socks", "cat", "male");
        Pet pet2 = new Pet ("Luna", "dog", "female");

        Pet favoritePet = null;


        // toString()

        System.out.println(pet1);
        System.out.println(pet2);
        System.out.println(favoritePet);

        // Aliasing

        // Method Parameters and Aliasing

        //


    }

    public static void giveFancyName (Pet pet) {

        if (pet.getGender().equals("male")) {
            pet.setName("Lord " + pet.getName());
        } else if (pet.getGender().equals("female")) {
            pet.setName("Lady " + pet.getName());
        }
    }

}
