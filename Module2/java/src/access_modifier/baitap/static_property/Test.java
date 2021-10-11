package access_modifier.baitap.static_property;

public class Test {
    public static void main(String[] args) {
        Student student=new Student();
        System.out.println("Name: "+student.getName()+"  Classes: "+student.getClasses());
        Student student1=new Student();
        student1.setName("Son");
        student1.setClasses("C03");
        System.out.println("Name: "+student1.getName()+"  Classes: "+student1.getClasses());
    }
}
