package org.harshit.creational.abstractfactorymethod.aws;

import org.harshit.creational.abstractfactorymethod.Instance;
import org.harshit.creational.abstractfactorymethod.ResourceFactory;
import org.harshit.creational.abstractfactorymethod.Storage;

public class AwsResourceFactory implements ResourceFactory {
    @Override
    public Instance createInstance(Instance.Capacity capacity) {
        return new Ec2instance(capacity);
    }

    @Override
    public Storage createStorage(int capMib) {
        return new S3Storage(capMib);
    }
}
