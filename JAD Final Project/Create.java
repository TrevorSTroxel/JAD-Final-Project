
// Creation file: contains method necessary to create instnaces for the program
import java.io.File;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;

public class Create {
	/**
	 * @param location
	 * @return String What this function will do is call the appropiate methods that
	 *         are needed depending on the input It will first look at what the user
	 *         want to do, then it will grab the whole string input, split it up and
	 *         then look at the naming convention and other things like that
	 */

	String[] WordSplit; // this a generic variable that will be called when we need to slit the users
						// input
	Text_Field_Input newInput = new Text_Field_Input();

	public void Creation(String CompleteString) {
		WordSplit = CompleteString.split(" "); // this will split up the string every time there is a space
		// depending on what the user decides to make, it will call different methods
		// WordSplit[1] = file : create_file
		if (WordSplit[1].equals("file")) {
			String dir = newInput.FileLocation();
			newInput.Dir.setVisible(false);
			String name = newInput.NameFile();
			newInput.fileName.setVisible(false);
			create_file(dir, name);
		} else if (WordSplit[1].equals("class")) {

		} else if (WordSplit[1].equals("method")) {

		}
	}

	// ) ( ) ( ) ( ) ( ) ( ) ( ) ( ) ( ) ( ) ( ) (
	// Class constructor
	// CREATE A CLASS
	// Function Input: string: name of class | Function Output:a class in string
	// form
	// ) ( ) ( ) ( ) (
	public String creatr_class(String class_name) {
		return String.format("public class %s{}", class_name);
	}

	// ) ( ) ( ) ( ) ( ) ( ) ( ) ( ) ( ) ( ) ( ) (
	// Method contructor
	// CREATE A METHOD
	// Function Input: string: a return type and a name for the method | Function
	// Output:a method in string form
	// ) ( ) ( ) ( ) (
	public String create_method(String return_type, String method_name) {

		return String.format("public %s %s(){}", return_type, method_name);
	}

	// ) ( ) ( ) ( ) ( ) ( ) ( ) ( ) ( ) ( ) ( ) (
	// File contructor
	// CREATE A FILE
	// Function Input: string | Function Output:a file in chosen directory
	// ) ( ) ( ) ( ) (
	public void create_file(String file_directory, String file_name) {
		try {
			File new_file = new File(file_directory);
			new_file.getParentFile().mkdirs();
			new_file.createNewFile();
		} catch (FileAlreadyExistsException e) { // this is to prevet the program from making a file that already exists
		} catch (IOException e) { // this is meant to make sure that the commands are being interperted correctly
			//
			e.printStackTrace();
		}
	}
}
