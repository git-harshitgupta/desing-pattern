package org.harshit.behavioral.momento;

import java.util.Arrays;
import java.util.LinkedList;

public class Workflow {
    private LinkedList<String> steps;
    private String name;

    public Workflow(String name) {
        this.steps = new LinkedList<String>();
        this.name = name;
    }

    public Workflow(String name, String... steps){
        this.name = name;
        this.steps = new LinkedList<>();
        if (steps!=null&&steps.length>0){
            this.steps.addAll(Arrays.asList(steps));
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("Workflow [name=");
        builder.append(name).append("]\nBEGIN -> ");
        for(String step : steps) {
            builder.append(step).append(" -> ");
        }
        builder.append("END");
        return builder.toString();
    }

    public void addStep(String step) {
        steps.addLast(step);
    }

    public boolean removeStep(String step) {
        return steps.remove(step);
    }

    public String[] getSteps() {
        return steps.toArray(new String[steps.size()]);
    }

    public String getName() {
        return name;
    }
}
