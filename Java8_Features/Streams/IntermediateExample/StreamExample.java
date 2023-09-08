import java.util.*;
import java.util.stream.*;

class StreamExample{

public static void main(String args[]){

    List<Integer> list = Arrays.asList(1,2,3,4,5,11,12,6,7,16);

    list.stream()
            .filter(n -> n %2 == 0)
            .filter(n -> n<10)
            .forEach(System.out::println);

}
}