package proncipal;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class TestEscritura {

	public static void main(String[] args ) throws IOException {
		String dir="c:\\temp\\productos.txt";
		List<String> list=List.of("pan","agua","filete","pizza","fanta");
		//guardar productos en fichero
		Path path=Path.of(dir);
		Files.write(path, list);
		//guardar un nuevo producto
		Files.writeString(path, "cerveza", StandardOpenOption.APPEND);
		

	}

}
