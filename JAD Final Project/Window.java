
/**
 * @author Trevor Troxel & Abed Abualkheir
 * @version 1.0
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Window extends JFrame implements ActionListener {

    /**
     * this line is meant to keep VSCode happy
     */
    private static final long serialVersionUID = 1L;

    Create creation = new Create(); // this is used for

    JFrame MainWindow = new JFrame("Jave Program Creation"); // creates the main window for the user to see

    JPanel MainPanel = new JPanel(); // this will hold the text input the user will do to call the different classes

    JTextField userInput = new JTextField(); // this will be where the user types what they want to do

    JButton Enter = new JButton("Enter"); // this is mostly used to seperate out what button is being pressed on the
                                          // main menu
    JButton Tutorial = new JButton("Click me if you want an explinations on some things"); // this will be used to help
                                                                                           // explain to people how to
                                                                                           // do things
    String[] WordChoice;

    // we created this method to call so that if we want to add more we can just add
    // it here rather than adding on to methods that already have a lot of stuff in
    // them
    public void WindowCreation() {
        MainWindow.setSize(500, 500);
        addContents();
    }

    /**
     * @ This will add most of the content to the main window function
     */
    private void addContents() {
        MainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JTextFeild settings
        userInput.setColumns(50); // this changes the size of the text box. the larger the number the more spaces
                                  // the user can see
        userInput.setSize(100, 100);
        userInput.setEditable(true); // this makes it so that the user can edit what they put in the text field

        // Action Listener enabler
        Enter.addActionListener(this);
        Tutorial.addActionListener(this);

        // JPanel additions
        MainPanel.add(userInput); // adds the editable text feild to the panel
        MainPanel.add(Enter);
        MainPanel.add(Tutorial);
        MainPanel.setSize(100, 100);
        MainPanel.setEnabled(true);

        // Window add ons
        MainWindow.add(MainPanel);
        MainWindow.setVisible(true);

    }

    /**
     * This method will be called when the user clicks on the instructions buttons
     * and they will get a pop up telling how to do things
     */
    public void Help() {
        JTextField Instructions = new JTextField(); // this will be used to explain to the user how to do certain
                                                    // commands
        Instructions.setColumns(999); // setting this to a high number for testing purposes

    }

    /**
     * @param e
     * @apiNote this will look at the first word that the user has writen and the
     *          program will go to the correct methods as needed
     */

    @Override
    public void actionPerformed(ActionEvent e) {
        String INPUT = userInput.getText();
        INPUT.toLowerCase(); // this is mostly just convience for the programmers so we can just have a
                             // single argument to deal with
        WordChoice = INPUT.split(" "); // this will split up the input that the user has made and from there the
                                       // program will go to the correct file to run the methods
        if (e.getSource() == Enter) {
            if (WordChoice[0].equals("create")) {
                creation.Creation(WordChoice[1], INPUT);
            }
        } else if (e.getSource() == Tutorial) {
            Help();

        }

    }

}
