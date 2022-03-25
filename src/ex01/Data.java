package ex01;

import java.io.Serializable;
import java.util.Arrays;

/**
 * stores the initial data and the result of  calculations
 *
 * @author Vlada
 * @version 1.0
 */
@SuppressWarnings("SpellCheckingInspection")
public class Data implements Serializable {
    /**
     * the number of units in number
     */
    private byte onesNumber;

    /**
     * function arguments
     */
    private double []arguments;

    /**
     * automatically geberated constant
     */
    private static final long serialVersionUID = 1L;

    /**
     * initialize fields  {@linkplain Data#onesNumber}, {@linkplain Data#arguments}
     */
    public Data() {
        onesNumber = 0;
        arguments = new double[4];
    }

    /**
     * sets field values: arguments
     * and result displayed by the function
     *
     * @param onesNumber - fielf initialization values {@linkplain Data#onesNumber}
     * @param arguments - fielf initialization values {@linkplain Data#arguments}
     */
    public Data(byte onesNumber, double []arguments) {
        this.onesNumber = onesNumber;
        this.arguments = arguments;
    }

    /**
     * setting a field value {@linkplain Data#onesNumber}
     *
     * @param onesNumber - values for{@linkplain Data#onesNumber}
     * @return values {@linkplain Data#onesNumber}
     */
    public byte setOnesNumber(byte onesNumber) {
        return this.onesNumber = onesNumber;
    }

    /**
     * get field value {@linkplain Data#onesNumber}
     *
     * @return values {@linkplain Data#onesNumber}
     */
    public byte getOnesNumber() {
        return onesNumber;
    }

    /**
     * setting a field value {@linkplain Data#arguments}
     *
     * @param arguments - values for {@linkplain Data#arguments}
     * @return values {@linkplain Data#arguments}
     */
    public double []setArguments(double []arguments) {
        return this.arguments = arguments;
    }

    /**
     * get field value {@linkplain Data#arguments}
     *
     * @return values {@linkplain Data#arguments}
     */
    public double []getArguments() {
        return arguments;
    }

    /**
     * setting values {@linkplain Data#onesNumber} и {@linkplain Data#arguments}
     *
     * @param onesNumber - values for {@linkplain Data#onesNumber}
     * @param arguments - values for {@linkplain Data#arguments}
     * @return this
     */
    public Data setOnesNumberAndArguments(byte onesNumber, double []arguments) {
        this.onesNumber = onesNumber;
        this.arguments = arguments;
        return this;
    }

    /**
     * represents the result of the calculation as a string.{@inheritDoc}
     */
    @Override
    public String toString() {
        return "Number of one = " + onesNumber + ", arguments = " + Arrays.toString(arguments);
    }

    /**
     * automatically genereted method.{@inheritDoc}
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Data other = (Data) obj;
        if(onesNumber != other.onesNumber) {
            return false;
        }

        return !Arrays.equals(arguments, other.arguments);
    }
}