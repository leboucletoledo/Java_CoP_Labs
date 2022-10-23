public class App {
    public static void main(String[] args) {

        int intValue = 888;
        short shortValue = 55;
        byte byteValue = -124;
        long longValue = 23443;

        float floatValue = 5583.8f;
        double doubleValue = 3253.46;

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);

        /*
         * Casting
         * Converting to a different numerical variable type
         */

        System.out.println(intValue);
        // with (int) we casted long to int value
        intValue = (int) longValue;
        System.out.println(intValue);

        // Java does the automatic casting
        doubleValue = intValue;
        System.out.println(doubleValue);

        // Casting to int will chop the float value after decimals 
        intValue = (int) floatValue;
        System.out.println(intValue);

        // Other way of casting
        float floatValue2 = (float) 99.3;
        // Max byte value is 127, pushing to 128 will convert it to negative
        byteValue = (byte) 128;
        System.out.println(byteValue);

        // Must pay attention to limits of the numerical types
    }
}
