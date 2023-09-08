

class ReverseEfficient{

public static void main(String args[]){
    reverse("welcome");
}

    public static void reverse(String str){

        char[] chStr = str.toCharArray();
        int strLength =  chStr.length;

        int start = 0;
        int end = strLength - 1;
        while(start <=end){
            swap(chStr,start,end);
            start++;
            end--;
        }

        System.out.println(chStr);
    }

    public static void swap(char[] arr, int low, int high){

        char temp =  arr[low];
        arr[low] = arr[high];
        arr[high] = temp;
    }
}