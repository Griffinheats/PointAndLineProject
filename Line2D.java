public class Line2D 
{
    int x1, x2, y1, y2;

    public Line2D(Point p1, Point p2)
    {
        x1 = p1.getX();
        y1 = p1.getY();
        x2 = p2.getX();
        y2 = p2.getX();
    }

    public Line2D(int setX1, int setY1, int setX2, int setY2)
    {
        x1 = setX1;
        y1 = setY1;
        x2 = setX2;
        y2 = setY2;
    }

    public Point getP1()
    {
        return new Point(x1, y1);
    }

    public Point getP2()
    {
        return new Point(x2, y2);
    }

    public String toString()
    {
        String result = ("[(" + x1 + ", " + y1 + "), (" + x2 + ", " + y2 + ")]");
        return result;
    }

    public double getSlope()
    {
        return (double)((Math.abs(x1-x2))/(Math.abs(y1-y2)));
    }

    public boolean isCollinear(Point p)
    {
        boolean test = false;
        double slope1 = getSlope();
        double slope2 = (Math.abs(x2-p.getX())/(Math.abs(y2-p.getY())));
        if(Math.abs(slope1-slope2) < .01)
        {
            test = true;
        }
        return test;
    }
}
