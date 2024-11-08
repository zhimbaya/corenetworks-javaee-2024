package testing;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import service.CiudadService;

class TestCiudadService {
	static CiudadService service = new CiudadService();
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		service.introducir("Madrid", "España", 10);
		service.introducir("Roma", "Italia", 100);
		service.introducir("Verona", "Italia", 50);
		service.introducir("Sicilia", "Italia", 500);
		service.introducir("Niza", "Francia", 200);
	}

	@Test
	void testIntroducir() {
		//fail("Not yet implemented");
	}

	@Test
	void testTodos() {
		//fail("Not yet implemented");
		assertEquals(1,service.todos("Francia").size());
	}

	@Test
	void testPoblacion() {
		//fail("Not yet implemented");
		assertEquals("Sicilia",service.poblacion().getNombre());
	}

	@Test
	void testEliminar() {
		//fail("Not yet implemented");
		service.eliminar("Madrid");
		assertEquals(0 , service.todos("España").size());
			    
	}

}
