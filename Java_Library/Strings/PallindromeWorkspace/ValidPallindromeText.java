

// Input: s = "A man, a plan, a canal: Panama"
// Output: true
// Explanation: "amanaplanacanalpanama" is a palindrome.

// Example 2:
// Input: s = "race a car"
// Output: false
// Explanation: "raceacar" is not a palindrome.

// Two Pointer technique

class ValidPallindromeText{

    public static void main(String[] args){

        String input =  "A man, a plan, a canal: Panama";

        validPallindome(input);
    }

    public static void validPallindome(String input){

        String updated_String = "";

        for(char c : input.toCharArray()){

            if(Character.isDigit(c) || Character.isLetter(c)){
                updated_String += c;
            }          
        }

        String modifyLowercase = updated_String.toLowerCase();
        boolean result = useTwoPointerPallCheck(modifyLowercase);
        System.out.println(result);
    }

public static boolean useTwoPointerPallCheck(String input){

    int start = 0;
    int end = input.length() - 1;

    while(start < end){
        if(input.charAt(start) != input.charAt(end)){
            return false;
        }
            start++;
            end--;
    }

    return true;
}

}