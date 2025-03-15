package task1.calculator.invoker;

import task1.calculator.commands.Command;

import java.util.Stack;

public class Invoker {
    private Stack<Command> commands = new Stack<Command>();

    public void putCommand(Command command) {
        commands.add(command);
    }

    public void applyCommands() {
        for (Command command: commands) {
            command.execute();
        }
    }
}
