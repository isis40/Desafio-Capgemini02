
public class Principal {

	public static void main(String[] args) {
		int n�meros[] = {4, 9, 1, 5, 6, 7, 4, 0, 1};
		int mediana = 0;
		if(n�meros.length % 2 == 0) {
			System.out.println("N�mero inv�lido somente �mpares");
		}else {
			mediana = n�meros.length/2;
			System.out.println(n�meros[mediana]);
		}
		
		

	}

}
