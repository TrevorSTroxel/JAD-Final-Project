import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileSystemView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//this will be used for better organization purposes
public class SecondayWindows extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

    static JFrame ContentWindow = new JFrame("Program execution");

    String[] WordChoice;
    static JLabel l = new JLabel();

    String Panel2_NAME = new String();
    String Panel2_DIR = new String();

    String Panel3_FILEPATH = new String();
    String Panel3_CLASSNAME = new String();

    String Panel4_File_Dir = new String();
    String Panel4_Return_Type = new String();
    String Panel4_Mathed_Name = new String();

    String Panel5_FileDir = new String();
    String Panel5_MethodName = new String();
    String Panel5_Contents = new String();

    /**
     * This will take in different settings and features from various windows so
     * that the user can have multiple windows open to use This was also used to
     * help with with file bloating, as some of these files were becoming very large
     */
    /**
     * Consider having multiple windows set up so that they can be all up and
     * operational for the user to use
     */
    public static void SecondSetUp() {
        ContentWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ContentWindow.setSize(700, 700);
        ContentWindow.setLocationRelativeTo(null); // this will make the wondow spawn in the middle of the screen
        ContentWindow.setVisible(true);
    }

    /**
     * What these methods do is to help lessen the amount of code we have to use and
     * also help give the user better feed back after doing something
     * 
     * we ended up having to use HTML code to break up our sentences as the text was
     * to large to fit inside the button
     */

    public static void DirButton(JButton JB) {
        JB.setText("<html> You have chosen your directory.<br/>Click again to change directories</html>");
    }

    public static void nm_Button(JButton _JB) {
        _JB.setText("<html>Name has been set.<br/>Change file name for new file and click again</html>");
    }

    public static void CreationButton(JButton __JB) {
        __JB.setText(
                "<html>You have added to your project.<br/>Check your folder to make sure.<br/>Click again to add more to your project</html>");
    }

    // reference:
    // https://docs.oracle.com/javase/7/docs/api/javax/swing/JFileChooser.html
    public static void FolderSelect(JTextField JTF) {
        JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int r = j.showOpenDialog(null);
        if (r == JFileChooser.APPROVE_OPTION) {
            l.setText(j.getSelectedFile().getAbsolutePath());
        }
        JTF.setText("Your directory is: " + l.getText());
    }

    public static void FileSelect(JTextField JTF) {
        JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        j.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int r = j.showOpenDialog(null);
        if (r == JFileChooser.APPROVE_OPTION) {
            // set the label to the path of the selected directory
            l.setText(j.getSelectedFile().getAbsolutePath());
        }
        JTF.setText("Your directory is: " + l.getText());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == WindowVar.P2_File_Path_Button) {
            FolderSelect(WindowVar.P2_File_Path_Text_Field);
            DirButton(WindowVar.P2_File_Path_Button);
            Panel2_DIR = l.getText();// this takes the name of the file directory that the user inputs
        } else if (e.getSource() == WindowVar.P2_File_Name_Button) {
            WordChoice = WindowVar.P2_File_Name_Text_Field.getText().split(" ");
            nm_Button(WindowVar.P2_File_Name_Button);
            Panel2_NAME = WordChoice[0]; // this takes the name of the file directory that the user inputs
        } else if (e.getSource() == WindowVar.P2_Call_Method_Button) {
            CreationButton(WindowVar.P2_Call_Method_Button);
            Create.create_file(Panel2_DIR, Panel2_NAME); // creates a new file in this location
        }
        /////////////////////////////////////////////////////////////////////////////////////
        else if (e.getSource() == WindowVar.P3_File_Path_Button) {
            FileSelect(WindowVar.P3_File_Path_Text_Field);
            DirButton(WindowVar.P3_File_Path_Button);
            Panel3_FILEPATH = l.getText();// this takes the name of the file directory that the user inputs
        } else if (e.getSource() == WindowVar.P3_Class_Name_Button) {
            WordChoice = WindowVar.P3_Class_Name_Text_Field.getText().split(" ");
            nm_Button(WindowVar.P3_Class_Name_Button);
            Panel3_CLASSNAME = WordChoice[0];
        } else if (e.getSource() == WindowVar.P3_Call_Method_Button) {
            CreationButton(WindowVar.P3_Call_Method_Button);
            Create.creatr_class(Panel3_FILEPATH, Panel3_CLASSNAME);
        }
        /////////////////////////////////////////////////////////////////////////////////////
        else if (e.getSource() == WindowVar.P4_File_Path_Button) {
            FileSelect(WindowVar.P4_File_Path_Text_Field);
            DirButton(WindowVar.P4_File_Path_Button);
            Panel4_File_Dir = l.getText();// this takes the name of the file directory that the user inputs
        } else if (e.getSource() == WindowVar.P4_Return_Type_Button) {
            WordChoice = WindowVar.P4_Return_Type_Text_Field.getText().split(" ");
            nm_Button(WindowVar.P4_Return_Type_Button);
            Panel4_Return_Type = WordChoice[0];
        } else if (e.getSource() == WindowVar.P4_Method_Name_Button) {
            WordChoice = WindowVar.P4_Method_Name_Text_Field.getText().split(" ");
            nm_Button(WindowVar.P4_Method_Name_Button);
            Panel4_Mathed_Name = WordChoice[0];
        } else if (e.getSource() == WindowVar.P4_Call_Method_Button) {
            CreationButton(WindowVar.P4_Call_Method_Button);
            Create.create_method(Panel4_File_Dir, Panel4_Return_Type, Panel4_Mathed_Name);
        }
        /////////////////////////////////////////////////////////////////////////////////////
        else if (e.getSource() == WindowVar.P5_File_Path_Button) {
            FileSelect(WindowVar.P2_File_Path_Text_Field);
            DirButton(WindowVar.P5_File_Path_Button);
            Panel5_FileDir = l.getText();// this takes the name of the file directory that the user inputs
        } else if (e.getSource() == WindowVar.P5_Method_Name_Button) {
            WordChoice = WindowVar.P5_Method_Name_Text_Field.getText().split(" ");
            nm_Button(WindowVar.P5_Method_Name_Button);
            Panel5_MethodName = WordChoice[0];
        } else if (e.getSource() == WindowVar.P5_Add_Contents_Button) {
            WordChoice = WindowVar.P5_Contents_To_Add_Text_Field.getText().split(" ");
            nm_Button(WindowVar.P5_Add_Contents_Button);
            Panel5_Contents = WordChoice[0];
        } else if (e.getSource() == WindowVar.P5_Call_Method_Button) {
            CreationButton(WindowVar.P5_Call_Method_Button);
            Create.Add_To_Method(Panel5_FileDir, Panel5_MethodName, Panel5_Contents);
        } else {
            System.out.println("Wrong command, try agian.");
        }
        /////////////////////////////////////////////////////////////////////////////////////
    }
}
