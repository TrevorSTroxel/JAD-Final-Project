import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

//this will be used for better organization purposes
public class SecondayWindows extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

    static JFrame SecondWindow = new JFrame("Program execution");

    String[] WordChoice;
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
    public static void SecondSetUp() {
        SecondWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SecondWindow.setSize(500, 500);
        SecondWindow.setLocation(PrimaryWindow.MainWindow.getX() + PrimaryWindow.MainWindow.getWidth(),
                PrimaryWindow.MainWindow.getY());
        SecondWindow.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == WindowVar.P2_Enter_Get_Dir) {
            WordChoice = WindowVar.P2_Dir_Text_Field.getText().split(" ");
            Panel2_DIR = WordChoice[7];// this takes the name of the file directory that the user inputs
            File file = new File(Panel2_DIR);
            if (!file.isDirectory()) {
                System.out.println("There was an error in your text, try again");
            }
        } else if (e.getSource() == WindowVar.P2_Enter_Get_File_Name) {
            WordChoice = WindowVar.P2_File_Name.getText().split(" ");
            Panel2_NAME = WordChoice[8]; // this takes the name of the file directory that the user inputs
        } else if (e.getSource() == WindowVar.P2_Enter_Call_Method) {
            Create.create_file(Panel2_DIR, Panel2_NAME); // creates a new file in this location
        }
        /////////////////////////////////////////////////////////////////////////////////////
        else if (e.getSource() == WindowVar.P3_Enter_Get_Dir) {
            WordChoice = WindowVar.P3_File_Path.getText().split(" ");
            Panel3_FILEPATH = WordChoice[5];
        } else if (e.getSource() == WindowVar.P3_Enter_Get_Class_Name) {
            WordChoice = WindowVar.P3_Class_Name.getText().split(" ");
            Panel3_CLASSNAME = WordChoice[8];
        } else if (e.getSource() == WindowVar.P3_Enter_Call_Method) {
            Create.creatr_class(Panel3_FILEPATH, Panel3_CLASSNAME);
        }
        /////////////////////////////////////////////////////////////////////////////////////
        else if (e.getSource() == WindowVar.P4_Enter_File_Dir) {
            WordChoice = WindowVar.P4_File_Path.getText().split(" ");
            Panel4_File_Dir = WordChoice[5];
        } else if (e.getSource() == WindowVar.P4_Enter_Return_Type) {
            WordChoice = WindowVar.P4_Return_Type.getText().split(" ");
            Panel4_Return_Type = WordChoice[8];
        } else if (e.getSource() == WindowVar.P4_Enter_Method_Name) {
            WordChoice = WindowVar.P4_Method_Name.getText().split(" ");
            Panel4_Mathed_Name = WordChoice[6];
        } else if (e.getSource() == WindowVar.P4_Enter_Call_Method) {
            Create.create_method(Panel4_File_Dir, Panel4_Return_Type, Panel4_Mathed_Name);
        }
        /////////////////////////////////////////////////////////////////////////////////////
        else if (e.getSource() == WindowVar.P5_Enter_File_Dir) {
            WordChoice = WindowVar.P5_File_Dir.getText().split(" ");
            Panel5_FileDir = WordChoice[5];
        } else if (e.getSource() == WindowVar.P5_Enter_Method_Name) {
            WordChoice = WindowVar.P5_Method_Name.getText().split(" ");
            Panel5_MethodName = WordChoice[6];
        } else if (e.getSource() == WindowVar.P5_Enter_Contents) {
            WordChoice = WindowVar.P5_Contents_To_Add.getText().split(" ");
            Panel5_Contents = WordChoice[9];
        } else if (e.getSource() == WindowVar.P5_Enter_Call_Method) {
            Create.Add_To_Method(Panel5_FileDir, Panel5_MethodName, Panel5_Contents);
        } else {
            System.out.println("Wrong command, try agian.");
        }
        /////////////////////////////////////////////////////////////////////////////////////
    }
}
