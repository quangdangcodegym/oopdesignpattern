package com.codegym.command.undoeditor;

public abstract class Command {
    public Editor editor;
    private String backup;

    Command(Editor editor) {
        this.editor = editor;
    }
    void backup() {
        this.backup = editor.textField.getText();
    }

    public void undo() {
        editor.textField.setText(this.backup);
    }

    public abstract boolean execute();
}
