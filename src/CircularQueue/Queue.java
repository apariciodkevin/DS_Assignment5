package CircularQueue;

public class Queue {
  private Object [] queue;
  private int capacity = 4;
  private int front;
  private int rear;
  private int size;

  public Queue() { // Constructor
      this.queue = new Object[capacity];
      this.front = 0;
      this.rear = 0;
      this.size = 0;
  }

  public Object enqueue(int val){
      if (full()){
        System.out.println("QUEUE IS FULL");
      }
      else {
          queue[rear] = val;
          rear = (rear + 1) % capacity;
          size = size + 1;
      }
      return queue;
  }

  public Object dequeue(){
      Object val = null;
      if (empty()){
          System.out.println("QUEUE IS EMPTY");
      }
      else {
          val = queue[front];
          queue[front] = null;
          front = (front +1) % capacity;
          size = size - 1;
      }
      return  val;
  }

  public boolean empty(){
      if (size == 0){
          return true;
      }
      else {
          return false;
      }
  }

  public boolean full(){
      if (size == capacity){
          return true;
      }
      else {
          return false;
      }
  }

  public int front(){
      return front;
  }

  public int rear(){
      return rear;
  }

  public Object peek(){
      return queue[front];
  }

  public int size(){
      return size;
  }

  public boolean contains(Object val){
      for (int i = 0; i < capacity; i++){
          if ( queue[i] == val){
              return true;
          }
      }
      return false;
  }

  public void printQueue(){
      System.out.print("Queue Elements: ");
      for (int i = 0; i < capacity; i++){
          System.out.print(queue[i] + " ");
      }
      System.out.println();
  }
  public void clear(){
      front = 0;
      rear = 0;
      size = 0;
      for (int i = 0; i < capacity; i++){
          queue[i] = null;
      }
  }
}

