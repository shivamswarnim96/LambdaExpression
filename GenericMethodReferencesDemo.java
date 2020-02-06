package LambdaExpression;

public class GenericMethodReferencesDemo {

	static <T> int myOp(GenericMethodReferencesInterface<T> f, T[] vals, T v) {
		return f.func(vals, v);
	}
	
	public static void main(String[] args) {

		Integer[] vals = { 1, 2, 3, 4, 2, 3, 4, 4, 5 };
		String[] strs = { "One", "Two", "Three", "Two" };
		int count;
		count = myOp(GenericMethodReferencesClass::<Integer>countMatching, vals, 4);
		System.out.println("vals contains " + count + " 4s");
		count = myOp(GenericMethodReferencesClass::<String>countMatching, strs, "Two");
		System.out.println("strs contains " + count + " Twos");		

	}

}
