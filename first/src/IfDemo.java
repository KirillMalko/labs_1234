public class IfDemo {
    public static void main(String args[]){
        int a,b,c;
        a = 2;
        b = 3;
        if(a<b){
            System.out.println("a less b");
        }
        if(a == b){
            System.out.println("We don't see this text");
        }
        System.out.println();
        c = a - b;
        System.out.println("c includes -1");
        if (c >= 0) System.out.println("c - is not negative number");
        if (c < 0) System.out.println("c - is negative number");
        System.out.println();
        c = b -a;
        System.out.println("c includes 1");
        if(c >= 0)  System.out.println("c - is not negative number");
    }
}
