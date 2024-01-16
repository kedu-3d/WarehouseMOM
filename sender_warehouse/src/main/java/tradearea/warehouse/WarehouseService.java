package tradearea.warehouse;// WarehouseService.java

import org.springframework.stereotype.Service;
import tradearea.model.Product;
import tradearea.model.WarehouseData;

import java.util.Collections;
import java.util.List;

@Service
public class WarehouseService {

    private WarehouseSimulation simulation = new WarehouseSimulation();

    public String getGreetings(String inModule) {
        return "Greetings from " + inModule;
    }

    public WarehouseData getWarehouseData(String inID) {
        WarehouseData data = simulation.getData(inID);

        // Wähle ein zufälliges Produkt aus
        List<Product> products = data.getProducts();
        if (products != null && !products.isEmpty()) {
            int randomIndex = simulation.getRandomInt(0, products.size()-1);
            Product randomProduct = products.get(randomIndex);

            // Aktualisiere die Produktliste, um nur das ausgewählte Produkt zu enthalten
            data.setProducts(Collections.singletonList(randomProduct));
        }

        return data;
    }

}
