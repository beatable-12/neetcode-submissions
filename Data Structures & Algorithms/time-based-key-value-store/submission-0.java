class TimeMap {
Map<String,ArrayList<Pair>> hm ;
    public TimeMap() {
        hm = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(hm.get(key) == null){
            hm.put(key,new ArrayList<>());
        }
        hm.get(key).add(new Pair(value,timestamp));
    }
    
    public String get(String key, int timestamp) {
        if(hm.get(key) == null) return "";
        List<Pair> ls = hm.get(key);
        int l = 0;
        int h = ls.size()-1;
        String ans ="";
        while(l<=h){
            int m = l+(h-l)/2;
            if(ls.get(m).timestamp<=timestamp){
                ans = ls.get(m).value;
                l = m+1;
            }else{
                
                h = m-1;
            }
        }
        return ans;
    }
}
class Pair{
    String value;
    int timestamp;
    Pair(String value,int timestamp){
        this.value = value;
        this.timestamp = timestamp;
    }
}
