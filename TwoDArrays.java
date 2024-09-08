package TwoDArrays;
import java.util.Scanner;

public class TwoDArrays {
    
    //searching an element in a 2d array
    
    public static boolean Search(int arr[][],int item){

        for(int i = 0;i <arr.length;i++){
            for(int j  = 0 ; j< (arr[0].length) ; j++){
                if(arr[i][j] == item){
                    System.out.println("found at cell " + i+ ","+j);
                    return true;
                }
            }
           
        }
        return false;
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //creation
        int arr[][] = new int[4][3];
        int n = arr.length;
        int m = arr[0].length;
        //insertion of data
        for(int i = 0; i<n;i++){
            for(int j = 0; j<m;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        // displaying the data 
        for(int i = 0; i<4;i++){
            for(int j = 0; j<3;j++){
                System.out.print(arr[i][j]+ " "); 
            }
            System.out.println();
        }

        Search(arr,4);

    }
    
}
