package ke_thua.baitap.circle;
public class Main {
    public static void main(String[] args) {
        Cylinder cylinder=new Cylinder();
        System.out.println(cylinder);

        cylinder =new Cylinder(3);
        System.out.println(cylinder);

        cylinder= new Cylinder(2,"pink",3);
        System.out.println(cylinder);
    }
}
