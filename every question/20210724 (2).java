//包含min函数的栈

import java.util.Stack;

public class Solution {
    Stack<Integer> stack = new Stack();
    Stack<Integer> minStack = new Stack();

    public void push(int node) {
        stack.push(node);
        // 压入最小值
        if(minStack.empty() || node <= minStack.peek()) {
            minStack.push(node);
        }
    }

    public void pop() {
        // 最小栈在相等时出栈
        if(!stack.empty() && stack.peek() == minStack.peek()) {
            minStack.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minStack.peek();
    }
}