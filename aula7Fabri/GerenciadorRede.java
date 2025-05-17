package aula7Fabri;

public class GerenciadorRede {

	public static void main(String[] args) {
		ServidorRede servidorWeb = new ServidorRede();
		servidorWeb.hostname = "WEVSRV01";
		servidorWeb.ipaddress = "10.0.0.19";
		servidorWeb.sistemaOperacional = "Apache on Linux";
//		servidorWeb.online = false;
		
		ServidorRede servidorDB = new ServidorRede();
		servidorDB.hostname = "DBSRV01";
		servidorDB.ipaddress = "10.0.0.25";
		servidorDB.sistemaOperacional = "MySQL on Windows Server";
//		servidorWeb.online = false;
		
//		Ligando os servidores
		servidorWeb.exibirStatus();
		servidorWeb.ligar();
		servidorWeb.ping();
		servidorWeb.exibirStatus();
		
		servidorDB.exibirStatus();
		servidorDB.ligar();
		servidorDB.ping();
		servidorDB.exibirStatus();
	}

}
