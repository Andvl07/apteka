import java.util.Arrays;

class Apteka {
    private String name;
    private String[] medicines;
    private double[] prices;

    //инициализация полей
    public Apteka(String name, String[] medicines, double[] prices) {
        this.name = name;
        this.medicines = medicines;
        this.prices = prices;
    }

    // метод конструктор
    public String getFullInfo() {
        StringBuilder konstrukt = new StringBuilder();
        konstrukt.append("Название аптеки: ").append(name).append("\n");
        konstrukt.append("Лекарства: ").append(Arrays.toString(medicines)).append("\n");
        konstrukt.append("Цены: ").append(Arrays.toString(prices)).append("\n");
        return konstrukt.toString();
    }

    // метод для расчёта цены самого дорого лекарства
    public double getMostExpensiveMedicinePrice() {
        if (prices.length == 0)
            return 0; 
        double maxPrice = prices[0];
        for (double price : prices) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        return maxPrice;
    }

    //метод, который рассчитывает общую стоимость лекарств в аптеке
    public double getTotalCost() {
        double total = 0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }
}
