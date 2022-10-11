import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileCopy {
    public static void main(String[] args) throws IOException {
        File file = new File("/home/dobyasa/IdeaProjects/HW1/file.txt");
        FileInputStream fis = new FileInputStream(file);
        InputStreamReader reader = new InputStreamReader(fis, StandardCharsets.UTF_8);

        File filecopy = new File("/home/dobyasa/IdeaProjects/HW1/file副本.txt");
        FileOutputStream fos = new FileOutputStream(filecopy);
        OutputStreamWriter writer = new OutputStreamWriter(fos, StandardCharsets.UTF_8);

        while(reader.ready()){
            writer.write(reader.read());
        }

        reader.close();
        writer.close();

        BufferedReader br = new BufferedReader(new FileReader("/home/dobyasa/IdeaProjects/HW1/file.txt"));
        PrintWriter pw = new PrintWriter(new PrintWriter("file副本2.txt"));
        String l;
        while((l = br.readLine()) != null){
            pw.println(l);
        }
        br.close();
        pw.close();
    }
    public FileCopy() {
        System.out.println("File not found!");
    }
}
