package ex_03_Core_Java;

public class Lab007_Conditional_Statement {
    public static void main(String[] args) {
        // if condition
        int age = 18;
        if (age >= 18) {
            System.out.println("eligible to vote");
        }
        //if else condition
        int temperature = 31;
        if (temperature > 30) {
            System.out.println("It's hot outside");
        } else {
            System.out.println("It's cold outside");
        }
        // if else if ladder
        int marks = 58;
        if (marks >= 90) {
            System.out.println("Grade : A");
        } else if (marks >= 80) {
            System.out.println("Grade : B");
        } else if (marks >= 70) {
            System.out.println("Grade : C");
        } else if (marks >= 60) {
            System.out.println("Grade : D");
        } else {
            System.out.println("Grade : F");
        }

        // nested if
        int eligible_age = 56;
        boolean haslicense = false;
        if (eligible_age >= 18) {
            if (haslicense) {
                System.out.println("can drive");
            } else {
                System.out.println("need a lecense");
            }
        } else {
            System.out.println("not eligible to drive");
        }

        // switch condition
        int day = 2;

        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
            default:
                System.out.println("invalid record");
        }

    }
}