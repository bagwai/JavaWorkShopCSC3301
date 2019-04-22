class Test {
  public static void main(String args[]) {
    myPrint(5);
    myPrint(5.0);
  }
  static void myPrint(int i) {
    System.out.println("int i = " + i);
  }
  static void myPrint(double d) {

    // same name, different parameters
    System.out.println("double d = " + d); } }
