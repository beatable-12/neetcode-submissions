class MyCircularQueue {
    private LinkedList<Integer> ll;
    private int s;
    public MyCircularQueue(int k) {
        ll = new LinkedList<>();
        s = k;
    }
    
    public boolean enQueue(int value) {
        if(isFull()) return false;
        ll.addLast(value);
        return true;
    }
    
    public boolean deQueue() {
        if(ll.isEmpty()){
            return false;
        }
        ll.removeFirst();
        return true;
    }
    
    public int Front() {
        if(ll.isEmpty()){
            return-1;
        }
        return ll.getFirst();
    }
    
    public int Rear() {
        if(ll.isEmpty()){
            return-1;
        }
        return ll.getLast();
    }
    
    public boolean isEmpty() {
        return ll.isEmpty();
    }
    
    public boolean isFull() {
        return s == ll.size();
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