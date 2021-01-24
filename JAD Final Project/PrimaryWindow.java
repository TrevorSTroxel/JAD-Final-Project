
/**
 * @author Trevor Troxel & Abed Abualkheir
 * @version 1.0
 */

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
        WindowVar.MainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // JTextFeild settings
        Text_Field_Input.Text_Box_Settings(WindowVar.P1_Text_Field);

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
            WindowVar.Creation_Window.getContentPane().removeAll();
            Text_Field_Input.addPanel2();
            WindowVar.P2_File_Path_Button.addActionListener(this);
            WindowVar.P2_File_Name_Button.addActionListener(this);
            WindowVar.P2_Call_Method_Button.addActionListener(this);
            WindowVar.Creation_Window.getContentPane().validate();
            WindowVar.Creation_Window.getContentPane().repaint();
            WindowVar.Panel2.setVisible(true);
        } else if (e.getSource() == WindowVar.P1_Enter && WindowVar.WordChoice[1].equals("class")) {
            WindowVar.Creation_Window.getContentPane().removeAll();
            Text_Field_Input.addPanel3();
            WindowVar.P3_File_Path_Button.addActionListener(this);
            WindowVar.P3_Class_Name_Button.addActionListener(this);
            WindowVar.P3_Call_Method_Button.addActionListener(this);
            WindowVar.Creation_Window.getContentPane().validate();
            WindowVar.Creation_Window.getContentPane().repaint();
            WindowVar.Panel3.setVisible(true);
        } else if (e.getSource() == WindowVar.P1_Enter && WindowVar.WordChoice[1].equals("method")) {
            WindowVar.Creation_Window.getContentPane().removeAll();
            Text_Field_Input.addPanel4();
            WindowVar.P4_File_Path_Button.addActionListener(this);
            WindowVar.P4_Return_Type_Button.addActionListener(this);
            WindowVar.P4_Method_Name_Button.addActionListener(this);
            WindowVar.P4_Call_Method_Button.addActionListener(this);
            WindowVar.Creation_Window.getContentPane().validate();
            WindowVar.Creation_Window.getContentPane().repaint();
            WindowVar.Panel4.setVisible(true);
        } else if (e.getSource() == WindowVar.P1_Enter && WindowVar.WordChoice[1].equals("content")) {
            WindowVar.Creation_Window.getContentPane().removeAll();
            Text_Field_Input.addPanel5();
            WindowVar.P5_File_Path_Button.addActionListener(this);
            WindowVar.P5_Method_Name_Button.addActionListener(this);
            WindowVar.P5_Add_Contents_Button.addActionListener(this);
            WindowVar.P5_Call_Method_Button.addActionListener(this);
            WindowVar.Creation_Window.getContentPane().validate();
            WindowVar.Creation_Window.getContentPane().repaint();
            WindowVar.Panel5.setVisible(true);
        } else {
            NewWindows.actionPerformed(e);
        }

    }

}
