import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

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
 * How we organize our variable is by: JPanel, JLabel, JTextField, JButtons
 */

public class WindowVar {
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    // These varables are special, they get their own space
    // I wanted to almost all variables inside here for better organization
    public static JFrame MainWindow = new JFrame("Jave Program Creation");// main window
    public static JPanel Panel1 = new JPanel(); // Starting panel for people to see
    public static JTextField P1_Text_Field = new JTextField(); // Users first choice into what to do
    public static JButton P1_Enter = new JButton("Enter"); // for confermation and selection process
    public static JButton P1_Tutorial = new JButton("Help"); // tutorial button
    public static String[] WordChoice; // generic string array
    public static JFrame Help_Window = new JFrame("Tutorial");
    public static JPanel Help_Panel = new JPanel();
    public static JTextArea Instructions = new JTextArea(20, 20);
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    public static JPanel Panel2 = new JPanel(); // this panel is being used for creating files in folders
    public static JLabel P2_File_Path_Label = new JLabel("Click Button to select your directory.");
    public static JLabel P2_File_Name_Label = new JLabel("Enter what you want to name your file: ");
    public static JTextField P2_File_Path_Text_Field = new JTextField(30);
    public static JTextField P2_File_Name_Text_Field = new JTextField(30);
    public static JButton P2_File_Path_Button = new JButton("Click Button to select your directory.");
    public static JButton P2_File_Name_Button = new JButton("Enter File Name");
    public static JButton P2_Call_Method_Button = new JButton("Create file in location");
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    public static JPanel Panel3 = new JPanel(); // this panel will be used to create methods inside the desired file
    public static JLabel P3_File_Path_Label = new JLabel("Click Button to select your directory and file.");
    public static JLabel P3_Class_Name_Label = new JLabel("Enter what you want to name your class: ");
    public static JTextField P3_File_Path_Text_Field = new JTextField(30);
    public static JTextField P3_Class_Name_Text_Field = new JTextField(30);
    public static JButton P3_File_Path_Button = new JButton("Click Button to select your directory.");
    public static JButton P3_Class_Name_Button = new JButton("Enter Name of class");
    public static JButton P3_Call_Method_Button = new JButton("Create class");
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    public static JPanel Panel4 = new JPanel(); // this will be used to create methods in files
    public static JLabel P4_File_Path_Label = new JLabel("Click Button to select your directory and file.");
    public static JLabel P4_Return_Type_Label = new JLabel("Enter what data type the method should return: ");
    public static JLabel P4_Method_Name_Label = new JLabel("Enter the name of your method: ");
    public static JTextField P4_File_Path_Text_Field = new JTextField(30);
    public static JTextField P4_Return_Type_Text_Field = new JTextField(30);
    public static JTextField P4_Method_Name_Text_Field = new JTextField(30);
    public static JButton P4_File_Path_Button = new JButton("Click Button to select your directory.");
    public static JButton P4_Return_Type_Button = new JButton("Enter Return Type.");
    public static JButton P4_Method_Name_Button = new JButton("Enter Method Name.");
    public static JButton P4_Call_Method_Button = new JButton("Create Method.");
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    public static JPanel Panel5 = new JPanel(); // this will be used to add content to panels
    public static JLabel P5_File_Path_Label = new JLabel("Click Button to select your directory and file.");
    public static JLabel P5_Method_Name_Label = new JLabel("Enter the name of your method: ");
    public static JLabel P5_Contents_To_Add_Label = new JLabel("Enter what you want to add to the method: ");
    public static JTextField P5_File_Path_Text_Field = new JTextField(30);
    public static JTextField P5_Method_Name_Text_Field = new JTextField(30);
    public static JTextField P5_Contents_To_Add_Text_Field = new JTextField(30);
    public static JButton P5_File_Path_Button = new JButton("Click Button to select your directory.");
    public static JButton P5_Method_Name_Button = new JButton("Enter Method Name.");
    public static JButton P5_Add_Contents_Button = new JButton("Enter Contents.");
    public static JButton P5_Call_Method_Button = new JButton("Add Contents To Methods.");
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    // We kept our naming convention simple to help avoid confusion on what they do
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    public static JTextArea errorTextArea = new JTextArea(20, 20); // this will display an error message
    //////////////////////////////////////////////////////////////////////////////////////////////////////
}
