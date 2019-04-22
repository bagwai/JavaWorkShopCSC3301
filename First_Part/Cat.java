                                /** Class example demostrating a
                                hiding and overriding methods **/
                                // the file name: Cat.java

class Animal {
public static void testClassMethod() {
System.out.println("The class method in Animal.");
}
public void testInstanceMethod() {
System.out.println("The instance method in Animal.");
}
} // end of the Animal class
public class Cat extends Animal {
    public static void testClassMethod() {
    System.out.println("The class method in Cat.");
}
  public void testInstanceMethod() {
  System.out.println("The instance method in Cat.");
}
  public static void main(String[] args) {
  Cat myCat = new Cat();
  Animal myAnimal = myCat;
  myAnimal.testClassMethod();
  myAnimal.testInstanceMethod();
  }
} // end of the Cat class
