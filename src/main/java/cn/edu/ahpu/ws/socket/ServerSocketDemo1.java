package cn.edu.ahpu.ws.socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketDemo1 {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(6789);
		
		while(true){
			Socket client = server.accept();
			BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			System.out.println("¿Í»§¶ËËµ:"+br.readLine());
			
			br.close();
			client.close();
		}
		
	}
}
