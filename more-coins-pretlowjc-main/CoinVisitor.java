
/*
  Your visitor should extend this class. Because each coin type has
  an implementation here, you only need to override those coins that
  may be of interest to you for your specific reason for visiting.
*/

public abstract class CoinVisitor {

  public abstract String report();

  public void visit(Coin.NullCoin c) { }

  public void visit(DollarCoin c) { }
  public void visit(HalfDollarCoin c) { }
  public void visit(QuarterCoin c) { }
  public void visit(DimeCoin c) { }
  public void visit(NickelCoin c) { }
  public void visit(PennyCoin c) { }

  public void visit(FivePoundCoin c) { }
  public void visit(TwoPoundCoin c) { }
  public void visit(PoundCoin c) { }
  public void visit(FiftyPenceCoin c) { }
  public void visit(TwentyPenceCoin c) { }
  public void visit(TenPenceCoin c) { }
  public void visit(FivePenceCoin c) { }
  public void visit(TwoPenceCoin c) { }
  public void visit(PenceCoin c) { }

  public void visit(ToonieCoin c) { }
  public void visit(LoonieCoin c) { }
  public void visit(FiftyCentCoin c) { }
  public void visit(CadQuarterCoin c) { }
  public void visit(CadDimeCoin c) { }
  public void visit(CadNickelCoin c) { }
  
  public void visit(TwoEuroCoin c) { }
  public void visit(EuroCoin c) { }
  public void visit(FiftyEuroCentCoin c) { }
  public void visit(TwentyEuroCentCoin c) { }
  public void visit(TenEuroCentCoin c) { }
  public void visit(FiveEuroCentCoin c) { }
  public void visit(TwoEuroCentCoin c) { }
  public void visit(EuroCentCoin c) { }
  
}

class Collector extends CoinVisitor {
  private int nulls = 0;
  private int dollar = 0;
  private int halfDollar = 0;
  private int quarter = 0;
  private int dime = 0;
  private int nickel = 0;
  private int penny = 0;

  public void visit(Coin.NullCoin c) {
    nulls++;
  }
  public void visit(DollarCoin c) {
    dollar++;
  }
  public void visit(HalfDollarCoin c) {
    halfDollar++;
  }
  public void visit(QuarterCoin c) {
    quarter++;
  }
  public void visit(DimeCoin c) {
    dime++;
  }
  public void visit(NickelCoin c) {
    nickel++;
  }
  public void visit(PennyCoin c) {
    penny++;
  }

  public String report() {
    return "Null: " + nulls + "\nDollar: " + dollar + "\nHalf Dollar: " 
      + halfDollar + "\nQuarter: " + quarter + "\nDime: " + dime + "\nNickel: "
      + nickel + "\nPenny: " + penny;

  }
}

// etc. for other visitor purposes...

