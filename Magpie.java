public class Magpie extends Cat {
    public static void main(String[] args) {
        Magpie magpie = new Magpie();
        magpie.sound(true);
    }

    @Override
    public void sound(boolean sound) {
        if (sound) {
            System.out.println("Meow");
        }
    }
}
