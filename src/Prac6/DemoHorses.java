package Prac6;

public class DemoHorses {
    public static void main(String[] args) {
        RaceHorse horseOne = new RaceHorse();
        horseOne.setName("Leith");
        System.out.println("Horses name is " + horseOne.getName());
        horseOne.setColour("Brown");
        System.out.println("Horses colour is " + horseOne.getColour());
        horseOne.setBirthYear(1992);
        System.out.println("Horses birth year is " + horseOne.getBirthYear());
        horseOne.setCompetedRaces(20);
        System.out.println("Horses completed races are " + horseOne.getCompetedRaces());
    }
}
