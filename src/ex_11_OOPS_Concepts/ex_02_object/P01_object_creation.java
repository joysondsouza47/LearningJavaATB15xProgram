package ex_11_OOPS_Concepts.ex_02_object;

public class P01_object_creation {
// instance variables
    int empid;
    String empname;
    long empnumber;

    //Instance Variable – Meaning (Java)
    //An instance variable is a variable declared inside a class but outside any method, and it belongs to each object (instance) of the class.

    void empdetails(int id, String name, long number){
        empid = id;
        empname = name;
        empnumber = number;
        System.out.println("The employee details are as follow :\nEmployee_id - "+empid+"\nEmployee_name - "+empname+"\nEmployee_number - "+empnumber);
    }  // method creation

    public static void main(String[] args){

        //An object is an instance of a Class
        //Here class = blueprint and Object = real thing created using that blueprint
        P01_object_creation obj1 = new P01_object_creation();   //Creation of object and assigning it to a reference variable(obj1)
        obj1.empdetails(2223795,"joyson dsouza",9945636877L);  // calling method using the object reference variable
        System.out.println(obj1.empname);
    }

}
