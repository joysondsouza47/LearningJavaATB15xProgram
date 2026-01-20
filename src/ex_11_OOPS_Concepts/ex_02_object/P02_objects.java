package ex_11_OOPS_Concepts.ex_02_object;

public class P02_objects {
    int eid;
    String ename;
    String job;
    int sal;

    void display(){
        System.out.println("employee Id : " + eid);
        System.out.println("employee Name : " + ename);
        System.out.println("employee Job : " + job);
        System.out.println("employee Salary : " + sal);
    }
    public static void main(String [] args){

        P02_objects emp1 = new P02_objects ();  // object 1
        emp1.eid=101;
        emp1.ename="Joyson Dsouza";
        emp1.job="Automation engineer";
        emp1.sal=30000;
        emp1.display();

        P02_objects emp2 = new P02_objects ();  // object 2
        System.out.println(emp2.eid);
        emp2.eid=102;
        emp2.ename="Royson Dsouza";
        emp2.job="Student";
        emp2.sal= 0;
        emp2.display();
    }

}

