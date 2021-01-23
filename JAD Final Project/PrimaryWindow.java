
/**
 * @author Trevor Troxel & Abed Abualkheir
 * @version 1.0
 */
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JFrame;

public class PrimaryWindow extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;

    // this is needed for calling the seconday window and all those actions it
    // preforms
    SecondayWindows NewWindows = new SecondayWindows();

    public void WindowCreation() {
        WindowVar.MainWindow.setSize(500, 500);
        addContents();
    }

    /**
     * This will add most of the content to the main window function
     */
    private void addContents() {
        WindowVar.MainWindow.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        // JTextFeild settings
        WindowVar.P1_Text_Field.setColumns(25); // sets how long the text box is
        WindowVar.P1_Text_Field.setSize(100, 100);// sets the size of the text box
        WindowVar.P1_Text_Field.setEditable(true);

        // ActionListener enabler
        WindowVar.P1_Enter.addActionListener(this);
        WindowVar.P1_Tutorial.addActionListener(this);

        // JPanel additions
        WindowVar.Panel1.add(WindowVar.P1_Text_Field);
        WindowVar.Panel1.add(WindowVar.P1_Enter);
        WindowVar.Panel1.add(WindowVar.P1_Tutorial);
        WindowVar.Panel1.setSize(100, 100);
        WindowVar.Panel1.setLayout(new GridLayout(3, 1));
        WindowVar.Panel1.setEnabled(true);

        // Window add ons
        WindowVar.MainWindow.add(WindowVar.Panel1);
        WindowVar.MainWindow.setVisible(true);
    }

    /**
     * This method will be called when the user clicks on the instructions buttons
     * and they will get a pop up telling how to do things
     */
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
     * @param e
     * @apiNote this will look at the first word that the user has writen and the
     *          program will go to the correct methods as needed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        String INPUT = WindowVar.P1_Text_Field.getText();
        INPUT.toLowerCase(); // we do this for easier argument sake
        WindowVar.WordChoice = INPUT.split(" "); // will help decide where the program needs to go
        if (e.getSource() == WindowVar.P1_Enter && WindowVar.WordChoice[0].equals("close")
                || WindowVar.WordChoice[0].equals("end")) {
            System.exit(0);
        } else if (e.getSource() == WindowVar.P1_Enter && WindowVar.WordChoice[1].equals("file")) {
            WindowVar.ContentWindow.getContentPane().removeAll();
            Text_Field_Input.addPanel2();
            WindowVar.P2_File_Path_Button.addActionListener(this);
            WindowVar.P2_File_Name_Button.addActionListener(this);
            WindowVar.P2_Call_Method_Button.addActionListener(this);
            WindowVar.ContentWindow.getContentPane().validate();
            WindowVar.ContentWindow.getContentPane().repaint();
            WindowVar.Panel2.setVisible(true);
        } else if (e.getSource() == WindowVar.P1_Enter && WindowVar.WordChoice[1].equals("class")) {
            WindowVar.ContentWindow.getContentPane().removeAll();
            Text_Field_Input.addPanel3();
            WindowVar.P3_File_Path_Button.addActionListener(this);
            WindowVar.P3_Class_Name_Button.addActionListener(this);
            WindowVar.P3_Call_Method_Button.addActionListener(this);
            WindowVar.ContentWindow.getContentPane().validate();
            WindowVar.ContentWindow.getContentPane().repaint();
            WindowVar.Panel3.setVisible(true);
        } else if (e.getSource() == WindowVar.P1_Enter && WindowVar.WordChoice[1].equals("method")) {
            WindowVar.ContentWindow.getContentPane().removeAll();
            Text_Field_Input.addPanel4();
            WindowVar.P4_File_Path_Button.addActionListener(this);
            WindowVar.P4_Return_Type_Button.addActionListener(this);
            WindowVar.P4_Method_Name_Button.addActionListener(this);
            WindowVar.P4_Call_Method_Button.addActionListener(this);
            WindowVar.ContentWindow.getContentPane().validate();
            WindowVar.ContentWindow.getContentPane().repaint();
            WindowVar.Panel4.setVisible(true);
        } else if (e.getSource() == WindowVar.P1_Enter && WindowVar.WordChoice[1].equals("content")) {
            WindowVar.ContentWindow.getContentPane().removeAll();
            Text_Field_Input.addPanel5();
            WindowVar.P5_File_Path_Button.addActionListener(this);
            WindowVar.P5_Method_Name_Button.addActionListener(this);
            WindowVar.P5_Add_Contents_Button.addActionListener(this);
            WindowVar.P5_Call_Method_Button.addActionListener(this);
            WindowVar.ContentWindow.getContentPane().validate();
            WindowVar.ContentWindow.getContentPane().repaint();
            WindowVar.Panel5.setVisible(true);
        } else if (e.getSource() == WindowVar.P1_Tutorial) {
            Help();
        } else {
            NewWindows.actionPerformed(e);
        }

    }

}
