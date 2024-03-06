package questaoUm;
import java.util.Scanner;
import java.util.Arrays;

public class Producao {

	public String[] nomes = new String[3];
	
	public Producao() {
		this.nomes = nomes;
	}

	Scanner scanner = new Scanner (System.in);
	
	public void ordernarNomes() {
		System.out.println("Insira dez nomes:\n");
		for (int i=0; i<3; i++) {
			nomes[i] = scanner.nextLine();
		}
	Arrays.sort(nomes);
	System.out.println("\n==============\n\nNomes em ordem alfabetica:\n");
	for (String vetorNomes : nomes) {
		System.out.println(vetorNomes);
	}
	}
}