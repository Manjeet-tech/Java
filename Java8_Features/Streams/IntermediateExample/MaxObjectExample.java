import java.util.*;
import java.util.stream.*;


// find the Person object with the minimum age:
class MaxObjectExample{

    String name;
    Integer age;

    public MaxObjectExample(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    private String getName(){
        return name;
    }

    private Integer getAge(){
        return age;
    }

    @Override
    public String toString() {
        return "[" + name + ", " + String.valueOf(age) + "]";
    }

    public static void main(String args[]){
        
        MaxObjectExample person1 =  new MaxObjectExample("manjeet",33);
        MaxObjectExample person2 =  new MaxObjectExample("rupesh",35);
        MaxObjectExample person3 =  new MaxObjectExample("mukund",33);
        MaxObjectExample person4 =  new MaxObjectExample("ankit",32);

        List<MaxObjectExample> personList = Arrays.asList(person1,person2,person3,person4);

        MaxObjectExample minAgePerson = personList.stream()
                                                .min(Comparator.comparingInt(MaxObjectExample::getAge))
                                                .get();
        
        System.out.println("min "  + minAgePerson);

        MaxObjectExample maxPersonDetail = personList.stream()
                                                        .max(Comparator.comparingInt(MaxObjectExample::getAge))
                                                        .get();

        System.out.println("max "  + maxPersonDetail);

    }

}