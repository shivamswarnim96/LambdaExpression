package LambdaExpression;

class ConstructorReferencesDemo {

	public static void main(String[] args) {
		
		ConstructorReferencesInterface myClassCons = ConstructorReferencesClass::new;
		
		ConstructorReferencesClass mc = myClassCons.func(100);
		
		System.out.println("val in mc is " + mc.getVal( ));
		
	}
	
}
