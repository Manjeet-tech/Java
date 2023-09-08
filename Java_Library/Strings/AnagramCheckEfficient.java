
class AnagramCheckEfficient{
    public static void main(String args[]){

        String s1 = "abaacd";
        String s2 = "aacbab";  // aacbab ==> false as frequency of b doesn't matches.

        boolean result = checkAnnagram(s1,s2);

        System.out.println(result);
    }

    //frequency count method
    public static boolean checkAnnagram(String s1, String s2){
        
        if(s1.length() != s2.length()){
            return false;
        }

        char[] count = new char[256];
        
        for(int i=0;i<s1.length();i++){
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }

        for(int i=0;i<count.length;i++){
            if(count[i] != 0){
                return false;
            }
            
        }

        return true;
    }
}