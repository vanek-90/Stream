import java.util.Random;

public class Generate {
    private int length = 65;

    public String genString() {
        Random r = new Random();
    /* Берем из таблицы  ASCII кодов цифры и строчные английские буквы. Это диапазон от 48-го до 122-го символа.
    И фильтруем ненужные символы от 58 до 65, а также от 91 до 96. Также для удобства исключил заглавные буквы
    и русский алфавит.
     */
        String s = r.ints(48, 122)
                .filter(i -> (i < 58 || i > 96))
                .mapToObj(i -> (char) i)
                .limit(length)
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
        return s;
    }
}
