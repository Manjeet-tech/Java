

// push() -> 1  2 3 4
// pop() -> 2 3 4 -> 1
// peak() -> 2 
// size() -> 3
class ArrayImplementationStack{

public static void main(String[] args){

    StackTest st = new StackTest(10);
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    System.out.println(st.toString());
    System.out.println( st.pop());
    System.out.println(st.isEmpty());
    System.out.println(st.peak());
    System.out.println(st.size());
    }

}

class StackTest{
    
    int  top;
    int capacity;
    int[] stack; 

    public StackTest(int cap){
        top = -1;
        capacity = cap;
        stack = new int[cap];
    }


    public void push(int data){
            top++;
            stack[top] = data;
    }

    public  int pop(){
        int result =  stack[top];
        top--;
        return result;
    }

    public  int peak(){
        return stack[top];
    }

    public  boolean isEmpty(){
        return top == -1;
    }

    public  int size(){
        return top + 1;
    }

}

