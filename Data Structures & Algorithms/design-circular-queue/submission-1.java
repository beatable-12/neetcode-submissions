class MyCircularQueue {
Node head;
Node tail;
int size;
int capacity;
    public MyCircularQueue(int k) {
        size = 0;
        capacity=k;
        head = null;
        tail = null;
    }
    
    public boolean enQueue(int value) {
        if(size == capacity) return false;

        size++;
        Node temp = head;
        Node newNode = new Node(value);
        if(head ==null){
            head= newNode;
            tail = newNode;
            tail.next = head;
        }else{
            tail.next = newNode;
            tail = tail.next;
            tail.next = head;
        }
        
        return true;
    }
    
    public boolean deQueue() {
        if(head == null && tail == null) return false;
        if(head == tail){
            size--;
            head =null;
            tail=null;
            return true;
        }
        size--;
        head = head.next;
        tail.next = head;
        return true;
    }
    
    public int Front() {
        if(head == null){
            return -1;
        }else{
            return head.val;
        }
    }
    
    public int Rear() {
        if(tail == null){
            return -1;
        }else{
            return tail.val;
        }
    }
    
    public boolean isEmpty() {
        return tail == null && head==null;
    }
    
    public boolean isFull() {
        return size == capacity;
    }
}
class Node{
    int val;
    Node next;
    public Node(int val){
        this.val = val;
        this.next = null;
    }
}


/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */