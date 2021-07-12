    package com.bridgelabz.linkedlistprograms;

    public class SingleLinkList {
        private ListNode head;              //head creation

        public static class ListNode {
            private int data;
            private ListNode next;              //ListNode class

            public ListNode(int data) {
                this.data = data;
                this.next = null;
            }
        }

        public boolean searchValue(int searchValue) {           // for searching node with perticular value with position
            ListNode current = head;
            int nodePosition = 1;
            while (current != null) {
                if (current.data == searchValue) {
                    System.out.println("Value found at node number ::" + nodePosition);
                    return true;
                }
                nodePosition++;
                current = current.next;
            }
            return false;
        }

        public static void main(String[] args) {
            SingleLinkList singleLinkList = new SingleLinkList();
            singleLinkList.head = new ListNode(56);
            ListNode thirdNode = new ListNode(70);
            singleLinkList.head.next = thirdNode;
            ListNode secondNode = new ListNode(30);
            secondNode.next = thirdNode;
            singleLinkList.head.next = secondNode;
            singleLinkList.printLinkedList();                                   //for printing linkedlist

            System.out.println('\n' + "adding node with value 40 in between");
            singleLinkList.insert(secondNode, thirdNode, 40);          // for adding 40 in between
            singleLinkList.printLinkedList();

            System.out.println('\n' + "Removing node with value 40 from between ::");
            singleLinkList.pop(secondNode, thirdNode);                  //for removing node from between
            singleLinkList.printLinkedList();

            System.out.println('\n' + "Sorting Linkedlist in ascending order ::");
            singleLinkList.sortList();                                      //for sorting nodes in ascending order
            singleLinkList.printLinkedList();

            System.out.println('\n' + "removing first node ");                 //removing first node
            singleLinkList.pop(null, secondNode);
            singleLinkList.printLinkedList();

            System.out.println('\n' + "removing last node ");                 //removing last node
            singleLinkList.pop(secondNode, null);
            singleLinkList.printLinkedList();

        }

        public void printLinkedList() {                                      //for printing node
            ListNode pointer = head;
            while (pointer != null) {
                System.out.print(pointer.data + " ===> ");
                pointer = pointer.next;
            }
            System.out.println("null");
        }

        public void insert(ListNode prevNode, ListNode afterNode, int newValue) {       //for inserting node
            ListNode newNode = new ListNode(newValue);
            prevNode.next = newNode;
            newNode.next = afterNode;
        }


        public void pop(ListNode prevNode, ListNode afterNode) {
            if (prevNode == null) {                                          //for removing head
                head = afterNode;
                return;

            } else if (afterNode == null) {                                     //for removing last element
                prevNode.next = null;
                return;
            }

            prevNode.next = afterNode;                                          //for removing node
        }

        public void sortList() {

            // Node current will point to head
            ListNode current = head, index = null;

            int temp;

            if (head == null) {
                return;
            } else {
                while (current != null) {
                    // Node index will point to node next to current
                    index = current.next;

                    while (index != null) {
                        // If current node's data is greater
                        // than index's node data, swap the data between them
                        if (current.data > index.data) {
                            temp = current.data;
                            current.data = index.data;
                            index.data = temp;
                        }
                        index = index.next;
                    }
                    current = current.next;
                }
            }
        }
    }



