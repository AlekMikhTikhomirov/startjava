public class ConditionalStatement {
    public static void main(String[] args) {
        byte age = 37;
        if(age > 20) {
            System.out.println("Возраст больше 20");
        }
        boolean malegender;
        if(malegender = true) {
            System.out.println("Пол мужской");
        }
        if(malegender = !true) {
            System.out.println("Пол женский");
        }
        float heigth = 1.83f;
        if(heigth < 1.80) {
            System.out.println("Рост ниже 180 см");
        } else {
            System.out.println("Рост выше 179 см");
        }
        char namecapitalletter = 'A';
        if(namecapitalletter == 'M') {
            System.out.println("Первая буква имени М");
        } else if(namecapitalletter == 'I') {
            System.out.println("Первая буква имени I");
        } else {
            System.out.println("Первая буква имени не M и не I");
        }
    }
}