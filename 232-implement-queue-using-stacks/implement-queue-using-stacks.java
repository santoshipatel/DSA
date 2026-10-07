class MyQueue {
    Stack<Integer>s;
    Stack<Integer>helper;
 public MyQueue(){
    s = new Stack<>();
    helper =  new Stack<>();
        }
    public void push(int x) {
        while(s.size() > 0){
            helper.push(s.pop());
        }
        s.push(x);

        while(helper.size() > 0){
            s.push(helper.pop());
        }
        }
    
    public int pop() {
        return s.pop();
        
    }
    
    public int peek() {
        return s.peek();

        
    }
    
    public boolean empty() {
        return s.size()==0;
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */