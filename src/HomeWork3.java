import java.util.Scanner;

/*
Итоговая задача №3Задание
Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу.
Пользователь вводит текущий курс и количество рублей. Итоговое значение должно быть округлено до двух знаков после запятой.
(Пример для теста работы программы: Курс доллара = 67,55, Количество рублей: 1000, Итого: 14,80 долларов)
 */
public class HomeWork3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите курс доллара в рублях");
        float rateDollar = in.nextFloat();
        System.out.println("Укажите количество рублей");
        float sumRub = in.nextFloat();
        float result = sumRub / rateDollar;
        System.out.println("Итого: " + String.format("%.2f", result) + " долларов");
    }
}
