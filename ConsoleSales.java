public class ConsoleSales extends Console {

    public ConsoleSales(String consoleType, String storeName, int totalSales) {
        super(consoleType, storeName, totalSales);
    }

    @Override
    public void printReport() {
        System.out.println("CONSOLE TYPE: " + getConsoleType());
        System.out.println("STORE NAME: " + getStore());
        System.out.println("TOTAL SALES: " + getTotalSales());
    }

    @Override
    public String getConsole() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

