package principal;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TestMover {

	public static void main(String[] args) throws IOException {
		String dirOrigen="c:\\temp\\origen\\para_mover.txt";
		String dirDestino="c:\\temp\\destino\\destrino_mover.txt";
		
		Files.move(Path.of(dirOrigen), Path.of(dirDestino));

	}

}
 