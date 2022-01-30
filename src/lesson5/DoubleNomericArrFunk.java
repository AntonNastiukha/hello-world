package lesson5;

public interface DoubleNomericArrFunk {
    double funk (double [] n ) throws EmptyArrayExсeption;
}

class EmptyArrayExсeption extends Exception{
    EmptyArrayExсeption(){
        super("Масив пустий");
    }
}
