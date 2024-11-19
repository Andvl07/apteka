import java.util.Arrays;

public class Programm {

    public static void main(String[] args) {
        // инициализация массива с названиями аптек, названиями лекарств, ценами
        // лекарств
        Apteka apteka1 = new Apteka("Фармгуд", new String[] { "Парацетамол", "Аспирин" }, new double[] { 100, 90 });
        Apteka apteka2 = new Apteka("НормФарм", new String[] { "Анальгин", "Ибупрофен", "Цитрамон" },
                new double[] { 120, 155, 97 });
        Apteka apteka3 = new Apteka("DeutschMed", new String[] { "Когацел", "Ринонорм", "ДокторМом" },
                new double[] { 250, 150, 400 });

        // вызовы методов
        System.out.println("Информация об аптеке 1:\n" + apteka1.getFullInfo());
        System.out
                .println("Стоимость самого дорогого лекарства в аптеке 1: " + apteka1.getMostExpensiveMedicinePrice());
        System.out.println("Общая стоимость лекарств в аптеке 1: " + apteka1.getTotalCost() + "\n");

        System.out.println("Информация об аптеке 2:\n" + apteka2.getFullInfo());
        System.out
                .println("Стоимость самого дорогого лекарства в аптеке 2: " + apteka2.getMostExpensiveMedicinePrice());
        System.out.println("Общая стоимость лекарств в аптеке 2: " + apteka2.getTotalCost() + "\n");

        System.out.println("Информация об аптеке 3:\n" + apteka3.getFullInfo());
        System.out
                .println("Стоимость самого дорогого лекарства в аптеке 3: " + apteka3.getMostExpensiveMedicinePrice());
        System.out.println("Общая стоимость лекарств в аптеке 3: " + apteka3.getTotalCost() + "\n");

    }
}