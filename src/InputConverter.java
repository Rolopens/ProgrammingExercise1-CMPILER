import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class InputConverter {

    public ArrayList<String> convert(String filepath){
        Scanner s = null;
        try {
            s = new Scanner(new File(filepath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        ArrayList<String> inputStrings = new ArrayList<String>();
        while (s.hasNextLine()){
            inputStrings.add(s.nextLine());
        }
        s.close();

        return inputStrings;
    }
}
