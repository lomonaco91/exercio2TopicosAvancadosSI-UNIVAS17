package core;

import javax.ejb.EJB;

import api.FormInventoryService;
import ejbClient.FormInventory;

public class FormInventoryServiceImpl implements FormInventoryService {
	
	//Verificar o mappedName
	@EJB(mappedName = "java:app/form-rest-ejb-0.1-SNAPSHOT/FormInventoryBean!br.edu.univas.si8.ta.form.ejb.interfaces.FormInventoryRemote")
	private FormInventory inventory;

	@Override
	public String[] listProductNames() {
		return inventory.listProductNames();
	}

	@Override
	public String saveNewProduct(String name, String email) {
		inventory.createNewProduct(name, email);
		return "{\"message\": \"Success\"}";
	}

}
