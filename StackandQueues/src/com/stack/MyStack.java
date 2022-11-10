package com.stack;

import java.util.ArrayList;

public class MyStack {
  ArrayList<Integer> al = new ArrayList<>();

  void push(int x){
      al.add(x);
  }
  int pop() {
      int res = al.get(al.size() - 1);
      al.remove(al.size() - 1);
      return res;
  }
  int peek() {
      return al.get(al.size() - 1);
  }
  boolean isEmpty() {
      return al.isEmpty();
  }
  int size() {
      return al.size();
  }


}
class  Test {
    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(10);
        s.push(20);
        System.out.println(s.pop());
        s.push(30);

    }
}
