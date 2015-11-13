package cz.boosik.boosadminforminecraft.app.commands;

/**
 * @author jakub.kolar@bsc-ideas.com
 */
public class Command {

    String name;
    String command;

    public Command() {
    }

    public Command(String name, String command) {
        this.name = name;
        this.command = command;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCommand() {
        return command;
    }

    public void setCommand(String command) {
        this.command = command;
    }
}
