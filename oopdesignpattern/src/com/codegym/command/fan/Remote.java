package com.codegym.command.fan;

public class Remote {
    private ICommand turnOnCommand;
    private ICommand turnOffCommand;

    public void turnOnButtonClick() {
        turnOnCommand.execute();
    }
    public void turnOffButtonClick() {
        turnOffCommand.execute();
    }

    Remote(ICommand turnOnCommand, ICommand turnOffCommand) {
        this.turnOnCommand = turnOnCommand;
        this.turnOffCommand = turnOffCommand;
    }

}
