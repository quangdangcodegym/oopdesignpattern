package com.codegym.command.fan;

public class TurnOnCommand implements ICommand{
    private Fan fan;
    TurnOnCommand(Fan fan) {
        this.fan = fan;
    }
    @Override
    public void execute() {
        fan.turnOn();
    }

    @Override
    public void undo() {
        fan.turnOff();

    }
}
