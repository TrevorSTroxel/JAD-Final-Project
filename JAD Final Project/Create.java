
//resources "https://www.w3schools.com/java/java_files_create.asp" reference to create and write to files
//reference: https://stackoverflow.com/questions/37276996/java-add-text-to-a-specific-line-in-a-file

//REference: https://stackoverflow.com/questions/20039980/java-replace-line-in-text-file
// Creation file: contains method necessary to create instnaces for the program
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

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
			List<String> fileContents = new ArrayList<>(
					Files.readAllLines(Paths.get(file_path), StandardCharsets.UTF_8));

			fileContents.add(0, "public class " + class_name + "(){\n\n}");
			Files.write(Paths.get(file_path), fileContents, StandardCharsets.UTF_8);

		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	/**
	 * @param File_Directory
	 * @param return_type
	 * @param method_name    // ) ( ) ( ) ( ) ( ) ( ) ( ) ( ) ( ) ( ) ( ) ( //
	 *                       Method contructor // CREATE A METHOD // Function Input:
	 *                       string: a return type and a name for the method |
	 *                       Function, // and the file path they want to get //
	 *                       Output:a method in string form // ) ( ) ( ) ( ) (
	 */
	public static void create_method(String File_Directory, String return_type, String method_name) {
		try {
			List<String> fileContents = new ArrayList<>(
					Files.readAllLines(Paths.get(File_Directory), StandardCharsets.UTF_8));

			for (int i = 0; i < fileContents.size(); i++) {
				if (fileContents.get(i).equals("")) {
					fileContents.set(i, "public " + return_type + " " + method_name + "(){\n\n}");
				}
			}

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
	 *                        consider putting content of file into arraylist and
	 *                        then add it because you need to manipulate data, not
	 *                        the actual file itself actually look into java output
	 *                        stream to file. will be useful
	 * @throws IOException
	 */
	public static void Add_To_Method(String File_Dir, String Method_Name, String Contents_To_Add) {
		File f = new File(File_Dir);
		try {
			FileInputStream is = new FileInputStream(f);
			InputStreamReader ir = new InputStreamReader(is);
			BufferedReader rdr = new BufferedReader(ir);
			String line = rdr.readLine();

			List<String> fileContents = new ArrayList<>(
					Files.readAllLines(Paths.get(File_Dir), StandardCharsets.UTF_8));

			for (int i = 0; i < fileContents.size(); i++) {

				/**
				 * Getting close! just need to make it so that it only goes in whan it matches
				 * exactly EX: if i look for test and i have 2 methods called test and test2,
				 * the program will try and put the content_to_add both in there
				 */
				if (line.contains(Method_Name + "()")) {
					for (int j = i; j < fileContents.size(); j++) {
						if (fileContents.get(j).equals("")) {
							fileContents.set(j, Contents_To_Add + "\n");
							break;
						}
					}
				}
				line = rdr.readLine(); // this helps with our iterations through the program
			}
			rdr.close();
			Files.write(Paths.get(File_Dir), fileContents, StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
