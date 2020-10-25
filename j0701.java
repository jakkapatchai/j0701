import java.io.*;
public class j0701 {
  public static void main (String args[]) throws IOException {
    int i = 1;
    int tot = 0;
    String b;
    String[] fields;
    String patternStr = ",";
    FileReader fin = new FileReader("data.txt");
    BufferedReader bin = new BufferedReader (fin);
    while ((b =  bin.readLine()) != null) {
      fields = b.split(patternStr);
      System.out.println(i + " : " + fields[0]);
      System.out.println("zip : " + fields[1]);
      System.out.println("lat : " + fields[4]);
      System.out.println("lng : " + fields[5]);
      i = i + 1;
    }
    fin.close();
  }
}