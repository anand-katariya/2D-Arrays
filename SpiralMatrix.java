package TwoDArrays;

public class SpiralMatrix {

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

    public static void main(String[] args) {
        int matrix[][]= {{1,2,3,4},
                         {1,2,3,4},
                         {1,2,3,4},
                         {1,2,3,4}};
        PrintSpiral(matrix);
    }
}
 