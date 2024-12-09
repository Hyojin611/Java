package basic;
//beans
class LeeHyoJin{
    static String address = "서울";
    String name = "이효진";
    int age =20;
    boolean smart = false;
}

 public class VariableScope {
    static  int b =4;
    public static void main(String[] args) {
        int a =3;
        System.out.println(" a = " +a);
        System.out.println(" b = " +VariableScope.b);
     //   System.out.println(LeeHyoJin.name);

        LeeHyoJin leeHyoJin = new LeeHyoJin();
        System.out.println(leeHyoJin.age);
        System.out.println(LeeHyoJin.address);
    }
}
