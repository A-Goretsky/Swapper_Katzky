public class Swapper {

    public static void swapStrings (String[][] a, String[][] b, int row1, int col1, int row2, int col2) {
      if (row1<a.length && col1<a[row1].length && row2<b.length && col2<b[row2].length){
	String temp1 = a[row1][col1];
	a[row1][col1] = b[row2][col2];
	b[row2][col2] = temp1;
  System.out.println("New Array 1: ");
  print2(a);
  System.out.println("New Array 2: ");
  print2(b);}
  else{System.out.println("Out of bound indexes");}
    }

    public static void print2( String[][] a ) {
        for (String[] i : a){
          for (String j: i){
            System.out.print(j+" ");}
          System.out.println("");}}

    public static void main(String[] args){
      String[][] _a= new String[][]{
        {"a","b","c","1"},
        {"d","e","f","2"},
        {"g","h","i","3"}
      };
      //print2(_a);
      String[][] _b = new String[][]{
        {"1","2","3","a"},
        {"4","5","6","b"},
        {"7","8","9","c"}
      };
      //print2(_b);
      swapStrings(_a,_b,2,3,1,2);
    }
  }
