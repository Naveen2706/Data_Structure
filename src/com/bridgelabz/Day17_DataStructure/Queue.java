package Day17_DataStructure;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Queue<T> {

    Node head;
    ArrayList<Integer> list = new ArrayList<>();

    class Node {
        T data;
        Node next;

        // constructor
        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    /*
     * for adding the elements in the queue
     * @param now
     *
     * @param new_data ==>T
     */
    public void enQueue(LocalDateTime now, T new_data) {
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new_node;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new_node;
        }
    }

    public void enQueue(T new_data) {
        Node new_node = new Node(new_data);
        if (head == null) {
            head = new_node;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = new_node;
        }
    }

    /*
     * for removing the elements from the queu
     */
    public T deQueue() {
        T data = null;
        if (head == null) {
            //throw new NoSuchElementException("UnderFlow");
            System.out.println("Queue is Empty");
        } else {
            data = head.data;
            head = head.next;
        }
        return data;
    }

    public boolean isEmpty() {
        if (head == null)
            return true;
        else
            return false;
    }

    /*
     * to calculate the size of the queue
     */
    public int getSize() {
        int size = 0;
        if (head == null) {
            return -1;
        } else {
            Node current = head;
            while (current != null) {
                current = current.next;
                size++;
            }
        }
        return size;
    }

    /*
     * to get the last element from the queue
     */
    public T peek() {
        T data = null;
        if (head == null)
            return data;
        else {
            Node current = head;
            Node previous = null;
            while (current != null) {
                previous = current;
                current = current.next;
            }
            data = previous.data;
        }
        return data;
    }

    // for printing the elements of the queue
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    //For practice
    public ArrayList<Integer> displayEach() {
        Node current = head;
        while (current != null) {
            list.add((Integer) current.data);
            //System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
        return list;
    }
}
