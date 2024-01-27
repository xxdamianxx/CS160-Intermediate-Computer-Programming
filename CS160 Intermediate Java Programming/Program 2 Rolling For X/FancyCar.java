public class FancyCar {

   // Declare private fields
   private final int FULL_TANK = 14;
   private int odometer;// Default constructor
   private double gallonsOfGas;
   private double mpg;
   private double drivingCapacity;
   private String make;
   private boolean isRunning;

   public FancyCar() {
      /* Complete the method */
      odometer = 5;
      gallonsOfGas = FULL_TANK;
      mpg = 24.0;
      make = "Old Clunker";
      drivingCapacity = 0.0;
      isRunning = false;
   }

   // Constructor (String make, double mpg)
   public FancyCar(String make, double mpg) {
      /* Complete the method */
      odometer = 5;
      gallonsOfGas = FULL_TANK;
      this.mpg = mpg;
      this.make = make;
      drivingCapacity = 0.0;
      make = "";
      isRunning = false;
   }

   // Return car model
   public String getModel() {
      /* Update the return statment */
      return make;
   }

   // Return miles per gallon (MPG)
   public double getMPG() {
      /* Update the return statment */
      return mpg;
   }

   // Return miles on odometer
   public int checkOdometer() {
      /* Update the return statment */
      return odometer;
   }

   // Return amount of gas in tank
   public double checkGasGauge() {
      /* Update the return statment */
      return gallonsOfGas;
   }

   // Honk horn
   public void honkHorn() {
      /* Complete the method */
      System.out.println("The " + make + " says beep beep!");
   }

   // Drive car requested miles but check for enough
   // gas and check for positive value
   public void drive(int milesToDrive) {
      if (isRunning) {
         if (milesToDrive < 0.0) {
            return;
         }
         double maxDrivingDistance = gallonsOfGas * mpg;
         if (maxDrivingDistance < (double) milesToDrive) {
            milesToDrive = (int) maxDrivingDistance;
            odometer += milesToDrive;
            gallonsOfGas = 0.0;
            isRunning = false;
         } else {
            odometer += milesToDrive;
            double gasUsed = milesToDrive / mpg;
            gallonsOfGas = gallonsOfGas - gasUsed;
         }
      }
   }

   // Add gas to tank. Check for positive value.
   public void addGas(double amtToAdd) {
      if (!isRunning) {
         if (amtToAdd < 0.0) {
            return;
         }
         if (gallonsOfGas == FULL_TANK) {
            return;
         } else {
            gallonsOfGas = gallonsOfGas + amtToAdd;
            if (gallonsOfGas > FULL_TANK) {
               gallonsOfGas = FULL_TANK;
            }
         }
      }
   }

   // Set boolean variable to true
   public void startEngine() {
      /* Complete the method */
      isRunning = true;
   }

   // Set boolean variable to false
   public void stopEngine() {
      /* Complete the method */
      isRunning = false;
   }

}