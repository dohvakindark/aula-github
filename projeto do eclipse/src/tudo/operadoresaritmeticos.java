package tudo;

public class operadoresaritmeticos {

	public static void main(String[] args) {
		
		//mult e div
		int um = 3/2;	//div de int gera int
		float umEmeio = (float) 3/2; //corre promoção aritmética para float
		double xyz = umEmeio * um; //corre promoção aritmética para float
		
		
		//mod %
		int resto = 7 % 2; //resto 1
		
		//adção subtração: + e -
		long l = 1000 + 4000;
		double d = 1.0 - 0.01;
		
		//concatenação
		long var = 12345;
		String str = "O valor de var é "+ var;
		
		//na cocatenação de string as variaveis ou literais sao promovidos a string antes: 
		String str = "Ovalor de var é "+ Long.toString(var);
		
	}

}
