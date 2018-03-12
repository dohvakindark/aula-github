package tudo;

public class clausulacontinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char letras[] = {'B','X','R','A','S','I','L'};
		int i;
		for( i=0; i<letras.length; i++) {
			if( letras[i] == 'X') {
				continue;
			}
			System.out.print(letras[i]);
		}
		
	}

}
