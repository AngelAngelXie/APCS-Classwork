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

}
