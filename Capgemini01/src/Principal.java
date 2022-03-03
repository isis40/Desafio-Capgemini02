
public class Principal {

	public static void main(String[] args) {
		//inicia as váriaveis números e mediana
		int números[] = {4, 9, 1, 5, 6, 7, 4, 0, };
		int mediana = 0;
		//condição se quantidade de num par = não executa o código
		//se quantidade de num ímpar executa a mediana
		if(números.length % 2 == 0) {
			System.out.printf("--Número inválido-- %nsomente ímpares");
		}else {
			mediana = números.length/2;
			System.out.println("A mediana da lista é: " + números[mediana]);
		}
		
		

	}

}
