package com.company;


import java.lang.reflect.Array;
import java.util.Arrays;

public class MinHeap {
//    int[] arr;
//    int size;
//    int capacity;
    private int capacity = 10;
    private int size = 0;
    int[] items = new int[capacity];
//    MinHeap(int c) {
//        arr = new int[c];
//        size = 0;
//        capacity = c;
//    }

    private int getLeftChildIndex(int parentIndex) { return 2 * parentIndex + 1; }
    private int getRightChildIIndex(int parentIndex) { return 2 * parentIndex + 2; }
    private int getParentIndex(int childIndex) { return (childIndex - 1) / 2; }

//    int left(int i) {return (2*i + 1);}
//    int right(int i) {return (2*i + 2);}
//    int parent(int i) {return (i-1)/2;}
//    void insert(int x) {
//        if (size == capacity) return;
//        size++;
//        arr[size-1] = x;
//        for (int i = size-1; i != 0 && arr[parent(i)] > arr[i] ; i--) {
//            swap(arr[i], arr[parent(i)]);
//            i = parent(i);
//        }
//    }
    private boolean hasLeftChild(int index) { return getLeftChildIndex(index) < size; }
    private boolean hasRightChild(int index) { return getRightChildIIndex(index) < size; }
    private boolean hasParent(int index) { return parent(index) >= 0; }

    private int leftChild(int index) { return items[getLeftChildIndex(index)]; }
    private int rightChild(int index) { return items[getRightChildIIndex(index)]; }
    private int parent(int index) { return items[getParentIndex(index)]; }

    private void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
    private void ensureExtraCapacity() {
        if (size == capacity) {
            items = Arrays.copyOf(items, capacity * 2);
            capacity *= 2;
        }
    }
    public int peek() {
        if (size == 0) throw new IllegalStateException();
        return items[0];
    }
    public int poll() {
        if (size == 0) throw new IllegalStateException();
        int item = items[0];
        items[0] = items[size-1];
        size--;
        heapifyDown();
        return item;
    }

    public void add(int item) {
        ensureExtraCapacity();
        items[size] = item;
        size++;
        heapifyUp();
    }

    private void heapifyDown() {
        int index = 0;
        while(hasLeftChild(index)) {
            int smallerChildIndex = getLeftChildIndex(index);
            if (hasRightChild(index) && rightChild(index) < leftChild(index)) {
                smallerChildIndex = getRightChildIIndex(index);
            }
            if(items[index] < items[smallerChildIndex]) {
                break;
            } else {
                swap(index, smallerChildIndex);
            }
            index = smallerChildIndex;
        }

    }

    private void heapifyUp() {
        int index = size-1;
        while(hasParent(index) && parent(index) > items[index]) {
            swap(getParentIndex(index),index);
            index = getParentIndex(index);
        }
    }


}

class Test {
    public static void main(String[] args) {
//        MinHeap s = new MinHeap(2);
//        s.insert(2);
//        s.insert(3);
//        s.insert(5);


    }

}

//Heap
//Hashing
//Binary tree
//Binary Search Tree
//BFS
//DFS
//Graph
//Greedy
//trie
//disjoint set
//Bit magic

