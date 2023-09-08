
// Input: mat[][] = { {1, 2, 3},
//                    {4, 5, 6},
//                    {7, 8, 9} };
// Output: 1 2 3 6 5 4 7 8 9

class SnakePatternExample{

    public static void main(String args[]){

        int[][] arr = { {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9} };

        for(int row=0;row<arr.length;row++){

            if(row%2 == 0){
                for(int column = 0; column<arr[row].length;column++){
                    System.out.print(arr[row][column]);
                }
            }else{
                for(int column = arr[row].length - 1; column>=0; column --){
                    System.out.print(arr[row][column]);
                }
            }

        }
    }

}