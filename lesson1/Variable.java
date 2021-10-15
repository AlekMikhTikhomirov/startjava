public class Variable {
    public static void main (String[] args) {
        byte a=2;
        short b=320;
        int c=6000;
        long d=2300000000L;
        float e=2.3E+9f;
        double f=6.022E+23d;
        System.out.println("Количество ядер процессора:"+" "+ a);
        System.out.println("Ёмкость ПЗУ в гигабайтах:"+" "+ b);
        System.out.println("Ёмкоcть ОЗУ в мегабайтах:"+" "+ c);
        System.out.println("Тактовая частота процессора в герцах:"+" "+ d);
        System.out.println("Она же в экспоненциальном виде:"+" "+ e);
        System.out.println("А это просто число Авогадро:"+" "+ f);
    }
}