class MyStack {
    Queue<Integer> str=new ArrayDeque<>();
    Queue<Integer> rev=new ArrayDeque<>();

    public MyStack() {
        
        
    }
    
    public void push(int x) {
        str.offer(x);
        
    }
    
    public int pop() {
        while(str.size()!=1){
            rev.offer(str.poll());
        }
       int a= str.poll();
         while(!rev.isEmpty()){
            str.offer(rev.poll());
        }
        return a;
    }
    
    public int top() {
        int a= pop();
         push(a);
         return a;

        
    }
    
    public boolean empty() {
        return str.isEmpty();
        
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