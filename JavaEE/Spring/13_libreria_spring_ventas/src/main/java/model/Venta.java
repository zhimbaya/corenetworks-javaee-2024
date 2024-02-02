package model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ventas")
public class Venta {
	private int idVenta;
	private int idCliente;
	private int idLibro;
	private Date fecha;

}
