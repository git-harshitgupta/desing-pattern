package org.harshit.behavioral.nullobject;

public class Client {
    public static void main(String[] args) {
//        ComplexService service = new ComplexService(new StorageService(),"Simple Report");
        ComplexService service = new ComplexService(new NullStorageService(),"Simple Report");
        service.generateReport();
    }
}
