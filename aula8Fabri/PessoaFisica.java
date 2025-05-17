package aula8Fabri;

public class PessoaFisica extends Pessoa{
		private String rg;
		
		public void setRg(String rg) {
			this.rg = rg;
		}
		
		public String getRg() {
			return rg;
		}
		public void mostraClasse() {
			System.out.println("\nClasse Pessoa Fisica!");
		}
	}
