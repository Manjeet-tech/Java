
import java.util.*;
import java.util.stream.*;
// Input: ArrayList = [1, 2, 2, 3, 4, 4, 4] 
// Output: [1, 2, 3, 4] 

// Input: ArrayList = [12, 23, 23, 34, 45, 45, 45, 45, 57, 67, 89] 
// Output: [12, 23, 34, 45, 57, 67, 89]

class RemoveRepeatedItem{

    public static void main(String[] args){
        List<Integer> listItem = Arrays.asList(1, 2, 2, 3, 4, 4, 4);
        removeRepeat(listItem);
        usingStreamhelp(listItem);
    }

    public static void removeRepeat(List<Integer> listItem){

        // convert to set collection 
        // convert it to list from set 

        Set<Integer> setItem = new LinkedHashSet<>(listItem);

        List<Integer> listResult = new LinkedList<>(setItem);

        System.out.println(listResult);


    }

    public static void usingStreamhelp(List<Integer> listItem){

        List<Integer> listResult = listItem.stream()
                                            .distinct()
                                            .collect(Collectors.toList());

        System.out.println("using streams: " +listResult);
        
    }
}