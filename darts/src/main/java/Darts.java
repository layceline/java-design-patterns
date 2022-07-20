class Darts {

    enum Circle {
        MISSED(0),
        OUTER(1),
        MIDDLE(5),
        INNER(10);

        private final int score;

        private Circle(final int score) {
            this.score = score;
        }

        public int getScore() { return score; }
    }

    private Circle target;

    Darts(double x, double y) {
        target = computePosition(computeDistance(x, y));
    }

    double computeDistance(double x, double y) {
        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
    }

    Circle computePosition(double distance) {
        Circle position;
        if(distance > 10) {
            position = Circle.MISSED;
        } else if (distance > 5) {
            position = Circle.OUTER;
        } else if(distance > 1) {
            position = Circle.MIDDLE;
        } else {
            position = Circle.INNER;
        }
        return position;
    }

    int score() {
        return target.getScore();
    }
}
