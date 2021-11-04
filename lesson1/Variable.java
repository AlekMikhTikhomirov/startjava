public class Variable {
    public static void main(String[] args) {
        byte cores = 2;
        short PZU = 320;
        int OZU = 6000;
        long rate = 2300000000L;
        float exprate = 2.3E+9f;
        double Avogadro = 6.022E+23d;
        System.out.println("Количество ядер процессора:" + " " + cores);
        System.out.println("Ёмкость ПЗУ в гигабайтах:" + " " + PZU);
        System.out.println("Ёмкоcть ОЗУ в мегабайтах:" + " " + OZU);
        System.out.println("Тактовая частота процессора в герцах:" + " " + rate);
        System.out.println("Она же в экспоненциальном виде:" + " " + exprate);
        System.out.println("А это просто число Авогадро:" + " " + Avogadro);
    }
}