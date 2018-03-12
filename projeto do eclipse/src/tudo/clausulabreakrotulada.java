package tudo;

public class clausulabreakrotulada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int j = 0, i = 0;
		principal1: while (true) {
			for (i=0;i<1000;i++) {
				if (j==10 && i==100 )
					break principal1;
			}
			j++;
		}
		
	}

}
