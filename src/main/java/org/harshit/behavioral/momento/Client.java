package org.harshit.behavioral.momento;

import org.harshit.behavioral.momento.command.AddStepCommand;
import org.harshit.behavioral.momento.command.CreateCommand;
import org.harshit.behavioral.momento.command.WorkflowCommand;

import java.util.LinkedList;

public class Client {
    public static void main(String[] args) {
        WorkflowDesigner designer = new WorkflowDesigner();
        LinkedList<WorkflowCommand> commands = runCommands(designer);
        designer.print();
        commands.removeLast().undo();
        designer.print();
        commands.removeLast().undo();
        designer.print();
    }

    private static void undoLastCommand(LinkedList<WorkflowCommand> commands){
        if (!commands.isEmpty())
            commands.removeLast().undo();
    }

    public static LinkedList<WorkflowCommand> runCommands(WorkflowDesigner designer){
        LinkedList<WorkflowCommand> commands = new LinkedList<>();
        WorkflowCommand cmd = new CreateCommand(designer,"Leave workflow");
        cmd.execute();

        cmd = new AddStepCommand(designer,"Create Leave Application");
        commands.addLast(cmd);
        cmd.execute();

        cmd = new AddStepCommand(designer,"Submit Application");
        commands.addLast(cmd);
        cmd.execute();

        cmd = new AddStepCommand(designer,"Application Approved");
        commands.addLast(cmd);
        cmd.execute();

        return commands;
    }
}
