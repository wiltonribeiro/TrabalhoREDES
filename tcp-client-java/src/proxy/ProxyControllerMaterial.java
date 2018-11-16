package proxy;

import entity.House;
import entity.Material;
import entity.Message;
import tcpClient.TCPClient;

import java.io.StringReader;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;


public class ProxyControllerMaterial {
	
	public Material calculateMaterial(House house) {
		TCPClient client = new TCPClient();
		Gson gson = new Gson();

		String json = gson.toJson(house);	
		
		Material material = null;
		
		try {
			Message message = new Message("ControllerMaterial" ,"calculateMaterial", json);
			String messageJson = gson.toJson(message);
			client.sendRequest(messageJson);
			String materialJson = client.getResponse();
			
			JsonReader reader = new JsonReader(new StringReader(materialJson));
			reader.setLenient(true);
			
			material = gson.fromJson(reader, Material.class);
			
		}catch(Exception e) {
			System.out.println("Erro ao calcular material: " + e.getMessage());
		}
		
		return material;
	}

}
