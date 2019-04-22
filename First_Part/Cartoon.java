                                  /** Class example demostrating a
                                  Constructor chaining
                                  the file name: Cartoon.java**/
class Art {
    Art() {
    System.out.println("Art constructor");
    }
} // end of Art class

class Drawing extends Art {
  Drawing() {
  System.out.println("Drawing constructor");
  }
} // end of the Drawing class
public class Cartoon extends Drawing {
  Cartoon() {
  System.out.println("Cartoon constructor");
  }
public static void main(String[] args) {
Cartoon x = new Cartoon();
}
} // end of the Cartoon class
