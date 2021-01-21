import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

//this will be used for better organization purposes
public class SecondayWindows extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

    Text_Field_Input newInput = new Text_Field_Input();

    static JFrame SecondWindow = new JFrame("Program execution");

    String[] WordChoice; // this is a generic String array to be used later
    String Panel2_NAME = new String();
    String Panel2_DIR = new String();

    String Panel3_FILEPATH = new String();
    String Panel3_CLASSNAME = new String();

    String Panel4_File_Dir = new String();
    String Panel4_Return_Type = new String();
    String Panel4_Mathed_Name = new String();

    /**
     * This will take in different settings and features from various windows so
     * that the user can have multiple windows open to use
     * 
     * @param settings
     */
    public static void SecondSetUp() {
        SecondWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SecondWindow.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        SecondSetUp();

        /////////////////////////////////////////////////////////////////////////////////////
        // This is where our program will calculate certain users input
        // add contigencies for if the user does not enter something correct
        if (e.getSource() == Text_Field_Input.P2_Enter_Get_Dir) {
            WordChoice = Text_Field_Input.P2_Dir_Text_Field.getText().split(" "); // this will breake up the string to
                                                                                  // be read easier
            Panel2_DIR = WordChoice[7];// this takes the name of the file directory that the user inputs
            File file = new File(Panel2_DIR);
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
            Panel2_NAME = WordChoice[8];// this takes the name of the file directory that the user inputs
        }

        else if (e.getSource() == Text_Field_Input.P2_Enter_Call_Method) {
            Create.create_file(Panel2_DIR, Panel2_NAME); // this calls the method after both variables are set and then
                                                         // creats a new
            // file in a folder location

        }

        /////////////////////////////////////////////////////////////////////////////////////

        else if (e.getSource() == Text_Field_Input.P3_Enter_Get_Dir) {
            WordChoice = Text_Field_Input.P3_File_Path.getText().split(" ");

            Panel3_FILEPATH = WordChoice[5];
        }

        else if (e.getSource() == Text_Field_Input.P3_Enter_Get_Class_Name) {
            WordChoice = Text_Field_Input.P3_Class_Name.getText().split(" ");

            Panel3_CLASSNAME = WordChoice[8];
        }

        else if (e.getSource() == Text_Field_Input.P3_Enter_Call_Method) {
            Create.creatr_class(Panel3_FILEPATH, Panel3_CLASSNAME);
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
    }

}
