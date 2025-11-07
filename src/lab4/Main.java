package lab4;

public class Main {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.pop();

        System.out.println("Middle element: " + stack.getMiddle());
        stack.deleteMiddle();
        System.out.println("Middle element after deletion: " + stack.getMiddle());
    }
}
