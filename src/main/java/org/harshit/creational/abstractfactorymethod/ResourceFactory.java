package org.harshit.creational.abstractfactorymethod;

public interface ResourceFactory {
    Instance createInstance(Instance.Capacity capacity);
    Storage createStorage(int capMib);
}
