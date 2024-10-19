package design.strategy;

public abstract class Duck {

  FlyBehavior flyBehavior;
  QuackBehavior quackBehavior;

  public Duck() {
  }

  void performQuack() {
    quackBehavior.quack();
  }

  void performFly() {
    flyBehavior.fly();
  }

  public void setFlyBehavior(FlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }

  public void setQuackBehavior(QuackBehavior quackBehavior) {
    this.quackBehavior = quackBehavior;
  }

  void swim() {
    System.out.println("All ducks swim.");
  }

  protected abstract void display();
}