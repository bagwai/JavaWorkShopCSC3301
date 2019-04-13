public class oddNumbers {
  public static void main(String[] args) {
    int line = 0;
  for (int i=2; i<13; i+=2){
    System.out.print(i + "\t");
    line++;
    if (line == 2){
      System.out.println();
      line = 0;
    }
  }
}
}
