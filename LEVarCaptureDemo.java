package LambdaExpression;

public class LEVarCaptureDemo {
	
	public static void main(String[] args) {
		
		// A local variable that can be captured.
		int num = 10;
		LEVarCapture myLambda = (n) -> {
		// This use of num is OK. It does not modify num.
			System.out.println(n);
			int v = num + n;
		// However, the following is illegal because it attempts
		// to modify the value of num.
		// num++;			
			return v;
		};
		// The following line would also cause an error, because
		// it would remove the effectively final status from num.
		// num = 9;
		
		System.out.println(num);
		
		System.out.println(myLambda.func(num));
		
	}

}