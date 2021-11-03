public class OperandChecking {
    String op1;
    boolean romeSystem = false;
    // Нужен для определения системы счисления для операнда

    OperandChecking (String op1) {
        this.op1 = op1;
    }
    // Конструктор класса

    public int returnInteger () {
        int i = 0;
        switch (op1) {
            case "I" -> {
                i = 1;
                romeSystem = true;
            }
            case "II" -> {
                i = 2;
                romeSystem = true;
            }
            case "III" -> {
                i = 3;
                romeSystem = true;
            }
            case "IV" -> {
                i = 4;
                romeSystem = true;
            }
            case "V" -> {
                i = 5;
                romeSystem = true;
            }
            case "VI" -> {
                i = 6;
                romeSystem = true;
            }
            case "VII" -> {
                i = 7;
                romeSystem = true;
            }
            case "VIII" -> {
                i = 8;
                romeSystem = true;
            }
            case "IX" -> {
                i = 9;
                romeSystem = true;
            }
            case "X" -> {
                i = 10;
                romeSystem = true;
            }
            // если введена римская цифра, bool поменяет значение

            case "1" -> i = 1;
            case "2" -> i = 2;
            case "3" -> i = 3;
            case "4" -> i = 4;
            case "5" -> i = 5;
            case "6" -> i = 6;
            case "7" -> i = 7;
            case "8" -> i = 8;
            case "9" -> i = 9;
            case "10" -> i = 10;
        }
        return i;
    }
}
