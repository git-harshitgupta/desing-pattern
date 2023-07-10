package org.harshit.creational.abstractfactorymethod;

import org.harshit.creational.abstractfactorymethod.aws.AwsResourceFactory;

public class Client {

    private ResourceFactory resourceFactory;
    public Client(ResourceFactory factory){
        this.resourceFactory = factory;
    }

    public static void main(String[] args) {
        Client aws =new Client(new AwsResourceFactory());
        Instance i1 = aws.createServer(Instance.Capacity.micro,20);
        i1.start();
        i1.stop();
    }

    public Instance createServer(Instance.Capacity cap, int storageMib) {
        Instance instance = resourceFactory.createInstance(cap);
        Storage storage = resourceFactory.createStorage(storageMib);
        instance.attachStorage(storage);
        return instance;
    }

}
