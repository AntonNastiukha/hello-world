package lesson2Homework;

public enum WeekDays {
    MONDAY("mondey"){
        @Override
        String tomorrow() {
            return  WeekDays.TUESDAY.getDayOfWeek();
        }
    },
    TUESDAY("tuesday"){
        @Override
        String tomorrow() {
            return WeekDays.WEDNESDAY.getDayOfWeek();
        }
    },
    WEDNESDAY("wednesday"){
        @Override
        String tomorrow() {
            return WeekDays.THURSDAY.getDayOfWeek();
        }
    },
    THURSDAY("thursday"){
        @Override
        String tomorrow() {
            return WeekDays.FRIDAY.getDayOfWeek();
        }
    },
    FRIDAY("friday"){
        @Override
        String tomorrow() {
            return WeekDays.SATURDAY.getDayOfWeek();
        }
    },
    SATURDAY("saturday"){
        @Override
        String tomorrow() {
            return WeekDays.SUNDAY.getDayOfWeek();
        }
    },
    SUNDAY("sunday"){
        @Override
        String tomorrow() {
            return WeekDays.MONDAY.getDayOfWeek();
    }
    };

    private final String dayOfWeek;

    WeekDays(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String getDayOfWeek() {
        return dayOfWeek;
    }

    abstract String tomorrow();
}
