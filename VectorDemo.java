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
    public void setNext(Node n) {
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
    public void setData(Object d) {
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
  //public Object get(int pos) {
  //  if(pos > size) {
  //      System.out.println("Position Greator than size");
  //      return;
  //  }
  //  if(pos < 0){
  //      System.out.println("Position cannot be smaller than 0");
  //      return; 
  //  }
  //}

  // Returns Size of Vector
  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return start == null;
  }

  //Remove specified element at given index
  public void remove(int index) {

  }

    //Clear Vector
  public void clear() {

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
    System.out.println("Size of Vector" + v1.size());
    System.out.println("Retrieving first element " + "[" +  v1.firstElement() + "]");
    System.out.println("Retrieving last element " + "[" +  v1.lastElement() + "]"); 
    System.out.println(v1.isEmpty());       
  }
}

