import cs1.Keyboard;

public class Swapper {

    public static void swapStrings (String[][] a, int row1, int col1, int row2, int col2) {
      if (row1<a.length && col1<a[row1].length && row2<a.length && col2<a[row2].length){
	String temp1 = a[row1][col1];
	a[row1][col1] = a[row2][col2];
	a[row2][col2]=temp1;
	System.out.println("New Array: ");
	print2(a);}
	else{System.out.println("Out of bound indexes");}}

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
      System.out.print( "Row 1 location: " );
	int _r1 = Integer.parseInt(Keyboard.readString());
      System.out.print( "Column 1 location: " );
	int _c1 = Integer.parseInt(Keyboard.readString());
      System.out.print( "Row 2 location: " );
	int _r2 = Integer.parseInt(Keyboard.readString());
      System.out.print( "Column 2 location: " );
	int _c2 = Integer.parseInt(Keyboard.readString());
	swapStrings(_a,_r1,_c1,_r2,_c2);
      //print2(_a);

    }
  }
