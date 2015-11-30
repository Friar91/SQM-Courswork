import g54ubi.chat.server.Connection;

import org.junit.Test;

public class ServerTest{
	@Test
	public void test_firstLogin(){
		Server server = new Server(9000);
		ServerSocket serverSocket = new ServerSocket(9000);
	    Socket clientSocket = serverSocket.accept();
	    Connection connection = new Connection(clientSocket,server);
	    connection.start();
	    connection.messageForConnection("IDEN LIAM");
	    assertEquals("LIAM",connection.getUserName());	    
	}
}