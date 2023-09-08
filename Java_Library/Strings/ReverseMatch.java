
class ReverseMatch{
    public static void main(String args[]){

        String s1 = "manjeet";
        String result = reverse(s1);

        System.out.println(result);
    }
    public static String reverse(String s1){

    StringBuilder sb = new StringBuilder(s1);
    return sb.reverse().toString();
    
    }
    
}


