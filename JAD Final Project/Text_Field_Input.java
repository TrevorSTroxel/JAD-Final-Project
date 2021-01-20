
/**
 * @author Trevor Troxel & Abed Abualkheir
 * @version 1.0
 */
import javax.swing.JButton;
// import javax.swing.JLabel;
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
    public static JTextField filePath = new JTextField("Enter the complete file path: ", 30); // grabs the files
                                                                                              // location
    public static JTextField className = new JTextField("Enter what you want to name your class: ", 30); // grabs the
                                                                                                         // name for the
                                                                                                         // class
    //////////////////////////////////////////////////////////////////////////////////////////////////////

    //////////////////////////////////////////////////////////////////////////////////////////////////////
    public static JPanel Panel2 = new JPanel(); // this panel is being used for creating files in folders
    public static JPanel Panel3 = new JPanel(); // this panel will be used to create methods inside the desired file
    public static JPanel Panel4 = new JPanel(); // this will be used to create methods in files
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    public static JButton Enter1 = new JButton("Enter Directory");
    public static JButton Enter2 = new JButton("Enter File Name");
    public static JButton Enter3 = new JButton("Create file in location"); // calls our create file method
 //////////////////////////////////////////////////////////////////////////////////////////////////////
    public static JButton Enter4 = new JButton("Enter File Directory"); // this will be used to grab the file loction
                                                                        // where they want to make a method
    public static JButton Enter5 = new JButton("Enter Name of class"); // lets the user name the class they want to
                                                                       // create
    public static JButton Enter6 = new JButton("Create class");
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    public static JButton Enter7 = new JButton()
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

    // this will open up the file the user has selected and add a method to that
    // file
    public static void addPanel3() { // adds buttons
        Panel3.add(Enter4);
        Panel3.add(Enter5);
        Panel3.add(Enter6);

        // addes text feilds
        Panel3.add(filePath);
        Panel3.add(className);

        // enables things
        filePath.setVisible(true);
        filePath.setEditable(true);
        className.setVisible(true);
        className.setEditable(true);

        Panel3.setVisible(true);
        Window.MainWindow.add(Panel3);
    }

    public static void addPanel4() {

    }

    /**
     * have the text area appear for the input and then dissapear after the user
     * gave their input
     */

}
