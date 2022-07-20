class ResistorColorDuo {

    enum Color {
        black(0),
        brown(1),
        red(2),
        orange(3),
        yellow(4),
        green(5),
        blue(6),
        violet(7),
        grey(8),
        white(9);

        private final int value;

        Color(final int value) {
            this.value = value;
        }

        public int getValue() { return value; }
    }

    int value(String[] colors) {
        return Color.valueOf(colors[0]).getValue() * 10 + Color.valueOf(colors[1]).getValue();
    }
}
