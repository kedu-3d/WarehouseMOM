package tradearea.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class WarehouseData {

	private String warehouseID;
	private String warehouseName;
	private String warehouseAddress;
	private String warehousePostalCode;
	private String warehouseCity;
	private String warehouseCountry;
	private String timestamp;

	private int mitarbeiter;
	private List<Product> products;

	public WarehouseData() {

		this.timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());

	}
	public String getWarehouseID() {
		return warehouseID;
	}

	public void setMitarbeiter(int mitarbeiter) {
		this.mitarbeiter = mitarbeiter;
	}

	public int getMitarbeiter() {
		return mitarbeiter;
	}

	public void setWarehouseID(String warehouseID) {
		this.warehouseID = warehouseID;
	}

	public String getWarehouseName() {
		return warehouseName;
	}

	public void setWarehouseName(String warehouseName) {
		this.warehouseName = warehouseName;
	}

	public String getWarehouseAddress() {
		return warehouseAddress;
	}

	public void setWarehouseAddress(String warehouseAddress) {
		this.warehouseAddress = warehouseAddress;
	}

	public String getWarehousePostalCode() {
		return warehousePostalCode;
	}

	public void setWarehousePostalCode(String warehousePostalCode) {
		this.warehousePostalCode = warehousePostalCode;
	}

	public String getWarehouseCity() {
		return warehouseCity;
	}

	public void setWarehouseCity(String warehouseCity) {
		this.warehouseCity = warehouseCity;
	}

	public String getWarehouseCountry() {
		return warehouseCountry;
	}

	public void setWarehouseCountry(String warehouseCountry) {
		this.warehouseCountry = warehouseCountry;
	}

	public String getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}
}
