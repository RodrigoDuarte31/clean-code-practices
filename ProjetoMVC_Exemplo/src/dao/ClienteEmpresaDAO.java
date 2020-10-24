package dao;

import java.io.BufferedWriter;
import java.io.FileWriter;

import modelo.ClienteEmpresa;

public class ClienteEmpresaDAO {
	
	public ClienteEmpresaDAO() {
		
	}
	
	public boolean salvarClienteEmpresa(ClienteEmpresa c) {
		
		FileWriter fw;
		BufferedWriter bw;
		
		try {
			fw = new FileWriter("arquivo.txt", true);
			bw = new BufferedWriter(fw);
			
			bw.write(c.toString());
			bw.flush();
			
			fw.close();
			bw.close();
			
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
	}
	
}
