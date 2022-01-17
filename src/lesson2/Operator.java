package lesson2;

public enum Operator {
    ADD {
        @Override
        int execute(int num1, int num2) {
            return num1 + num2;
        }
    },
    SUBTRECT {
        @Override
        int execute(int num1, int num2) {
            return num1 - num2;
        }
    },
    MULTIPLY{
        @Override
        int execute(int num1, int num2) {
            return num1* num2;
        }
    },
    DIVIDE{
        @Override
        int execute(int num1, int num2) {
            return num1/num2;
        }
    };

    abstract int execute(int num1, int num2);
    }
