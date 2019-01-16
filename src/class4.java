public class class4 {

    private static final int MONTHS = 12;
    private static final int SEASONS = 4;
    private static final int  DAYS_IN_MONTHS= 30;

    private static final String[] months = {"Январь", "Февраль", "Март", "Апрель",
            "Май", "Июнь", "Июль", "Август", "Сентябрь", "Октябрь", "Ноябрь", "Декабрь"};
    private static final String[] seasons = {"Зима", "Весна", "Лето", "Осень"};

    private static final int[] numbers = {31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30};

    public static void main(String[] args)
    {
        for(int i=0; i<MONTHS; i++)
        {
            System.out.println(months[i] + " это " + getSeasonByMonth(months[i]) + "и содержит " + numbers[i] + " дней");
        }
    }

    public static String getSeasonByMonth(String month)
    {
        String season;
        switch (month)
        {
            case "Декабрь":
            case "Январь":
            case "Февраль":
                season = seasons[0];
                break;
            case "Март":
            case "Апрель":
            case "Май":
                season = seasons[1];
                break;
            case "Июнь":
            case "Июль":
            case "Август":
                season = seasons[2];
                break;
            case "Сентябрь":
            case "Октябрь":
            case "Ноябрь":
                season = seasons[3];
                break;
            default:
                season = "Не знаю такого";
                break;
        }
        return season;
    }
}
