class MyCircularQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

   
    public MyCircularQueue(int k) {
        capacity = k;
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    
    public boolean enQueue(int value) {
        if (isFull()) return false;
        rear = (rear + 1) % capacity;
        queue[rear] = value;
        size++;
        return true;
    }

    
    public boolean deQueue() {
        if (isEmpty()) return false;
        front = (front + 1) % capacity; 
        size--;
        return true;
    }

    
    public int Front() {
        if (isEmpty()) return -1;
        return queue[front];
    }

    
    public int Rear() {
        if (isEmpty()) return -1;
        return queue[rear];
    }

    
    public boolean isEmpty() {
        return size == 0;
    }

   
    public boolean isFull() {
        return size == capacity;
    }

    
    public static void main(String[] args) {
        MyCircularQueue circularQueue = new MyCircularQueue(3);
        System.out.println(circularQueue.enQueue(1)); 
        System.out.println(circularQueue.enQueue(2)); 
        System.out.println(circularQueue.enQueue(3)); 
        System.out.println(circularQueue.enQueue(4)); 
        System.out.println(circularQueue.Rear());     
        System.out.println(circularQueue.isFull());   
        System.out.println(circularQueue.deQueue());  
        System.out.println(circularQueue.enQueue(4)); 
        System.out.println(circularQueue.Rear());     
    }
}
