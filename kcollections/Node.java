package kcollections;

class Node {
  Object data;
  Node next;

  //Default Constructor
  Node() {
    next = null;
    data = 0;
  }
    //Parameterized Constructor
  Node(Object item, Node n) {
    data = item;
    next = n;
  }

  // Set link to next node
  public synchronized void setNext(Node n) {
    next = n;
  }

  public Node getNext(){
    return next;
  }

  // Retrieve Data
  public Object getData() {
    return data;
  }

  // Set Data
  public synchronized void setData(Object d) {
    data = d;
  }
}

