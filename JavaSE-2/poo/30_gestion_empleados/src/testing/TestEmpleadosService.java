package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import service.EmpleadoService;

class TestEmpleadosService {

	EmpleadoService service;

	@BeforeEach
	void setUp() throws Exception {
		service=new EmpleadoService();
	}

	@Test
	void testEmpleadosPorDepartamento() {
		assertEquals(2, service.empleadosPorDepartamento("sistemas").size());
		assertEquals(1, service.empleadosPorDepartamento("ventas").size());
	}

	@Test
	void testEmpleadoMayorSalario() {
		assertEquals("Javier", service.empleadoMayorSalario().getNombre());
	}

	@Test
	void testBuscarEmpleado() {
		assertEquals("Laura", service.buscarEmpleado("lauri@gmail.es").getNombre());
	}

}
