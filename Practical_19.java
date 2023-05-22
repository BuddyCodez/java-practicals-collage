public class Practical_19 {
    public static interface Animal {
        public void makesound();
    }

    public static interface Animal2 {
        public void details();
    }

    public static class cat implements Animal, Animal2 {
        public void makesound() {
            System.out.println("Meow..Meow");
        }

        public void details() {
            System.out.println("Cat has Strong flexible body and sharp teeth");
        }
    }

    public static void main(String args[]) {
        cat c = new cat();
        System.out.println("Udit Vegad(216090307001)");
        c.makesound();
        c.details();
    }
}
