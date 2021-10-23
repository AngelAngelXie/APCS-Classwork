public class Demo{
  /* more methods can go here*/


  public static void main(String[]args){
    Point P1 = new Point(1,1);
    Point P2 = new Point(2,2);

    distance(P1, P2);
    P1.distanceTo(P2);
    System.out.println(distance(P1,P2)); //call1 static
    System.out.println(Point.distance(P1,P2)); //call 2 static
    System.out.println(P1.distanceTo(P2)); //call 3 non-static
    // //This one is IMPLIED strongly. You cannot tell by the calling style alone,
    //but you can make an educated guess.
  }
 }
