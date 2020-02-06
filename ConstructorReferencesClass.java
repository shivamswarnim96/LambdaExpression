package LambdaExpression;

class ConstructorReferencesClass {
	
	private int val;
	// This constructor takes an argument.
	ConstructorReferencesClass(int v) {
		val = v; 
	}
	// This is the default constructor.
	ConstructorReferencesClass() {
		val = 0; 
	}
	// ...
	int getVal() { return val; };

}
