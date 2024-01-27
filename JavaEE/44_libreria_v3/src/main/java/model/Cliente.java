package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="clientes")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cliente {
	@Id
	private int idCliente;
	private String usuario;
	private String password;
	private String email;
	private int telefono;
}
