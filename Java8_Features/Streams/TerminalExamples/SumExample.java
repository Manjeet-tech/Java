import java.util.*;
import java.util.stream.*;

class SumExample{

public static void main(String args[]){
List<Integer> numbers = Arrays.asList(1,2,3,4,5);

// The Stream API provides us with the mapToInt() intermediate operation, 
//which converts our stream to an IntStream object.
Integer sum = numbers.stream()
                    .mapToInt(Integer::intValue)
                    .sum();
       

    System.out.println(sum);

}

}