package com.codegym.obsever.clicklistener1;

public interface IQButton {
    void addActionListenner(ActionListenner actionListenner);
    void removeActionListenner(ActionListenner actionListenner);
    void notifyActionListenners();
}
