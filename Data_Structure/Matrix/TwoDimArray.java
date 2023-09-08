
class TwoDimArray{
    public static void main(String args[]){
        int m=3,n=3;
        int[][] arr = new int[m][n];

        for(int row=0;row<arr.length;row++){
            for(int column=0;column<arr[row].length;column++){
                arr[row][column] = 10;
                System.out.print(arr[row][column] + " ");
            }
            System.out.println();
        }
    }
}