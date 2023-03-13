package alg;

public class Combine extends Cup {
    
    
  @Override
  public void WaterInCup() {
        Water.Pers();
      super.WaterInCup();
  }
  @Override
  public void TeaBagInCup() {
         TeaBag.Bag();
      super.TeaBagInCup();
  }
}
