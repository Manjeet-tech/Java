import java.util.*;
import java.util.stream.*;

//calculate the sum of all the values of a given field of these objects.
class SumWithObject{
    private int id;
    private Integer price;

    public SumWithObject(int id, Integer price){
        this.id = id;
        this.price = price;
    }

    public int getId(){
        return id;
    }

    public Integer getPrice(){
        return price;
    }


 public static void main(String args[]){

    SumWithObject item1 = new SumWithObject(1,10);
    SumWithObject item2 = new SumWithObject(2,20);
    SumWithObject item3 = new SumWithObject(3,30);
    SumWithObject item4 = new SumWithObject(4,40);

    List<SumWithObject> listItems = Arrays.asList(item1, item2, item3, item4);

    Integer sumItem = listItems.stream()
                .mapToInt(item -> item.getPrice())
                .sum();

    //using map
//   Integer sum = items.stream()
//   .map(x -> x.getPrice())
//   .collect(Collectors.summingInt(Integer::intValue));

    System.out.println(sumItem);

 }   

}