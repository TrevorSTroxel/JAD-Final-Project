import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileSystemView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStreamReader;
import java.awt.Font;

//this will be used for better organization purposes
public class SecondayWindows extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

    /**
     * This will take in different settings and features from various windows so
     * that the user can have multiple windows open to use This was also used to
     * help with with file bloating, as some of these files were becoming very large
     */
    public static void SecondSetUp() {
        WindowVar.Creation_Window.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        WindowVar.Creation_Window.setSize(700, 700);
        WindowVar.Creation_Window.setLocationRelativeTo(null); // appears in the middle
        WindowVar.Creation_Window.setVisible(true);
    }

    public void Help() {
        // reference: https://kodejava.org/how-do-i-read-text-file-into-jtextarea/
        // Read some text from the resource file to display in the JTextArea.
        try {
            WindowVar.Instructions.read(new InputStreamReader(getClass().getResourceAsStream("/help.txt")), null);
        } catch (IOException e) {
            e.printStackTrace();
        }

        WindowVar.Instructions.setEditable(false); // the user can't edit the text
        Font f = new Font("Times New Roman", Font.BOLD, 16); // this sets up the style of the text for the new window
        WindowVar.Instructions.setFont(f); // sets the style of the text

        WindowVar.Help_Panel.add(WindowVar.Instructions);
        WindowVar.Help_Panel.setEnabled(true);

        WindowVar.Help_Window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        WindowVar.Help_Window.setSize(700, 700);
        WindowVar.Help_Window.add(WindowVar.Help_Panel);
        WindowVar.Help_Window.setVisible(true);
    }

    /**
     * What these methods do is to help lessen the amount of code we have to use and
     * also help give the user better feed back after doing something.
     * 
     * We ended up having to use HTML code to break up our sentences as the text was
     * to large to fit inside the button.
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
    public static void FolderSelect(JTextArea JTF) {
        JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int r = j.showOpenDialog(null);
        if (r == JFileChooser.APPROVE_OPTION) {
            WindowVar.l.setText(j.getSelectedFile().getAbsolutePath());
        }
        JTF.setText("Your directory is: \n" + WindowVar.l.getText());
    }

    /**
     * @param JTF
     */
    public static void FileSelect(JTextArea JTF) {
        JFileChooser j = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        j.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int r = j.showOpenDialog(null);
        if (r == JFileChooser.APPROVE_OPTION) {
            // set the label to the path of the selected directory
            WindowVar.l.setText(j.getSelectedFile().getAbsolutePath());
        }
        JTF.setText("Your directory is: \n" + WindowVar.l.getText());
    }

    /**
     * @param e
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == WindowVar.P2_File_Path_Button) {
            FolderSelect(WindowVar.P2_File_Path_Text_Field);
            DirButton(WindowVar.P2_File_Path_Button);
            WindowVar.P2_FILE_PATH = WindowVar.l.getText(); // grabs file path as a string
        } else if (e.getSource() == WindowVar.P2_File_Name_Button) {
            WindowVar.Word_Split = WindowVar.P2_File_Name_Text_Field.getText().split(" ");
            nm_Button(WindowVar.P2_File_Name_Button);
            WindowVar.P2_FILE_NAME = WindowVar.Word_Split[0]; // this makes it so it grabs something
        } else if (e.getSource() == WindowVar.P2_Call_Method_Button) {
            CreationButton(WindowVar.P2_Call_Method_Button);
            Create.create_file(WindowVar.P2_FILE_PATH, WindowVar.P2_FILE_NAME); // creates a new file in this location
        }
        /////////////////////////////////////////////////////////////////////////////////////
        else if (e.getSource() == WindowVar.P3_File_Path_Button) {
            FileSelect(WindowVar.P3_File_Path_Text_Field);
            DirButton(WindowVar.P3_File_Path_Button);
            WindowVar.P3_FILE_PATH = WindowVar.l.getText();
        } else if (e.getSource() == WindowVar.P3_Class_Name_Button) {
            WindowVar.Word_Split = WindowVar.P3_Class_Name_Text_Field.getText().split(" ");
            nm_Button(WindowVar.P3_Class_Name_Button);
            WindowVar.P3_CLASS_NAME = WindowVar.Word_Split[0];
        } else if (e.getSource() == WindowVar.P3_Call_Method_Button) {
            CreationButton(WindowVar.P3_Call_Method_Button);
            Create.creatr_class(WindowVar.P3_FILE_PATH, WindowVar.P3_CLASS_NAME);
        }
        /////////////////////////////////////////////////////////////////////////////////////
        else if (e.getSource() == WindowVar.P4_File_Path_Button) {
            FileSelect(WindowVar.P4_File_Path_Text_Field);
            DirButton(WindowVar.P4_File_Path_Button);
            WindowVar.P4_File_Path = WindowVar.l.getText();
        } else if (e.getSource() == WindowVar.P4_Return_Type_Button) {
            WindowVar.Word_Split = WindowVar.P4_Return_Type_Text_Field.getText().split(" ");
            nm_Button(WindowVar.P4_Return_Type_Button);
            WindowVar.P4_Return_Type = WindowVar.Word_Split[0];
        } else if (e.getSource() == WindowVar.P4_Method_Name_Button) {
            WindowVar.Word_Split = WindowVar.P4_Method_Name_Text_Field.getText().split(" ");
            nm_Button(WindowVar.P4_Method_Name_Button);
            WindowVar.P4_Mathed_Name = WindowVar.Word_Split[0];
        } else if (e.getSource() == WindowVar.P4_Call_Method_Button) {
            CreationButton(WindowVar.P4_Call_Method_Button);
            Create.create_method(WindowVar.P4_File_Path, WindowVar.P4_Return_Type, WindowVar.P4_Mathed_Name);
        }
        /////////////////////////////////////////////////////////////////////////////////////
        else if (e.getSource() == WindowVar.P5_File_Path_Button) {
            FileSelect(WindowVar.P2_File_Path_Text_Field);
            DirButton(WindowVar.P5_File_Path_Button);
            WindowVar.P5_File_Path = WindowVar.l.getText();
        } else if (e.getSource() == WindowVar.P5_Method_Name_Button) {
            WindowVar.Word_Split = WindowVar.P5_Method_Name_Text_Field.getText().split(" ");
            nm_Button(WindowVar.P5_Method_Name_Button);
            WindowVar.P5_Method_Name = WindowVar.Word_Split[0];
        } else if (e.getSource() == WindowVar.P5_Add_Contents_Button) {
            WindowVar.Word_Split = WindowVar.P5_Contents_To_Add_Text_Field.getText().split(" ");
            nm_Button(WindowVar.P5_Add_Contents_Button);
            WindowVar.P5_Add_Contents = WindowVar.Word_Split[0];
        } else if (e.getSource() == WindowVar.P5_Call_Method_Button) {
            CreationButton(WindowVar.P5_Call_Method_Button);
            Create.Add_To_Method(WindowVar.P5_File_Path, WindowVar.P5_Method_Name, WindowVar.P5_Add_Contents);
        } else {
            Help();
        }
        /////////////////////////////////////////////////////////////////////////////////////
    }
}
