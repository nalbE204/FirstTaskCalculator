public class Calculate {
    String operator = null;

    Calculate (String operator){
        this.operator = operator;
    }
    // Конструктор класса

    public int result (int op1, int op2) {
        int res = 0;

        if (op2 != 0) {
        // Во избежание деления на ноль
            switch (operator) {
                case "+" -> res = op1 + op2;
                case "-" -> res = op1 - op2;
                case "*" -> res = op1 * op2;
                case "/" -> res = op1 / op2;
                default -> res = 10000;
                // Если оператор неверный, метод возвращает невозможный результат 10 000
            }
        }

        return res;
    }
}
