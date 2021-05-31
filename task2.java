public class task2 {
    // *** ЗВЁЗДОЧКАМИ пометил свои комментарии к коду


//    interface Moveable {
//        void move();
//    }
//    interface Stopable {
//        void stop();
//    }
//    abstract class Car {
//        public Engine engine; *** Почему-то переменная как public, я бы сделал private
//        private String color;
//        private String name;
//        protected void start() {
//            System.out.println("Car starting");
//        }
//        abstract void open(); *** Нет уровня доступа к методу, я бы поставил public
//        public Engine getEngine() {
//            return engine;
//        }
//        public void setEngine(Engine engine) {
//            this.engine = engine;
//        }
//        public String getColor() {
//            return color;
//        }
//        public void setColor(String color) {
//            this.color = color;
//        }
//        public String getName() {
//            return name;
//        }
//        public void setName(String name) {
//            this.name = name;
//        }
//    }
//    class LightWeightCar extends Car implements Moveable{ *** интерфейс Moveable я бы сразу в класс Car добавил, а не сюда
//        *** и эти два метода переопределил бы в классе Car для всех будущих наследников машин
//        @Override
//        void open() { *** public бы продублировал
//            System.out.println("Car is open");
//        }
//        @Override
//        public void move() {
//            System.out.println("Car is moving");
//        }
//    }
//0 *** здесь 0 явно лишний )))
//
//    class Lorry extends Car, Moveable, Stopable{ *** если уж так делать, то должнобыть implements Moveable, Stopable, но
//                                                  опять таки я бы это вынес в класс Car
//        public void move(){ *** почему то не указано @Override здесь и в классе ниже
//            System.out.println("Car is moving");
//        }
//        public void stop(){
//            System.out.println("Car is stop");
//        }
//       *** а вот метод open из абстрактного класа Car не переопределён здесь, хотя должен был.
//    }

}
