
//resources "https://www.w3schools.com/java/java_files_create.asp" reference to create and write to files
// Creation file: contains method necessary to create instnaces for the program
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
// import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileWriter; // Import the FileWriter class
import java.nio.file.FileAlreadyExistsException;

public class Create {
	// ) ( ) ( ) ( ) ( ) ( ) ( ) ( ) ( ) ( ) ( ) (
	// Class constructor
	// CREATE A CLASS
	// Function Input: string: name of class | Function Output:a class in string
	// form
	// ) ( ) ( ) ( ) (
	/**
	 * @param file_path
	 * @param class_name
	 */
	public static void creatr_class(String file_path, String class_name) {
		try {
			FileWriter myWriter = new FileWriter(file_path);
			myWriter.write(String.format("public class %s{\n\n}", class_name));
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
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
	/**
	 * @param File_Directory
	 * @param return_type
	 * @param method_name
	 */
	public static void create_method(String File_Directory, String return_type, String method_name) {

		try {
			FileWriter myWriter = new FileWriter(File_Directory);
			myWriter.write(String.format("public %s %s(){\n\n}", return_type, method_name));
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}

	}

	/**
	 * // ) ( ) ( ) ( ) ( ) ( ) ( ) ( ) ( ) ( ) ( ) ( // File contructor // CREATE A
	 * FILE // Function Input: string | Function Output:a file in chosen directory
	 * // ) ( ) ( ) ( ) (
	 * 
	 * @param file_directory
	 * @param file_name
	 */
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

	/**
	 * Method right now is WIP
	 * 
	 * @param Method_Name
	 * @param File_dir
	 * @param Contents_To_Add This method will search through the given file the
	 *                        user has selected and look for the method the user has
	 *                        asked for.
	 * 
	 *                        After this the program will insert contents they want
	 *                        to add to the method they have called Reference:
	 *                        https://www.coderslexicon.com/search-a-text-file-in-java/
	 */
	public static void Add_To_Method(String File_Dir, String Method_Name, String Contents_To_Add) {
		File dir = new File(File_Dir);// this will open up the file directory that the user has chosen
		try {
			// Reference: Pete Tuckers JAD slides practices
			FileInputStream is = new FileInputStream(dir);
			InputStreamReader ir = new InputStreamReader(is);
			BufferedReader FileReader = new BufferedReader(ir);
			String line = FileReader.readLine();
			FileWriter content = new FileWriter(File_Dir);// this will enable us to write content to the file

			if (line != "}" || line != null) // this makes sure that the program does not read beyond the
			{
				String prevLine = line;
				if (prevLine.contains(Method_Name)) // this means that the program has found the method name
				{
					line = FileReader.readLine();
					if (line.isBlank()) {
						content.write(String.format(Contents_To_Add));
					}
				} else {
					line = FileReader.readLine();
				}
			}
			FileReader.close();
			content.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
