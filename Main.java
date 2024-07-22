public class Main {
    public static void main(String[] args){
        Implementation i = new Implementation();
        i.foo_tag(2,false);
        Interface ii = null;
        if (true) {
            ii = i;
        }
        ii.foo_tag(24,true);
    }
}
