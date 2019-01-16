public class main {
    private final int MON = 12;
    private final int SEASONS = 4;

    private static final String[] month = {"Январь", "Февраль", "Март", "Апрель", "Май", "Июнь", "Июль", "Август",
            "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
    private static final String[] season = {"Зима", "Весна", "Лето", "Осень"};

    private static final int[] days = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void main(String[] args) {
        double AVG = 0;

        for (int i = 0; i < month.length; i++) {
            String rString = "";
            rString += month[i] + " это ";
            switch (i) {
                case 11:
                case 0:
                case 1:
                    rString += season[0] + " и содержит " + days[i] + " дней";
                    break;
                case 2:
                case 3:
                case 4:
                    rString += season[1] + " и содержит " + days[i] + " дней";
                    break;
                case 5:
                case 6:
                case 7:
                    rString += season[2] + " и содержит " + days[i] + " дней";
                    break;
                case 8:
                case 9:
                case 10:
                    rString += season[3] + " и содержит " + days[i] + " дней";
                    break;
            }

            System.out.println(rString);

        }

        int j = 0;
        int sum = 0;
        while (j < days.length) {
            sum += days[j];
            j++;
        }
        AVG = sum / days.length;

        System.out.println("В среднем " + AVG + " дней в месяце");

        if (days[1] == 28) {
            System.out.println("Год не высокосный");
        } else {
            System.out.println("Год высокосный");
        }
    }
}
