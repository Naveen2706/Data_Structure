package com.bridgelabz.queue;

import java.util.Scanner;

public class Queue {
    private QueueNode rear = null;
    private QueueNode front = null;
    private int length = 0;

    private class QueueNode {
        private int data;
        private QueueNode next;
        private QueueNode previous;

        public QueueNode(int data) {
            this.data = data;
        }
    }

    public int getLen() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        queue.printQueue();
        queue.dequeue();
        queue.printQueue();
    }

    public void enqueue(int data) {
        QueueNode temp = new QueueNode(data);
        if (front == null) {
            temp.next = rear;
            rear = temp;
            front = temp;
        } else {
            rear.next = temp;
        }
        rear = temp;
        length++;
    }

    public void printQueue() {
        QueueNode temp = front;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void dequeue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the choice 1: for removing front node , 2 : for complete dequeue");
        int choice = scanner.nextInt();
        int result = front.data;
        switch (choice) {
            case 1:
                front = front.next;
                if (front == null)
                    rear = null;
                length--;
                System.out.println(result);
                break;
            case 2:
                while (front != null) {
                    result = front.data;
                    front = front.next;
                    if (front == null)
                        rear = null;
                    System.out.println(result);
                    length--;
                }
                break;
        }
    }

    public boolean searchQueue(int data) {
        QueueNode temp = front;
        while (temp.data != data) {
            temp = temp.next;
        }
        if (temp.data == data)
            return true;
        return false;
    }
}
