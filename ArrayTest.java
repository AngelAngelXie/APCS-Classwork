public class ArrayTest {
    public static void main(String[] args){
        //int[] anArray = ???;
        int[] anArray = new int[11];

        for(int i = 0; i <= 10; i++){
            anArray[i] = 100 + 10 * i;
        }
        //Write the loop to initialize it
        System.out.println("part 1:"); //print the array variable
        System.out.println(anArray);
        
        System.out.println("part 2:"); // write a loop to print it out(on one line)
        
        for (int r = 0; r <= 10; r++){
            System.out.println(anArray[r] + " ");
        }

    }
}
