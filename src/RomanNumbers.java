public class RomanNumbers {
    int res;

    RomanNumbers(int res) {
        this.res = res;
    }
    // Конструктор класса

    String RomanResult () {
        String romanResult = null;
        // Используется для возвращения значения

        String resStr = Integer.toString(res);        // Перевёл полученный int в string
        String[] subArabianResult = resStr.split("");      // Разделил число на цифры

        switch (subArabianResult.length) {
            case 1 -> {
            // Если результат операции состоит из единиц
                switch (subArabianResult[0]) {
                    case "1" -> romanResult = "I";
                    case "2" -> romanResult = "II";
                    case "3" -> romanResult = "III";
                    case "4" -> romanResult = "IV";
                    case "5" -> romanResult = "V";
                    case "6" -> romanResult = "VI";
                    case "7" -> romanResult = "VII";
                    case "8" -> romanResult = "VIII";
                    case "9" -> romanResult = "IX";
                }
            }
            case 2 -> {
            // Если результат операции состоит из десятков и единиц
                switch (subArabianResult[0]) {
                // Для десятков
                    case "1" -> romanResult = "X";
                    case "2" -> romanResult = "XX";
                    case "3" -> romanResult = "XXX";
                    case "4" -> romanResult = "XL";
                    case "5" -> romanResult = "L";
                    case "6" -> romanResult = "LX";
                    case "7" -> romanResult = "LXX";
                    case "8" -> romanResult = "LXXX";
                    case "9" -> romanResult = "XC";
                }

                switch (subArabianResult[1]) {
                // Для единиц
                    case "1" -> romanResult += "I";
                    case "2" -> romanResult += "II";
                    case "3" -> romanResult += "III";
                    case "4" -> romanResult += "IV";
                    case "5" -> romanResult += "V";
                    case "6" -> romanResult += "VI";
                    case "7" -> romanResult += "VII";
                    case "8" -> romanResult += "VIII";
                    case "9" -> romanResult += "IX";
                }
            }
            case 3 -> {
            // Если результат операции равен 100
                romanResult = "C";
            }
        }

        return romanResult;
    }
}
