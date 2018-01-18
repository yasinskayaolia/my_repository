package ua.conditions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collections {


  //public static void main(String[] args) {

  //String[] langs = new String[4];           // созданный здесь масси может хранить 4 элемента
  //langs[0] = "Java";                        // нумерация элементов массивов начинается с нуля [0]
  //langs[1] = "C#";
  // langs[2] = "Python";
  //langs[3] = "PHP";
  //}

  //public static void main(String[] args) {
  //String[] langs = {"Java", "C#", "Python", "PHP"};

  // for (int i = 0; i < langs.length; i++) {
  // System.out.println("Я хочу выучить " + langs[i]);
  // }
  // }
//}
  //тоже самое, что и вверху

  //public static void main(String[] args) {
  //String[] langs = {"Java", "C#", "Python", "PHP"};


  //List<String> languages = new ArrayList<String>();      //слева указан интерфейс, а справа конкретный класс этого интерфейса
  //languages.add("Java");                                 //размер списка при создании равен 0, его можно менять, удалять; размер массива удалять нельзя
  //languages.add("PHP");

  // for (String l : langs) {
  //  System.out.println("Я хочу выучить " + l);
  //}
  // }
//}

  public static void main(String[] args) {
    String[] langs = {"Java", "C#", "Python", "PHP"};

    List<String> languages = Arrays.asList("Java", "C#", "Python", "PHP");

    //for (String l : languages) {
      //System.out.println("Я хочу выучить " + l);
   // }
    for (int i = 0; i < languages.size(); i++) {
      System.out.println("Я хочу выучить " + languages.get(i));
    }
  }
}