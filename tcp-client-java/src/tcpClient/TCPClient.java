package tcpClient;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class TCPClient {
	
	Socket cliente;
	DataOutputStream out;
	DataInputStream in;
	
	public TCPClient() {
		try{
			Socket cliente = new Socket("52.15.194.28", 18346);
			out = new DataOutputStream(cliente.getOutputStream());
			in = new DataInputStream(cliente.getInputStream());
		}catch(Exception e){
			System.out.println("Erro ao criar socket: "+e.getMessage());
		}
	}
	
	public void sendRequest(String request) {
		try{
			byte[] b = (request+'\n').getBytes("UTF-8");
			out.write(b);
		}catch(Exception e){
			System.out.println("Erro ao mandar mensagem: "+e.getMessage());
		}
	}
	
	public String getResponse() {
		try {
			byte[] bytes = new byte[16 * 1024];
			in.read(bytes);
			return  new String(bytes);
		}catch(Exception e) {
			return "Erro ao receber mensagem: " + e.getMessage();
		}
	}
	
	public void close(){
		try {
			cliente.close();
		}catch(Exception e) {
			System.out.println("Erro ao fechar socket:  " + e.getMessage());
		}
	}
	
}
