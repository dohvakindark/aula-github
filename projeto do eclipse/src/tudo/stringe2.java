package tudo;

public class stringe2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "isto � uma string do java";
		//o �todo split quebra a string e v�rias outras
		//pelo separador desejado
		
		String[] palavras = str.split(" ");
		
		int i = str.indexOf("uma"); //retorna o �ndice da palavra na String
		
		if( str.startsWith("Ol�") || str.endsWith("Mundo!")) {
			//testa come�o e fim da string - retorna boolean
		}
		str = str.trim(); //elimina os espa�os em branco no in�cio e fim
		
		str = str.replace('a', '@'); //substitui os caracteres
		
		//substitui uma palavra (usa express�es regulares)
		
		str = str.replaceAll("String", "Cadeia de caracteres");
	}

}
