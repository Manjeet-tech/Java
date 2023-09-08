import java.util.*;
import java.util.stream.*;
class ListToMap{

    private Integer key;
    private String value;

    public ListToMap(Integer key, String value){
        this.key = key;
        this.value = value;
    }

    public Integer getKey(){
        return key;
    }

    public String getValue(){
        return value;
    }

public static void main(String args[]){

    List<ListToMap> listData = new ArrayList<>();
    listData.add(new ListToMap(1,"A"));
    listData.add(new ListToMap(2,"B"));
    listData.add(new ListToMap(3,"C"));
    listData.add(new ListToMap(4,"D"));
    listData.add(new ListToMap(4,"D"));
    
 //   Map<Integer,String> mapData = new HashMap<>();

    HashMap<Integer,String> mapData =  listData.stream()
                                            .collect(Collectors.toMap(ListToMap::getKey,ListToMap::getValue,
                                            (x,y) -> x + " ," +y, HashMap::new));
    
    // for(ListToMap li : listData){
    //     mapData.put(li.getKey(),li.getValue());
    // }

    // listData.forEach((n) -> {
    //                             mapData.put(n.getKey(),n.getValue());
    //                         });

   System.out.println("map " + mapData);

    //=======//
    // Set<ListToMap> setData = new HashSet<ListToMap>();
    // //List to set 
    // for(ListToMap li : listData){
    //   setData.add(li);  
    // }
 
    // using lambda method
    // Converting to set using stream
    Set<ListToMap> setData = listData.stream().collect(Collectors.toSet());

    for(ListToMap s : setData){
        System.out.println("set " +s.getKey() +" " +s.getValue());
    }
    

}                           

}

