package LambdaExpression;

public class BasicFunctionalInterfaceLamdaExpressionDemo {
	
	public static void main(String[] args) {
//		BasicFunctionalInterface v = (x,y) -> (x*y) ;
//		System.out.println(v.multiply(2, 3));
		
		BasicFunctionalInterface basicFunctionalInterface=(n,d) -> (n % d) == 0;
		System.out.println(basicFunctionalInterface.multiply(10, 2));
	}
	
	

}
