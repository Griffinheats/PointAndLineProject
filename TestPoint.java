public class TestPoint 
{
    public static void main(String[]args)
    {
        Point test1 = new Point();
        Point test2 = new Point(3, 4);
        Point test3 = new Point(-5, 7);
        Point test4 = new Point(3, -10);
        Point test5 = new Point(3, 10);
        Point test6 = new Point(6, 8);

        System.out.println("distance");
        System.out.println(test2.manhattanDistance(test3));
        System.out.println(test3.manhattanDistance(test4));
        System.out.println("linear");
        System.out.println(test2.isCollinear(test4, test5));
        System.out.println(test2.isCollinear(test3, test4));
        System.out.println(test1.isCollinear(test2, test6));
        System.out.println(test1.isCollinear(test2, test3));
    }
}
