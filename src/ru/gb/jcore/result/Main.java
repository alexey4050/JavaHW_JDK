package ru.gb.jcore.result;
import ru.gb.jcore.puppies.Kittens;
import ru.gb.jcore.puppies.Puppy;
/**
 * Основной класс приложения.
 * Здесь мы можем описать его основное назначение и способы взаимодействия с ним
 */
class Main{
/**
 * Точка входа в программу. С неё всегда всё начинается.
 * @param args
 */
public static void main(String []args) {
    /**
     *  Создание объекта класса 
     */
    Puppy myPuppy = new Puppy( "tommy" );
    Kittens myKitten = new Kittens("cat");

    /** 
     * Вызов метода class, чтобы установить возраст щенка и кошки 
     */
    myPuppy.setAge(2);
    myKitten.setAge(4);


    /**
     *  Вызов другого метода класса, чтобы получить возраст щенка и кошки 
     */
    myPuppy.getAge( );
    myKitten.getAge();

    /**
     * Доступ к переменной экземпляра
     */
    System.out.println("Variable Value: " + myPuppy.puppyAge );
    System.out.println("Variable Value: " + myKitten.kittenAge);
 }
}
