package design.strategy;

public class FlyRocketPowered implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("FlyRocketPowered");
  }
}
