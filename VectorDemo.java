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

class SimpleVector {
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


public class VectorDemo {
  public static void main(String[] args) {
    SimpleVector v1 = new SimpleVector();
    String simplevector = new String("Vector");
    v1.addElement(6); //Add Integer
    v1.addElement('a'); //Add Character
    v1.addElement(1.2F); //Add Float
    v1.addElement(simplevector); //Add String
    v1.display();
    // v1.remove(4);
    // v1.display();
    // v1.clear();
    // v1.display();
    // // System.out.println("Size of Vector" + v1.size());
    // System.out.println("Retrieving first element " + "[" +  v1.firstElement() + "]");
    // System.out.println("Retrieving last element " + "[" +  v1.lastElement() + "]"); 
    // System.out.println(v1.isEmpty());    
    v1.add(1, '2');
    v1.display();
    Object output = v1.get(2);
    System.out.println(output);   
  }
}