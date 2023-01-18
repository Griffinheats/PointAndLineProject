public class TestLine2D 
{
    public static void main(String[]args)
    {
        Point end1 = new Point();
        Point end2 = new Point(3, 4);
        Point end3 = new Point(4, 9);
        Point end4 = new Point(6, 8);

        Line2D line1 = new Line2D(end1, end2);
        Line2D line2 = new Line2D(end3, end4);
        Line2D line3 = new Line2D(4, 9, 6, 8);

        System.out.println("get");
        System.out.println(line1.getP1());
        System.out.println(line1.getP2());
        System.out.println(line2.getP1());
        System.out.println(line2.getP2());
        System.out.println("slope");
        System.out.println(line1.getSlope());
        System.out.println(line2.getSlope());
        System.out.println("linear");
        System.out.println(line1.isCollinear(end3));
        System.out.println(line1.isCollinear(end4));
    }
}
