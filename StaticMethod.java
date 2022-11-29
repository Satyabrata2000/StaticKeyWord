package StaticKeyword;

class StaticMethodInitialization {

    int rollno;
    String name;
    static String college = "ABC";

    //static method to change the value of static variable
    static void change(){
        college = "xyz";
    }

    //constructor to initialize the variable
    StaticMethodInitialization(int r, String n){
        rollno = r;
        name = n;
    }

    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }
}

public class StaticMethod{

    public static void main(String[] args) {

        StaticMethodInitialization s1 = new StaticMethodInitialization(100, "name1");
        StaticMethodInitialization s2 = new StaticMethodInitialization(200, "name2");

        s1.display();
        s2.display();

        StaticMethodInitialization.change();

        s1.display();
        s2.display();

    }
}
