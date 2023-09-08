
// 0 
// 1 1 
// 2 2 2 
class JaggedTwoDArray{
    
    public static void main(String args[]){

        int m=3;
        String[][] arr = new String[m][];

        for(int row=0;row<arr.length;row++){
            arr[row] = new String[row + 1];
            for(int column=0;column<arr[row].length;column++){
                arr[row][column] = "*";
                System.out.print(arr[row][column] +" ");
            }

                System.out.println();
        }

    }
}