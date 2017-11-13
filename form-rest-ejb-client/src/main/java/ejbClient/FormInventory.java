package ejbClient;

public interface FormInventory {

	void createNewProduct(String productName);

	String[] listProductNames();

}