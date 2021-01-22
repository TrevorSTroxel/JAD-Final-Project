import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * This file is where we will hold new variables we will need to deal with. The
 * reason why we moved them here is that our other files were becoming to
 * bloated and confusing. With this our coding shall look much nicer and much
 * better to manage as we can now change any variable configuration here
 */

public class WindowVar {
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    public static JPanel Panel2 = new JPanel(); // this panel is being used for creating files in folders
    public static JPanel Panel3 = new JPanel(); // this panel will be used to create methods inside the desired file
    public static JPanel Panel4 = new JPanel(); // this will be used to create methods in files
    public static JPanel Panel5 = new JPanel(); // this will be used to add content to panels
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    public static JTextField P2_Dir_Text_Field = new JTextField("Click Button to select your directory.", 30);
    public static JTextField P2_File_Name = new JTextField("Enter what you want to name your file: ", 30);
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    public static JTextField P3_File_Path = new JTextField("Click Button to select your directory and file.", 30);
    public static JTextField P3_Class_Name = new JTextField("Enter what you want to name your class: ", 30);
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    public static JTextField P4_File_Path = new JTextField("Click Button to select your directory and file.", 30);
    public static JTextField P4_Return_Type = new JTextField("Enter what data type the method should return: ", 30);
    public static JTextField P4_Method_Name = new JTextField("Enter the name of your method: ", 30);
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    public static JTextField P5_File_Dir = new JTextField("Click Button to select your directory and file.", 30);
    public static JTextField P5_Method_Name = new JTextField("Enter the name of your method: ", 30);
    public static JTextField P5_Contents_To_Add = new JTextField("Enter what you want to add to the method: ", 30);
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    // We kept our naming convention simple to help avoid confusion on what they do
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    public static JButton P2_Enter_Get_Dir = new JButton("Click Button to select your directory.");
    public static JButton P2_Enter_Get_File_Name = new JButton("Enter File Name");
    public static JButton P2_Enter_Call_Method = new JButton("Create file in location"); // calls our create file method
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    public static JButton P3_Enter_Get_Dir = new JButton("Click Button to select your directory.");
    public static JButton P3_Enter_Get_Class_Name = new JButton("Enter Name of class");
    public static JButton P3_Enter_Call_Method = new JButton("Create class");
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    public static JButton P4_Enter_File_Dir = new JButton("Click Button to select your directory.");
    public static JButton P4_Enter_Return_Type = new JButton("Enter Return Type.");
    public static JButton P4_Enter_Method_Name = new JButton("Enter Method Name.");
    public static JButton P4_Enter_Call_Method = new JButton("Create Method.");
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    public static JButton P5_Enter_File_Dir = new JButton("Click Button to select your directory.");
    public static JButton P5_Enter_Method_Name = new JButton("Enter Method Name.");
    public static JButton P5_Enter_Contents = new JButton("Enter Contents.");
    public static JButton P5_Enter_Call_Method = new JButton("Add Contents To Methods.");
    //////////////////////////////////////////////////////////////////////////////////////////////////////
    public static JTextArea errorTextArea = new JTextArea(20, 20); // this will display an error message
    //////////////////////////////////////////////////////////////////////////////////////////////////////
}
