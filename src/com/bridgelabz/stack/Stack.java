package stack;

public class Stack {
    private ListNode top;
    private int length;

    private class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public Stack() {
        top = null;
        length = 0;
    }

    public int getLength() {
        return length;

    }

    public void push(int data) {                        //pushing node in stack
        ListNode tem = new ListNode(data);
        tem.next = top;
        top = tem;
        length++;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        System.out.println("Stack top value ::" + stack.peak());
        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.display(stack);

/*
        System.out.println("Stack top value ::" + stack.peek());
        System.out.println("Stack ::" + stack.pop());
        System.out.println("Stack ::" + stack.pop());
        System.out.println("Stack ::" + stack.pop());
        System.out.println("Stack :: " + stack.isEmpty());
        System.out.println(" " + stack);
  */
    }

    public boolean isEmpty() {
        return length == 0;
    }

    private int peak() {
        return top.data;
    }

    public int pop() {
        int result = top.data;
        top = top.next;
        length--;
        return result;
    }

    public void display(Stack stack) {
        while (!isEmpty()) {
            System.out.println(stack.peak());
            stack.pop();
        }
    }

    @Override
    public String toString() {
        return "Stack [top=" + top + ", length=" + length + "]";
    }
}
