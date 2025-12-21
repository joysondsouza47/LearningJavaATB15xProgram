package ex_03_Core_Java;

public class Lab004_Variable {
    public static void main(String[] args){
        // data type variable name = variable name
        byte value_1 = 45;
        value_1 = 127;
        // now new value for the variable value_1 is 127
        // I want to capture age of a person, which data type to be used - we can use byte data type
        // byte can store from -128 to 127
        // can we create a variable with a underscore and dollar (only these are allowed A-Z, a-z, _, $,)
        // int _123 = 123
        // System.out.println(_123);
        // yes this one will be executed.
        // int enum = 10
        // is this a valid syntax or not - here enum is a reserved keyword so we cannot use a enum key word as identifier.
        short s = 123;
        int i = 234;
        long l = 9945636877L;  // to store phone number
        // long has a special property if we want to use the long datatype, we have to use l in the end... 9945636877l / 9945636877L
        char c = 'A';
        char r = 90;
        // Char is actually an integral so we are not getting an error.
        float f = 23.567F;
        // float has a special property if we want to use the float datatype, we have to use f in the end... 9945.45435f / 9945636877F
        System.out.println(value_1);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(c);
        System.out.println(r);
        System.out.println(f);

        String string = "joyson";
        // non-primitive
        // string is a bunch of chars.
    }
}
