import javax.swing.JPanel;
import javax.swing.JTextField;

import java.awt.*;

//https://www.genuinecoder.com/directory-folder-indexing-program-using-java-source-code-html/

/**
 * @author Trevor Troxel & Abed Abualkheir
 * @version 1.0
 */

public class Text_Field_Input {
    
    /** 
     * @param JP
     */
    // WIP
    // this functions will be called if there is an error in the users input
    public static void ERROR(JPanel JP) {
        WindowVar.errorTextArea.setEditable(false);
        WindowVar.errorTextArea.setText("You mistyped something in the text area, try again.");
        WindowVar.errorTextArea.setVisible(true);
        WindowVar.Panel2.add(WindowVar.errorTextArea);
    }

    /**
     * Look into JFileChooser for when people have to select a file directory. This
     * will be more useful and more helpful then manually getting the address
     * resource: https://www.geeksforgeeks.org/java-swing-jfilechooser/ look inside
     * of testingcode to get a better idea of what I am thinking about
     * 
     * @param JTF
     */
    public static void Text_Box_Settings(JTextField JTF) {
        JTF.setVisible(true);
        JTF.setEditable(true);
    }

    // creats a new file in the desired location
    public static void addPanel2() {
        WindowVar.Panel2.setLayout(new GridLayout(3, 3));

        WindowVar.Panel2.add(WindowVar.P2_File_Path_Button);
        WindowVar.Panel2.add(WindowVar.P2_File_Path_Label);
        WindowVar.Panel2.add(WindowVar.P2_File_Path_Text_Field);

        WindowVar.Panel2.add(WindowVar.P2_File_Name_Button);
        WindowVar.Panel2.add(WindowVar.P2_File_Name_Label);
        WindowVar.Panel2.add(WindowVar.P2_File_Name_Text_Field);

        WindowVar.Panel2.add(WindowVar.P2_Call_Method_Button);

        Text_Box_Settings(WindowVar.P2_File_Path_Text_Field);
        Text_Box_Settings(WindowVar.P2_File_Name_Text_Field);

        WindowVar.Panel2.setVisible(true);

        SecondayWindows.SecondSetUp();
        WindowVar.ContentWindow.add(WindowVar.Panel2);
    }

    // adds method to selected file
    public static void addPanel3() {
        WindowVar.Panel3.setLayout(new GridLayout(3, 3));

        WindowVar.Panel3.add(WindowVar.P3_File_Path_Button);
        WindowVar.Panel3.add(WindowVar.P3_File_Path_Label);
        WindowVar.Panel3.add(WindowVar.P3_File_Path_Text_Field);

        WindowVar.Panel3.add(WindowVar.P3_Class_Name_Button);
        WindowVar.Panel3.add(WindowVar.P3_Class_Name_Label);
        WindowVar.Panel3.add(WindowVar.P3_Class_Name_Text_Field);

        WindowVar.Panel3.add(WindowVar.P3_Call_Method_Button);

        Text_Box_Settings(WindowVar.P3_File_Path_Text_Field);
        Text_Box_Settings(WindowVar.P3_Class_Name_Text_Field);

        WindowVar.Panel3.setVisible(true);

        SecondayWindows.SecondSetUp();
        WindowVar.ContentWindow.add(WindowVar.Panel3);
    }

    // Allows the user to make a class inside the file they made
    public static void addPanel4() {
        WindowVar.Panel4.setLayout(new GridLayout(4, 3));

        WindowVar.Panel4.add(WindowVar.P4_File_Path_Button);
        WindowVar.Panel4.add(WindowVar.P4_File_Path_Label);
        WindowVar.Panel4.add(WindowVar.P4_File_Path_Text_Field);

        WindowVar.Panel4.add(WindowVar.P4_Return_Type_Button);
        WindowVar.Panel4.add(WindowVar.P4_Return_Type_Label);
        WindowVar.Panel4.add(WindowVar.P4_Return_Type_Text_Field);

        WindowVar.Panel4.add(WindowVar.P4_Method_Name_Button);
        WindowVar.Panel4.add(WindowVar.P4_Method_Name_Label);
        WindowVar.Panel4.add(WindowVar.P4_Method_Name_Text_Field);

        WindowVar.Panel4.add(WindowVar.P4_Call_Method_Button);

        Text_Box_Settings(WindowVar.P4_File_Path_Text_Field);
        Text_Box_Settings(WindowVar.P4_Method_Name_Text_Field);
        Text_Box_Settings(WindowVar.P4_Return_Type_Text_Field);

        WindowVar.Panel4.setVisible(true);

        SecondayWindows.SecondSetUp();
        WindowVar.ContentWindow.add(WindowVar.Panel4);
    }

    // allows the user to add contents to methods they have created
    public static void addPanel5() {
        WindowVar.Panel5.setLayout(new GridLayout(4, 3));
        WindowVar.Panel5.add(WindowVar.P5_File_Path_Button);
        WindowVar.Panel5.add(WindowVar.P5_File_Path_Label);
        WindowVar.Panel5.add(WindowVar.P5_File_Path_Text_Field);

        WindowVar.Panel5.add(WindowVar.P5_Method_Name_Button);
        WindowVar.Panel5.add(WindowVar.P5_Method_Name_Label);
        WindowVar.Panel5.add(WindowVar.P5_Method_Name_Text_Field);

        WindowVar.Panel5.add(WindowVar.P5_Add_Contents_Button);
        WindowVar.Panel5.add(WindowVar.P5_Contents_To_Add_Label);
        WindowVar.Panel5.add(WindowVar.P5_Contents_To_Add_Text_Field);

        WindowVar.Panel5.add(WindowVar.P5_Call_Method_Button);

        Text_Box_Settings(WindowVar.P5_File_Path_Text_Field);
        Text_Box_Settings(WindowVar.P5_Method_Name_Text_Field);
        Text_Box_Settings(WindowVar.P5_Contents_To_Add_Text_Field);

        WindowVar.Panel5.setVisible(true);

        SecondayWindows.SecondSetUp();
        WindowVar.ContentWindow.add(WindowVar.Panel5);
    }

}
