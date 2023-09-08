
//i
// ABCDEF
// ABD
//j
class SubsequenceCheck{

public static void main(String args[]){

    String main ="ABCDEF"; 
    String sbSeq ="ABF";

    boolean result = subsequenceCheck(main,sbSeq);

    System.out.println(result);

}

public static boolean subsequenceCheck(String main, String sbSeq){

    int mainLength =  main.length();
    int sbLength = sbSeq.length();
    int j = 0;
    for(int i=0;i<mainLength && j < sbLength;i++){
        if(main.charAt(i) == sbSeq.charAt(j)){
            j++;
        }
    }

    return j == sbLength;
}
}