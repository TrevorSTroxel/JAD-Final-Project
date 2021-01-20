//resources "https://www.w3schools.com/java/java_files_create.asp" reference to create and write to files
// Creation file: contains method necessary to create instnaces for the program
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;   // Import the FileWriter class
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
	/*
	// Leaving this in here until we know for sure we do not need this
	// public void Creation(String CompleteString) {
	// WordSplit = CompleteString.split(" "); // this will split up the string every
	// time there is a space
	// // depending on what the user decides to make, it will call different methods
	// // WordSplit[1] = file : create_file
	// if (WordSplit[1].equals("file")) {
	// Window.Panel1.setVisible(false);
	// //String dir = newInput.FileLocation();
	// //String name = newInput.NameFile();
	// //create_file(dir, name);
	// } else if (WordSplit[1].equals("class")) {

	// } else if (WordSplit[1].equals("method")) {

	// }
	// }
	*/
	// ) ( ) ( ) ( ) ( ) ( ) ( ) ( ) ( ) ( ) ( ) (
	// Class constructor
	// CREATE A CLASS
	// Function Input: string: name of class | Function Output:a class in string
	// form
	// ) ( ) ( ) ( ) (
	public static void creatr_class(String file_path, String class_name) 
	{
		try 
		{
			FileWriter myWriter = new FileWriter(file_path);
			myWriter.write(String.format("public class %s{}", class_name));
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		  	} 
			catch (IOException e) 
			{
				System.out.println("An error occurred.");
				e.printStackTrace();
			}
	}

	// ) ( ) ( ) ( ) ( ) ( ) ( ) ( ) ( ) ( ) ( ) (
	// Method contructor
	// CREATE A METHOD
	// Function Input: string: a return type and a name for the method | Function,
	// and the file path they want to get
	// Output:a method in string form
	// ) ( ) ( ) ( ) (
	public static void create_method(String File_Directory, String return_type, String method_name) 
	{

		try 
		{
			FileWriter myWriter = new FileWriter(File_Directory);
			myWriter.write(String.format("public %s %s(){}", return_type, method_name));
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		  	} 
			catch (IOException e) 
			{
				System.out.println("An error occurred.");
				e.printStackTrace();
			}
		
	}

	// ) ( ) ( ) ( ) ( ) ( ) ( ) ( ) ( ) ( ) ( ) (
	// File contructor
	// CREATE A FILE
	// Function Input: string | Function Output:a file in chosen directory
	// ) ( ) ( ) ( ) (
	public static void create_file(String file_directory, String file_name) {
		try {
			File new_file = new File(file_directory + "\\" + file_name);
			new_file.getParentFile().mkdirs();
			new_file.createNewFile();
		} catch (FileAlreadyExistsException e) { // this is to prevet the program from making a file that already exists
		} catch (IOException e) { // this is meant to make sure that the commands are being interperted correctly
			System.out
					.println("There was an error when creating your new file, try making sure you have correct inputs");
			e.printStackTrace();
		}
	}
}
