package lab5;

public class Queue {
    int size;
    Node front;
    Node rear;

    Queue(){
        front = rear = null;
        this.size = 0;
    }

    void enqueue(int data){
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next=newNode;
        rear = newNode;
        size++;
    }
    int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty!");
            return -1;
        }

        int value = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }
        size--;

        return value;
    }
    @Override
    public String toString() {
        if (front == null) {
            return "Queue is empty";
        }

        StringBuilder sb = new StringBuilder();
        Node current = front;
        sb.append("Front -> ");
        while (current != null) {
            sb.append(current.data);
            if (current.next != null) sb.append(" -> ");
            current = current.next;
        }
        sb.append(" <- Rear");
        return sb.toString();
    }




}


