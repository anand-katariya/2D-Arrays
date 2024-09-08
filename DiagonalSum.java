package TwoDArrays;

public class DiagonalSum {

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

    public static void main(String[] args) {
        int arr[][]={
            {1,2,3,4},
            {1,2,3,4},
            {1,2,3,4},
            {1,2,3,4}};
            System.out.println(Diagonal(arr));
    }
}
