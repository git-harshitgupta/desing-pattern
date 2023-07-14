package org.harshit.structural.adapter.objectadapter;

public class BusinessCardDesigner {
    public String desginCard(Customer customer){
        String card="";
        card+=customer.getName();
        card+="\n"+ customer.getDesignation();
        card+="\n"+customer.getAddress();
        return card;
    }

}
