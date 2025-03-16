package task1.calculator.invoker;

import task1.calculator.commands.Command;

import java.util.Stack;

public class CommandInvoker {
    private Stack<Command> commands = new Stack<Command>();

    public void putCommand(Command command) {
        commands.push(command);
    }

    public void applyCommands() {
        for (Command command: commands) {
            command.execute();
        }
    }
}
