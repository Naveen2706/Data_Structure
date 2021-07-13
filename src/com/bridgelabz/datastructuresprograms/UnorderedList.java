package com.bridgelabz.datastructuresprograms;

import Utility.Utility;

public class UnorderedList {
    public static void main(String[] args) {
        Utility utility = new Utility();
        utility.readWordfromfile();
    }
}

class Link {
    private ListNode head;
    private int size;

    class ListNode {
    ListNode data;
    ListNode next;
public ListNode() {
        this.data = null;
        this.next = null;
}
    }
}