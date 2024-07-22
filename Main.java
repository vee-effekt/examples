public class Main {
    public static void main(String[] args){
        Implementation i = new Implementation();
        i.foo(2,false);
        Interface ii = null;
        if (true) {
            ii = i;
        }
        ii.foo(24,true);
    }
}
