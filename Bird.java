public class Bird {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.sound(false);
    }

    public void sound(boolean sound) {
        if (sound) {
            System.out.println("Tweet");
        }
    }
}