import javax.swing.JTextField;

//this file will be used to have multiple JTextFields and JTextArea for the whole program to use
public class Text_Field_Input {

    JTextField Dir = new JTextField("Put the File Directory here: ", 25); // generic TextField for my methods
                                                                          // to use
    JTextField fileName = new JTextField("What do you want to name your file: ", 30); // will be used for the name of
                                                                                      // the file
    String dir = new String(); // this is the directory that the user wants to create
    String name = new String(); // used for grabbing the name of the file you want to make

    public String FileLocation() {
        Window addContent = new Window(); // this is to add the text field to the main window for the user
        addContent.MainWindow.add(Dir);
        Dir.setVisible(true);
        Dir.setEditable(true);

        dir = Dir.getText();
        return dir;
    }

    public String NameFile() {
        Window addContent = new Window(); // this is to add the text field to the main window for the user
        addContent.MainWindow.add(fileName);
        fileName.setVisible(true);
        fileName.setEditable(true);

        name = fileName.getText();
        return name;
    }

    /**
     * have the text area appear fdor the input and then dissapear after the user
     * gave their input
     */

}
