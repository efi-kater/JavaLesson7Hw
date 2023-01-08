import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    private static WriteToFile writeToFile = null;
    private WriteToFile(){};

    public static WriteToFile getWriteToFile() {
        if (writeToFile==null){
            writeToFile= new WriteToFile();
        }
        return writeToFile;
    }
    public void writeToFile(String fileName, String content) throws IOException {
        File myObj = new File(fileName);
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
        writer.append(content);
        writer.close();

    }
}
