import java.util.*;


// "abaac" --> aaabc
// "aacba" --> aaabc

class AnagramCheck{

    public static void main(String args[]){

        String s1 = "abaac";
        String s2 = "aacba";  // aacbab ==> false as frequency of b doesn't matches.

        boolean result = checkAnnagram(s1,s2);

        System.out.println(result);
    }

    public static boolean checkAnnagram(String s1, String s2){
        
        //boundry condition
        if(s1.length() != s2.length()){
            return false;
        }
        char[] s1Array = s1.toCharArray();
        Arrays.sort(s1Array);
        String sortS1 =  new String(s1Array);

        char[] s2Array = s2.toCharArray();
        Arrays.sort(s2Array);
        String sortS2 =  new String(s2Array);

        return sortS2.equals(sortS1);

    }
}

