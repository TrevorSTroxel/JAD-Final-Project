import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.*;

/**
 * @author Trevor Troxel & Abed Abualkheir
 * @version 1.0
 */

//this file will be used to have multiple JTextFields and JTextArea for the whole program to use
/**
 * This file is mostly used for helping use methods to create different windows
 * and to help store a large amount of different variables for us to use. Our
 * naming conventions are based around what panel the variables belong to.
 * Example: P2_Dir_Text_Fiedl belongs to panel2, as indicated by the P2 in
 * fromnt of the variable name.
 */
public class Text_Field_Input {
    // WIP
    // this functions will be called if there is an error in the users input
    public static void ERROR(JPanel JP) {
        WindowVar.errorTextArea.setEditable(false);
        WindowVar.errorTextArea.setText("You mistyped something in the text area, try again.");
        WindowVar.errorTextArea.setVisible(true);
        WindowVar.Panel2.add(WindowVar.errorTextArea);
    }

    public static void Text_Box_Settings(JTextField JTF) {
        JTF.setVisible(true);
        JTF.setEditable(true);
    }

    public static void addPanel2() {
        // changed when I add things so that the grid layout can pick up on that
        WindowVar.Panel2.setLayout(new GridLayout(3, 2));
        // Adds the buttons to the pannel
        WindowVar.Panel2.add(WindowVar.P2_Enter_Get_Dir);
        WindowVar.Panel2.add(WindowVar.P2_Dir_Text_Field);

        WindowVar.Panel2.add(WindowVar.P2_Enter_Get_File_Name);
        WindowVar.Panel2.add(WindowVar.P2_File_Name);

        WindowVar.Panel2.add(WindowVar.P2_Enter_Call_Method);

        // This enabes the user to see the text fields and to also be able to write in
        // the
        WindowVar.P2_Dir_Text_Field.setVisible(true);
        WindowVar.P2_Dir_Text_Field.setEditable(true);
        WindowVar.P2_File_Name.setVisible(true);
        WindowVar.P2_File_Name.setEditable(true);

        // makes it so we can see the new panel and adds it to the main window
        WindowVar.Panel2.setVisible(true);

        SecondayWindows.SecondSetUp();
        SecondayWindows.SecondWindow.add(WindowVar.Panel2);
    }

    // this will open up the file the user has selected and add a method to that
    // file
    public static void addPanel3() {
        WindowVar.Panel3.setLayout(new GridLayout(3, 2));

        WindowVar.Panel3.add(WindowVar.P3_Enter_Get_Dir);
        WindowVar.Panel3.add(WindowVar.P3_File_Path);

        WindowVar.Panel3.add(WindowVar.P3_Enter_Get_Class_Name);
        WindowVar.Panel3.add(WindowVar.P3_Class_Name);

        WindowVar.Panel3.add(WindowVar.P3_Enter_Call_Method);

        // enables things
        WindowVar.P3_File_Path.setVisible(true);
        WindowVar.P3_File_Path.setEditable(true);
        WindowVar.P3_Class_Name.setVisible(true);
        WindowVar.P3_Class_Name.setEditable(true);

        WindowVar.Panel3.setVisible(true);

        SecondayWindows.SecondSetUp();
        SecondayWindows.SecondWindow.add(WindowVar.Panel3);
    }

    // Allows the user to make a class inside the file they made
    public static void addPanel4() {
        WindowVar.Panel4.setLayout(new GridLayout(4, 2));
        WindowVar.Panel4.add(WindowVar.P4_Enter_File_Dir);
        WindowVar.Panel4.add(WindowVar.P4_File_Path);

        WindowVar.Panel4.add(WindowVar.P4_Enter_Return_Type);
        WindowVar.Panel4.add(WindowVar.P4_Return_Type);

        WindowVar.Panel4.add(WindowVar.P4_Enter_Method_Name);
        WindowVar.Panel4.add(WindowVar.P4_Method_Name);

        WindowVar.Panel4.add(WindowVar.P4_Enter_Call_Method);

        Text_Box_Settings(WindowVar.P4_File_Path);
        Text_Box_Settings(WindowVar.P4_Method_Name);
        Text_Box_Settings(WindowVar.P4_Return_Type);

        WindowVar.Panel4.setVisible(true);

        SecondayWindows.SecondSetUp();
        SecondayWindows.SecondWindow.add(WindowVar.Panel4);
    }

    // allows the user to add contents to methods they have created
    public static void addPanel5() {
        WindowVar.Panel5.setLayout(new GridLayout(4, 2));
        WindowVar.Panel5.add(WindowVar.P5_Enter_File_Dir);
        WindowVar.Panel5.add(WindowVar.P5_File_Dir);

        WindowVar.Panel5.add(WindowVar.P5_Enter_Method_Name);
        WindowVar.Panel5.add(WindowVar.P5_Method_Name);

        WindowVar.Panel5.add(WindowVar.P5_Enter_Contents);
        WindowVar.Panel5.add(WindowVar.P5_Contents_To_Add);

        WindowVar.Panel5.add(WindowVar.P5_Enter_Call_Method);

        Text_Box_Settings(WindowVar.P5_File_Dir);
        Text_Box_Settings(WindowVar.P5_Method_Name);
        Text_Box_Settings(WindowVar.P5_Contents_To_Add);

        WindowVar.Panel5.setVisible(true);

        SecondayWindows.SecondSetUp();
        SecondayWindows.SecondWindow.add(WindowVar.Panel5);
    }

}
