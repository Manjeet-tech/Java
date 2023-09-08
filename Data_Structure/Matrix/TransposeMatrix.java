

// Output:
// 1 5 9 13 
// 2 6 10 14 
// 3 7 11 15 
// 4 8 12 16 
class TransposeMatrix{
    public static void main(String args[]){
    int arr[][] = {{1, 2, 3, 4},
    			   {5, 6, 7, 8},
    			   {9, 10, 11, 12},
    			   {13, 14, 15, 16}};

    int[][] transResult = transpose(arr);

        for(int i=0;i<transResult.length;i++){
            for(int j=0;j<transResult[i].length;j++){
                System.out.print(transResult[i][j] +" ");
            }
            System.out.println();
        }

    }

    public static int[][] transpose(int[][] arr){
        int[][] temp = new int[arr.length][arr.length];
        for(int row=0;row<arr.length;row++){
            for(int column = 0;column<arr[row].length;column++){
                temp[column][row] = arr[row][column];
            }
        }

        return temp;
    }
}
