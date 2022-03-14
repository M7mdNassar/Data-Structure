package dataStructure;

public class Stack {
    private int[] array;
    private int top;

    public Stack(int size) {
        array = new int[size];
        top = -1;

    }


    public void push(int item) {
        if (isFull())
            return;
        array[++top] = item;

    }

    public int pop() {
        if (isEmpty())
            return -1;
        return array[top--];
    }

    public int top() {
        return array[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == array.length - 1);
    }

    public void reverseWord (String word){
        Stack s = new Stack(word.length());
        for (int i=0 ; i<word.length() ; i++){
            s.push( (int)word.charAt(i));
        }
        while (!s.isEmpty()){
            System.out.print((char) s.pop());

        }


    }

    public static void main(String[] args) {
        Stack stack = new Stack(6);
        System.out.println("Is Empty Stack ? "+stack.isEmpty());
        System.out.println("Is Full Stack ? "+stack.isFull());
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Is Empty Stack ? "+stack.isEmpty());
        System.out.println("Is Full Stack ? "+stack.isFull());
        stack.push(40);
        stack.push(50);
        stack.push(60);
        System.out.println("Is Empty Stack ? "+stack.isEmpty());
        System.out.println("Is Full Stack ? "+stack.isFull());
        System.out.println(stack.top());
        stack.pop();
        System.out.println(stack.top());
        stack.push(60);
        stack.push(70);    // full!!!!!!
        System.out.println(stack.top());
        String word = "Nassar";
        stack.reverseWord(word);

    }

}
