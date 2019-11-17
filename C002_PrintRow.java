public class C002_PrintRow {

  private static void printRow(char ch, int N){
    int i;
    for (i=0; i<=N; i++) {
      System.out.print(ch);
    }
  }

  public static void main(String[] args) {
    printRow('A', 10);
  }
}