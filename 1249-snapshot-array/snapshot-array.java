class SnapshotArray {

    int snapVal;
    TreeMap<Integer,Integer>[] history;

    public SnapshotArray(int length) {
        snapVal=0;
        history = new TreeMap[length];
        for(int i=0;i<length;i++){
            history[i] = new TreeMap<Integer,Integer>();
            history[i].put(0, 0);
        }

    }
    
    public void set(int index, int val) {
        history[index].put(snapVal, val);
    }
    
    public int snap() {
        return snapVal++;
    }
    
    public int get(int index, int snap_id) {
        return history[index].floorEntry(snap_id).getValue();
    }
}

/**
 * Your SnapshotArray object will be instantiated and called as such:
 * SnapshotArray obj = new SnapshotArray(length);
 * obj.set(index,val);
 * int param_2 = obj.snap();
 * int param_3 = obj.get(index,snap_id);
 */