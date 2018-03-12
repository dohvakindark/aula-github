package tudo;

public class stringe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "isto é uma string java";
		String xyz = new String("Isto é uma String do java");
		
		if(str == xyz ) System.out.println("IGUAL");
		else System.out.println("DIFERENTE");
		
		if (str.equals(xyz)){
			//MANEIRA CORRETA DE SE COMPARAR O CONTEUDO DAS STRINGS
			
		}
		System.out.println("Tamanho da string"+ str.length());
		System.out.println("SubString: "+ str.substring(0, 10));
		System.out.println("Caracter na posição 5"+ str.charAt(5));
	}

}
