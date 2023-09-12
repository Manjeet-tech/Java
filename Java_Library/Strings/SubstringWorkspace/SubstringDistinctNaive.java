import java.lang.*;
import java.util.*;

// Length of the longest substring with distinct characters
// For “ABDEFGABEF”, the longest substring are “BDEFGA” and "DEFGAB", with length 6.
// For “BBBB” the longest substring is “B”, with length 1.
// Time Complexity = O(N^3)

class SubstringDistinctNaive{

    public static void main(String args[]){

        String input = "abcdabc";
        getSubstringDistinct(input);
    }

    public static void getSubstringDistinct(String input){

        //get the substring
        int sbLength = input.length();
        int res = 0;
        for(int start=0;start<sbLength;start++){
            for(int end=0;end<sbLength;end++){
                
                //check the substring has distinct characters 
                if(checkDistinct(input,start,end))

                //count the max distinct
                 res = Math.max(res,end-start+1);
            }
        }

        System.out.println("max length of ditint substring : " +res);

    }

    public static boolean checkDistinct(String subStr, int start, int end){

        boolean visited[] = new boolean[256];

        for(int k = start;k <= end; k++){

            if(visited[subStr.charAt(k)] == true)
                return false;

            visited[subStr.charAt(k)] = true;

        }
        return true;
    }
        

}