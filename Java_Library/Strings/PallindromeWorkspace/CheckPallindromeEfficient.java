
class CheckPallindromeEfficient{

    public static void main(String args[]){

        String value = "abba"; // false -> abca

        boolean result = checkPallindrome(value);

        System.out.println(result);
    }

    public static boolean checkPallindrome(String value){
            int start = 0;
            int last = value.length() - 1;

          while(start < last){
            char st = value.charAt(start); //0->a 1->b 3->b
            char lt = value.charAt(last);  //3->a 2->b 1->b

             if(st == lt){
                start++;
                last--;
            }else
            return false;
          }

        return true;    
  }
}