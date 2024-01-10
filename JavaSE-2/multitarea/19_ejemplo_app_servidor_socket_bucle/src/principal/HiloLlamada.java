package principal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.List;


public class HiloLlamada implements Runnable {
	
	Socket socket;
	public HiloLlamada(Socket socket) {
		super();
		this.socket = socket;
	}

	@Override
	public void run() {
		//recoger el nombre enviado el cliente y enviarle
		//mensaje de saludo personalizado
		try(PrintStream out=new PrintStream(socket.getOutputStream());
			BufferedReader bf=new BufferedReader(new InputStreamReader(socket.getInputStream()));){
			
			out.println("Hola "+bf.readLine()+", bienvenido al servidor de sockets");
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}

	}

}
