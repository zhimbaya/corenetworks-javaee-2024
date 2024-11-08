package service;
import java.util.ArrayList;
import model.Ciudad;

		public class CiudadService {
			Ciudad ciudad = new Ciudad();
			ArrayList<Ciudad> ciudadeslist = new ArrayList<>();
			
			
			public boolean introducir (String nombre,String pais, int habitantes) {
				Ciudad ciudad = new Ciudad(nombre, pais, habitantes );
				ciudadeslist.add(ciudad);
				return true;
			}
			public ArrayList<Ciudad> todos (String pais) {
				ArrayList<Ciudad> aux = new ArrayList();
				for (Ciudad c : ciudadeslist) {
					if (c.getPais().equals(pais)) {
						aux.add(c);
					}
				}
				return aux;
			}
			public Ciudad poblacion () {
				int habitantesMax=0;
				Ciudad ciudad = null;
				for (Ciudad c : ciudadeslist) {
					if(c.getHabitantes()>habitantesMax) {
						habitantesMax=c.getHabitantes();
						ciudad=c;
					}
				}
				return ciudad;
			}
			public void eliminar (String city) {
				for (int i=0; i<ciudadeslist.size(); i++) {
					if (city.equals(ciudadeslist.get(i).getNombre())) {
						ciudadeslist.remove(i);
						break;
					}
				}
			}
			
		}
