package ru.gb.jcore.puppies;
/**
 * Еще один очень важный класс приложения, здесь мы можем описать его основное назначение и способы взаимодействия с ним, а так же передать значение в основной класс.
 */
public class Kittens {
 /**
 * Передает параметр возраст
 * @param kittenAge
 */
   public int kittenAge;
      /**
       * Этот конструктор имеет один параметр
       * @param name
       */
   public Kittens(String name) {
     
      System.out.println("Name chosen is: " + name);
   }

   
   /** 
    * @param age
    */
   public void setAge(int age) {
      kittenAge = age;
   }
   /**
    * Передаем значение 
    * @param age
    * @returns: отформатированная строка
    */
   public int getAge() {
      System.out.println("Kitten's age is: " + kittenAge);
      return kittenAge;
   }
}
