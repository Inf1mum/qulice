/*
 * This is not a real Java class. It won't be compiled ever. It is used
 * only as a text resource in integration.ChecksTest.
 */
public final class Snapshot {
    private static int current = 1;
    private static final int INITIAL = Snapshot.current;
    public static int read() {
        Snapshot.current = 2;
        return Snapshot.INITIAL;
    }
}
