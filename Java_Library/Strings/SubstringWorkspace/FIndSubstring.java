

class FIndSubstring{

    public static void main(String args[]){

        String input = "abcd";
        getSubstringDistinct(input);
    }

    public static void getSubstringDistinct(String input){

        //get the substring
        int sbLength = input.length();
          for(int start=0;start<sbLength;start++){
            for(int end=start+1;end<=sbLength;end++){
                String substringValue = input.substring(start,end);
                System.out.println(input.substring(start,end));

            }
        }
    }
}