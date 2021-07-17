package hashtable;

import java.util.Scanner;
import java.util.concurrent.RecursiveTask;

public class HashTable {
    private HashNode[] Buckets;
    private int noOfBuckets;
    private int size; // no of key value pair in hash table

    public HashTable() {
        this(10);
    }

    public HashTable(int capacity) {
        this.noOfBuckets = capacity;
        this.Buckets = new HashNode[noOfBuckets];
        this.size = 0;
    }


    class HashNode {
        private Integer key;
        private String value;
        private HashNode next;

        public HashNode(Integer key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    public int getBucketIndex(Integer key) {
        return key % noOfBuckets;
    }


    public void put(Integer key, String value) {
        if (key == null || value == null) {
            throw new IllegalArgumentException("key or value are null");

        }
        int bucketIndex = getBucketIndex(key);
        HashNode head = Buckets[bucketIndex];               //empty bucket is replaced with head
        // check existing node in hash table
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        size++;
        head = Buckets[bucketIndex];
        HashNode node = new HashNode(key, value);
        node.next = head;
        Buckets[bucketIndex] = node;

    }

    public int freqChecker(String value) {
        HashNode node = Buckets[0];
        int wordFreq = 0;
        while (node != null) {
            if (node.value.equals(value)) {
                wordFreq++;
            }
            node = node.next;
        }
        return wordFreq;
    }

    public String getValueOfKey(Integer key) {
        int bucketIndex = getBucketIndex(key);
        HashNode head = Buckets[bucketIndex];
        // check existing node in hash table
        while (head != null) {
            if (head.key.equals(key)) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    public static void main(String[] args) {
        HashTable hashTable = new HashTable();
        hashTable.put(10, "To");
        hashTable.put(20, "be");
        hashTable.put(30, "or");
        hashTable.put(40, "not");
        hashTable.put(50, "to");
        hashTable.put(60, "be");

        System.out.println(hashTable.freqChecker("be"));

        hashTable.inputParagraph(1);
        System.out.println(hashTable.freqChecker("be"));
        System.out.println("The size of hash table ::" + hashTable.size());
    }

    public void inputParagraph(int bucketIndex) {
        String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        System.out.println(sentence.toString());
        String array[] = sentence.split(" ");
        HashTable hashTableWord = new HashTable();
        HashNode head = Buckets[bucketIndex];

        for (String word : array) {
            hashTableWord.put(1, word);
            System.out.println(hashTableWord.getValueOfKey(1));
        }
    }

    private int size() {
        return size;
    }
}

