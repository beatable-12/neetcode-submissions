class StockSpanner {
private List<Integer> arr;
    public StockSpanner() {
        arr = new ArrayList<>();
    }
    
    public int next(int price) {
        arr.add(price);
        int count = 0;
        int n = arr.size();
        if(n == 1) return 1;
        int temp = arr.get(n-1);
        for(int i = n-1;i>=0;i--){
            if(arr.get(i)<=temp){
                count++;
                
            }else{
                break;
            }
        }
        return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */