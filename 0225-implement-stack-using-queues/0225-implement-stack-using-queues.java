class MyStack {
    ArrayDeque<Integer> al=new ArrayDeque<>();
    public MyStack() {
        
    }
    
    public void push(int x) {
        al.push(x);
    }
    
    public int pop() {
        return al.pop();
    }
    
    public int top() {
        return al.peek();
    }
    
    public boolean empty() {
        return al.isEmpty();
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