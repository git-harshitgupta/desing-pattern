package org.harshit.behavioral.momento.command;

import org.harshit.behavioral.momento.WorkflowDesigner;

public class RemoveCommand extends AbstractWorkflowCommand{
    private String step;

    public RemoveCommand(WorkflowDesigner designer, String step) {
        super(designer);
        this.step = step;
    }
    @Override
    public void execute() {
        memento = receiver.getMemento();
        receiver.removeStep(step);
    }
}
