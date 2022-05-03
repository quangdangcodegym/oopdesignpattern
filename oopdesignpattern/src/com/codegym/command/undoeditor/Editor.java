package com.codegym.command.undoeditor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Editor {
    public JTextArea textField;
    public String clipboard;
    private CommandHistory history = new CommandHistory();
    public void init() {
        JFrame jframe = new JFrame("Text editor");
        JPanel content = new JPanel();

        jframe.setContentPane(content);
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        content.setLayout(new BoxLayout(content, BoxLayout.Y_AXIS));
        textField = new JTextArea();
        textField.setLineWrap(true);
        content.add(textField);
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.CENTER));

        JButton ctrC = new JButton("Ctrl + C");
        JButton ctrX = new JButton("Ctrl + X");
        JButton ctrV = new JButton("Ctrl + V");
        JButton ctrZ = new JButton("Ctrl + Z");

        Editor editor = this;
        ctrC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeCommand(new CopyCommand(editor));
            }
        });
        ctrV.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeCommand(new PasteCommand(editor));
            }
        });
        ctrX.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                executeCommand(new CutCommand(editor));
            }
        });
        ctrZ.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                undo();
            }
        });
        buttons.add(ctrC);
        buttons.add(ctrX);
        buttons.add(ctrV);
        buttons.add(ctrZ);
        content.add(buttons);
        jframe.setSize(450, 200);
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);

    }

    private void executeCommand(Command command) {
        if (command.execute()) {
            history.push(command);
        }
    }
    private void undo() {
        if (history.isEmpty()) {
            return;
        }
        Command command = history.pop();
        if (command != null) {
            command.undo();
        }
    }
}
