import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

//<html> <br/> </html>

/**
 * This file is where we will hold new variables we will need to deal with. The
 * reason why we moved them here is that our other files were becoming to
 * bloated and confusing. With this our coding shall look much nicer and much
 * better to manage as we can now change any variable configuration here
 * 
 * Our naming conventions goes like this: 
 * First part : what panel it belongs to
 * end part : what tpye of variable is it
 */

/**
 * How we organize our variable is by: JPanel, JLabel, JTextArea, JButtons
 */

public class WindowVar {
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    // These varables are special, they get their own space
    // I wanted to almost all variables inside here for better organization
    // Variables from: PrimaryWindow.java
    public static JFrame MainWindow = new JFrame("Jave Program Creation");// main window
    public static JPanel Panel1 = new JPanel(); // Starting panel for people to see
    public static JTextArea P1_Text_Field = new JTextArea(); // Users first choice into what to do
    public static JButton P1_Enter = new JButton("Enter"); // for confermation and selection process
    public static JButton P1_Tutorial = new JButton("Help"); // tutorial button
    public static String[] WordChoice; // generic string array
    public static JFrame Help_Window = new JFrame("Tutorial");
    public static JPanel Help_Panel = new JPanel();
    public static JTextArea Instructions = new JTextArea(20, 20);
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    // Variables from: SecondayWindow.java
    public static JFrame Creation_Window = new JFrame("Program execution");
    public static String[] Word_Split;
    public static JLabel l = new JLabel();
    public static String P2_FILE_NAME = new String();
    public static String P2_FILE_PATH = new String();
    public static String P3_CLASS_NAME = new String();
    public static String P3_FILE_PATH = new String();
    public static String P4_File_Path = new String();
    public static String P4_Return_Type = new String();
    public static String P4_Mathed_Name = new String();
    public static String P5_File_Path = new String();
    public static String P5_Method_Name = new String();
    public static String P5_Add_Contents = new String();
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    // Everything below this line should be orginally created in this file
    public static JPanel Panel2 = new JPanel(); // this panel is being used for creating files in folders
    public static JLabel P2_File_Path_Label = new JLabel("<html>Click Button to <br/>select your directory.</html>");
    public static JLabel P2_File_Name_Label = new JLabel("Enter what you want to name your file: ");
    public static JTextArea P2_File_Path_Text_Field = new JTextArea();
    public static JTextArea P2_File_Name_Text_Field = new JTextArea();
    public static JButton P2_File_Path_Button = new JButton("<html>Click Button to <br/>select your directory.</html>");
    public static JButton P2_File_Name_Button = new JButton("Enter File Name");
    public static JButton P2_Call_Method_Button = new JButton("Create file in location");
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    public static JPanel Panel3 = new JPanel(); // this panel will be used to create methods inside the desired file
    public static JLabel P3_File_Path_Label = new JLabel(
            "<html>Click Button to <br/>select your directory and file.</html>");
    public static JLabel P3_Class_Name_Label = new JLabel("Enter what you want to name your class: ");
    public static JTextArea P3_File_Path_Text_Field = new JTextArea();
    public static JTextArea P3_Class_Name_Text_Field = new JTextArea();
    public static JButton P3_File_Path_Button = new JButton("<html>Click Button to <br/>select your directory.</html>");
    public static JButton P3_Class_Name_Button = new JButton("Enter Name of class");
    public static JButton P3_Call_Method_Button = new JButton("Create class");
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    public static JPanel Panel4 = new JPanel(); // this will be used to create methods in files
    public static JLabel P4_File_Path_Label = new JLabel(
            "<html>Click Button to <br/>select your directory and file.</html>");
    public static JLabel P4_Return_Type_Label = new JLabel("Enter what data type the method should return: ");
    public static JLabel P4_Method_Name_Label = new JLabel("Enter the name of your method: ");
    public static JTextArea P4_File_Path_Text_Field = new JTextArea();
    public static JTextArea P4_Return_Type_Text_Field = new JTextArea();
    public static JTextArea P4_Method_Name_Text_Field = new JTextArea();
    public static JButton P4_File_Path_Button = new JButton("<html>Click Button to <br/>select your directory.</html>");
    public static JButton P4_Return_Type_Button = new JButton("Enter Return Type.");
    public static JButton P4_Method_Name_Button = new JButton("Enter Method Name.");
    public static JButton P4_Call_Method_Button = new JButton("Create Method.");
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    public static JPanel Panel5 = new JPanel(); // this will be used to add content to panels
    public static JLabel P5_File_Path_Label = new JLabel(
            "<html>Click Button to <br/>select your directory and file.</html>");
    public static JLabel P5_Method_Name_Label = new JLabel("Enter the name of your method: ");
    public static JLabel P5_Contents_To_Add_Label = new JLabel("Enter what you want to add to the method: ");
    public static JTextArea P5_File_Path_Text_Field = new JTextArea();
    public static JTextArea P5_Method_Name_Text_Field = new JTextArea();
    public static JTextArea P5_Contents_To_Add_Text_Field = new JTextArea();
    public static JButton P5_File_Path_Button = new JButton("<html>Click Button to <br/>select your directory.</html>");
    public static JButton P5_Method_Name_Button = new JButton("Enter Method Name.");
    public static JButton P5_Add_Contents_Button = new JButton("Enter Contents.");
    public static JButton P5_Call_Method_Button = new JButton("Add Contents To Methods.");
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    // We kept our naming convention simple to help avoid confusion on what they do
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    public static JTextArea errorTextArea = new JTextArea(20, 20); // this will display an error message
    //////////////////////////////////////////////////////////////////////////////////////////////////////
}
