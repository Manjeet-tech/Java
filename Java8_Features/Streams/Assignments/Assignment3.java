

// String str = "manjeet";
// Find the length of the string using java stream

class Assignment3{

    public static void main(String args[]){
        String str = "manjeet";
        getLength(str);
    }

    public static void getLength(String str){

         int lengthResult =  str.char()
          .                     .map(c -> 1)
                                .sum();

        System.out.println(lengthResult);
    }


}