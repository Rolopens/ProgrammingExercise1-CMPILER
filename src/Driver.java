import java.util.ArrayList;

public class Driver {

    public static void main(String[] args){
        //declare variables
        String filepath = "./input.txt";
        ArrayList<String> inputs = new ArrayList<>();

        //fix our inputs
        InputConverter converter = new InputConverter();
        inputs = converter.convert(filepath);

        //plug in inputs to grammar
        AntlrChecker checker = new AntlrChecker();
        checker.checkInputs(inputs);
    }

}


