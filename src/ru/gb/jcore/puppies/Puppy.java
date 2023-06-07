package ru.gb.jcore.puppies;
/**
 * Класс приложения, здесь мы можем описать его основное назначение и способы взаимодействия с ним, а так же передать значение в основной класс.
 */
public class Puppy {
/**
 * Передает параметр возраст
 * @param puppyAge
 */
    public int puppyAge;
      /**
       * Этот конструктор имеет один параметр
       * @param name
       */
    public Puppy(String name) {
       System.out.println("Name chosen is: " + name );
    }
    /**
     * Устанавливаем значение 
     * @param age
     */
    public void setAge(int age) {
       puppyAge = age;
    }
    /**
     * Передаем значение 
     * @param age
     * @returns: отформатированная строка
     */
    public int getAge( ) {
       System.out.println("Puppy's age is: " + puppyAge);
       return puppyAge;
    }
}
