class CustomStack {
    private Stack<Integer> stackIn;
    private Stack<Integer> stackOut;
    private int max;
    private int size;

    public CustomStack(int maxSize) {
        max = maxSize;
        size = 0;
        stackIn = new Stack<>();
        stackOut = new Stack<>();
    }

    public void push(int x) {
        if (size == max)
            return;
        while (!stackOut.isEmpty()) {
            stackIn.add(stackOut.pop());
        }
        stackIn.push(x);
        size++;
    }

    public int pop() {
        while (!stackOut.isEmpty()) {
            stackIn.push(stackOut.pop());
        }
        if (size > 0)
            size--;
        else if (size == 0)
            return -1;
        return stackIn.pop();
    }

    public void increment(int k, int val) {
        int temp = k;
        while (!stackOut.isEmpty()) {
            stackIn.push(stackOut.pop());
        }
        while (size - temp > 0) {
            temp++;
            stackOut.push(stackIn.pop());
        }
        while (!stackIn.isEmpty()) {
            stackOut.push(stackIn.pop() + val);
        }
    }
}

/**
 * Your CustomStack object will be instantiated and called as such:
 * CustomStack obj = new CustomStack(maxSize);
 * obj.push(x);
 * int param_2 = obj.pop();
 * obj.increment(k,val);
 */