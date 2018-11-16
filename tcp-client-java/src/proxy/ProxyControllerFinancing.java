package proxy;

import java.io.StringReader;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import entity.Financing;
import entity.House;
import entity.Message;
import tcpClient.TCPClient;

public class ProxyControllerFinancing {
	public Financing calculateFinancing(House house) {
		TCPClient client = new TCPClient();
		Gson gson = new Gson();
		
		Financing financing = null;
		
		try {
			String houseJson = gson.toJson(house);
			Message message = new Message("ControllerFinancing","calculateFinancing", houseJson);
			String messageJson = gson.toJson(message);
			
			client.sendRequest(messageJson);
			String financingJson = client.getResponse();
			
			JsonReader reader = new JsonReader(new StringReader(financingJson));
			reader.setLenient(true);
			
			financing = gson.fromJson(reader, Financing.class);
		}catch(Exception e){
			System.out.println("Erro ao calulcar material: " + e.getMessage());
		}
		
		return financing;
	}
}
