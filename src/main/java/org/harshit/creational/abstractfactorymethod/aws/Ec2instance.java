package org.harshit.creational.abstractfactorymethod.aws;

import org.harshit.creational.abstractfactorymethod.Instance;
import org.harshit.creational.abstractfactorymethod.Storage;

public class Ec2instance implements Instance {
    public Ec2instance(Capacity capacity) {
        System.out.println("Created EC2");
    }

    @Override
    public void start() {
        System.out.println("Created EC2 instance");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached "+storage+" to EC2");
    }

    @Override
    public void stop() {
        System.out.println("Stopped");
    }
}
