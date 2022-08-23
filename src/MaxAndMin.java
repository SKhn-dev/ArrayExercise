import java.util.Random;

public class MaxAndMin {
    public static void main(String[] args) {
        //program to find maximum and minimum number in an array
        Random rand=new Random();
        int min, max; //variables to hold minimun and maximum values
        int num; //holds the value of random number
        int[] myArray=new int[10];
        for(int i=0;i<myArray.length;i++){
            num= rand.nextInt(10)+1;
            myArray[i]=num;   //store random number to an array at index i
        }
        min=max=myArray[0]; //initialize min and max to first element of the array
        //print the array
        System.out.println("Array values are: ");
        for(int element:myArray)
            System.out.print(element+" ");
        for(int i=0;i<myArray.length;i++){ //loop through the array
            if(min>myArray[i])   //check if the minimum number is greater than array's current value
                min=myArray[i];
            if(max<myArray[i])   //check if the maximum number is less than array's current value
                max=myArray[i];

        }
        //print the results
        System.out.println("\nMinimum number in array: "+min);
        System.out.println("Maximum number in array: "+max);

    }
}
