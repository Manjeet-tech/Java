import java.util.*;
import java.util.stream.*;

class AverageAsExample{

public static void main(String args[]){
List<Integer> avgList = Arrays.asList(1,2,5,6,9,3);

double avg = avgList.stream()
                    .mapToDouble(Integer::doubleValue)
                    .average()
                    .getAsDouble();

System.out.println(avg);

    }
}