import kcollections.*;
public class VectorDemo {
  public static void main(String[] args) {
    SimpleVector v1 = new SimpleVector();
    String simplevector = new String("Vector");
    v1.addElement(6); //Add Integer
    v1.addElement('a'); //Add Character
    v1.addElement(1.2F); //Add Float
    v1.addElement(simplevector); //Add String
    v1.display();
    //Remove 4th element
    v1.remove(4);
    v1.display();
    System.out.println("Size of Vector" + v1.size());
    System.out.println("Retrieving first element " + "[" +  v1.firstElement() + "]");
    System.out.println("Retrieving last element " + "[" +  v1.lastElement() + "]"); 
    System.out.println("Vector empty " + v1.isEmpty());    
    //Add at first posotion
    System.out.println("After adding element at 1st position ");
    v1.add(1, '2');
    v1.display();
    //Add at 3rd position
    v1.add(3, 4);
    System.out.println("After adding element at 3rd position ");
    v1.display();
    //Retrieve data at 2 position
    Object output = v1.get(2);
    System.out.println(output);
    //Clear vector
    v1.clear();  
    v1.display(); 
  }
}