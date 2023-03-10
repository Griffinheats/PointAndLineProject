public class Point 
{
    int x;
    int y;

    public Point(int setX, int setY)
    {
        x = setX;
        y = setY;
    }   
    public Point()
    {
        x = 0;
        y = 0;
    }

    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }

    public void addX(int a)
    {
        x += a;
    }
    public void addY(int a)
    {
        y += a;
    }

    public int manhattanDistance(Point other)
    {
        return (Math.abs(x-other.getX()) + Math.abs(y-other.getY()));
    }

    public boolean isCollinear(Point p1, Point p2)
    {
        boolean test = false;
        double slope1 = (Math.abs(x-p1.getX())/Math.abs(y-p1.getY()));
        double slope2 = (Math.abs(p1.getX()-p2.getX())/Math.abs(p1.getY()-p2.getY()));
        if(Math.abs(slope1-slope2) < .01)
        {
            test = true;
        }
        return test;
    }
}
