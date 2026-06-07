class MinStack {
    private ArrayDeque<Integer> stack;
    private ArrayDeque<Integer> minStack;

    public MinStack() {
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }
    
    public void push(int val) {
        stack.push(val);
        if(minStack==null || minStack.isEmpty()){ minStack.push(val); }
        else{int min = minStack.peek();
        min = Math.min(min,val);
        minStack.push(min);
        }
    }
    
    public void pop() {
        if(stack!=null && !stack.isEmpty()) stack.pop();
        if(minStack!=null && !minStack.isEmpty()) minStack.pop();
    }
    
    public int top() {
        if(stack==null || stack.isEmpty()) return 0;
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
