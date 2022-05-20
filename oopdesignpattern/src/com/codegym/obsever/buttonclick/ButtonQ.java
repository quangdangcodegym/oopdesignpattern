package com.codegym.obsever.buttonclick;

import java.util.ArrayList;
import java.util.List;

public class ButtonQ {
    private List<ActionListenerQ> listActionListeners;
    ButtonQ() {
        listActionListeners  = new ArrayList<>();
    }
    public void addActionListener(ActionListenerQ actionListener) {
        listActionListeners.add(actionListener);
    }
    public void removeActionListener(ActionListenerQ actionListener) {
        listActionListeners.remove(actionListener);
    }

    public void notifyClicked(){
        for (ActionListenerQ actionListenerQ : listActionListeners) {
            actionListenerQ.actionPerformed("Hello abc");
        }
    }


}
