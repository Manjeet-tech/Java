import java.util.*;
import java.util.stream.*;
import java.math.*;

// Get all the name values from a list of the staff objects.

class MapExampleStaff{

    private String name;
    private int age;
    private BigDecimal salary;

public MapExampleStaff(String name,int age,BigDecimal salary){
    this.name = name;
    this.age = age;
    this.salary = salary;
}

private String getName(){
    return name;
}

private int getAge(){
    return age;
}

private BigDecimal getSalary(){
    return salary;
}

public static void main(String args[]){

    MapExampleStaff st1 = new MapExampleStaff("manjeet", 34, new BigDecimal("4561.02"));
    MapExampleStaff st2 = new MapExampleStaff("ankit", 34, new BigDecimal("4561.02"));
    MapExampleStaff st3 = new MapExampleStaff("mukund", 34, new BigDecimal("4561.02"));

    List<MapExampleStaff> stList = Arrays.asList(st1,st2,st3);

    List<String> nameStaff = stList.stream()
            .map(MapExampleStaff::getName)
            .collect(Collectors.toList());

    System.out.println(nameStaff);
    
    }
}