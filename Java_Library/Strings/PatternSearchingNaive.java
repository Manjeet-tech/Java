
// txt = "ABCABCD";
// pat="ABCD"
class PatternSearchingNaive{

public static void main(String args[]){

    String text = "ABABCD";
    String  pat="AB";

    patternSearch(text,pat);

}


public static void patternSearch(String text, String pat){

    int textLength = text.length();
    int patLength =  pat.length();
    int window = textLength - patLength;

    if(textLength < patLength){
        System.out.println("No match");
    }

    for(int textIndex=0; textIndex<=window;textIndex++){
        int patIndex;
        for(patIndex=0; patIndex < patLength; patIndex++){
            if(pat.charAt(patIndex) != text.charAt(textIndex + patIndex)){
                break;
            }
            if(patIndex == (patLength-1)){
                
                System.out.println("indexMatch: " +textIndex);
            }  
        }
        System.out.println("No match found");
    }
     
}



}