class MinStack {
    Stack<Integer> as;
    Stack<Integer> po;
    public MinStack() {
        as =new Stack<>();
        po = new Stack<>();
    }
    
    public void push(int val) {
        
        as.push(val);
        if(po.isEmpty()  || val <=po.peek()){
            po.push(val);
        }
    }
    
    public void pop() {
        if(po.peek().equals(as.peek())){
            po.pop();
        }
        as.pop();

    }
    
    public int top() {
        return as.peek();
    }
    
    public int getMin() {
        return po.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */