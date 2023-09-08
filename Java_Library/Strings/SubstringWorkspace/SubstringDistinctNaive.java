import java.lang.*;
import java.util.*;

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
                
                //check distinct
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