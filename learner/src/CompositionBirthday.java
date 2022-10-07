public final class CompositionBirthday {
    private final int d;
    private final int m;
    private final int y;

    public CompositionBirthday(int d, int m, int y) {
        this.d = d;
        this.m = m;
        this.y = y;

        System.out.printf("The constructor is %s\n", this);
    }


    public String toString() {
        return String.format("%d/%d/%d,", d, m, y);
    }
}
