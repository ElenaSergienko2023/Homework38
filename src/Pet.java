public class Pet {
//  Создать класс Pet (домашнее животное). В классе должны быть:
//  enum Kind для вида животного (DOG, CAT, OTHER);
//  поля:
//      "вид животного" (тип Kind),
//      "кличка" (тип String),
//      "дата рождения" (тип String),
//  вес (тип double);
//  конструктор, сеттеры, геттеры;
//  статический метод для создания животного при прочтении данных из строки
//  "dog,кличка", "cat,кличка,вес", "turtle,кличка,вес,дата рождения".
//  Создать класс Main, в котором данные будут считываться с консоли и красиво выводиться на экран.
//  Формат входных данных: количество строк с записями о домашних животных,
//  атем сами записи в описанном формате.

  final private static char SEP = ',';
  private Kind kind;
  private String name;
  private String dateOfBirth;
  private double weight;

  public Pet(String name, String kind) {
    this.name = name;
    this.kind = kind;
    this.dateOfBirth = null;
    this.weight = null;
  }

  public Pet(String name, String kind, String dateOfBirth, double weight) {
    this.name = name;
    this.kind = kind;
    this.dateOfBirth = dateOfBirth;
    this.weight = weight;
  }

  public String getName() {
    return name;
  }

  public String getKind() {
    return kind;
  }

  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public double getWeight() {
    return weight;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public void setWeight(String weight) {
    this.weight = weight;
  }



}