package beans;

import java.util.stream.Collectors;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import dao.ClientDAO;
import ejbClient.FormInventoryLocal;
import ejbClient.FormInventoryRemote;
import entities.Client;

@Stateless
@Local(FormInventoryLocal.class)
@Remote(FormInventoryRemote.class)
public class FormInventoryBean implements FormInventoryLocal, FormInventoryRemote {

	@EJB
	private ClientDAO dao;

	@Override
	public void createNewProduct(String clientName, String clientEmail) {
		Client cli = new Client();
		cli.setName(clientName);
		cli.setEmail(clientEmail);
		dao.insert(cli);
	}

	@Override
	public String[] listProductNames() {
		return dao.listAll()
				.stream()
				.map(Client::getName)
				.collect(Collectors.toList())
				.toArray(new String[0]);
	}

}