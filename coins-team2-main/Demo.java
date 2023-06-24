import java.util.Scanner;

/**
 * A demo to showcase our progress.
 * @author Jake B., Justin P., Matt N., Reis G.
 * @version 2/8/21
 *
 */
public class Demo {
    final static double ZERO = 0.0;
    Scanner kb = new Scanner(System.in);

    /**
     * Main method of the demo.
     * 
     * @param args - command line arguments
     */
    public static void main(String [] args) {
        Demo d = new Demo();
        CoinMint coinMint;

        if (args.length > ZERO && args[0].equalsIgnoreCase("USD")) {
            System.out.println("Using " + args[0] + ": U.S. Coin Factory");
            coinMint = USDCoinMint.getInstance();
        }
        else if (args.length > ZERO && args[0].equalsIgnoreCase("GBP")) {
            System.out.println("Using " + args[0] 
                +  ": Great Britain Coin Factory");
            coinMint = GBPCoinMint.getInstance();
        }
        else {
            System.out.println("\nProblem with command " 
                + "line coin factory argument.");
            System.out.println("Possible coin factories include: GBP, USD");
            
            coinMint = USDCoinMint.getInstance();
            System.out.println("Using USD: U.S. Coin Factory");
        }

        double denom;
        do {
            denom = d.getDenom();
            Coin c = coinMint.createCoin(denom);

            if (c == Coin.NULL) {
                if (denom != ZERO) {
                    System.out.println("Error reading your entry");
                }
                else {
                    System.out.println();
                }
            }
            else {
                coinMint.mintCoin(denom);
                System.out.println();
            }

        } while(denom != ZERO);

    }

    /**
     * Method to help prevent crashing for.
     * DEPRECATED because of null coin, idk.
     * 
     * @return double value of denom
     */
    public double getDenom() {
        System.out.print("Enter coin denomination " 
            + "(0.25 = a quarter, 0 to quit): ");
        String d = kb.nextLine();
        d.trim();

        // will prevent demo from crashing if a number is not entered
        double denom;
        try {
            denom = Double.parseDouble(d);
        }
        catch (NumberFormatException e) {
            denom = -1.0;
        }

        return denom;
    }
}
