package homework.additional;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\user\\IdeaProjects\\Web_Services_1\\src\\homework\\additional\\diamonds.xml");

        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);

        String tmp = null;

        while((tmp = br.readLine()) != null){
            System.out.println(tmp);
        }

        br.close();
    }
}
