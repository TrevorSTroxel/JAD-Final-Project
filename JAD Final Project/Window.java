
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
    JPanel TextInput = new JPanel(); // this will hold the text input the user will do to call the different classes
    JTextField userInput = new JTextField(); // this will be where the user types what they want to do
    JButton Enter = new JButton("Enter"); // this will be used for determining what file to go to and what method to
                                          // call
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
        userInput.setColumns(16);
        userInput.setSize(100, 100);
        userInput.setEditable(true); // this makes it so that the user can edit what they put in the text field

        Enter.addActionListener(this);

        TextInput.add(userInput);
        TextInput.add(Enter);
        TextInput.setSize(100, 100);
        TextInput.setEnabled(true);

        MainWindow.add(TextInput);
        MainWindow.setVisible(true);

    }

    /**
     * @param e
     * @apiNote this will look at the first word that the user has writen and the
     *          program will go to the correct methods as needed
     */

    @Override
    public void actionPerformed(ActionEvent e) {
        String INPUT = userInput.getText();
        WordChoice = INPUT.split(" "); // this will split up the input that the user has made and from there the
                                       // program will go to the correct file to run the methods
        if (e.getSource() == Enter) {
            if (WordChoice[0] == "Create" || WordChoice[0] == "create") {
                creation.Creation(WordChoice[1], INPUT);
            }

        }

    }

}
