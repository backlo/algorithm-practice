package example;

public interface QueueInterface {
    boolean isEmpty();
    boolean isFull();
    void enqueue(String data);
    String dequeue();
    String peek();
    void clear();
}
