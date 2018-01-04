package ua.stqa.pft.addressbook;

public class GroupData {             // это объект, у коорого три атрибута
  private final String name;         //1
  private final String header;       //2
  private final String footer;       //3

  public GroupData(String name, String header, String footer) {   // это конструктор ,который инициализирет (определяет параметры) объект значениями
    this.name = name;
    this.header = header;
    this.footer = footer;
  }

  public String getName() {
    return name;
  }                // три метода, которые возвращают эти атрибуты

  public String getHeader() {
    return header;
  }

  public String getFooter() {
    return footer;
  }
}
