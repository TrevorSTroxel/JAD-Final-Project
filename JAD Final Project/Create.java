
//reference: "https://www.w3schools.com/java/java_files_create.asp" reference to create and write to files
//reference: https://stackoverflow.com/questions/37276996/java-add-text-to-a-specific-line-in-a-file
//reference: https://stackoverflow.com/questions/20039980/java-replace-line-in-text-file
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * This file holds all of our methods that are called manipulating the file
 */

public class Create {
	/**
	 * @param file_directory
	 * @param file_name
	 */
	public static void create_file(String file_directory, String file_name) {
		if (!file_name.contains(".txt") || !file_name.contains(".java")) {
			String[] FileFix = file_name.split(" ");
			file_name = FileFix[0] + ".java";
		}
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
	 * @param method_name
	 */
	public static void create_method(String File_Directory, String return_type, String method_name) {
		try {
			List<String> fileContents = new ArrayList<>(
					Files.readAllLines(Paths.get(File_Directory), StandardCharsets.UTF_8));
			for (int i = 0; i < fileContents.size(); i++) {
				String testing = fileContents.get(i);
				if (testing.contains("class")) {
					for (int j = i; j < fileContents.size(); j++) {
						if (fileContents.get(j).equals("")) {
							fileContents.set(j, "public " + return_type + " " + method_name + "(){\n\n}");
						}
					}
				}
			}
			Files.write(Paths.get(File_Directory), fileContents, StandardCharsets.UTF_8);
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}

	/**
	 * @param Method_Name
	 * @param File_dir
	 * @param Contents_To_Add
	 */
	public static void Add_To_Method(String File_Dir, String Method_Name, String Contents_To_Add) {
		Method_Name = WordsOnly(Method_Name); // used for simplicity
		try {
			List<String> fileContents = new ArrayList<>(
					Files.readAllLines(Paths.get(File_Dir), StandardCharsets.UTF_8));
			for (int i = 0; i < fileContents.size(); i++) {
				String test = fileContents.get(i); // this is used to help simplify our code
				if (test.contains(Method_Name + "()")) {
					for (int j = i; j < fileContents.size(); j++) {
						if (fileContents.get(j).equals("")) {
							fileContents.set(j, Contents_To_Add + "\n");
							break;
						}
					}
				}
			}
			Files.write(Paths.get(File_Dir), fileContents, StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @param simple
	 * @return String
	 */
	// Used for cleaning up words
	public static String WordsOnly(String simple) {
		String Clean = simple.replaceAll("[^a-zA-Z0-9]", "");
		return Clean;
	}
}
