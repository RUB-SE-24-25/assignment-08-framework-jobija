package structra.assignment.task.impl;

import structra.assignment.framework.llm.gen.questions.OpenQuestionTarget;
import structra.assignment.framework.llm.model.Mimic;
import structra.assignment.framework.provide.ModelQuestionProvider;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI {

    /**
     * Create the GUI and show it. For thread safety, this method should be invoked from the
     * event-dispatching thread.
     */
    private static void createAndShowGUI() {
        //classA classA = new classA();
        //Mimic mimic = new Mimic(classA);
        //OpenQuestionTarget target = new OpenQuestionTarget("Test");
        //        contextQuestions = new
        //ModelQuestionProvider provider = new ModelQuestionProvider(mimic,target,)

        // Create and set up the window
        JFrame frame = new JFrame("GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,600);
        frame.setLayout(null);

        // Add the "Hello World" label to the center of the window
        JLabel label = new JLabel("[...]");
        label.setVerticalAlignment(SwingConstants.TOP);
        label.setHorizontalAlignment(SwingConstants.LEFT);
        label.setBounds(10,10,550,400);
        frame.add(label);

        // Add the "Hello World" label to the center of the window
        JButton button = new JButton("Get next Question");
        button.setBounds(10,420,150,20);
        frame.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Change the text in the textField when the button is clicked
                label.setText("Test!!!");
            }
        });

        // Display the window
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Schedule a job for the event-dispatching thread:
        // creating and showing this application's GUI.
        SwingUtilities.invokeLater(GUI::createAndShowGUI);
    }
}
