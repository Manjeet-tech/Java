import java.util.*;
import java.util.stream.*;

// How to get the 2nd largest number from a list using java 8 stream. 
// i/p : 5, 2, 9, 8, 1, 6
// o/p : 8

class Assignment2{

    public static void main(String args[]){

        List<Integer> input = Arrays.asList(5, 2, 9, 8, 1, 6);

        findSecondLargest(input);

    }


    public static void findSecondLargest(List<Integer> input){

       int result = input.stream()
                            .sorted((a,b) -> b.compareTo(a))
                            .skip(1)
                            .findFirst()
                            .orElse(-1);
                           
                            
                           

        System.out.println(result);
    }



}