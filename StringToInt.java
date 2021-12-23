public class StringToInt{
  public static int valueOfDigit(char c){
    int result = 0;
    result = c - 48;
    return result;
  }

  public static int stringToInt(String s){
      //return the value of Integer.parseInt(s) but do it yourself!
      //Do not use any built in parse methods.
      int result = 0;
      for(int i = 0; i<s.length(); i++){
        result = valueOfDigit(s[i]) * 10 * s.length()-(i+1);
      } return result;
  }
}
