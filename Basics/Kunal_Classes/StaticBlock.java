package Kunal_Classes;

public class StaticBlock {
	static int a = 4;
    static int b;
    //This Static block runs only on the creation of first object
    static{
        System.out.println("Used Static Block");
        b = a*5;
    }
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
        StaticBlock.b +=7;
        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}
