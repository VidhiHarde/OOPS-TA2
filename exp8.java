import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            // Step 1: Write to the file
            FileWriter writer = new FileWriter("sample.txt");
            writer.write("Hello from the file!\nThis is the second line.");
            writer.close();
            System.out.println("File written successfully.");

            // Step 2: Read from the file
            FileReader reader = new FileReader("sample.txt");
            BufferedReader br = new BufferedReader(reader);

            System.out.println("Reading file contents:");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            // Step 3: Close the reader
            br.close();
            reader.close();
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        }
    }
}

/*Output
File written successfully.
Reading file contents:
Hello from the file!
This is the second line.
*/