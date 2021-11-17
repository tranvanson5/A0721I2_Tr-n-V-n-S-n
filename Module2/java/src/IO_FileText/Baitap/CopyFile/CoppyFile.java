package IO_FileText.Baitap.CopyFile;

import java.io.*;
import java.util.Scanner;

public class CoppyFile {
    public void CoppyFile(String filePath){
        try {
            File file = new File(filePath);
            FileWriter writer = new FileWriter("java/src/IO_FileText/Baitap/CoppyFile.csv");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            BufferedWriter bufferedWriter =new BufferedWriter(new BufferedWriter(writer));
            String line;
            while ((line = bufferedReader.readLine())!=null){
                bufferedWriter.write(line);
                bufferedWriter.write("\n");
            }
            bufferedReader.close();
            bufferedWriter.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        CoppyFile coppyFile=new CoppyFile();
        coppyFile.CoppyFile(path);
    }
}
