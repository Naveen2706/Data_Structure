package Day17_DataStructure;

public class Dequeue<T> {
    Node head;

    class Node {
        T data;
        Node next;

        // constructor
        public Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFront(T item) {
        Node node = new Node(item);
        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    public void addRear(T item) {
        Node node = new Node(item);
        Node current = head;
        if (head == null) {
            head = node;
        } else {
            while (current.next != null) {
                current = current.next;
            }
            current.next = node;
            node = current;
        }
    }

    public T removeFront() {
        T data = head.data;
        head = head.next;
        return data;
    }

    public T removeRear() {
        Node current = head;
        T data = null;
        Node prev = null;
        while (current.next != null) {
            prev = current;
            current = current.next;
        }
        data = current.data;
        prev.next = null;
        return data;
    }

    public boolean isEmpty() {
        if (head == null)
            return true;

        else
            return false;
    }

    /*
     * @purpose returning size of deQueue
     * @return Integer Size
     */
    public int size() {
        Node current = head;
        int size = 0;
        if (head == null) {
            System.out.println("Queue is empty");
        } else {
            while (current != null) {
                size++;
                current = current.next;
            }
            return size;
        }
        return -1;
    }

    public void show() {
        Node current = head;
        if (head == null) {
            System.out.println("list is empty..!!");
        } else {
            while (current.next != null) {
                System.out.print(current.data + "");
                current = current.next;
            }
            System.out.println(current.data);
        }
    }
}
