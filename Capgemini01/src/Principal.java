
public class Principal {

	public static void main(String[] args) {
		//inicia as v�riaveis n�meros e mediana
		int n�meros[] = {4, 9, 1, 5, 6, 7, 4, 0, };
		int mediana = 0;
		//condi��o se quantidade de num par = n�o executa o c�digo
		//se quantidade de num �mpar executa a mediana
		if(n�meros.length % 2 == 0) {
			System.out.printf("--N�mero inv�lido-- %nsomente �mpares");
		}else {
			mediana = n�meros.length/2;
			System.out.println("A mediana da lista �: " + n�meros[mediana]);
		}
		
		

	}

}
