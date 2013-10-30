package Unidad2;

public class Ejercicios_Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bolean a,b;
		
		System.out.println("a\tb\ta and b\ta or b\tnot ")
		
		a= ( 3>5 );
		b= ( 12 |=8 );
		
		System.out.print("(3>5)\t(12!=8)\t" + ( a && b));
		System.out.print("\t");
		System.out.print(a || b);
		System.out.print("\t");
		System.out.print(!a);
		System.out.print("\t");
		System.out.print(!b + "\n");

	}

}
