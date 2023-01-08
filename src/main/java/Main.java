import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name="";
        String age="";
        String address ="";
        String phoneNumber="";
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name");
        try {
            WriteToFile writeToFileContactInfo = WriteToFile.getWriteToFile();
            writeToFileContactInfo.writeToFile("test.txt","Contact Informaion: "+System.lineSeparator());
            name="Name: "+scanner.nextLine();
            WriteToFile writeToFileName = WriteToFile.getWriteToFile();
            writeToFileName.writeToFile("test.txt",name+System.lineSeparator());
            System.out.println("enter age");
            age ="Age: "+scanner.nextLine();
            WriteToFile writeToFileAge = WriteToFile.getWriteToFile();
            writeToFileAge.writeToFile("test.txt",age+System.lineSeparator());
            System.out.println("enter address");
            address ="Address: "+scanner.nextLine();
            WriteToFile writeToFileAddress = WriteToFile.getWriteToFile();
            writeToFileAddress.writeToFile("test.txt",address+System.lineSeparator());
            System.out.println("enter phone number");
            phoneNumber ="Phone Number: "+scanner.nextLine();
            WriteToFile writeToFilePhoneNumber = WriteToFile.getWriteToFile();
            writeToFilePhoneNumber.writeToFile("test.txt",phoneNumber+System.lineSeparator());
            System.out.println(writeToFileAddress==writeToFileAge&&writeToFileAddress==writeToFileName&&writeToFileAddress==writeToFilePhoneNumber&&writeToFileAddress==writeToFileContactInfo);

        } catch (IOException e){
            e.printStackTrace();
        }

    }
}
