public class Swapper {
    
    public String swapStrings (String[][] a, int row1, int col1, int row2, int col2) {
	String temp1 = a[row1][col1];
	a[row1][col1] = a[row2][col2];
	a[row2][col2] = temp1;
    }

    
