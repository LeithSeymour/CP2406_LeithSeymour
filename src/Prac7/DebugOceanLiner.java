package Prac7;

public class DebugOceanLiner extends DebugBoat
{
   public DebugOceanLiner()
   {
      super("Ocean liner");
//      Debug("ocean liner ");
      setPassengers();
      power();
   }


    @Override
    public void setPower() {

    }

    public void setPassengers()
   {
      super.passengers = 2400;
   }
   public void power()
   {
      super.power = "four engines";
   }
}
