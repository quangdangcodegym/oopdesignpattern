package com.codegym.obsever.clicklistener;

import java.util.ArrayList;
import java.util.List;

public class QButton implements IQButton{
    List<ActionListenner> listActionListenners;
    public QButton() {
        listActionListenners = new ArrayList<>();
    }
    @Override
    public void addActionListenner(ActionListenner actionListenner) {
        listActionListenners.add(actionListenner);
    }

    @Override
    public void removeActionListenner(ActionListenner actionListenner) {
        listActionListenners.remove(actionListenner);
    }

    @Override
    public void notifyActionListenners() {
        for (ActionListenner actionListenner : listActionListenners) {
            actionListenner.actionPerform(ActionEvent.LABEL);
        }
    }
}
