package questaoTres;

public class Principal {

	public static void main(String[] args) {
	
	Empresa [] cadEmp = new Empresa[2];
	cadEmp[0] = new Empresa ("45558840001", "Autthentic", "7538510972");
	cadEmp[1] = new Empresa ("52345650001", "Canape", "7538516585");
	
	Funcionario[] cadFun = new Funcionario[2];
	cadFun[0] = new Funcionario ("12555658459", "Jose", "9400819", "87999396123", cadEmp[0]);
	cadFun[1] = new Funcionario ("468484777", "Joao", "47774455", "87995954", cadEmp[1]);
	
	for(int i=0; i<2; i++){
		System.out.println(cadFun[i]);
		}
	
	System.out.println("\n");
	
	for(int i=0; i<2; i++){
		System.out.println(cadEmp[i]);
	}
}
}