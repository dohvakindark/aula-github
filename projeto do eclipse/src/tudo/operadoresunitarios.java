package tudo;

public class operadoresunitarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//incrementos e decremento: ++ e --
		int a=0;
		int b= a++;//incremento depois de atribuir
		int c= ++a; //incremento antes de atribuir
		b = a--; //decremento depois de atribuir
		c = a--; //decremento antes de aatribuir
		
		//mais e menos unário: + e -
		
		int x = +3;
		x = -x;
		
		//inversão de bits
		
		int i = ~1; // i = -2 (os bits foram invertidos)
		
		//complementar booleano!
		boolean falsidade = ! (true); //inverte o valor booleano
		
		//conversão de tipos:(tipo)
		double d = 1.99;
		int i = (int) d;
		
		
	}

}
