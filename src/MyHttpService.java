import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class MyHttpService {

	public static void main(String[] args) throws IOException {
		int port = 80;
		
		ServerSocket service = new ServerSocket(port);
		
		System.out.println("Waiting for a connection....");
		Socket clientInfo = service.accept();
		System.out.println(clientInfo);
		
		InputStream in = clientInfo.getInputStream();
		
		InputStreamReader bridge = new InputStreamReader(in);
		BufferedReader bReader = new BufferedReader(bridge);
		
		while(true){
			String line = bReader.readLine();
			
			if(line == null)
				break;
			
			System.out.println(line);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
