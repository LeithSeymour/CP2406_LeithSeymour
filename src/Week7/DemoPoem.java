package Week7;

public class DemoPoem {

    public static void main(String[] args) {
        Couplet coupletOne = new Couplet("Leith", 0);
        System.out.println(coupletOne.getName());
        System.out.println(coupletOne.getNumberLines());

        Limerick limerickOne = new Limerick("Jody", 0);
        System.out.println(limerickOne.getName());
        System.out.println(limerickOne.getNumberLines());

        Haiku haikuOne = new Haiku("Andrew", 0);
        System.out.println(haikuOne.getName());
        System.out.println(haikuOne.getNumberLines());
    }
}
