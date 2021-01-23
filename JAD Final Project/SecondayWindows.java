import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.filechooser.FileSystemView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//this will be used for better organization purposes
public class SecondayWindows extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

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
        WindowVar.ContentWindow.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        WindowVar.ContentWindow.setSize(700, 700);
        WindowVar.ContentWindow.setLocationRelativeTo(null); // appears in the middle
        WindowVar.ContentWindow.setVisible(true);
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

    /**
     * @param _JB
     */
    public static void nm_Button(JButton _JB) {
        _JB.setText("<html>Name has been set.<br/>Change file name for new file and click again</html>");
    }

    /**
     * @param __JB
     */
    public static void CreationButton(JButton __JB) {
        __JB.setText(
                "<html>You have added to your project.<br/>Check your folder to make sure.<br/>Click again to add more to your project</html>");
    }

    /**
     * @param JTF
     */
    // reference:
    // https://docs.oracle.com/javase/7/docs/api/javax/swing/JFileChooser.html
    public static void FolderSelect(JTextField JTF) {
        JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int r = j.showOpenDialog(null);
        if (r == JFileChooser.APPROVE_OPTION) {
            WindowVar.l.setText(j.getSelectedFile().getAbsolutePath());
        }
        JTF.setText("<html>Your directory is: <br/></html>" + WindowVar.l.getText());
    }

    /**
     * @param JTF
     */
    public static void FileSelect(JTextField JTF) {
        JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        j.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int r = j.showOpenDialog(null);
        if (r == JFileChooser.APPROVE_OPTION) {
            // set the label to the path of the selected directory
            WindowVar.l.setText(j.getSelectedFile().getAbsolutePath());
        }
        JTF.setText("<html>Your directory is: <br/></html>" + WindowVar.l.getText());
    }

    /**
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == WindowVar.P2_File_Path_Button) {
            FolderSelect(WindowVar.P2_File_Path_Text_Field);
            DirButton(WindowVar.P2_File_Path_Button);
            WindowVar.P2_FILR_PATH = WindowVar.l.getText();// this takes the name of the file directory that the user
                                                           // inputs
        } else if (e.getSource() == WindowVar.P2_File_Name_Button) {
            WindowVar.Word_Choice = WindowVar.P2_File_Name_Text_Field.getText().split(" ");
            nm_Button(WindowVar.P2_File_Name_Button);
            WindowVar.P2_FILE_NAME = WindowVar.Word_Choice[0]; // this takes the name of the file directory that the
                                                               // user
                                                               // inputs
        } else if (e.getSource() == WindowVar.P2_Call_Method_Button) {
            CreationButton(WindowVar.P2_Call_Method_Button);
            Create.create_file(WindowVar.P2_FILR_PATH, WindowVar.P2_FILE_NAME); // creates a new file in this location
        }
        /////////////////////////////////////////////////////////////////////////////////////
        else if (e.getSource() == WindowVar.P3_File_Path_Button) {
            FileSelect(WindowVar.P3_File_Path_Text_Field);
            DirButton(WindowVar.P3_File_Path_Button);
            WindowVar.P3_FILE_PATH = WindowVar.l.getText();// this takes the name of the file directory that the user
                                                           // inputs
        } else if (e.getSource() == WindowVar.P3_Class_Name_Button) {
            WindowVar.Word_Choice = WindowVar.P3_Class_Name_Text_Field.getText().split(" ");
            nm_Button(WindowVar.P3_Class_Name_Button);
            WindowVar.P3_CLASS_NAME = WindowVar.Word_Choice[0];
        } else if (e.getSource() == WindowVar.P3_Call_Method_Button) {
            CreationButton(WindowVar.P3_Call_Method_Button);
            Create.creatr_class(WindowVar.P3_FILE_PATH, WindowVar.P3_CLASS_NAME);
        }
        /////////////////////////////////////////////////////////////////////////////////////
        else if (e.getSource() == WindowVar.P4_File_Path_Button) {
            FileSelect(WindowVar.P4_File_Path_Text_Field);
            DirButton(WindowVar.P4_File_Path_Button);
            WindowVar.P4_File_Path = WindowVar.l.getText();// this takes the name of the file directory that the user
                                                           // inputs
        } else if (e.getSource() == WindowVar.P4_Return_Type_Button) {
            WindowVar.Word_Choice = WindowVar.P4_Return_Type_Text_Field.getText().split(" ");
            nm_Button(WindowVar.P4_Return_Type_Button);
            WindowVar.P4_Return_Type = WindowVar.Word_Choice[0];
        } else if (e.getSource() == WindowVar.P4_Method_Name_Button) {
            WindowVar.Word_Choice = WindowVar.P4_Method_Name_Text_Field.getText().split(" ");
            nm_Button(WindowVar.P4_Method_Name_Button);
            WindowVar.P4_Mathed_Name = WindowVar.Word_Choice[0];
        } else if (e.getSource() == WindowVar.P4_Call_Method_Button) {
            CreationButton(WindowVar.P4_Call_Method_Button);
            Create.create_method(WindowVar.P4_File_Path, WindowVar.P4_Return_Type, WindowVar.P4_Mathed_Name);
        }
        /////////////////////////////////////////////////////////////////////////////////////
        else if (e.getSource() == WindowVar.P5_File_Path_Button) {
            FileSelect(WindowVar.P2_File_Path_Text_Field);
            DirButton(WindowVar.P5_File_Path_Button);
            WindowVar.P5_File_Path = WindowVar.l.getText();// this takes the name of the file directory that the user
                                                           // inputs
        } else if (e.getSource() == WindowVar.P5_Method_Name_Button) {
            WindowVar.Word_Choice = WindowVar.P5_Method_Name_Text_Field.getText().split(" ");
            nm_Button(WindowVar.P5_Method_Name_Button);
            WindowVar.P5_Method_Name = WindowVar.Word_Choice[0];
        } else if (e.getSource() == WindowVar.P5_Add_Contents_Button) {
            WindowVar.Word_Choice = WindowVar.P5_Contents_To_Add_Text_Field.getText().split(" ");
            nm_Button(WindowVar.P5_Add_Contents_Button);
            WindowVar.P5_Add_Contents = WindowVar.Word_Choice[0];
        } else if (e.getSource() == WindowVar.P5_Call_Method_Button) {
            CreationButton(WindowVar.P5_Call_Method_Button);
            Create.Add_To_Method(WindowVar.P5_File_Path, WindowVar.P5_Method_Name, WindowVar.P5_Add_Contents);
        } else {
            System.out.println("Wrong command, try agian.");
        }
        /////////////////////////////////////////////////////////////////////////////////////
    }
}
