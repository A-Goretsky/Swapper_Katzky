public class Swapper {

    public static void swapStrings (String[][] a, int row1, int col1, int row2, int col2) {
      if (row1<a.length && col1<a[row1].length && row2<a.length && col2<a[row2].length){
	String temp1 = a[row1][col1];
	a[row1][col1] = a[row2][col2];
  a[row2][col2]=temp1;
  System.out.println("New Array: ");
  print2(a);}
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
      swapStrings(_a,1,2,2,1);
      //print2(_a);

    }
  }
