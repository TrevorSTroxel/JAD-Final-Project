
/**
 * @author Trevor Troxel & Abed Abualkheir
 * @version 1.0
 */
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//this file will be used to have multiple JTextFields and JTextArea for the whole program to use
public class Text_Field_Input {
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    public static JTextField Dir = new JTextField("Enter the name of your directory here: ", 25); // generic TextField
                                                                                                  // for my methods to
                                                                                                  // use
    public static JTextField fileName = new JTextField("Enter what you want to name your file: ", 30); // will be used
                                                                                                       // for the name
                                                                                                       // of the file
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    public static String dir = new String(); // this is the directory that the user wants to create
    public static String name = new String(); // used for grabbing the name of the file you want to make
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    public static JPanel Panel2 = new JPanel();
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    public static JButton Enter1 = new JButton("Enter Directory");
    public static JButton Enter2 = new JButton("Enter File Name");
    public static JButton Enter3 = new JButton("Create file in location");
    //////////////////////////////////////////////////////////////////////////////////////////////////////

    //////////////////////////////////////////////////////////////////////////////////////////////////////
    public static JTextArea errorTextArea = new JTextArea(20, 20); // this will display an error message
    //////////////////////////////////////////////////////////////////////////////////////////////////////

    //////////////////////////////////////////////////////////////////////////////////////////////////////

    //////////////////////////////////////////////////////////////////////////////////////////////////////

    // this functions will be called if there is an error in the users input
    public static void ERROR(JPanel JP) {
        errorTextArea.setEditable(false);
        errorTextArea.setText("You mistyped something in the text area, try again.");
        errorTextArea.setVisible(true);
        Panel2.add(errorTextArea);
    }

    // this will be called if you want to create a file
    public static void addPanel2() {
        // Adds the buttons to the pannel
        Panel2.add(Enter1);
        Panel2.add(Enter2);
        Panel2.add(Enter3);

        // adds the text fields to the new panel
        Panel2.add(Dir);
        Panel2.add(fileName);

        // This enabes the user to see the text fields and to also be able to write in
        // the
        Dir.setVisible(true);
        Dir.setEditable(true);
        fileName.setVisible(true);
        fileName.setEditable(true);

        // makes it so we can see the new panel and adds it to the main window
        Panel2.setVisible(true);
        Window.MainWindow.add(Panel2);

    }

    /**
     * have the text area appear fdor the input and then dissapear after the user
     * gave their input
     */

}
