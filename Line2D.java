public class Line2D 
{
    private Point p1;
    private Point p2;

    //constructors
    public Line2D(Point point1, Point point2)
    {
        p1 = point1;
        p2 = point2;
    }
    public Line2D(int x1, int y1, int x2, int y2)
    {
        p1 = new Point(x1, y1);
        p2 = new Point(x2, y2);
    }

    //getters
    public Point getP1()
    {
        return p1;
    }
    public Point getP2()
    {
        return p2;
    }
    public double getSlope()
    {
        double run = (p2.getX()-p1.getX());
        double rise = (p2.getY()-p1.getY());
        return(rise/run);
    }

    //other methods
    public String toString()
    {
        return ("[(" + p1.getX() + ", " + p1.getY() + "), (" + p2.getX() + ", " + p2.getY() + ")]");
    }
    public boolean isCollinear(Point p)
    {
        boolean result = false;
        double slope = ((p2.getY() - p.getY())/(p2.getX() - p.getX()));
        if(getSlope() - slope < .01)
        {
            result = true;
        }
        return result;
    }

}
