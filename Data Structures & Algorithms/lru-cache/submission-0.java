class LRUCache {
private Map<Integer,Node> cache;
private int cap;
private Node left;
private Node right;
    public LRUCache(int capacity) {
        this.cap = capacity;
        cache = new HashMap<>();
        this.left = new Node(0,0);
        this.right = new Node(0,0);
        this.left.next = this.right;
        this.right.prev = this.left;
    }

    public void remove(Node node){
        Node nextNode = node.next;
        Node prevNode = node.prev;
        prevNode.next = nextNode;
        nextNode.prev = prevNode;
    }

    public void insert(Node node){
        Node prevNode = this.right.prev;
        prevNode.next = node;
        node.prev = prevNode;
        node.next = this.right;
        this.right.prev = node;
    }
    
    public int get(int key) {
        if(cache.containsKey(key)){
            Node node = cache.get(key);
            remove(node);
            insert(node);
            return node.value;
        }else{
            return -1;
        }

    }
    
    public void put(int key, int value) {
        if(cache.containsKey(key)){
           remove(cache.remove(key)); 
        }
        Node newNode = new Node(key,value);
        cache.put(key,newNode);
        insert(newNode);
        if(cache.size()>cap){
            Node lru = this.left.next;
            remove(lru);
            cache.remove(lru.key);
        }
    }
}

class Node {
    int key;
    int value;
     Node next;
    Node prev;
    
        public Node(int key ,int value){
            this.key = key;
            this.value = value;
            this.prev = null;
            this.next = null;
            
        }
}