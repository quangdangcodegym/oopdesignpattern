package com.codegym.obsever.clicklistener1;

public class ButtonActionListenner implements ActionListenner{
    private IQButton iqButton;
    public ButtonActionListenner(IQButton iqButton) {
        this.iqButton = iqButton;
        iqButton.addActionListenner(this);
    }
    @Override
    public void actionPerform(ActionEvent event) {
        System.out.println("ButtonActionListenner " + event.name());
    }
}
