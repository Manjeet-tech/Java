import java.util.*;

class CheckOptionalOf{

public static void main(String[] args){

    Optional<String> test = Optional.of("manjeet");
    
    System.out.println(test);
    System.out.println(test.get());

    Optional<String> test2 = Optional.of(null);

    System.out.println(test2);
}


}