package com.codegym.obsever.clicklistener;

public interface IQButton {
    void addActionListenner(ActionListenner actionListenner);
    void removeActionListenner(ActionListenner actionListenner);
    void notifyActionListenners();
}
