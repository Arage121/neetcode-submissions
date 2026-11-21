class MinStack {
    Stack<Integer> st;
    Stack<Integer> minSt;
    public MinStack() {
        st = new Stack<>();
        minSt = new Stack<>();
    }
    
    public void push(int val) {
        st.push(val);
        if (minSt.isEmpty() || val <= minSt.peek()) {
            minSt.push(val);
        }
    }
    
    public void pop() {
        if(!st.isEmpty()) {
            if (st.peek().equals(minSt.peek())) {
                minSt.pop();
            }
            st.pop();
        }
    }
    
    public int top() {
        if(!st.isEmpty()) return st.peek();
        return -1;
    }
    
    public int getMin() {
        return minSt.peek();
    }
}
