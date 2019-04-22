                                      /** Class example demostrating a
                                      how to assess methods in the super class
                                      the file name: Son.java**/

class Father {
public void printMethod() {
System.out.println("Printed in Father class.");
}
} // end of the Father class

public class Son extends Father {

//overrides printMethod in Father class
public void printMethod() {
super.printMethod();
System.out.println("Printed in Son class");
}

public static void main(String[] args) {
Son s = new Son();
s.printMethod();
}
} 
                                  /**If your method overrides
                                      one of its superclass's
                                      methods, you can invoke
                                      the overridden method
                                      through the use of the
                                      keyword super.**/
