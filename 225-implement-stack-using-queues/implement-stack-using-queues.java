import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> q;
    Queue<Integer> helper;

    public MyStack() {
        q = new LinkedList<>();
        helper = new LinkedList<>();
    }
    
    public void push(int x) {
        // Step 1: Main queue (q) ke saare elements helper queue mein daal do
        while (!q.isEmpty()) {
            helper.add(q.remove());
        }

        // Step 2: Naya element q mein add karo
        q.add(x);

        // Step 3: Helper queue se saare elements wapas q mein daal do
        while (!helper.isEmpty()) {
            q.add(helper.remove());
        }
    }
    
    public int pop() {
        return q.remove(); // LIFO order maintain ho chuka hai, front element hi stack top hoga
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}