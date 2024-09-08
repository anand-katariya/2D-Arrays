package TwoDArrays;

import java.util.Scanner;

public class Overall2dArray {

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
        int row = 2, column = 3;
        int[][]matrix= { {2,3,7}, {5,6,7} };
        // Display original matrix
        printMatrix(matrix);
        // Transpose the matrix
        int[][] transpose = new int[column][row];
        for(int i=0;i<row;i++) {
            for(int j=0;j<column;j++) {
                transpose[j][i] =matrix[i][j];
            }
        }
        // print the transposed matrix
        printMatrix(transpose);

    }
    
        public static void printMatrix(int[][]matrix){
            System.out.println("The matrix is: ");
            for(int i= 0; i<matrix.length;i++) {
                for(int j =0;j<matrix[0].length;j++){
                    System.out.print(matrix[i][j] +"");
                }System.out.println();
            }
        }
    
    


    
     // Brute force O(n^2)
     public static void BruteForce(int arr[][],int key){
        for(int i = 0; i<arr.length ; i++){
            for(int j = 0 ; j< arr[0].length;j++){
                if(arr[i][j] == key){
                    System.out.println("item fount at "+i+" "+j);
                }
            }
        }
    }

    //stair case Search O(n+m)
    public static boolean Staircase(int arr[][], int key){
        int row = 0;
        int col = arr[0].length -1;
        while(row < arr.length && col >= 0){
            if(arr[row][col] == key){
                System.out.println("Found key at ( "+row +","+col+")");
                return true;
            }else if(key < arr[row][col]){
                col--;
            }else{
                row++;
            }
        }
        System.out.println("key not found");
        return false;
        
    }

    public static int Diagonal(int arr[][]){
        int sum  = 0;
        for(int i = 0; i<arr.length;i++){
            sum = sum + arr[i][i];

            if(i != arr.length - i -1){
                sum = sum + arr[i][arr.length - i -1];
            }
        }
        return sum;
    }

    public static void PrintSpiral(int matrix[][]){
        int strow = 0;
        int stcol = 0;
        int endrow = matrix.length - 1;
        int endcol = matrix[0].length -1;
        while(stcol<=endcol && strow<=endcol){
            //top
            for(int j =stcol; j <= endcol ; j++){
                System.out.print(matrix[strow][j]+ " ");
            }
            //right
            for(int i = strow+1; i<=endrow;i++){
                System.out.print(matrix[i][endcol]+" ");
            }
            //bottom
            for(int j = endcol-1; j>=stcol;j--){
                if(strow == endrow){
                    break;
                }
                System.out.print(matrix[endrow][j]+" ");
            }
            //left
            for(int i = endrow-1; i>=strow+1;i--){
                if(stcol==endcol){
                    break;
                }
                System.out.print(matrix[i][stcol]+" ");
            }
            stcol++;
            strow++;
            endcol--;
            endrow--;
        }

    }



}
