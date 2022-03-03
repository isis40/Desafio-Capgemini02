
public class Principal {

	public static void main(String[] args) {
		//váriaveis do vetor e do numero x 
		int n[] = {1,5,3,4,2,6,8,9,10};
		int x = 3;
		//inicia a variavel contador que servirá para contar o números que tem uma diferença igual o valor de x
		int contador = 0;
		//cria o for duas vezes que percorre toda o vetor e compara os números
		for(int i = 0; i < n.length; i++) {
			int comparador = n[i];
			for(int j = 0; j < n.length; j++) {
				if(comparador - n[j] == x) {
					contador++;
				}
			}
		}
		//printa na tela os números contados
		System.out.println("Números de diferença igual ao valor x: " + contador);
		
	}

}
