package homework.task_3;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader( new FileInputStream("C:\\Users\\user\\" +
                    "IdeaProjects\\Web_Services_1\\src\\homework\\additional\\diamonds.xml")));

            String tmp = null;
            Pattern p = Pattern.compile("(?<=>).+(?=<)");
            Matcher m;
            while((tmp = br.readLine()) != null){
                m = p.matcher(tmp);
                while(m.find()){
                    System.out.println(m.group());
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
