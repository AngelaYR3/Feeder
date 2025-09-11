public class Main
{
    public static void main(String[] args)
    {
        Feeder f = new Feeder(500);
        System.out.println(f);
        System.out.println(f.getCurrentFood());
        System.out.println(Math.random());
        System.out.println(Math.random() * 10);
        System.out.println((int) (Math.random() * 10)+1);
        f.simulateOneDay(12);
        System.out.println(f.getCurrentFood());
    }
}


