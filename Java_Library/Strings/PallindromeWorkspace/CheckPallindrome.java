
class CheckPallindrome{

    public static void main(String args[]){
        String value = "abca";
        String result = revValue(value);
        if(result.equals(value))
            System.out.println(value +" is Pallidrome");
        else
         System.out.println(value +" is not Pallidrome");
    }

    private static String revValue(String input){
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }

}