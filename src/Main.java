public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    // С помощью цикла while посчитайте, сколько месяцев потребуется, чтобы накопить 2 459 000 рублей
// при условии, что первоначально мы имеем 0 рублей и готовы откладывать по 15 тысяч рублей.
    public static void task1() {
        System.out.println("Задача 1");
        int deposit = 15000;
        int total = 0;
        int month = 0;
        while (total < 2_459_000) {
            total = total + deposit;
            month++;
            System.out.println("Месяц " + month + " сумма накоплений " + total + " рублей");
        }
    }

    // Выведите в одну строку через пробел числа от 1 до 10 с помощью цикла while.
    // На следующей строке выведите числа в обратном порядке от 10 до 1 с помощью цикла for.
    public static void task2() {
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        for (i--; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }

    // В стране Y население равно 12 миллионов человек.
// Рождаемость составляет 17 человек на 1000, смертность — 8 человек.
// Рассчитайте, какая численность населения будет через 10 лет, если показатели рождаемости и смертности постоянны.
    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int increase = (population / 1000 * 9);
        int time = 0;
        while (time < 10) {
            time++;
            population += population / 1000 * 9;
            System.out.println("Год " + time + " численность населения составляет " + population);
        }
    }

    // Василий решил положить деньги на накопительный счет, где каждый месяц к сумме его вклада добавляется еще 7%.
    // Первоначальная сумма вклада — 15 тысяч рублей.
    // Вычислите и выведите в консоль, сколько месяцев Василию нужно будет копить, чтобы собрать сумму в 12 млн руб
    // при условии, что процент банка от накоплений не меняется, а всегда равен 7%.
    // Выведите в консоль результат программы с указанием суммы накоплений по каждому месяцу.
    public static void task4() {
        System.out.println("Задача 4");
        int deposit = 15000;
        int time = 0;
        while (deposit <= 12_000_000) {
            deposit = (int) (deposit * 1.07);
            time++;
            System.out.println("Месяц " + time + " сумма накоплений " + deposit + " рублей ");
        }
    }

    //* Видоизмените программу таким образом, чтобы в консоль выводились не все месяцы подряд, а только каждый шестой.
// Должны быть видны накопления за 6, 12, 18, 24-й и следующие месяцы.
    public static void task5() {
        System.out.println("Задача 5");
        int deposit = 15000;
        int time = 0;
        while (deposit <= 12_000_000) {
            deposit = (int) (deposit * 1.07);
            time++;
            if (time % 6 == 0)
                System.out.println("Месяц " + time + " сумма накоплений " + deposit + " рублей ");
        }
    }

        // Василий решил, что будет копить деньги ближайшие 9 лет.
        // Он хочет знать, какой будет сумма его накоплений каждые полгода на протяжении этих 9 лет.
        // Исходная сумма всё та же — 15 тысяч рублей, проценты банка – 7% ежемесячно.
        // Напишите программу, которая будет выводить сумму накоплений за каждые полгода в течение 9 лет.
        public static void task6 () {
            System.out.println("Задача 6");
            int deposit = 15000;
            int time = 0;
            while (time < 9 * 12) {
                deposit = (int) (deposit * 1.07);
                time++;
                if (time % 6 == 0)
                System.out.println("Месяц " + time + " сумма накоплений " + deposit + " рублей ");
            }
        }

        // В компании пятница — отчетный день.
        // Нужно написать программу, которая считает дни месяца по датам,
        // определяет, какой день пятница, и выводит сообщение с напоминанием, что нужно подготовить еженедельный отчет.
        //Создайте переменную типа int, которая хранит в себе номер первой пятницы месяца (число от 1 до 7).
        //Выведите на каждую пятницу месяца (включая полученную) сообщение следующего вида:
        // «Сегодня пятница, ...-е число. Необходимо подготовить отчет».
        //В нашем месяце 31 день. В результате у вас должно получиться от 4 до 5 сообщений с напоминаниями по разным датам.
        public static void task7 () {
            System.out.println("Задача 7");
            int friday = 2;
            for (; 1 <= friday && friday <= 31; friday = friday + 7) {
                System.out.println("Сегодня пятница " + friday + "-е число. Необходимо подготовить отчет");
            }
        }

        // Нам нужно написать астрономическое приложение, которое считает, когда над Землей пролетает комета.
        // Известно, что комета пролетает каждый 79-й год, начиная с нулевого.
        // В консоль нужно вывести все годы за последние 200 лет,
        // когда появлялась комета, а также следующий год ее появления (ближайшие 100 лет).
        // Для вычисления периода можно создать две дополнительные переменные,
        // которые содержат год за 200 лет до текущего (из созданной ранее переменной) в качестве старта
        // и 100 лет после в качестве завершения периода расчета.
        // В результате решения задачи в консоли должен получиться следующий результат: 1896, 1975, 2054
        public static void task8 () {
            System.out.println("Задача 8");
            int year = 2022;
            int previous = year - 200;
            int next = year + 100;

            for (int cometYear = previous; cometYear < next; cometYear++) {
                if (cometYear % 79 == 0) {
                    System.out.println(cometYear);
                }

            }
        }
    }







