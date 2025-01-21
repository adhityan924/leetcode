class RecentCounter {
    LinkedList<Integer> calls = new LinkedList();

    public RecentCounter() {
        calls= new LinkedList();
    }
    
    public int ping(int t) {
        calls.addLast(t);
        while(calls.getFirst()<t-3000){
            calls.removeFirst();
        }

        return calls.size();
    }
}

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter obj = new RecentCounter();
 * int param_1 = obj.ping(t);
 */