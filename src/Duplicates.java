import java.util.Arrays;
import java.util.Random;

public class Duplicates {
    public static void main(String[] args) {
        // finding and printing the duplicate values
        int[] Array1=new int[20]; //create two arrays to store 20 values
        int[] Array2=new int[20];
        int[] duplicateNumbers=new int[40];
        int duplicateValue; //variable to hold duplicate value
        Random rand=new Random();  //rand to generate random numbers
        for(int i=0;i<Array1.length;i++){
            Array1[i]= rand.nextInt(19)+1;//Assign random values to Array1 and Arrays
            Array2[i]= rand.nextInt(19)+1;
        }
        //Printing Arrays
        System.out.println("Array1 values: ");
        for(int i=0;i<Array1.length;i++)
            System.out.print(Array1[i]+" ");
        System.out.println("\nArray2 values: ");
        int k=0;
        for(int j=0;j<Array2.length;j++)
            System.out.print(Array2[j]+" ");
        boolean duplicateFlag=false; //variable to indicate if there is any duplicate value or not
        System.out.println("\nDuplicate Values");
        for(int i=0;i<Array1.length;i++) {
            for (int j = 0; j<Array2.length;j++) {
                if (Array1[i] == Array2[j]) { //check if the value exists in both arrays
                    duplicateNumbers[k++]=Array1[i];
                    duplicateFlag = true;
                    System.out.print(Array1[i] + " "); //Printing all instances of duplicate numbers
                }
            }

        }
        int j=0;

        if(duplicateFlag==false)
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
