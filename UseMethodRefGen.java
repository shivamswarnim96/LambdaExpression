package LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;

class UseMethodRefGen {

	// A compare() method compatible with the one defined by Comparator<T>.
	static int compareMC(MyClassGen a, MyClassGen b) {
		return a.getVal() - b.getVal();
	}
	
	public static void main(String args[]) {
		
		ArrayList<MyClassGen> al = new ArrayList<MyClassGen>();
		al.add(new MyClassGen(1));
		al.add(new MyClassGen(4));
		al.add(new MyClassGen(2));
		al.add(new MyClassGen(9));
		al.add(new MyClassGen(3));
		al.add(new MyClassGen(7));
		// Find the maximum value in al using the compareMC() method.
		MyClassGen maxValObj = Collections.max(al, UseMethodRefGen::compareMC);
		System.out.println("Maximum value is: " + maxValObj.getVal());
	}
		
}