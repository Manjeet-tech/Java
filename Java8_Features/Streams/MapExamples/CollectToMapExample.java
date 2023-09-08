import java.util.*;
import java.util.stream.*;


class CollectToMapExample{

    int roll;
    int marks;
    String name;

    public CollectToMapExample(int roll,int marks,String name){
        this.roll = roll;
        this.marks = marks;
        this.name = name;
    }

    public int getRoll(){
        return roll;
    }

    public int getMarks(){
        return marks;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return "CollectToMapExample{" +
                "roll=" + roll +
                ", marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }

    public static void main(String args[]){

        CollectToMapExample st1 = new CollectToMapExample(1, 89, "manjeet");
        CollectToMapExample st2 = new CollectToMapExample(2, 90, "rupesh");
        CollectToMapExample st3 = new CollectToMapExample(3, 90, "mukund");
        CollectToMapExample st4 = new CollectToMapExample(4, 92, "ankit");

        List<CollectToMapExample> stList = Arrays.asList(st1,st2,st3,st4);

       // Collect To Map Example 
        Map<Integer,String> mapStudent = stList.stream()
                .collect(Collectors.toMap(CollectToMapExample::getRoll,CollectToMapExample::getName));

      //  System.out.println(mapStudent);

        //iterate map process::
        for(Map.Entry<Integer,String> ent : mapStudent.entrySet()){
            System.out.println(ent.getKey() +" "+ent.getValue());
        }

        System.out.println("===================================");

        // grouping by example -> grouping students based on marks
        groubByMarks(stList);

        System.out.println("===================================");

        // filter example -> filtering students where name = "manjeet"
        filterByname(stList);

        System.out.println("===================================");
        // filter example -> filtering students where marks = 90
        filterByMarks(stList);

        System.out.println("===================================");
        // ordered() example -> custom ordering students with name 
        orderByName(stList);

    }


    private static void groubByMarks(List<CollectToMapExample> student){
       Map<Integer,List<CollectToMapExample>> groupStudent = student.stream()
                                                .collect(Collectors.groupingBy(CollectToMapExample::getMarks));
        System.out.println(groupStudent);
    }

    private static void filterByname(List<CollectToMapExample> students){
        List<CollectToMapExample> filterResult = students.stream()
                                                .filter(name -> "manjeet".equals(name.getName()))
                                                .collect(Collectors.toList());
      //  System.out.println(filterResult);
        filterResult.forEach(System.out::println);
    }

    private static void filterByMarks(List<CollectToMapExample> student){
        List<CollectToMapExample> filterResult = student.stream()
                                                    .filter(mark -> mark.getMarks() == 90)
                                                    .collect(Collectors.toList());
        
        filterResult.forEach(System.out::println);
    }

    private static void orderByName(List<CollectToMapExample> student){
        List<CollectToMapExample> filterResult = student.stream()
                                                    .sorted(Comparator.comparing(CollectToMapExample::getName))
                                                    .collect(Collectors.toList());
        filterResult.forEach(System.out::println);
    }
}