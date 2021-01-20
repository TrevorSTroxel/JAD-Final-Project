
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
    JButton Tutorial = new JButton("Help"); // tutorial button

    String[] WordChoice; // this is a generic String array to be used later
    String NAME = new String();
    String DIR = new String();

    String FILEPATH = new String();
    String CLASSNAME = new String();

    // Trying to have variables with better names, so it is better programing habits
    // and easier to read in code form;
    String Panel4_File_Dir = new String();
    String Panel4_Return_Type = new String();
    String Panel4_Mathed_Name = new String();

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
     * @apiNote Look into finding better ways of having this be layed out. Possible
     *          call another window to handle all these inputs so that it looks much
     *          cleaner
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
            Text_Field_Input.P2_Enter_Get_Dir.addActionListener(this);
            Text_Field_Input.P2_Enter_Get_File_Name.addActionListener(this);
            Text_Field_Input.P2_Enter_Call_Method.addActionListener(this);
            Text_Field_Input.Panel2.setVisible(true);
        }

        else if (e.getSource() == Enter && WordChoice[1].equals("class")) {
            Panel1.setVisible(false);
            Text_Field_Input.addPanel3();
            Text_Field_Input.P3_Enter_Get_Dir.addActionListener(this);
            Text_Field_Input.P3_Enter_Get_Class_Name.addActionListener(this);
            Text_Field_Input.P3_Enter_Call_Method.addActionListener(this);
            Text_Field_Input.Panel3.setVisible(true);
        }

        else if (e.getSource() == Enter && WordChoice[1].equals("method")) {
            Panel1.setVisible(false);
            Text_Field_Input.addPanel4();
            Text_Field_Input.P4_Enter_File_Dir.addActionListener(this);
            Text_Field_Input.P4_Enter_Return_Type.addActionListener(this);
            Text_Field_Input.P4_Enter_Method_Name.addActionListener(this);
            Text_Field_Input.P4_Enter_Call_Method.addActionListener(this);
            Text_Field_Input.Panel4.setVisible(true);
        }

        /////////////////////////////////////////////////////////////////////////////////////
        // This is where our program will calculate certain users input
        // add contigencies for if the user does not enter something correct
        else if (e.getSource() == Text_Field_Input.P2_Enter_Get_Dir) {
            WordChoice = Text_Field_Input.P2_Dir_Text_Field.getText().split(" "); // this will breake up the string to
                                                                                  // be read easier
            DIR = WordChoice[7];// this takes the name of the file directory that the user inputs
            File file = new File(DIR);
            if (!file.isDirectory()) {
                // Text_Field_Input.ERROR(Text_Field_Input.Panel2); //come back to this later
                // as this is not working proporly
                System.out.println("There was an error in your text, try again");
            }
        }

        else if (e.getSource() == Text_Field_Input.P2_Enter_Get_File_Name) {
            WordChoice = Text_Field_Input.P2_File_Name.getText().split(" "); // this will breake up the string to be
                                                                             // read
            // easier
            NAME = WordChoice[8];// this takes the name of the file directory that the user inputs
        }

        else if (e.getSource() == Text_Field_Input.P2_Enter_Call_Method) {
            Create.create_file(DIR, NAME); // this calls the method after both variables are set and then creats a new
                                           // file in a folder location

        }

        /////////////////////////////////////////////////////////////////////////////////////

        else if (e.getSource() == Text_Field_Input.P3_Enter_Get_Dir) {
            WordChoice = Text_Field_Input.P3_File_Path.getText().split(" ");

            FILEPATH = WordChoice[5];
        }

        else if (e.getSource() == Text_Field_Input.P3_Enter_Get_Class_Name) {
            WordChoice = Text_Field_Input.P3_Class_Name.getText().split(" ");

            CLASSNAME = WordChoice[8];
        }

        else if (e.getSource() == Text_Field_Input.P3_Enter_Call_Method) {
            Create.creatr_class(FILEPATH, CLASSNAME);
        }

        /////////////////////////////////////////////////////////////////////////////////////

        else if (e.getSource() == Text_Field_Input.P4_Enter_File_Dir) {
            WordChoice = Text_Field_Input.P4_File_Path.getText().split(" ");

            Panel4_File_Dir = WordChoice[5];

        }

        else if (e.getSource() == Text_Field_Input.P4_Enter_Return_Type) {
            WordChoice = Text_Field_Input.P4_Return_Type.getText().split(" ");

            Panel4_Return_Type = WordChoice[8];
        }

        else if (e.getSource() == Text_Field_Input.P4_Enter_Method_Name) {
            WordChoice = Text_Field_Input.P4_Method_Name.getText().split(" ");

            Panel4_Mathed_Name = WordChoice[6];
        }

        else if (e.getSource() == Text_Field_Input.P4_Enter_Call_Method) {
            Create.create_method(Panel4_File_Dir, Panel4_Return_Type, Panel4_Mathed_Name);
        }

        /////////////////////////////////////////////////////////////////////////////////////

        else if (e.getSource() == Tutorial) {
            Help();
        }

    }

}
