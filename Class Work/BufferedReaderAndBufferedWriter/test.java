import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class practice {
    public static void main(String args[]) throws IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader("input.txt"));
        BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
        String line;
        while ((line = reader.readLine()) != null) 
        {
            writer.write(line + "\n");
        }
        reader.close();
        writer.close();
    }
}


// Take input in input.txt File
// Output will be available in output.txt File
