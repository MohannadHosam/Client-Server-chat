package Milestone2;

import java.io.*; 
import java.net.*; 

class TCPServer { 

	public static void main(String argv[]) throws Exception 
	{ 
		String clientSentence = ""; 
		String capitalizedSentence; 
		ServerSocket welcomeSocket = new ServerSocket(5000); 

		while(true) { 
				Socket connectionSocket = welcomeSocket.accept(); 

				BufferedReader inFromClient = new BufferedReader(new InputStreamReader(connectionSocket.getInputStream())); 

				DataOutputStream  outToClient = new DataOutputStream(connectionSocket.getOutputStream()); 

				clientSentence = inFromClient.readLine(); 

				capitalizedSentence = clientSentence.toUpperCase() + '\n'; 

				outToClient.writeBytes(capitalizedSentence);
				System.out.println("From Client:" + clientSentence);
			} 
		} 
}
