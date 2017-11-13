package war;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import api.FormInventoryService;
import core.FormInventoryServiceImpl;

@ApplicationPath("/rest")
public class RestApplication extends Application {

	@Override
	public Set<Class<?>> getClasses() {
		Set<Class<?>> classes = new HashSet<>();
		classes.add(FormInventoryService.class);
		classes.add(FormInventoryServiceImpl.class);
		return classes;
	}

}