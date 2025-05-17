package aula8Fabri;

public class Gerente extends Funcionario{
	private int senha;
	private int funciGeren;
	
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public int getFunciGeren() {
		return funciGeren;
	}
	public void setFunciGeren(int funciGeren) {
		this.funciGeren = funciGeren;
	}
	public boolean authentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Logando...");
			return true;
		}
		else {
			System.out.println("Acesso negado");
			return false;
		}
		
	}
		@Override 
		public double getBonificacao(){
			return this.getSalario() * 0.15;
		}
}

