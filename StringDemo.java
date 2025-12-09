

public class StringDemo {
    public static void main(String[] args) {
        String s1="Lavanya";
        s1.concat("Jalla");//it donot append strings are immutable
        System.out.println(s1);

        StringBuffer s2=new StringBuffer("Lavanyaa");//string builder are mutable we append strings
        s2.append("Jallaaa");
        System.out.println(s2);

        StringBuilder s3=new StringBuilder("Kushaaalaa");
        s3.append("Jalaa");
        System.out.println(s3);

        //equals,comapre,==

        String a1="Ram";//scp
        String a2="Seetha";//scp
        String a3=new String("Ram");//heap
        String a4=new String("seetha");//heap
        String a5="Krishna";//scp
        String a6="Ram";//scp
        String a7 =new String("ram");
        //3 mrthods length(),charat(),substring()
        System.out.println(a1.length());//3
        System.out.println(a4.length());//6
        System.out.println(a6.charAt(1));//a
        System.out.println(a5.charAt(5));//n
        



        System.out.println("*******************");
        System.out.println(a1.equals(a6));//true
        System.out.println(a2.equals(a7));//false
        System.out.println(a3.equals(a1));//true
        System.out.println(a2.equalsIgnoreCase(a4));//true
        System.out.println("**************");

        System.out.println(a5.compareTo(a7));//krishna is samller than ram -ve
        System.out.println(a1.compareTo(a6));//0
        System.out.println(a2.compareToIgnoreCase(a4));//0
        System.out.println(a7.compareTo(a5));//ram is bigger so +ve
        System.out.println("***************");

        System.out.println(a1==a6);//true
        System.out.println(a1==a3);//false both ref are diff
        System.out.println(a5==a6);//false

    }
    
}
