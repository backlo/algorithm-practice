package example.priorityQueue;

public class PriorityQueue<I extends Number> {

    private int front;
    private int rear;
    private int queueSize;
    private char[] queueArr;

    public PriorityQueue(int queueSize) {
        front = -1;
        rear = -1;
        this.queueSize = queueSize;
        queueArr = new char[queueSize];
    }

    public boolean isEmpty() {
        if (front == rear) {
            front = -1;
            rear = -1;
            return true;
        }

        return false;
    }

    public boolean isFull() {
        return rear == (this.queueSize - 1);
    }

    public void enqueue(char data) {
        if (isFull()) {
            throw new IllegalArgumentException("큐가 가득 찼습니다.");
        }
        if (isEmpty()) {
            queueArr[++rear] = data;
            return;
        }
        int i;

        for (i = rear; i >= front + 1; i--) {
            if (data > queueArr[i]) {
                queueArr[i + 1] = queueArr[i];
                continue;
            }
            break;
        }

        queueArr[i + 1] = data;
        ++rear;
    }

    public char dequeue() {
        if (isEmpty()) {
            throw new IllegalArgumentException("큐가 비었습니다.");
        }
        front = (front + 1) % this.queueSize;
        return queueArr[front];
    }

    public char peek() {
        if (isEmpty()) {
            throw new IllegalArgumentException("큐가 비었습니다.");
        }
        return queueArr[front];
    }

    public void clear() {
        if (isEmpty()) {
            return;
        }
        front = -1;
        rear = -1;
        queueArr = new char[this.queueSize];
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("큐가 비었습니다.");
            return;
        }
        for (int i = front + 1; i <= rear; i++) {
            System.out.print(queueArr[i] + " ");
        }
        System.out.println();
    }
}
