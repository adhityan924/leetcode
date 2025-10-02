class TimeMap {

    Map<String , TreeMap<Integer,String>> tmap;
    public TimeMap() {
        tmap= new HashMap<String,TreeMap<Integer,String>>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!tmap.containsKey(key)){
            tmap.put(key, new TreeMap<Integer,String>());
        }
        tmap.get(key).put(timestamp,value);
    }
    
    public String get(String key, int timestamp) {
        if(!tmap.containsKey(key)){
            return "";
        }

        Integer floorval = tmap.get(key).floorKey(timestamp);

        if(floorval !=null){
            return tmap.get(key).get(floorval);
        }

        return "";
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */