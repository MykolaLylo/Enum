package HT;

public enum Month {
    JANUARY(Season.WINTER,31),
    FEBRUARY(Season.WINTER,28),
    MARCH(Season.SPRING,31),
    APRIL(Season.SPRING,30),
    MAY(Season.SPRING,31),
    JUNE(Season.SUMMER,3),
    JULY(Season.SUMMER,31),
    AUGUST(Season.SUMMER,31),
    SEPTEMBER(Season.AUTUMN,30),
    OCTOBER(Season.AUTUMN,31),
    NOVEMBER(Season.AUTUMN,30),
    DECEMBER(Season.WINTER,31);
    private final Season season;
    private final int days;

    Month(Season season, int days) {
        this.season = season;
        this.days = days;
    }

    public Season getSeason() {
        return season;
    }

    public int getDays() {
        return days;
    }
}
