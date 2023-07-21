package org.harshit.behavioral.momento.command;

public interface WorkflowCommand {

    void execute();
    void undo();

}
