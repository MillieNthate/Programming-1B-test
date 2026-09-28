public class RunApplicationQ2 {
    public static void main(String[] args) {
        ConsoleSales sale1 = new ConsoleSales("PS5", "Number 1 Electronics - Cape Town", 1000);
        ConsoleSales sale2 = new ConsoleSales("XBOX", "Number 1 Electronics - Pretoria", 1100);

        sale1.printReport();
        System.out.println("------------");
        sale2.printReport();
    }
}