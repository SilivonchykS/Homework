package classwork.classwork_37;

public class Example_01 {
        /*
        Разработать класс машина и двигатель
        Машина должна уметь уздить по вызову метода на какок-то расстояние
        Добавить надобность заправляться
         */
        public static void main(String[] args) {
            Carrrr car = new Carrrr("Tayota", 65, 8.5, "benzine");
            car.drive(1000);
            car.drive(100);
            System.out.println("Fuel left: " + car.getFuelAmount());
            car.refill();
            System.out.println("Fuel restored! Level: " + car.getFuelAmount());
            car.drive(50);
            System.out.println("Fuel left: " + car.getFuelAmount());{
            }
        }}