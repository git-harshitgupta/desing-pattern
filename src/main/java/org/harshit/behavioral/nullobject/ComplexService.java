package org.harshit.behavioral.nullobject;

public class ComplexService {

    private StorageService storage;
    private String reportName;

    public ComplexService(StorageService storage) {
        this.storage = storage;
        reportName = "A complex report";
    }

    public ComplexService(StorageService storage, String reportName) {
        this.storage = storage;
        this.reportName = reportName;
    }

    public void generateReport(){
        System.out.println("Starting a complex report build");

        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Done with report");
        storage.save(new Report(reportName));
    }
}
