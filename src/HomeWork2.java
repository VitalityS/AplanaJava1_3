import java.util.Arrays;
import java.util.Scanner;

/*
Итоговая задача №2Задание
Написать программу сортировки по возрастанию заданного пользователем массива чисел.
Пользователь программы должен задавать размер массива и наполнять его числами.
Использовать одну из следующих сортировок: прямого выбора, вставки, быстрая, Шелла.
 */
public class HomeWork2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел в массиве");
        int numElementArray = in.nextInt();
        int[] arr = new int[numElementArray];
        //цикл для поэлементного ввода значений массива
        for (int i = 0; i < numElementArray; i++) {
            System.out.println("Введите " + (i + 1) + "-е число массива");
            arr[i] = in.nextInt();
        }
        System.out.println("Исходный массив:\n" + Arrays.toString(arr));
        // используем сортировку прямого выбора
        //для поиска минимальноно элемента и для обмена
        int min, temp;
        for (int i = 0; i < numElementArray - 1; i++) {
            //запоминаем индекс текущего элемента
            min = i;
            //ищем минимальный элемент чтобы поставить на место i-го
            for (int j = i + 1; j < numElementArray; j++)//для остальных элементов после i-го
            {
                if (arr[j] < arr[min]) //если элемент меньше минимального
                {
                    min = j; //запоминаем его индекс в min
                }
            }
            temp = arr[i]; //меняем местами i-й и минимальный элементы
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println("Отсортированный массив:\n" + Arrays.toString(arr));
    }
}
