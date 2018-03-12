package tudo;

public class stringe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "isto é uma string do java";
		//o étodo split quebra a string e várias outras
		//pelo separador desejado
		
		String[] palavras = str.split(" ");
		
		int i = str.indexOf("uma"); //retorna o índice da palavra na String
		
		if( str.startsWith("Olá") || str.endsWith("Mundo!")) {
			//testa começo e fim da string - retorna boolean
		}
		str = str.trim(); //elimina os espaços em branco no início e fim
		
		str = str.replace('a', '@'); //substitui os caracteres
		
		//substitui uma palavra (usa expressões regulares)
		
		str = str.replaceAll("String", "Cadeia de caracteres");
	}

}
