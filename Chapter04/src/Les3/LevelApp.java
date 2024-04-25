package Les3;

public class LevelApp {
    public static void main(String[] args) {
        Level level = Level.MEDIUM;

        switch (level){
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }
    }
}
