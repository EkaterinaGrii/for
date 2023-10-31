public class For {
    public static void main(String[] args) {
       task10();
    }

//    Задача1 Вывести числа от 1 до 10
    public static void task1(){
        for(int i=1;i<=10;i++) {
            System.out.printf("%d ",i);
        }
    }


    //    Задача2 Вывести от 10 до 1
    public static void task2() {
        for(int i=10;i>=1;i--){
            System.out.printf("%d ", i);
        }
    }


//    Задача3 Вывести четные от 0 до 17
      public static void task3() {
        for(int i=0;i<=17;i=i+2) {
            System.out.printf("%d ",i);
        }
      }


//      Задача4 Вывести от 10 до -10
public static void task4(){
        for(int i=10;i>=-10;i--) {
            System.out.printf("%d ",i);
        }
}


//      Задача5 високосные года с 1904 по 2096
public static void task5() {
        for(int i=1904;i<=2096;i=i+4) {
            System.out.printf("%d год является високосным\n",i);
        }
}


//Задача6 от 7 до 98 шаг 7
public static void task6() {
        for(int i=7;i<=98;i=i+7) {
            System.out.printf("%d ",i);
        }
}


//Задача7 от 1 до 512
public static void task7() {
        for(int i=1;i<=512;i=i*2) {
            System.out.printf("%d ",i);
        }
}


//Задача8 Годовые накопления 29 000
public static void task8() {
       int moneyInJar= 29000;
       int total=0;
       for(int i=1;i<=12;i++) {
         total=total+moneyInJar;
           System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n",i,total);
       }
}


//Задача9 в банк под 12% годовых
public static void task9() {
        int moneyInBank= 29000;
        int total=0;
        for(int i=1;i<=12;i++) {
            total+=total/100;
            total+=moneyInBank;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n",i,total);
    }
}

//Задача10 Вывести таблицу умножения на 2
public static void task10() {
    for (int i = 1; i <= 10; i++) {
        System.out.printf("2 * %d = %d\n", i, 2 * i);
    }
}
}

