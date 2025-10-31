package lab4;
class DLLNode {
    int data;
    DLLNode prev;
    DLLNode next;

    DLLNode(int data) {
        this.data = data;
    }
}

class MyStack {
    DLLNode head;
    DLLNode mid;
    int count;

    MyStack() {
        head = null;
        mid = null;
        count = 0;
    }


    void push(int data) {
        DLLNode newNode = new DLLNode(data);
        newNode.next = head;

        if (head != null)
            head.prev = newNode;

        head = newNode;
        count++;


        if (count == 1)
            mid = newNode;
        else if (count % 2 == 0)
            mid = mid.prev;
    }


    int pop() {
        if (count == 0) {
            System.out.println("Stack is empty");
            return -1;
        }

        int item = head.data;
        head = head.next;
        if (head != null)
            head.prev = null;

        count--;


        if (count == 0)
            mid = null;
        else if (count % 2 == 1)
            mid = mid.next;

        return item;
    }


    void deleteMiddle() {
        if (count == 0) {
            System.out.println("Stack is empty, nothing to delete");
            return;
        }

        DLLNode temp = mid;


        if (mid.prev != null)
            mid.prev.next = mid.next;
        if (mid.next != null)
            mid.next.prev = mid.prev;

        count--;


        if (count == 0) {
            mid = null;
            head = null;
        } else if (count % 2 == 0)
            mid = temp.next;
        else
            mid = temp.prev;
    }


    int getMiddle() {
        if (count == 0) {
            System.out.println("Stack is empty");
            return -1;
        }
        return mid.data;
    }
}



