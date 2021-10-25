public class Point{
// field
  private double x,y;

//constructot
  public Point(double X, double Y){
    x=X;
    y=Y;
  }
  public Point(Point p){
    x= p.x;
    y= p.y;
  }

  //methods
  public double getX(){
    return x;
  }
  public double getY(){
    return y;
  }


  public double distanceTo(Point A){
    double result = Math.sqrt((x - A.x) * (x - A.x) +(y - A.y) * (y - A.y));
    return result;
  }

  public static double distance(Point A, Point B){
    double result = Math.sqrt((A.x - B.x) * (A.x - B.x) + (A.y - B.y) * (A.y - B.y));
    return result;
  }

  /*Return a string in the format: (x, y)
  *where x and y are the values from the Point.
  *e.g.  "(0.0, 1.23)"  or  "(-1.02, 21.45)"
  */
  public static String toString(Point A){
    String result = "";
    result = "(" + A.x + ", " + A.y + ")";
    return result;
  }


}
