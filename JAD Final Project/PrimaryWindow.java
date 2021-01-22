
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

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class PrimaryWindow extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;

    SecondayWindows NewWindows = new SecondayWindows();// this is needed for calling the seconday window and all those
                                                       // actions it preforms

    static JFrame MainWindow = new JFrame("Jave Program Creation"); // creates the main window for the user to see

    public static JPanel Panel1 = new JPanel(); // Starting panel for people to see

    JTextField P1_Text_Field = new JTextField(); // Users first choice into what to do

    JButton Enter = new JButton("Enter"); // for confermation and selection process
    JButton Tutorial = new JButton("Help"); // tutorial button

    String[] WordChoice; // generic string array

    public void WindowCreation() {
        MainWindow.setSize(500, 500);
        addContents();
    }

    /**
     * This will add most of the content to the main window function
     */
    private void addContents() {

        MainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JTextFeild settings
        P1_Text_Field.setColumns(25); // sets how long the text box is
        P1_Text_Field.setSize(100, 100);// sets the size of the text box
        P1_Text_Field.setEditable(true); // this makes it so that the user can edit what they put in the text field

        // ActionListener enabler
        Enter.addActionListener(this);
        Tutorial.addActionListener(this);

        // JPanel additions
        Panel1.add(P1_Text_Field);
        Panel1.add(Enter);
        Panel1.add(Tutorial);
        Panel1.setSize(100, 100);
        Panel1.setLayout(new GridLayout(3, 1));
        Panel1.setEnabled(true);

        // Window add ons
        MainWindow.add(Panel1);
        MainWindow.setVisible(true);
    }

    /**
     * This method will be called when the user clicks on the instructions buttons
     * and they will get a pop up telling how to do things
     */
    public void Help() {
        JFrame HelpWindow = new JFrame("Tutorial");
        JPanel HelpPanel = new JPanel();
        JTextArea Instructions = new JTextArea(20, 20);

        // reference: https://kodejava.org/how-do-i-read-text-file-into-jtextarea/
        // Read some text from the resource file to display in the JTextArea.
        try {
            Instructions.read(new InputStreamReader(getClass().getResourceAsStream("/help.txt")), null);
        } catch (IOException e) {
            e.printStackTrace();
        }

        Instructions.setEditable(false); // the user can't edit the text
        Font f = new Font("Times New Roman", Font.BOLD, 16); // this sets up the style of the text for the new window
        Instructions.setFont(f); // sets the style of the text

        HelpPanel.add(Instructions);
        HelpPanel.setEnabled(true);

        HelpWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        HelpWindow.setSize(700, 700);
        HelpWindow.add(HelpPanel);
        HelpWindow.setVisible(true);
    }

    /**
     * @param e
     * @apiNote this will look at the first word that the user has writen and the
     *          program will go to the correct methods as needed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        String INPUT = P1_Text_Field.getText();
        INPUT.toLowerCase(); // we do this for easier argument sake
        WordChoice = INPUT.split(" "); // will help decide where the program needs to go
        if (e.getSource() == Enter && WordChoice[1].equals("file")) {
            SecondayWindows.ContentWindow.getContentPane().removeAll();
            Text_Field_Input.addPanel2();
            WindowVar.P2_File_Path_Button.addActionListener(this);
            WindowVar.P2_File_Name_Button.addActionListener(this);
            WindowVar.P2_Call_Method_Button.addActionListener(this);
            SecondayWindows.ContentWindow.getContentPane().validate();
            SecondayWindows.ContentWindow.getContentPane().repaint();
            WindowVar.Panel2.setVisible(true);
        } else if (e.getSource() == Enter && WordChoice[1].equals("class")) {
            SecondayWindows.ContentWindow.getContentPane().removeAll();
            Text_Field_Input.addPanel3();
            WindowVar.P3_File_Path_Button.addActionListener(this);
            WindowVar.P3_Class_Name_Button.addActionListener(this);
            WindowVar.P3_Call_Method_Button.addActionListener(this);
            SecondayWindows.ContentWindow.getContentPane().validate();
            SecondayWindows.ContentWindow.getContentPane().repaint();
            WindowVar.Panel3.setVisible(true);
        } else if (e.getSource() == Enter && WordChoice[1].equals("method")) {
            SecondayWindows.ContentWindow.getContentPane().removeAll();
            Text_Field_Input.addPanel4();
            WindowVar.P4_File_Path_Button.addActionListener(this);
            WindowVar.P4_Return_Type_Button.addActionListener(this);
            WindowVar.P4_Method_Name_Button.addActionListener(this);
            WindowVar.P4_Call_Method_Button.addActionListener(this);
            SecondayWindows.ContentWindow.getContentPane().validate();
            SecondayWindows.ContentWindow.getContentPane().repaint();
            WindowVar.Panel4.setVisible(true);
        } else if (e.getSource() == Enter && WordChoice[1].equals("content")) {
            SecondayWindows.ContentWindow.getContentPane().removeAll();
            Text_Field_Input.addPanel5();
            WindowVar.P5_File_Path_Button.addActionListener(this);
            WindowVar.P5_Method_Name_Button.addActionListener(this);
            WindowVar.P5_Add_Contents_Button.addActionListener(this);
            WindowVar.P5_Call_Method_Button.addActionListener(this);
            SecondayWindows.ContentWindow.getContentPane().validate();
            SecondayWindows.ContentWindow.getContentPane().repaint();
            WindowVar.Panel5.setVisible(true);
        } else if (e.getSource() == Tutorial) {
            Help();
        } else {
            NewWindows.actionPerformed(e);
        }

    }

}
