import java.util.Scanner;
// Подключается библиотека класса Scanner

public class Calculator {

    static Scanner scanner = new Scanner (System.in);
    // В классе Scanner создаётся новый объект scanner, принимающий в себя входные данные

        public static void main (String[] args) {
            String input = scanner.nextLine ();
            // Присвоение строке input значения введённых данных

            String delimeter = " ";
            String[] subInput = input.split (delimeter);
            // Разделение строки на отдельные элементы разделителем пробел


            if (subInput.length < 3) {
                System.out.println("throws Exception //т.к. строка не является математической операцией");
                return;
            }
            else if (subInput.length > 3) {
                System.out.println("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
                return;
            }
            // Проверка исключений по количеству введённых данных

            OperandChecking Operand1 = new OperandChecking (subInput[0]);
            int operand1 = Operand1.returnInteger ();
            OperandChecking Operand2 = new OperandChecking (subInput[2]);
            int operand2 = Operand2.returnInteger ();
            // 2 новых объекта в классе Calculate
            // Методы возвращают введённые значения в типе int

            Calculate Result = new Calculate(subInput[1]);
            // Новый объект в классе Calculate
            int arabianResult = Result.result(operand1, operand2);
            // Метод возвращает результат решения операции арабскими цифрами

            boolean returnCheck = false;
            // Нужен для вывода всех ошибок, а не первой, на которую наткнётся
            if (operand1 == 0 || operand2 == 0) {
                System.out.println("throws Exception //т.к. введено недопустимое значение операндов");
                returnCheck = true;
            }
            if (Operand1.romeSystem != Operand2.romeSystem) {
                System.out.println("throws Exception //т.к. используются одновременно разные системы счисления");
                returnCheck = true;
            }
            if (arabianResult == 10000) {
                System.out.println("throws Exception //т.к. введено недопустимое значение оператора");
                returnCheck = true;
            }
            // Проверка всех условий:
            // 1. диапазон введённых операндов от 1 до 10 или от I до X;
            // 2. операнды принадлежат одной системе счичтления;
            // 3. значение оператора "+", "-", "*" или "/".
            if (returnCheck) {
                return;

            }

            if (Operand1.romeSystem) {
                if (arabianResult <= 0) {
                    System.out.println("throws Exception //т.к. по условиям задачи результатом работы калькулятора с римскими числами могут быть только положительные числа");
                }
                else {
                    RomanNumbers rome = new RomanNumbers(arabianResult);
                    System.out.println(rome.RomanResult());
                }
                // Если были введены римские цифры и результат > 0, результат будет римскими
            }
            else {
                System.out.println(arabianResult);
            }
        }
}
