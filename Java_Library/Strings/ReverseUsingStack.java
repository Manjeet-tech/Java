import java.util.*;

class ReverseUsingStack{

public static void main(String args[]){

    String result1 = reverse("abcd is alphabet");
   // String result = reverse(result1);

    System.out.println(result1);
}    

public static String reverse(String s1){

    char[] chString = s1.toCharArray();
  //  Stack<Character> st = new Stack<Character>();
    Deque<Character> st = new ArrayDeque<>();

    for(int i=0; i<chString.length; i++){
        st.push(chString[i]);
    }

    for(int i=0;i<chString.length;i++){
        chString[i] = st.pop();
    }

    return new String(chString);
}

}