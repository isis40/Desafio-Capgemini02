
public class Principal {

	public static void main(String[] args) {
		int números[] = {4, 9, 1, 5, 6, 7, 4, 0, 1};
		int mediana = 0;
		if(números.length % 2 == 0) {
			System.out.println("Número inválido somente ímpares");
		}else {
			mediana = números.length/2;
			System.out.println(números[mediana]);
		}
		
		

	}

}
