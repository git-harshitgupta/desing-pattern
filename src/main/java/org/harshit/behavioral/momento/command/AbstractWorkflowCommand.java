package org.harshit.behavioral.momento.command;

import org.harshit.behavioral.momento.WorkflowDesigner;

public abstract class AbstractWorkflowCommand implements WorkflowCommand {
    protected WorkflowDesigner.Memento memento;
    protected  WorkflowDesigner receiver;

    public AbstractWorkflowCommand(WorkflowDesigner designer){
        this.receiver = designer;
    }

    @Override
    public void undo() {
        receiver.setMemeto(memento);
    }
}
