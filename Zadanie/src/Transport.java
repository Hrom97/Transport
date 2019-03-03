public class Transport{
 public interface  traffic{
     void movement();
     void spares();
     void model();
     abstract void place();
     public String Company = "MMM";
     default void pilot (){
         System.out.println("У каждого свой");
     }
 }
 public abstract class Car implements  traffic {
     @Override
     public void movement() {
         System.out.println("По дороге");
     }

     @Override
     public void spares() {
         System.out.println("От машины");
     }

     public abstract void model();
 }
    public class Bike implements traffic{

     @Override
     public void movement() {
     }
     @Override
     public void spares() {
     }
     @Override
     public void model() {
     }
     @Override
     public void place() {

     }

     private Wheel leftWheel = new Wheel("Black"), rightWheel = new Wheel("Green");
     private class Wheel {

         private String color;
         private Wheel(String color){
             this.color = color;

         }
     }

     public class bicycle extends Bike{
         private String color;

     }

     private class motorcycle extends Bike {

     }

 }
 public abstract class Aircraft implements traffic{

     @Override
     public void movement() {
     }

     @Override
     public void spares() {
     }

     public abstract void model();

     @Override
     public void place() {
     }

     @Override
     public void pilot(){
     }
     public class Balloon extends Aircraft{

         @Override
         public void model() {

         }
     }

     public  class Helicopter implements traffic{

         private  String pilot;
         String getPilot(){
             return pilot;
         }

     Helicopter(String pilot){
         this.pilot = pilot;
     }

         @Override
         public void movement() {
         }

         @Override
         public void spares() {
         }

         @Override
         public void model() {

         }

         @Override
         public void place() {
         }
     }
 }

 public class Train implements traffic{

     String color;
     String passenger;

     Train(String color, String passenger){

         this.color = "Green";
         this.passenger = "Eleven";
     }

     @Override
     public void movement() {
     }

     @Override
     public void spares() {
     }

     @Override
     public void model() {
     }

     @Override
     public void place() {
     }

     private class ElectricTrain extends Train{

         ElectricTrain(String color, String passenger) {
             super(color, passenger);
         }
     }

     public  class Tram extends Train{

         Tram(String color, String passenger) {
             super(color, passenger);
         }
     }
 }
 public abstract class Boat implements traffic{

     String mark;
     String motor;
     Boat(){
         mark = "Бульк";
         motor = "0912";
     }

     public abstract void movement();

     @Override
     public void spares() {

     }

     @Override
     public void model() {

     }

     public abstract void place();

     void ride(){
         System.out.println("Бульк-бульк");
     }

     private class Cutter extends Boat{

         Cutter(String mark, String motor){
             this.mark = "Ohohoh";
             this.motor = "9999";

         }

         @Override
         public void movement() {
         }

         @Override
         public void place() {
         }
     }
 }
 public class Ship implements traffic{

     @Override
     public void movement() {
     }

     @Override
     public void spares() {
     }

     @Override
     public void model() {
     }

     @Override
     public void place() {
     }
 }

 public interface RidingAnimals{
     void eat();
     void movement();
     void rider();
 }

 public class Horse implements RidingAnimals{

     @Override
     public void eat() {
         System.out.println("Хочу морковку");
     }

     @Override
     public void movement() {
         System.out.println("Галопом");

     }

     @Override
     public void rider() {
     }
 }
}


