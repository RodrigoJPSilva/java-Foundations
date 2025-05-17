package aula7Fabri;

public class ServidorRede {
	String hostname;
	String ipaddress;
	String sistemaOperacional;
	boolean online;
	
	public void ligar() {
		this.online = true;
		System.out.println("Servidor " + this.hostname + " (" + this.ipaddress + ")changed up");
	}

	public void exibirStatus() {
		System.out.println("\n--- Status ---\n");
		System.out.println("Hostname: " + this.hostname);
		System.out.println("IP: " + this.ipaddress);
		System.out.println("Sistema Operacional: " + this.sistemaOperacional);
		System.out.println("Status: " + (this.online ? "Online" : "Offline"));
		
		}
	public boolean ping() {
		if (this.online) {
		}
		else {
			System.out.println("Ping para " + this.ipaddress + ": Failed. unknow host");			
		}
	}
	}

