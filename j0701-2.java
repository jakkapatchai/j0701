import java.io.*;
public class j0701 {
  public static void main (String args[]) throws IOException {
    int i = 1;
    String b;
    String[] fields;
    String patternStr = ",";
    FileReader fin = new FileReader("data.txt");
    BufferedReader bin = new BufferedReader (fin);
    BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
    String get = stdin.readLine();
    while ((b = bin.readLine()) != null) {
      fields = b.split(patternStr);
      if(fields[1].equals(get)){
          System.out.println("latitude : " + fields[4]);
          System.out.println("longitude : " + fields[5]);
      }
      i=i+1;
    }
    fin.close();
  }
}