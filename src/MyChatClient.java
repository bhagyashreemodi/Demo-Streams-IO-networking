import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyChatClient {
	public static void main(String[] args) throws UnknownHostException, IOException {
//		EXPLICIT SOCKET CREATION
		Socket sock = new Socket("10.102.49.197", 5511);
		
		new Thread(new RequestProcessingJob(sock)).start();
		
		
	}
}
