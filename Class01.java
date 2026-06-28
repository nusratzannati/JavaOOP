[1:06 am, 29/06/2026] +880 1313-575028: @@ -0,0 +1,39 @@
public class Teacher {
    public String name;
    public String gender;
    public int number;
    public String person;
    
}
public class Class01 {

    public static void main(String[] args) {
        Teacher teacher1=new Teacher();
        
        teacher1.name="lablu";
        teacher1.gender="male";
        teacher1.number=1255466565;
        teacher1.person="good";
        
        System.out.println("name:"+teacher1.name);
        System.out.println("gender:"+teacher1.gender);
        System.out.println("number:"+teacher1.number);
        System.out.println("person:"+teacher1.person);
        System.out.println("Hello World!");
        
        Teacher teacher2=new Teacher();
        
        
         teacher2.name="muslima";
        teacher2.gender="women";
        teacher2.number=1255467565;
        teacher2.person="better";
        
        
        System.out.println("name:"+teacher2.name);
        System.out.println("gender:"+teacher2.gender);
        System.out.println("number:"+teacher2.number);
        System.out.println("person:"+teacher2.person);
        System.out.println("Hello World!");
    }
}
