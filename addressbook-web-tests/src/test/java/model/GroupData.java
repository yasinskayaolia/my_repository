package model;

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

  @Override
  public String toString() {
    return "GroupData{" +
            "name='" + name + '\'' +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    GroupData groupData = (GroupData) o;

    return name != null ? name.equals(groupData.name) : groupData.name == null;
  }

  @Override
  public int hashCode() {
    return name != null ? name.hashCode() : 0;
  }
}
