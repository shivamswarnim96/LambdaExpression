package LambdaExpression;

class ConstructorReferencesGenClass1<T> {

	private T val;
	
	// A constructor that takes an argument.
	ConstructorReferencesGenClass1(T v) {
		val = v; 
	}
	// This is the default constructor.
	ConstructorReferencesGenClass1( ) {
		val = null; 
	}
	
	T getVal() {
		return val; 
	};
	
}