package kcollections;
import kcollections.Node;

public class SimpleVector {
  Node start;
  Node end;
  int size;

  public SimpleVector() {
    start = null;
    end = null;
    size = 0;
  }

  // Add data at specific position
  public void add(int index, Object data) {
    Node newnode = new  Node();
    newnode.setData(data);
    if(index == 1) {
      newnode.setNext(start);
      start = newnode;
    } else {
      int i = 1;
      Node temp = start;
      Node temp1 = null;
      while(i < index - 1) {
        temp = temp.getNext();
        i++;
      }
      temp1 = temp.getNext();
      temp.setNext(newnode);
      newnode.setNext(temp1);
    }
  }

  // Add data at the end of the vector
  public void addElement(Object data) {
    Node nptr = new Node();
    nptr.setData(data);
    if(start == null) {
      start = nptr;
      end = start;    
    } else {
      end.setNext(nptr);
      end = nptr;
    }
    size++;
  }

  //Retrieve first element
  public Object firstElement() {
    if(start != null) { 
      return start.data;
    }
    return null; 
  }

  //Retrieve last element
  public Object lastElement() {
    if(end != null) {
      return end.data;
    }
    return null; 
  }

  //Retrieve element from given position
  public Object get(int pos) {
   if(pos > size || pos < 0) {
       System.out.println("Position doesnot exists");
       return null;
   }
   if(pos == 1) {
    return start.data;
   }
   if(pos == size) {
    return end.data;
   }
   int i = 1;
   Node temp = start;
   while(i < pos) {
      temp = temp.getNext();
      i++;
   }
   return temp.data;
  }

  // Returns Size of Vector
  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return start == null;
  }

  //Remove specified element at given index
  public void remove(int index) {
    Node temp = start;
    Node todelete = null;
    int  i = 1;
    if(index == 1) {
      start = start.next;
      temp = null;
      return;
    }
    while(i < index - 1) {
      temp = temp.getNext();
      i++;
    }
    todelete = temp.getNext();
    temp.setNext(todelete.getNext());
    todelete = null;
    if(index == size) {
      end = temp;
    }
  }

    //Clear Vector
  public void clear() {
    start = end = null;
    size = 0;
    System.gc();
  }

    //Display the Vector
  public void display() {
    if(size == 0) {
      System.out.println("The Vector is empty");
      return;
    }
    if (start.getNext() == null) {
      System.out.println(start.getData());
      return;
    }
    Node temp = start;
    while(temp.getNext() !=null) {
      System.out.println("[" + temp.getData() + "]");
      temp = temp.getNext();
    }
      System.out.println("[" + temp.getData() + "]");
  }
}


