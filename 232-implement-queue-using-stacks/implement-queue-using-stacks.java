class MyQueue {
    Stack<Integer> str=new Stack<>();
     Stack<Integer> rev=new Stack<>();


    public MyQueue() {
        
    }
    
    public void push(int x) {
        str.push(x);
        
    }
    
    public int pop() {
        while(!str.isEmpty()){
            rev.push(str.pop());
        }
        int a=rev.pop();
         while(!rev.isEmpty()){
            str.push(rev.pop());
        }
        return a;

        
    }
    
    public int peek() {
         while(!str.isEmpty()){
            rev.push(str.pop());
        }
        int a= rev.peek();
         while(!rev.isEmpty()){
            str.push(rev.pop());
        }
        return a;
        
    }
    
    public boolean empty() {
        return str.isEmpty();
        
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