public class RunApplication {
  public static void main(String[] args) {
      //There is a single array for cities
      String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
      
      //Two dimensional array for sales
      
      int[][] sales = {
          {1000, 2000, 3000}, //Cape Town
          {2000, 3000, 4000}, //Port Elizabeth
          {1500, 1100, 1200}, //Pretoria
  };
      
      int[] totalSalesPerCity = new int[3];
      int maxSales = 0;
      String cityWithMostSales = "";
      
      //Calculate totals
      for(int i = 0; i < cities.length; i++) {
          int total = 0;
          for(int j = 0; j < sales[i].length; j++) {
              total+= sales[i][j];
          }
          totalSalesPerCity[i] = total;
          
          if (total > maxSales) {
              maxSales = total;
              cityWithMostSales = cities[i];
          }
      }
      
      //The report for system out print
      
      System.out.println("------------------------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("------------------------------------------------------------------");
        System.out.printf("%-20s %-10s %-10s %-10s%n", "", "PS5", "XBOX", "SWITCH");
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s %-10d %-10d %-10d%n", cities[i], sales[i][0], sales[i][1], sales[i][2]);
        }
        System.out.println("------------------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("------------------------------------------------------------------");
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s %d%n", cities[i], totalSalesPerCity[i]);
        }
        System.out.println();
        System.out.println("CITY WITH THE MOST SALES: " + cityWithMostSales);
        System.out.println("------------------------------------------------------------------");
    }
  }  