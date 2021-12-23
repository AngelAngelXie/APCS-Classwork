import java.lang.Math;

public class StringToInt{
  public static void main(String[]args){
    System.out.println(stringToInt("1520"));
    System.out.println(stringToInt("0"));
    System.out.println(stringToInt("9999999"));
    System.out.println(stringToInt("7861"));
    System.out.println(stringToInt("1"));
    System.out.println(stringToInt("4"));
    System.out.println(stringToInt("19"));

    System.out.println(stringToInt("-27"));
    System.out.println(stringToInt("-9183429"));
    System.out.println(stringToInt("-1"));
    System.out.println(stringToInt("-80349712937"));
    System.out.println(stringToInt("-4"));
    System.out.println(stringToInt("-765"));

  }

  public static int valueOfDigit(char c){
    int result = 0;
    result = c - 48;
    // System.out.println(result);
    return result;
  }
  public static int stringToInt(String s){
      //return the value of Integer.parseInt(s) but do it yourself!
      //Do not use any built in parse methods.
      if(s.charAt(0) == '-'){

      }
      else{
        int result = 0;
        for(int i = 0; i<s.length(); i++){
          result +=  valueOfDigit(s.charAt(i)) * (int)Math.pow(10, (s.length() -i-1));
          // System.out.println(result);
        }
        return result;
      }

  }
}
