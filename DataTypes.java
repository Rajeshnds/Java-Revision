class DataTypes {

    static int age;
    public static void main(String[] args) {
        int age = 27;

        // age = 28;
        // int age = 28;

        // age = 27;

        System.out.println("I am " + age + " years old.");



        // data types

        // integer types

        byte aSingleByte = 100; // -128 to 127
        short aSmallNumber = 20000; // -32,768 to 32,767
        int anInteger = 2147483647; // -2147483648 to 2147483647
        long aLargeNumber = 9223372036854775807L; // -9223372036854775808 to 9223372036854775807

        // decimal types

        double aDouble = 1.79769313; // 4.9E-324 to 1.7976931348623157E308
        float aFloat = 3.4028F; // 1.4E-45 to 3.4028235E38

        // booleans
        boolean isWeekend = false;
        boolean isWorkday = true;

        // characters
        char copyrightSymbol = '\u00A9';
        char percentSymbol = '%';

        System.out.println("This is the copyright symbol: " + copyrightSymbol);
        
        System.out.println("This is the percent symbol: " + percentSymbol);
    }
}
