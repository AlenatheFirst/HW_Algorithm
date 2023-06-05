import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    //создаем массив со значениями, которые уже нам известны;

    List<Integer> studentHeight = new ArrayList<>();
    studentHeight.add(160);
    studentHeight.add(150);
    studentHeight.add(161);
    studentHeight.add(172);
    studentHeight.add(180);
    studentHeight.add(160);

//сортируем полученые значения и выводим на экран отсортированный массив
    Collections.sort(studentHeight);
    for (int values : studentHeight) {
      System.out.println(values);
    }

   // просим пользователя ввести данные

    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter the heigh of a stundent");

    int peteHeight = keyboard.nextInt();

      int position = 1; // Изначально считаем, что Петя должен встать на первую позицию

      // Ищем первое место, где рост человека в строю меньше или равен росту Пети
      for (int i = 0; i < studentHeight.size(); i++) {
        if (studentHeight[i] = peteHeight) {
          position = i + 1; // Находимся на позиции (i + 1), так как индексы начинаются с 0
          break;
        }
      }
    System.out.println(position);

  }
}
