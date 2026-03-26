package modelo;

import java.time.LocalDate;

public record Cesta(String producto, int precio, LocalDate fechaPedido) {

}
