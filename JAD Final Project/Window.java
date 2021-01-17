import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window extends JFrame implements ActionListener {

    /**
     * this line is meant to keep VSCode happy
     */
    private static final long serialVersionUID = 1L;

    JFrame MainWindow = new JFrame("Jave Program Creation"); // creates the main window for the user to see
    JPanel TextInput = new JPanel(); // this will hold the text input the user will do to call the different classes
    JTextField userInput = new JTextField(); // this will be where the user types what they want to do

    // we created this method to call so that if we want to add more we can just add
    // it here rather than adding on to methods that already have a lot of stuff in
    // them
    public void WindowCreation() {
        addContents();
    }

    /**
     * This will add most of the content to the main window function
     */
    private void addContents() {
        MainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        TextInput.setEnabled(true);
        MainWindow.add(TextInput);
        MainWindow.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

    }

}
