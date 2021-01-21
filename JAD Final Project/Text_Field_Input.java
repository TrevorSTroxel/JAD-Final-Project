
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
    public static JPanel Panel2 = new JPanel(); // this panel is being used for creating files in folders
    public static JPanel Panel3 = new JPanel(); // this panel will be used to create methods inside the desired file
    public static JPanel Panel4 = new JPanel(); // this will be used to create methods in files
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    // generic TextField for my methods to use
    public static JTextField P2_Dir_Text_Field = new JTextField("Enter the name of your directory here: ", 30);
    // will be used for the name of the file
    public static JTextField P2_File_Name = new JTextField("Enter what you want to name your file: ", 30);
    // grabs the files location
    public static JTextField P3_File_Path = new JTextField("Enter the complete file path: ", 30);
    public static JTextField P3_Class_Name = new JTextField("Enter what you want to name your class: ", 30);
    public static JTextField P4_File_Path = new JTextField("Enter the complete file path: ", 30);
    public static JTextField P4_Return_Type = new JTextField("Enter what data type the method should return: ", 30);
    public static JTextField P4_Method_Name = new JTextField("Enter the name of your method: ", 30);
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    // We kept our naming convention simple to help avoid confusion on what they do
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    public static JButton P2_Enter_Get_Dir = new JButton("Enter Directory");
    public static JButton P2_Enter_Get_File_Name = new JButton("Enter File Name");
    public static JButton P2_Enter_Call_Method = new JButton("Create file in location"); // calls our create file method
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    // this will be used to grab the file loction where they want to make a method
    public static JButton P3_Enter_Get_Dir = new JButton("Enter File Directory");
    // lets the user name the class they want to create
    public static JButton P3_Enter_Get_Class_Name = new JButton("Enter Name of class");
    public static JButton P3_Enter_Call_Method = new JButton("Create class");
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    public static JButton P4_Enter_File_Dir = new JButton("Enter File Directory");
    public static JButton P4_Enter_Return_Type = new JButton("Enter Return Type");
    public static JButton P4_Enter_Method_Name = new JButton("Enter Method Name");
    public static JButton P4_Enter_Call_Method = new JButton("Create Method");
    //////////////////////////////////////////////////////////////////////////////////////////////////////

    //////////////////////////////////////////////////////////////////////////////////////////////////////
    public static JTextArea errorTextArea = new JTextArea(20, 20); // this will display an error message
    //////////////////////////////////////////////////////////////////////////////////////////////////////

    // WIP
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
        Panel2.add(P2_Enter_Get_Dir);
        Panel2.add(P2_Enter_Get_File_Name);
        Panel2.add(P2_Enter_Call_Method);

        // adds the text fields to the new panel
        Panel2.add(P2_Dir_Text_Field);
        Panel2.add(P2_File_Name);

        // This enabes the user to see the text fields and to also be able to write in
        // the
        P2_Dir_Text_Field.setVisible(true);
        P2_Dir_Text_Field.setEditable(true);
        P2_File_Name.setVisible(true);
        P2_File_Name.setEditable(true);

        // makes it so we can see the new panel and adds it to the main window
        Panel2.setVisible(true);
        SecondayWindows.SecondSetUp();
        SecondayWindows.SecondWindow.add(Panel2);
    }

    // this will open up the file the user has selected and add a method to that
    // file
    public static void addPanel3() {
        Panel3.add(P3_Enter_Get_Dir);
        Panel3.add(P3_Enter_Get_Class_Name);
        Panel3.add(P3_Enter_Call_Method);

        Panel3.add(P3_File_Path);
        Panel3.add(P3_Class_Name);

        // enables things
        P3_File_Path.setVisible(true);
        P3_File_Path.setEditable(true);
        P3_Class_Name.setVisible(true);
        P3_Class_Name.setEditable(true);

        Panel3.setVisible(true);
        SecondayWindows.SecondSetUp();
        SecondayWindows.SecondWindow.add(Panel3);
    }

    // Allows the user to make a class inside the file they made
    public static void addPanel4() {
        // adds buttons
        Panel4.add(P4_Enter_File_Dir);
        Panel4.add(P4_Enter_Return_Type);
        Panel4.add(P4_Enter_Method_Name);
        Panel4.add(P4_Enter_Call_Method);

        // adds text fields
        Panel4.add(P4_File_Path);
        Panel4.add(P4_Method_Name);
        Panel4.add(P4_Return_Type);

        // enables things
        Text_Box_Settings(P4_File_Path);
        Text_Box_Settings(P4_Method_Name);
        Text_Box_Settings(P4_Return_Type);

        Panel4.setVisible(true);
        SecondayWindows.SecondSetUp();
        SecondayWindows.SecondWindow.add(Panel4);
    }

    public static void Text_Box_Settings(JTextField JTF) {
        JTF.setVisible(true);
        JTF.setEditable(true);
    }

}
