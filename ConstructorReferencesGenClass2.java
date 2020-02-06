package LambdaExpression;

class ConstructorReferencesGenClass2 {
	
	String str;
	// A constructor that takes an argument.
	ConstructorReferencesGenClass2(String s) {
		str = s; 
	}
	// The default constructor. This
	// constructor is NOT used by this program.
	ConstructorReferencesGenClass2() {
		str = ""; 
	}
	// ...
	String getVal() {
		return str; 
	};

}