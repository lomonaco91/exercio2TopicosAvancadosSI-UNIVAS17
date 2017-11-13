package ejbClient;

public interface FormInventory {

	void createNewProduct(String clientName, String clientEmail);

	String[] listProductNames();

}