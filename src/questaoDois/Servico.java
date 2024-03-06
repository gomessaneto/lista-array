package questaoDois;
import java.util.Scanner;

public class Servico {

	Scanner scanner = new Scanner (System.in);
	public int [] num = new int [3];

	public Servico() {
		this.num = num;
	}
	
	public void somarVetor() {
	System.out.println("Insira dez numeros: ");
	for (int i=0; i<3; i++) {
		num[i] = scanner.nextInt();
	}

	 int somatorio = 0;

     for (int numero : num) {
         somatorio += numero;
     }

     System.out.println("O somatorio dos numeros dentro do array eh: " + somatorio);

     scanner.close();
	
	}
	}