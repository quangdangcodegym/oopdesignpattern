package com.codegym.command.fan;

public class Main {
    public static void main(String[] args) {
        Fan fan = new Fan();
        ICommand turnOnCommand = new TurnOnCommand(fan);
        ICommand turnOffCommand = new TurnOffCommand(fan);

        Remote remote = new Remote(turnOnCommand, turnOffCommand);

        remote.turnOnButtonClick();
        remote.turnOffButtonClick();
    }
}
