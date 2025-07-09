class MyStack {
  Queue<Integer> po;
    public MyStack() {
      
            po = new LinkedList<>();
        }
    
    
    public void push(int x) {
        po.add(x);
        int n =po.size();
        for(int i=1;i<n;i++){
            po.add(po.remove());
        }
    }
    
    public int pop() {
        return po.remove();
    }
    
    public int top() {
        return po.peek();
    }
    
    public boolean empty() {
        return po.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */