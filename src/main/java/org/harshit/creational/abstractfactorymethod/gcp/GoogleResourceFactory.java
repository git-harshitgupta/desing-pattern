package org.harshit.creational.abstractfactorymethod.gcp;


import org.harshit.creational.abstractfactorymethod.Instance;
import org.harshit.creational.abstractfactorymethod.ResourceFactory;
import org.harshit.creational.abstractfactorymethod.Storage;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Instance.Capacity capacity) {
		return new GoogleComputeEngine(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new GoogleCloudStorage(capMib);
	}
	

}
