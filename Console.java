public abstract class Console implements IConsole{
    protected String consoleType;
    protected String storeName;
    protected int totalSales;
    
    public Console(String consoleType, String storeName, int totslSales) {
        this.consoleType = consoleType;
         this.storeName = storeName;
        this.totalSales = totalSales;
    }

    @Override
    public String getConsoleType() {
        return consoleType;
    }

    @Override
    public String getStore() {
        return storeName;
    }

    @Override
    public int getTotalSales() {
        return totalSales;
    }

    public abstract void printReport() {
    }
} 