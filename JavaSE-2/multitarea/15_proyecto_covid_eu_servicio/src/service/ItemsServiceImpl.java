package service;

import static service.locator.ItemsLocator.getJsonStream;
import static utilities.Utilidades.convertirTextoFecha;
import java.util.List;
import java.util.stream.Collectors;

import model.Item;

public class ItemsServiceImpl implements ItemsService {
	
	@Override
	public List<String> paises() {
		return getJsonStream()//Stream<Item>
				.map(it->it.getNombrePais())//Stream<String>
				.distinct()
				.toList();
	}

	@Override
	public double incidenciaPais(String pais) {
		return getJsonStream()
				.filter(it->it.getNombrePais().equals(pais)&&it.getIndicador().equals("cases")) //solo nos interesan los casos (no deaths) del pais
				.max((it1,it2)->convertirTextoFecha(it1.getFecha())
						.compareTo(convertirTextoFecha(it2.getFecha()))) //Optional<Item>
				//.orElse(new Item())//Item
				.get()
				.getIncidencia();
				
	}

	@Override
	public int totalAcumulados() {
		return getJsonStream()
				.filter(it->it.getIndicador().equals("cases"))
				.collect(Collectors.groupingBy(it->it.getNombrePais(), Collectors.maxBy((it1,it2)->convertirTextoFecha(it1.getFecha())
						.compareTo(convertirTextoFecha(it2.getFecha()))))) //Map<String,Item>
				.values()  //Collection<Item>
				.stream() //Stream<Item>
				.collect(Collectors.summingInt(op->op.get().getAcumulados()));//suma acumulados de todos los paises
				
	}
	/*@Override
	public int totalAcumulados() {
		LocalDate fechaMax=fechaMasReciente();
		return locator.getJsonStream()
				.filter(it->it.getIndicador().equals("cases")&&convertirTextoFecha(it.getFecha()).equals(fechaMax))
				.collect(Collectors.summingInt(it->it.getAcumulados()));
	}

	private LocalDate fechaMasReciente() {
		return locator.getJsonStream()
				.map(it->convertirTextoFecha(it.getFecha())) //Stream<LocalDate>
				.max((f1,f2)->f1.compareTo(f2))
				.orElse(LocalDate.now());
	}*/
}
