import java.util.*;
import java.util.stream.*;
//convert a list of Strings to upper case

class MapExample1{

    public static void main(String args[]){

        List<String> lwCase = Arrays.asList("a","b","c");

        // List<String> upCase = new ArrayList<>();
        // for(String data : lwCase){
        //     upCase.add(data.toUpperCase());
        // }

        // System.out.println(upCase);

        // Using Java 8 
        List<String> upCase = lwCase.stream()
                                        .map(String::toUpperCase)
                                        .collect(Collectors.toList());

        System.out.println(upCase);

    }
}