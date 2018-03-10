package domain;

@Entity
public  final class A {

    private int a;
    public  int b;
    private  void c(){
        System.out.print("c....");
    }
    private  void c(String b){
        System.out.print("c...."+b);

    }
    public  void d(String name){
        System.out.print(name);
    }

    static {
        System.out.print("static");
    }

    {
        System.out.print("init");
    }
}
