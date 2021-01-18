
/**
 * @author Trevor Troxel & Abed Abualkheir
 * @version 1.0
 */
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Window extends JFrame implements ActionListener {
    // public static Window addContent = new Window(); // this is to add the text
    // field to the

    /**
     * this line is meant to keep VSCode happy
     */
    private static final long serialVersionUID = 1L;

    Create creation = new Create(); // this is an object that is used for calling the a methods to sort out what the
                                    // user wants to do
    Text_Field_Input newInput = new Text_Field_Input();

    static JFrame MainWindow = new JFrame("Jave Program Creation"); // creates the main window for the user to see

    public static JPanel Panel1 = new JPanel(); // this will hold the text input the user will do to call the different
    // classes

    JTextField userInput = new JTextField(); // this will be where the user types what they want to do

    JButton Enter = new JButton("Enter"); // this is mostly used to seperate out what button is being pressed on the
                                          // main menu
    JButton Tutorial = new JButton("Click me if you want an explinations on some things"); // this will be used to help
                                                                                           // explain to people how to
                                                                                           // do things
    String[] WordChoice; // this is a generic String array to be used later
    String NAME = new String();
    String DIR = new String();

    // we created this method to call so that if we want to add more we can just add
    // it here rather than adding on to methods that already have a lot of stuff in
    // them
    public void WindowCreation() {
        MainWindow.setSize(500, 500);

        addContents();
    }

    /**
     * This will add most of the content to the main window function
     */
    private void addContents() {
        // create a new panel. name it panel2. add the second text field to it. add
        // panel2 to mainwindow. set panel2 to false/true.
        // Panel1.add(Text_Field_Input.Dir);

        MainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JTextFeild settings
        userInput.setColumns(25); // this changes the size of the text box. the larger the number the more spaces
                                  // the user can see
        userInput.setSize(100, 100);
        userInput.setEditable(true); // this makes it so that the user can edit what they put in the text field

        // ActionListener enabler
        Enter.addActionListener(this);
        Tutorial.addActionListener(this);

        // JPanel additions
        Panel1.add(userInput); // adds the editable text feild to the panel
        Panel1.add(Enter);
        Panel1.add(Tutorial);
        Panel1.setSize(100, 100);
        Panel1.setEnabled(true);

        // Window add ons
        MainWindow.add(Panel1);
        MainWindow.setVisible(true);

    }

    /**
     * This method will be called when the user clicks on the instructions buttons
     * and they will get a pop up telling how to do things
     */
    public void Help() {
        JFrame HelpWindow = new JFrame("Tutorial"); // this will pop up once the user click the button to see another
                                                    // window for instructions

        JPanel HelpPanel = new JPanel(); // this will add content to the new window that was made
        JTextArea Instructions = new JTextArea(20, 20); // this will be used to display all the content of the text file

        // reference: https://kodejava.org/how-do-i-read-text-file-into-jtextarea/
        try {
            // Read some text from the resource file to display in
            // the JTextArea.
            Instructions.read(new InputStreamReader(getClass().getResourceAsStream("/help.txt")), null);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Instructions.setEditable(false); // the user can't edit the text
        Font f = new Font("Times New Roman", Font.BOLD, 16); // this sets up the style of the text for the new window
        Instructions.setFont(f); // sets the style of the text

        HelpPanel.add(Instructions);
        HelpPanel.setEnabled(true);

        HelpWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        HelpWindow.setSize(700, 700);
        HelpWindow.add(HelpPanel);
        HelpWindow.setVisible(true);
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
        if (e.getSource() == Enter && WordChoice[1].equals("file")) {
            Panel1.setVisible(false); // this brings up the new panel for the user to see and hides the first panel
            Text_Field_Input.addPanel2(); // calls the method to set up the second panel
            // we needed to add action functionality to our buttons and this was the only
            // way we could set this up
            Text_Field_Input.Enter1.addActionListener(this);
            Text_Field_Input.Enter2.addActionListener(this);
            Text_Field_Input.Enter3.addActionListener(this);
            Text_Field_Input.Panel2.setVisible(true);
        }
        // add contigencies for if the user does not enter something correct
        else if (e.getSource() == Text_Field_Input.Enter1) {
            WordChoice = Text_Field_Input.Dir.getText().split(" "); // this will breake up the string to be read easier
            DIR = WordChoice[7];// this takes the name of the file directory that the user inputs
            File file = new File(DIR);
            if (!file.isDirectory()) {
                // Text_Field_Input.ERROR(Text_Field_Input.Panel2); //come backk to this later
                // as this is not working proporly
                System.out.println("There was an error in your text, try again");
            }
        }

        else if (e.getSource() == Text_Field_Input.Enter2) {
            WordChoice = Text_Field_Input.fileName.getText().split(" "); // this will breake up the string to be read
                                                                         // easier
            NAME = WordChoice[8];// this takes the name of the file directory that the user inputs
        }

        else if (e.getSource() == Text_Field_Input.Enter3) {
            Create.create_file(DIR, NAME); // this calls the method after both variables are set and then creats a new
                                           // file in a folder location
        } else if (e.getSource() == Tutorial) {
            Help();
        }

    }

}
