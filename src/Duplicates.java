import java.util.Arrays;
import java.util.Random;

public class Duplicates {
    public static void main(String[] args) {
        // finding and printing the duplicate values
        int[] Array1=new int[20]; //create two arrays to store 20 values
        int[] Array2=new int[20];
        int[] duplicateNumbers=new int[40]; //Array to hold duplicate values
        Random rand=new Random();  //rand to generate random numbers
        for(int i=0;i<Array1.length;i++){
            Array1[i]= rand.nextInt(19)+1;//Assign random values to Array1 and Arrays
            Array2[i]= rand.nextInt(19)+1;
        }
        //Printing Arrays
        System.out.println("Array1 values: ");
        for (int i1 : Array1) System.out.print(i1 + " ");
        System.out.println("\nArray2 values: ");
        int k=0;
        for (int element : Array2)
            System.out.print(element + " ");
        boolean duplicateFlag=false; //variable to indicate if there is any duplicate value or not
        System.out.println("\nDuplicate Values");
        for (int item : Array1) {
            for (int value : Array2) {
                if (item == value) { //check if the value exists in both arrays
                    duplicateNumbers[k++] = item;
                    duplicateFlag = true;
                    System.out.print(item + " "); //Printing all instances of duplicate numbers
                }
            }

        }
        int j=0;

        if(!duplicateFlag)
            System.out.println("\nNo duplicate value");

        else{
            //using built-in function sort to sort the arrays
            Arrays.sort(duplicateNumbers);
            //Removing the duplicated numbers from sorted array
            for(int i=0;i<duplicateNumbers.length-1;i++){

                if(duplicateNumbers[i]!=duplicateNumbers[i+1]){
                    duplicateNumbers[j++]=duplicateNumbers[i];
                }
            }
            duplicateNumbers[j++]=duplicateNumbers[duplicateNumbers.length-1];
        }
        //Display after removing multiple occurrences
        System.out.println("\nArray of duplicated numbers after removing multiple occurrences: ");
        for(int i=1;i<j;i++){
            System.out.print(duplicateNumbers[i]+ " ");
        }
    }
}
