package lesson3Homework.ticket;

public enum University {
    LNULP("політех"){
        @Override
        String tolerance() {
            return "Allowed to take out";
        }
    },
    LNUIF("універ") {
        @Override
        String tolerance() {
            return "Only reading room";
        }
    };
    private final String UniversityName;

    University(String UniversityName) {
        this.UniversityName = UniversityName;
    }

    public String getUniversityName() {
        return UniversityName;
    }

    abstract String tolerance();
}
