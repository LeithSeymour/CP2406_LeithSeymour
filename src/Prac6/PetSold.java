package Prac6;

public class PetSold extends ItemSold{
    boolean isVaccinated = false;
    boolean isNeutered = false;
    boolean isHouseBroken = false;

    public boolean isVaccinated() {
        return isVaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = true;
    }

    public boolean isNeutered() {
        return isNeutered;
    }

    public void setNeutered(boolean neutered) {
        isNeutered = true;
    }

    public boolean isHouseBroken() {
        return isHouseBroken;
    }

    public void setHouseBroken(boolean houseBroken) {
        isHouseBroken = true;
    }
}
