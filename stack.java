public class Stack {
    int max = 5;
    int[] stack = new int[max];
    int top = -1;

    
    void push(int value) {
        if (top == max - 1) {
            System.out.println("Stack Overflow");
        } else {
            top++;
            stack[top] = value;
            System.out.println("Pushed: " + value);
        }
    }
    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            System.out.println("Popped: " + stack[top]);
            top--;
        }
    }

    public static void main(String[] args) {
        StackDemo s = new StackDemo();

        s.push(10);
        s.push(20);
        s.push(30);

        s.pop();
        s.pop();
        s.pop();
        s.pop();
    }
}