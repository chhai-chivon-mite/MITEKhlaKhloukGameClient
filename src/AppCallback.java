import java.net.Socket;

/*
 * @author: Chhai Chivon on Jan 19, 2020
 * Senior Application Developer
 */

public interface AppCallback {
	
	void onConnectionConnected(Socket socket);
	
	void onRegisterCompleted(boolean isSuccess);
	
	void onSignInCompleted(boolean isSuccess);
	
	void onMessageSent(boolean isSuccess);
	
	void onMessageRecieved(String message);
	
	void onSignOutCompleted();

}
