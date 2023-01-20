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

        System.out.println("Testing manhattanDistance:");
        System.out.println("p2 to p3: " + test2.manhattanDistance(test3));
        System.out.println("p3 to p4: " + test3.manhattanDistance(test4));
        System.out.println("Testing isCollinear:");
        System.out.println("p2, p4, p5: " + test2.isCollinear(test4, test5));
        System.out.println("p2, p3, p4: " + test2.isCollinear(test3, test4));
        System.out.println("p1, p2, p6: " + test1.isCollinear(test2, test6));
        System.out.println("p1, p2, p3: " + test1.isCollinear(test2, test3));
    }
}
