/*2. interface MusicSystem
void playMusic();
void stopMusic();
Now create a class Car that implements both interfaces.
The class should:
Print "Engine started" when start() is called
Print "Engine stopped" when stop() is called
Print "Playing music" when playMusic() is called
Print "Music stopped" when stopMusic() is called

In the main method:
Create an object of Car
Call all four methods using the object
Show how a single class can inherit behavior from multiple interfaces */


    // First Interface
    interface Engine {
        void start();

        void stop();
    }

    // Second Interface
    interface MusicSystem {
        void playMusic();

        void stopMusic();
    }

   
    class Car implements Engine, MusicSystem {

        // Engine interface methods
        public void start() {
            System.out.println("Engine started");
        }

        public void stop() {
            System.out.println("Engine stopped");
        }

        // MusicSystem interface methods
        public void playMusic() {
            System.out.println("Playing music");
        }

        public void stopMusic() {
            System.out.println("Music stopped");
        }
    }

  
    public class oops_day7b{
        public static void main(String[] args) {

            Car myCar = new Car(); // creating object

            // Calling all four methods
            myCar.start();
            myCar.stop();
            myCar.playMusic();
            myCar.stopMusic();
        }
    }
    
