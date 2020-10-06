/** 155. Min Stack
  * https://leetcode.com/problems/min-stack/
  
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
 

Example 1:

Input
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]

Output
[null,null,null,null,-3,null,0,-2]

Explanation
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin(); // return -3
minStack.pop();
minStack.top();    // return 0
minStack.getMin(); // return -2
 

Constraints:

Methods pop, top and getMin operations will always be called on non-empty stacks.
*
*/
class MinStack {

    List<Integer> elements = new ArrayList<>();
    List<Integer> mins = new ArrayList<>();


    /** initialize your data structure here. */
    public MinStack() {
        
        
    }
    
    public void push(int x) {
        elements.add(x);
        if (mins.size() == 0) {
            mins.add(x);

        }
        else {
            int lastMin = mins.get(mins.size() - 1);
            mins.add(Math.min(x,lastMin));
            /*
            if (x < lastMin) {
                mins.add(x);
            }
            else {
                mins.add(lastMin);
            }*/
        }

        
    }
    
    public void pop() {
        elements.remove(elements.size() - 1);
        mins.remove(mins.size() - 1);
        
    }
    
    public int top() {
        return elements.get(elements.size() - 1);
    }
    
    public int getMin() {
        return mins.get(mins.size()-1);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
