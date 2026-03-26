package testing;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Empleado;
import service.EmpleadoService;

class TestEmpleadoService {

	EmpleadoService service;
	@BeforeEach
	void setUp() throws Exception {
		service=new EmpleadoService();
	}

	@Test
	void test() {
		assertTrue(service.altaEmpleado(new Empleado(0,"e1","e1@gmail.es","dept1",2000)));
	}
	
	@Test
	void testEliminar() {
		assertTrue(service.eliminarEmpleado(2));
	}
	
	@Test
	void testUpdate() {
		assertTrue(service.updateSalary(2000.50,2));
	}

}
