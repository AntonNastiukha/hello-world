package lesson2;

public class MyMind {
    private JavaLanguage javaLanguage;

    public MyMind(JavaLanguage javaLanguage) {
        this.javaLanguage = javaLanguage;
    }

    public JavaLanguage getJavaLanguage() {
        return javaLanguage;
    }

    public void setJavaLanguage(JavaLanguage javaLanguage) {
        this.javaLanguage = javaLanguage;
    }

    @Override
    public String toString() {
        return "MyMind{" +
                "javaLanguage=" + javaLanguage +
                '}';
    }
}
