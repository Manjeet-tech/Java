import java.util.*;
import java.lang.*;

class SubstringDistinctEffective{

public static void main(String args[]){

        String input = "abcdabc";
        getSubstringDistinct(input);
    }

public static void getSubstringDistinct(String input){

    int start_pointer = 0;
    int end_pointer = 0;
    int max = 0;
    Set<Character> setData = new HashSet<>();

    while(end_pointer < input.length()){

        if(!setData.contains(input.charAt(end_pointer))){
                setData.add(input.charAt(end_pointer));
                end_pointer++;

        max = Math.max(setData.size(),max);
        }else{
            setData.remove(input.charAt(start_pointer));
            start_pointer++;
        }
    }

    System.out.println(max);
 
}

}