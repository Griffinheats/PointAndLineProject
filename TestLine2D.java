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

        System.out.println("Testing constructor using 2 Point objects and the toString method ");
        System.out.println("Line 1: " + line1.toString());
        System.out.println("Line 2: " + line2.toString());
        System.out.println("Testing constructor using 4 int's and the toString method ");
        System.out.println("Line 3: " + line3.toString());
        System.out.println("Testing getP1 and getP2 methods: ");
        System.out.println("Line 1, getP1: x=" + line1.getP1().getX() + ", y=" + line1.getP1().getY());
        System.out.println("Line 1, getP2: x=" + line1.getP2().getX() + ", y=" + line1.getP2().getY());
        System.out.println("Line 2, getP1: x=" + line2.getP1().getX() + ", y=" + line2.getP1().getY());
        System.out.println("Line 2, getP2: x=" + line2.getP2().getX() + ", y=" + line2.getP2().getY());
        System.out.println("Testing getSlope");
        System.out.println("Line 1 slope: " + line1.getSlope());
        System.out.println("Line 2 slope: " + line2.getSlope());
        System.out.println("Testing isCollinear");
        System.out.println("Line1 and p3: " + line1.isCollinear(end3));
        System.out.println("Line1 and p4: " + line1.isCollinear(end4));
    }
}
