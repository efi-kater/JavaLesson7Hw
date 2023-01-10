import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
    private static volatile WriteToFile writeToFile = null;
    private static Object mutex = new Object();
    private WriteToFile(){};

    public static WriteToFile getWriteToFile() {
        WriteToFile result = writeToFile;
        if (result==null){
            synchronized (mutex){
                result=writeToFile;
                if (result==null){
                    writeToFile=result=new WriteToFile();
                }
            }
        }
        return result;
    }
    public void writeToFile(String fileName, String content) throws IOException {
        File myObj = new File(fileName);
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true));
        writer.append(content);
        writer.close();

    }
}
