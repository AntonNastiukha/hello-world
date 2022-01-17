package lesson2;

public enum JavaLanguage {
    JAVA("Forever"),
    SCALE("nextGeneration"),
    Kotlin("Future");

    private final String clime;

    JavaLanguage(String clime){
        this.clime = clime;
    }


    public  String getClime(){
        return clime;
    }


}
