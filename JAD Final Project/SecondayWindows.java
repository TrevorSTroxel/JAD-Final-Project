import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
        ContentWindow.setSize(500, 500);
        ContentWindow.setLocation(PrimaryWindow.MainWindow.getX() + PrimaryWindow.MainWindow.getWidth(),
                PrimaryWindow.MainWindow.getY());
        ContentWindow.setVisible(true);
    }

    public static void DirButton(JButton JB) {
        JB.setText("You have chosen your directory. Click again to change directories");
    }

    public static void nm_Button(JButton _JB) {
        _JB.setText("Name has been set. Change file name for new file and click again");
    }

    public static void CreationButton(JButton __JB) {
        __JB.setText(
                "You have added to your project. Check your folder to make sure. Click again to add more to your project");
    }

    public static void FolderSelect() {
        JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int r = j.showOpenDialog(null);
        if (r == JFileChooser.APPROVE_OPTION) {
            // set the label to the path of the selected directory
            l.setText(j.getSelectedFile().getAbsolutePath());
        }
    }

    public static void FileSelect() {
        JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        j.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int r = j.showOpenDialog(null);
        if (r == JFileChooser.APPROVE_OPTION) {
            // set the label to the path of the selected directory
            l.setText(j.getSelectedFile().getAbsolutePath());
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == WindowVar.P2_Enter_Get_Dir) {
            FolderSelect();
            WindowVar.P2_Dir_Text_Field.setText("Your directory is: " + l.getText());
            DirButton(WindowVar.P2_Enter_Get_Dir);
            Panel2_DIR = l.getText();// this takes the name of the file directory that the user inputs
        } else if (e.getSource() == WindowVar.P2_Enter_Get_File_Name) {
            WordChoice = WindowVar.P2_File_Name.getText().split(" ");
            nm_Button(WindowVar.P2_Enter_Get_File_Name);
            Panel2_NAME = WordChoice[8]; // this takes the name of the file directory that the user inputs
        } else if (e.getSource() == WindowVar.P2_Enter_Call_Method) {
            CreationButton(WindowVar.P2_Enter_Call_Method);
            Create.create_file(Panel2_DIR, Panel2_NAME); // creates a new file in this location
        }
        /////////////////////////////////////////////////////////////////////////////////////
        else if (e.getSource() == WindowVar.P3_Enter_Get_Dir) {
            FileSelect();
            WindowVar.P3_File_Path.setText("Your directory is: " + l.getText());
            DirButton(WindowVar.P3_Enter_Get_Dir);
            Panel3_FILEPATH = l.getText();// this takes the name of the file directory that the user inputs
        } else if (e.getSource() == WindowVar.P3_Enter_Get_Class_Name) {
            WordChoice = WindowVar.P3_Class_Name.getText().split(" ");
            nm_Button(WindowVar.P3_Enter_Get_Class_Name);
            Panel3_CLASSNAME = WordChoice[8];
        } else if (e.getSource() == WindowVar.P3_Enter_Call_Method) {
            CreationButton(WindowVar.P3_Enter_Call_Method);
            Create.creatr_class(Panel3_FILEPATH, Panel3_CLASSNAME);
        }
        /////////////////////////////////////////////////////////////////////////////////////
        else if (e.getSource() == WindowVar.P4_Enter_File_Dir) {
            FileSelect();
            WindowVar.P4_File_Path.setText("Your directory is: " + l.getText());
            DirButton(WindowVar.P4_Enter_File_Dir);
            Panel4_File_Dir = l.getText();// this takes the name of the file directory that the user inputs
        } else if (e.getSource() == WindowVar.P4_Enter_Return_Type) {
            WordChoice = WindowVar.P4_Return_Type.getText().split(" ");
            nm_Button(WindowVar.P4_Enter_Return_Type);
            Panel4_Return_Type = WordChoice[8];
        } else if (e.getSource() == WindowVar.P4_Enter_Method_Name) {
            WordChoice = WindowVar.P4_Method_Name.getText().split(" ");
            nm_Button(WindowVar.P4_Enter_Method_Name);
            Panel4_Mathed_Name = WordChoice[6];
        } else if (e.getSource() == WindowVar.P4_Enter_Call_Method) {
            CreationButton(WindowVar.P4_Enter_Call_Method);
            Create.create_method(Panel4_File_Dir, Panel4_Return_Type, Panel4_Mathed_Name);
        }
        /////////////////////////////////////////////////////////////////////////////////////
        else if (e.getSource() == WindowVar.P5_Enter_File_Dir) {
            FileSelect();
            WindowVar.P2_Dir_Text_Field.setText("Your directory is: " + l.getText());
            DirButton(WindowVar.P5_Enter_File_Dir);
            Panel5_FileDir = l.getText();// this takes the name of the file directory that the user inputs
        } else if (e.getSource() == WindowVar.P5_Enter_Method_Name) {
            WordChoice = WindowVar.P5_Method_Name.getText().split(" ");
            nm_Button(WindowVar.P5_Enter_Method_Name);
            Panel5_MethodName = WordChoice[6];
        } else if (e.getSource() == WindowVar.P5_Enter_Contents) {
            WordChoice = WindowVar.P5_Contents_To_Add.getText().split(" ");
            nm_Button(WindowVar.P5_Enter_Contents);
            Panel5_Contents = WordChoice[9];
        } else if (e.getSource() == WindowVar.P5_Enter_Call_Method) {
            CreationButton(WindowVar.P5_Enter_Call_Method);
            Create.Add_To_Method(Panel5_FileDir, Panel5_MethodName, Panel5_Contents);
        } else {
            System.out.println("Wrong command, try agian.");
        }
        /////////////////////////////////////////////////////////////////////////////////////
    }
}
