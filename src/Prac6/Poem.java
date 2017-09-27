package Prac6;

public class Poem {
    String name;
    int numberLines;

    public Poem(String name, int numberLines) {
        this.name = name;
        this.numberLines = numberLines;
    }

    public String getName() {
        return name;
    }

    public int getNumberLines() {
        return numberLines;
    }
}
