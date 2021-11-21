package introduction_to_java.baitap;

public class DocSoThanhChu {
    static String[] nums= new String[]{"","one","tow", "three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
    static String[] nums20= new String[]{"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
    static String[] nums100=new String[]{"","-hundres"};
    static String read(int num){
        String s = "";
        int temp=num/100;
        if(temp!=0){
            s=s+nums[temp]+"-hundres";
        }
        temp=num%100;
        if (temp<20){
            s=s+" "+nums[temp];
        }else{
            int temp1=temp/10;
            s=s+" "+nums20[temp1];
            temp=temp%10;
            s=s+" "+nums[temp];
        }
        s=s.trim();
        return s;
    }
    public static void main(String[] args) {
        System.out.println(read(999));
        System.out.println(read(101));
        System.out.println(read(111));
        System.out.println(read(119));
        System.out.println(read(120));
        System.out.println(read(121));
        System.out.println(read(99));
        System.out.println(read(1));
        System.out.println(read(11));
        System.out.println(read(19));
        System.out.println(read(20));
        System.out.println(read(21));
        System.out.println(read(10));
        System.out.println(read(0));

    }
}
