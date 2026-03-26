package principal;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestCopiar {

	public static void main(String[] args) throws IOException{
		String dirOrigen="c:\\temp\\origen\\para_copiar.txt";
		String dirDestino="c:\\temp\\destino\\destrino_copiar.txt";
		
			Files.copy(Path.of(dirOrigen), Path.of(dirDestino));
	

	}

}
