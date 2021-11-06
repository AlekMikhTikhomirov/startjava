public class Variable {
    public static void main(String[] args) {
        byte cores = 2;
        short hdd = 320;
        int systemMemory = 6000;
        long rate = 2300000000L;
        float rateExponential = 2.3E+9f;
        double avogadro = 6.022E+23d;
        char intel = 'i';
        boolean windows10 = true;
        System.out.println("Количество ядер процессора:" + " " + cores);
        System.out.println("Ёмкость ПЗУ в гигабайтах:" + " " + hdd);
        System.out.println("Ёмкоcть ОЗУ в мегабайтах:" + " " + systemMemory);
        System.out.println("Тактовая частота процессора в герцах:" + " " + rate);
        System.out.println("Она же в экспоненциальном виде:" + " " + rateExponential);
        System.out.println("А это просто число Авогадро:" + " " + avogadro);
        System.out.println("Символ в наименовании процессоров Intel:" + intel);
        System.out.println("Операционная система Windows:" + windows10);
    }
}