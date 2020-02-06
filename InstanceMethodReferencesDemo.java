package LambdaExpression;

public class InstanceMethodReferencesDemo {
	
	// This method has a functional interface as the type of
	// its first parameter. Thus, it can be passed any instance
	// of that interface, including method references.
	static String stringOp(StaticMethodReferencesInterface sf, String s) {
		return sf.func(s);
	}
	
	public static void main(String[] args) {
		
		String inStr = "Lambdas add power to Java";
		String outStr;
		// Create a MyStringOps object.
		InstanceMethodReferencesClass strOps = new InstanceMethodReferencesClass( );
		// Now, a method reference to the instance method strReverse
		// is passed to stringOp().
		outStr = stringOp(strOps::strReverse, inStr);
		System.out.println("Original string: " + inStr);
		System.out.println("String reversed: " + outStr);

	}

}
