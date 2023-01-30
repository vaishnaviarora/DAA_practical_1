import java.util.Stack;

class My_Stack{
    int size;
    int arr[];
    int peek;

    void fun(int size){
        this.size=size;
        this.arr = new int[size];
        this.peek = -1;
    }

    void push(int x){
        if(!isFull()){
            peek++;
            arr[peek]=x;
            System.out.println("Pushed element:"+x);
        }
        else {
            System.out.println("Stack is full !");
        }

    }
    public int pop() {
        if (!isEmpty()) {
            int returnedTop = peek;
            peek--;
            System.out.println("Popped element :" + arr[returnedTop]);
            return arr[returnedTop];

        } else {
            System.out.println("Stack is empty !");
            return -1;
        }
    }

   public boolean isEmpty(){
        return (peek==-1);
    }

    public boolean isFull(){
        return (size-1==peek);
    }

    public int top(){
        return peek+1;
    }
}
public class stack{
    public static void main(String[] args){
        My_Stack s = new My_Stack();
        s.fun(10);
        s.push(10);
        s.push(30);
        s.push(50);
        s.push(40);
        s.pop();
        s.pop();
        System.out.println(s.isFull());
        System.out.println(s.top());
    }
}

