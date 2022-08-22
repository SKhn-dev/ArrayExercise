import java.util.Scanner;

public class TestArray {
    //A program to sum all the values of array and print the result
    public static void main(String[] args) {
        int sum=0; //A variable to hold the value of sum
        int[] myArray=new int[10]; //Array to hold 10 values entered by user
        System.out.println("Please enter 10 values");
        Scanner reader=new Scanner(System.in);
        for(int i=0;i<10;i++){ //loop through 10 numbers
            myArray[i]=reader.nextInt();  //get input from user and save it to myArray
            sum+=myArray[i]; //add up the value of myArray to sum
        }
        System.out.println("The sum of all the numbers is: "+ sum);

    }
}
