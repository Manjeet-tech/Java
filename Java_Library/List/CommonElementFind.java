
import java.util.ArrayList;
import java.util.stream.*;
import java.util.*;
// Find common elements in two ArrayLists in Java

// Input: List1 = ["Hii", "Geeks", "for", "Geeks"], 
//        List2 = ["Hii", "Geeks", "Gaurav"]
// Output: [Hii, Geeks, Geeks]

class CommonElementFind{

    public static void main(String[] args){

        List<String> listItem1 = Arrays.asList("Hii", "Geeks", "for", "Geeks");
        List<String> listItem2 = Arrays.asList("Hii", "Geeks", "Gaurav");

    //    usingLibMethod(listItem1,listItem2);
          usingNaiveMethod(listItem1,listItem2);
          usingStream(listItem1,listItem2);
    }

    public static void usingLibMethod(List<String> listItem1,List<String> listItem2){
           listItem1.retainAll(listItem2);
           System.out.println(listItem1);

    }

    public static void usingNaiveMethod(List<String> listItem1,List<String> listItem2){

        List<String> resultList = new ArrayList<>();
        for(String item1:listItem1){
           if(listItem2.contains(item1)){
                resultList.add(item1);
           }
    }
            System.out.println(resultList);
    }

    public static void usingStream(List<String> listItem1,List<String> listItem2){

        List<String> resultList = listItem1.stream()
                                            .filter(listItem2::contains)
                                            .collect(Collectors.toList());

           System.out.println("using stream: " +resultList);                                  
    }
}