package tradearea.warehouse;

import tradearea.model.Product;
import tradearea.model.WarehouseData;
import java.util.Random;

import java.util.ArrayList;
import java.util.List;

public class WarehouseSimulation {

	int getRandomInt(int inMinimum, int inMaximum) {
		Random random = new Random();
		return random.nextInt((inMaximum - inMinimum) + 1) + inMinimum;
	}
	public WarehouseData getData(String inID) {
		// Daten vom Warehouse
		WarehouseData data = new WarehouseData();
		data.setWarehouseID(inID);
		data.setWarehouseName("Linz Bahnhof");
		data.setWarehouseAddress("Bahnhofsstrasse 27/9");
		data.setWarehousePostalCode("Linz");
		data.setWarehouseCity("Linz");
		data.setWarehouseCountry("Austria");
		data.setTimestamp("2021-09-12 08:52:39.077");
		data.setMitarbeiter(1);

		// Produkte im Warehouse
		List<Product> products = new ArrayList<>();
		products.add(new Product("00-443175", "Bio Orangensaft Sonne", "Getraenk", 2500, "Packung 1L"));
		products.add(new Product("00-871895", "Bio Apfelsaft Gold", "Getraenk", 3420, "Packung 1L"));
		products.add(new Product("01-926885", "Ariel Waschmittel Color", "Waschmittel", 478, "Packung 3KG"));
		products.add(new Product("00-316253", "Persil Discs Color", "Waschmittel", 1430, "Packung 700G"));

		// Produkte setzen
		data.setProducts(products);

		// Gesamtdaten zurueckgeben
		return data;
	}
}
