import java.util.*;

class CheckOptionalOfNUllable{


    public static void main(String[] args){

        Optional<String> test = Optional.ofNullable("manjeet");

        System.out.println(test.get());

        Optional<String> test2 = Optional.ofNullable(null);
        System.out.println(test2);
 
    }
}
