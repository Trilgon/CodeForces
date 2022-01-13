package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //t4A(in);   //1--OK
        //t71A(in);  //2--OK
        //t231A(in); //3--OK
        //t158A(in); //4--OK
        //t50A(in);  //5--OK
        //t59A(in);  //6--OK
        //t41A(in);  //7--OK
        //t112A(in); //8--OK
        //t281A(in); //9--OK
        //t734A(in);//10--OK
    }

    static void t4A(Scanner in) {
        //https://codeforces.com/problemset/problem/4/A --Арбузы
        int n = in.nextInt();
        if (n > 2 && n % 2 == 0) System.out.println("YES");
        else System.out.println("NO");
    }

    static void t71A(Scanner in) {
        //https://codeforces.com/problemset/problem/71/A --Длинные слова
        int n = in.nextInt();
        while (n > 0) {
            String s = in.next();
            if (s.length() < 11)
                System.out.println(s);
            else
                System.out.println("" + s.charAt(0) + (s.length() - 2) + s.charAt(s.length() - 1));
            n--;
        }
    }

    static void t231A(Scanner in) {
        //https://codeforces.com/problemset/problem/231/A --Подсчёт уверенных задач
        int n = in.nextInt();
        int x, y, z;
        int tasks = 0;
        for (int i = 0; i < n; i++) {
            x = in.nextInt();
            y = in.nextInt();
            z = in.nextInt();
            if (x + y + z > 1) {
                tasks++;
            }
        }
        System.out.println(tasks);
    }

    static void t158A(Scanner in) {
        //https://codeforces.com/problemset/problem/158/A --Следующий раунд
        int n = in.nextInt(); //кол-во участников
        int k = in.nextInt(); //место проходного участника
        int[] a = new int[n]; //массив баллов
        int targets = 0; //кол-во целевых цчастников
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
            if (a[i] != 0 && a[i] >= a[k - 1])
                targets++;
        }
        System.out.println(targets);
    }

    static void t50A(Scanner in) {
        //https://codeforces.com/problemset/problem/50/A --Доминошки
        System.out.println((in.nextInt() * in.nextInt()) / 2);
    }

    static void t59A(Scanner in) {
        //https://codeforces.com/problemset/problem/59/A --Регистр
        String str = in.next();
        if (str.chars().filter(c -> c < 97).count() * 2 > str.length())
            System.out.print(str.toUpperCase());
        else
            System.out.println(str.toLowerCase());
    }

    static void t41A(Scanner in) {
        //https://codeforces.com/problemset/problem/41/A --Перевод наоброт
        StringBuilder word = new StringBuilder(in.next());
        System.out.println(word.reverse().toString().equals(in.next()) ? "YES" : "NO");
    }

    static void t112A(Scanner in) {
        //https://codeforces.com/problemset/problem/112/A --Лексиграфическое сравнение
        int compResult = in.next().compareToIgnoreCase(in.next());
        System.out.print(Integer.compare(compResult, 0));
    }

    static void t281A(Scanner in) {
        //https://codeforces.com/problemset/problem/281/A --Капитализация
        String s = in.nextLine();
        System.out.println(s.substring(0, 1).toUpperCase() + s.substring(1));
    }

    static void t734A(Scanner in) {
        //https://codeforces.com/problemset/problem/734/A --Антон и Даник
        int n = in.nextInt();
        int a = in.next().replaceAll("D", "").length();
        System.out.print(a > n - a ? "Anton" : n - a > a ? "Danik" : "Friendship");
    }
}
