package tasks;
// Дано  целое число n, оно от1 до 99
// Мне n лет, но при необходимости вместо лет пишется  год или года
// Мне 1 год, мне 2 года, мне 3 года. мне 25 лет

public class Years {
    public static void main(String[] args) {
        printMyYears(18);
    }
        public static void printMyYears ( int years){
            if (years < 1 || years > 99) {
                System.out.println("Возраст введен неправильно: " + years);
                return;
            }
            String result = "";  // Год года лет
            int lastInteger = years % 10;
            if (years >= 5 && years <= 20) {
                result = "лет";
            } else {
                switch (lastInteger) {
                    case 1:
                        result = "год";
                        break;
                    case 2, 3, 4:
                        result = "года";
                        break;
                    case 5, 6, 7, 8, 9, 0:
                        result = "лет";
                        break;
                }
            }
            System.out.println("Мне " + years + " " + result);
        }
    }