class Leap {

    boolean isLeapYear(int year) {
        return isDivisibleBy(year, 4) && !isDivisibleBy(year, 100) || isDivisibleBy(year, 400);
    }

    boolean isDivisibleBy(int year, int divider) {
        return (year % divider) == 0;
    }
}
