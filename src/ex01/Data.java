package ex01;

import java.io.Serializable;
import java.util.Arrays;

/**
 * Stores the initial data and the result of calculations.
 *
 * @author Vlada
 * @version 1.0
 */
//@SuppressWarnings("SpellCheckingInspection")
public class Data implements Serializable {
    /**
     * The number of units in the number.
     */
    private byte onesNumber;

    /**
     * Function arguments.
     */
    private double []arguments;

    /**
     * Automatically generated constant
     */
    private static final long serialVersionUID = 1L;

    /**
     * Initializes fields {@linkplain Data#onesNumber}, {@linkplain Data#arguments}
     */
    public Data() {
        onesNumber = 0;
        arguments = new double[4];
    }

    /**
     * Sets field values: arguments
     * and the result of the function evaluation.
     *
     * @param onesNumber - value to initialize the field {@linkplain Data#onesNumber}
     * @param arguments - value to initialize the field {@linkplain Data#arguments}
     */
    public Data(byte onesNumber, double []arguments) {
        this.onesNumber = onesNumber;
        this.arguments = arguments;
    }

    /**
     * Setting a field value {@linkplain Data#onesNumber}
     *
     * @param onesNumber - value for{@linkplain Data#onesNumber}
     * @return value {@linkplain Data#onesNumber}
     */
    public byte setOnesNumber(byte onesNumber) {
        return this.onesNumber = onesNumber;
    }

    /**
     * Getting the value of a field {@linkplain Data#onesNumber}
     *
     * @return value {@linkplain Data#onesNumber}
     */
    public byte getOnesNumber() {
        return onesNumber;
    }

    /**
     * Setting a field value {@linkplain Data#arguments}
     *
     * @param arguments - value for {@linkplain Data#arguments}
     * @return value {@linkplain Data#arguments}
     */
    public double []setArguments(double []arguments) {
        return this.arguments = arguments;
    }

    /**
     * Getting the value of a field{@linkplain Data#arguments}
     *
     * @return value {@linkplain Data#arguments}
     */
    public double []getArguments() {
        return arguments;
    }

    /**
     * Setting values  {@linkplain Data#onesNumber} и {@linkplain Data#arguments}
     *
     * @param onesNumber - value for {@linkplain Data#onesNumber}
     * @param arguments - value for {@linkplain Data#arguments}
     * @return this
     */
    public Data setOnesNumberAndArguments(byte onesNumber, double []arguments) {
        this.onesNumber = onesNumber;
        this.arguments = arguments;
        return this;
    }

    /**
     * Represents the result of a calculation as a string. {@inheritDoc}
     */
    @Override
    public String toString() {
        return "Number of one = " + onesNumber + ", arguments = " + Arrays.toString(arguments);
    }

    /**
     * An automatically generated method.{@inheritDoc}
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