

public class Main {
    public static void main(String[] args) {
        Generate s = new Generate();
        StringCounter m = new StringCounter();
        s.genString();
        String c = s.genString();
        System.out.println("Строка до сортировки: " + c);
        System.out.println("Результат работы:");
        m.countSymbol(c);

    }
}