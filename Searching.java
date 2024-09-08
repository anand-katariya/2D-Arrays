package TwoDArrays;

public class Searching {

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
    public static void main(String[] args) {
        int arr[][] = {
            {10,20,30,40},
            {15,25,35,40},
            {27,29,37,48},
            {32,33,39,50}};
        int key  = 50;
        Staircase(arr, key);
    }




    
}
