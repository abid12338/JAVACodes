import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class problem_18 {

       
    private static final String INPUT_FILE = "GasPrices[2605].txt";
    private static final String LOWEST_TO_HIGHEST_FILE = "LowestToHighestPrices.txt";
    private static final String HIGHEST_TO_LOWEST_FILE = "HighestToLowestPrices.txt";

    public static void main(String[] args) {

        double totalPricePerMonth[] = new double[12];
        int pricesCountPerMonth[] = new int[12];
        double highestPrice = 0;
        double lowestPrice = 0;
        double totalPrice = 0;
        String highestPriceDate = "";
        String lowestPriceDate = "";
        int priceCount = 0;
        ArrayList<Double> prices = new ArrayList<Double>();

        try {
            Scanner fileReader = new Scanner(new File(INPUT_FILE));
            String line = "";
            while (fileReader.hasNext()) {
                line = fileReader.nextLine();
                String[] tokens = line.split(":");
                double price = Double.parseDouble(tokens[1].trim());
                String date[] = tokens[0].split("-");
                int month = Integer.parseInt(date[0].trim());
                totalPrice += price;
                priceCount += 1;
                if (priceCount == 1) {
                    highestPrice = lowestPrice = price;
                }
                totalPricePerMonth[month - 1] += price;
                pricesCountPerMonth[month - 1] += 1;
                prices.add(price);

                if (highestPrice < price) {
                    highestPrice = price;
                    highestPriceDate = tokens[0];
                }
                if (lowestPrice > price) {
                    lowestPrice = price;
                    lowestPriceDate = tokens[0];
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Unable to read file : " + INPUT_FILE);
            System.exit(1);
        }

        System.out.printf("Average Price Per Year: $%.3f\n", totalPrice / priceCount);
        System.out.println("Average Price Per Month - ");
        for (int i = 0; i < pricesCountPerMonth.length; i++) {
            if (pricesCountPerMonth[i] != 0) {
                System.out.printf("Month - %d Average Price was: $%.3f\n", (i +1), totalPricePerMonth[i] / pricesCountPerMonth[i]);
            }
        }

        System.out.printf("Highest Price: $%.3f was on %s\n", highestPrice, highestPriceDate);
        System.out.printf("Lowest Price: $%.3f was on %s\n", lowestPrice, lowestPriceDate);


                  
        try {
            FileWriter writer = new FileWriter(new File(LOWEST_TO_HIGHEST_FILE));
            Collections.sort(prices);
            for (double price : prices) {
                writer.write(String.format("%.3f\r\n", price));
            }
            writer.flush();
            writer.close();
            System.out.println(LOWEST_TO_HIGHEST_FILE+" file created sucessfully.");
        } catch (IOException e) {
            System.out.println("Unable to write data to file : " + LOWEST_TO_HIGHEST_FILE);
        }


                      
        try {
            FileWriter writer = new FileWriter(new File(HIGHEST_TO_LOWEST_FILE));
            Collections.sort(prices,Collections.reverseOrder());
            for (double price : prices) {
                writer.write(String.format("%.3f\r\n", price));
            }
            writer.flush();
            writer.close();
            System.out.println(HIGHEST_TO_LOWEST_FILE+" file created sucessfully.");
        } catch (IOException e) {
            System.out.println("Unable to write data to file : " + HIGHEST_TO_LOWEST_FILE);
        }
    }
}
