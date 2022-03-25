package ex01;

import java.io.*;

/**
 * contains the implementation of nethods for calculating and displaying results.
 *
 * @author Vlada
 * @version 1.0
 */
@SuppressWarnings("SpellCheckingInspection")
public class Calc {
    /**
     * filename used in serialization.
     */
    private static final String FNAME = "ex0.Data.bin";
    /**
     * saves the result of the calculation. class object  {@linkplain Data}
     */
    private Data result;

    /**
     * initializes {@linkplain Calc#result}
     */
    public Calc() {
        result = new Data();
    }

    /**
     * Уset value {@linkplain Calc#result}
     *
     * @param result - the new value of the object reference  {@linkplain Data}
     */
    public void setResult(Data result) {
        this.result = result;
    }

    /**
     * get value {@linkplain Calc#result}
     *
     * @return the current value of the object reference {@linkplain Data}
     */
    public Data getResult() {
        return result;
    }

    /**
     * calculates the function value
     *
     * @param arguments - aruments are calculated
     * @return function evaluation result
     */
    private byte calc(double []arguments) {
        int number = (int)((Math.sin(arguments[0]) + Math.sin(arguments[1]) + Math.sin(arguments[2]) + Math.sin(arguments[3])) / 4.0 * 1000);
        byte count = 0;

        if(number < 0) {
            number *= -1;
        }

        while (number > 0) {
            number &= (number - 1);
            count++;
        }

        return count;
    }

    /**
     * calculates function va;lues and saves
     * object result  {@linkplain Calc#result}
     *
     * @param arguments - evaluated function arguments
     */
    public byte init(double []arguments) {
        result.setArguments(arguments);
        return result.setOnesNumber(calc(arguments));
    }

    /**
     * prints the result of the calculation
     */
    public void show() {
        System.out.println(result);
    }

    /**
     * saves  {@linkplain Calc#result} in a file {@linkplain Calc#FNAME}
     *
     * @throws IOException
     */
    public void save() throws IOException {
        ObjectOutputStream os = new ObjectOutputStream(new
                FileOutputStream(FNAME));
        os.writeObject(result);
        os.flush();
        os.close();
    }

    /**
     * restore {@linkplain Calc#result} from a file {@linkplain Calc#FNAME}
     *
     * @throws Exception
     */
    public void restore() throws Exception {
        ObjectInputStream is = new ObjectInputStream(new FileInputStream(FNAME));
        result = (Data) is.readObject();
        is.close();
    }
}
