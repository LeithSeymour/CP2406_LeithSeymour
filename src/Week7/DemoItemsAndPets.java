package Week7;

public class DemoItemsAndPets {
    public static void main(String[] args) {
        ItemSold itemOne = new ItemSold();
        ItemSold itemTwo = new ItemSold();
        PetSold petOne = new PetSold();
        PetSold petTwo = new PetSold();


        itemOne.setInvoice(200);
        itemOne.setDescription("Fan");
        itemOne.setPrice(25.00);
        System.out.println("Invoice " + itemOne.getInvoice() + " is for a " + itemOne.getDescription() + " which is at "
                + itemOne.getPrice());

        itemTwo.setInvoice(300);
        itemTwo.setDescription("Power Drill");
        itemTwo.setPrice(200.00);
        System.out.println("invoice " + itemTwo.getInvoice() + " is for a " + itemTwo.getDescription() + " which is at "
                + itemTwo.getPrice());


        System.out.println("Is pet vaccinated? " + petOne.isVaccinated());
        petOne.setVaccinated(true);
        System.out.println("Is pet vaccinated? " + petOne.isVaccinated());

        System.out.println("Is pet neutered? " + petOne.isNeutered());
        petOne.setNeutered(true);
        System.out.println("Is pet neutered? " + petOne.isNeutered());

        System.out.println("Is home broken? " + petOne.isHouseBroken());
        petOne.setHouseBroken(true);
        System.out.println("Is home broken? " + petOne.isHouseBroken());


        System.out.println("Is pet vaccinated? " + petTwo.isVaccinated());
        petTwo.setVaccinated(true);
        System.out.println("Is pet vaccinated? " + petTwo.isVaccinated());

        System.out.println("Is pet neutered? " + petTwo.isNeutered());
        petTwo.setNeutered(true);
        System.out.println("Is pet neutered? " + petTwo.isNeutered());

        System.out.println("Is home broken? " + petTwo.isHouseBroken());
        petTwo.setHouseBroken(true);
        System.out.println("Is home broken? " + petTwo.isHouseBroken());

    }
}
