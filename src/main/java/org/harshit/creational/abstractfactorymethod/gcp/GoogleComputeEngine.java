package org.harshit.creational.abstractfactorymethod.gcp;

import org.harshit.creational.abstractfactorymethod.Instance;
import org.harshit.creational.abstractfactorymethod.Storage;

public class GoogleComputeEngine implements Instance {
    public GoogleComputeEngine(Capacity capacity) {
        System.out.println("Created Google Compute Engine instance");
    }

    @Override
    public void start() {
        System.out.println("Compute engine instance started");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached "+storage+" to Compute engine instance");
    }

    @Override
    public void stop() {
        System.out.println("Compute engine instance stopped");
    }
}
