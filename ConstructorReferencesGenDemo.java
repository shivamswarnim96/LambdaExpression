package LambdaExpression;

class ConstructorReferencesGenDemo {
	
	// A factory method for class objects. The class must
	// have a constructor that takes one parameter of type T.
	// R specifies the type of object being created.
	static <R,T> R myClassFactory(ConstructorReferencesGenInterface<R, T> cons, T v) {
	return cons.func(v);
	}
	
	public static void main(String[] args) {
	
		// Create a reference to the MyClass<T> constructor.
		ConstructorReferencesGenInterface<ConstructorReferencesGenClass1<Integer> ,Integer> myClassCons = ConstructorReferencesGenClass1<Integer>::new;
		// Create an instance of MyClass<T> via that constructor reference.
		ConstructorReferencesGenClass1<Integer> mc = myClassCons.func(100);
		// Use the instance of MyClass<T> just created.
		System.out.println("val in mc is " + mc.getVal( ));
		
		ConstructorReferencesGenInterface<ConstructorReferencesGenClass2 ,String> myClassCons1 = ConstructorReferencesGenClass2::new;
		
		ConstructorReferencesGenClass2 mc1 = myClassCons1.func("Jai Mata Di");
		
		System.out.println("str in mc1 is " + mc1.getVal( ));
		
	}

}