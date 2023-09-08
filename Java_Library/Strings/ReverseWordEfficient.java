

// Welcome to Gfg
//After reversing words in the string:
//Gfg to Welcome

class ReverseWordEfficient{

    public static void main(String args[]){

        reverseWords("Welcome");
        
    }

    public static void reverseWords(String s1){

        char[] arr = s1.toCharArray();
        int stringLen = arr.length;

        int start = 0;
        for(int end=0; end<stringLen; end++){
            if(arr[end] == ' '){
                reverse(arr,start,end-1);
                start = end + 1;
            }
            
        }
            reverse(arr,start,stringLen-1); //emocleW ot
            reverse(arr,0,stringLen-1); // to Welcome

        System.out.println(arr);
    }

    public static void reverse(char[] arr, int low, int high){
        
        while(low <= high){
            swap(arr, low, high);
            low++;
            high--;
        }
    }

    public static void swap(char[] arr, int low, int high){

        char temp = arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }

}