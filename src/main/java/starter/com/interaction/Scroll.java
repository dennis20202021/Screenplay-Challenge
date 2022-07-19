package starter.com.interaction;

public class Scroll {

    private Scroll() {
        throw new IllegalStateException("Utility class");
    }

    public static SimpleScroll down(int y) {
        return new SimpleScroll(y);
    }
}
