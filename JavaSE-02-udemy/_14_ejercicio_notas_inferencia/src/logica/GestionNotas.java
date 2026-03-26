package logica;

public class GestionNotas {
	private int total;
	private double[] notas;

	public GestionNotas() {
		super();
		total = 0;
		notas = new double[10];
	}

	public boolean agregarNota(double d) {
		if (total < 10) {
			notas[total] = d;
			total++;
			return true;
		} else {
			return false;
		}
	}

	public int aprobados() {
		var ap = 0;
		for (var i = 0; i < total; i++) {
			if (notas[i] >= 5) {
				ap++;
			}
		}
		return ap;
	}

	public double media() {
		var m = 0;
		for (var i = 0; i < total; i++) {
			m += notas[i];
		}
		return m / total;
	}
}
