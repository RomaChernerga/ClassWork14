package HomeWork14;

import java.util.Arrays;
import java.util.Scanner;

public class HW14 {
    public static void main(String[] args) throws Exception {
        FindFourMethod();
        System.out.println();




        int[] array = {4,5,4,1};
        System.out.println("Массив: " + Arrays.toString(array) + " Результат: " + OnlyOneAndFour(array));
        int[] array2 = {1,1,1,1};
        System.out.println("Массив: " + Arrays.toString(array2) + " Результат: " + OnlyOneAndFour(array2));
        int[] array3 = {4,4,4,4};
        System.out.println("Массив: " + Arrays.toString(array3) + " Результат: " + OnlyOneAndFour(array3));
        int[] array4 = {1, 1, 4, 4, 1, 4, 4};
        System.out.println("Массив: " + Arrays.toString(array4) + " Результат: " + OnlyOneAndFour(array4));

    }

    public static void FindFourMethod() throws RuntimeException {
        /*Написать метод, которому в качестве аргумента передается не пустой одномерный
        целочисленный массив. Метод должен вернуть новый массив, который получен путем
        вытаскивания из исходного массива элементов, идущих после последней четверки. Входной
        массив должен содержать хотя бы одну четверку, иначе в методе необходимо выбросить
        RuntimeException.
                Написать набор тестов для этого метода (по 3-4 варианта входных данных).
                Вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ].*/

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите величину массива");
        int[] arrayIN = new int[]{1,2,3,4,5,6,7}; //выделение памяти на N ячеек в массиве
        if (arrayIN.length > 0) {
            for (int i = 0; i <arrayIN.length; i++) {
//                arrayIN[i] = (int)(Math.random() * 10); // заполнение случ числами от 0 до 10
                System.out.println( "Входящий массив: -> " + Arrays.toString(arrayIN)); // вывод массива в консоль
                break;}

            int fourPosition = 0;
            for (int i = arrayIN.length - 1; i >= 0; i--) {
                if (arrayIN[i] == 4) {
                    fourPosition = i+1;
                    System.out.println("крайняя четверка является " + fourPosition +"-й" + " по счету");
                }/*else {
                    throw new RuntimeException("нет четверок в массиве");
                }*/
            }

            int []arrayOUT = new int[arrayIN.length - fourPosition];
            System.arraycopy(arrayIN, fourPosition, arrayOUT,0,arrayOUT.length);
            System.out.print("Выходящий массив: -> " + Arrays.toString(arrayOUT));
        } else {throw new RuntimeException("Массив пуст");}
        System.out.println();

    }


    public static boolean OnlyOneAndFour(int[]array){
        /*Написать метод, который проверяет состав массива из чисел 1 и 4. Если в нем нет хоть одной
    четверки или единицы, то метод вернет false; Написать набор тестов для этого метода (по 3-4
            варианта входных данных).
            [ 1 1 1 4 4 1 4 4 ] -> true
            [ 1 1 1 1 1 1 ] -> false
            [ 4 4 4 4 ] -> false
            [ 1 4 4 1 1 4 3 ] -> false
            */

        boolean i1 = false, i4 = false;  // ставим изначально значение 1 и 4 как - ложное
        for (int i = 0; i < array.length; i++) {   // проходимся по массиву
            if (array[i] == 1){ // если элемент массива == 1
                i1 = true;  // то элемент 1 = истинна
            } else if (array[i] == 4) { // если элемент массива  == 4
                i4 = true; // то элемент 4 = истинна
            } else {
                return false;  // и только во всех остальных случаях, если нет 1 и 4 = то ложь
            }
        }
        return i1 && i4;  // возвращаем логический параметр для 1и4
    }


}






