import java.util.Scanner;

public class ExistInArray {
    //This program search for the value in an array
    public static void main(String[] args) {
        int[] myArray={2,5,9,4,12,55,0}; //declare and initialize the array
        int numToSearch;  //holds the number user wants to search in an array
        boolean found=false; //a flag variable to check if the number is found or not
        System.out.print("Please enter the number you are looking for: ");
        Scanner reader=new Scanner(System.in);
        numToSearch=reader.nextInt();
        for(int i=0;i<myArray.length;i++){  //loop through the array
            if(numToSearch==myArray[i]){  //if the  number exists in the array
                found=true;  //set found variable to true
            }
        }
        System.out.println("The array is as under: ");
        for(int i=0;i<myArray.length;i++){  //display the values of array
            System.out.print(myArray[i]+ " ");
        }
        if(found==true)
            System.out.println("\nValue "+numToSearch+" exists in array");
        else
            System.out.println("\nValue was not found in array");
    }
}
