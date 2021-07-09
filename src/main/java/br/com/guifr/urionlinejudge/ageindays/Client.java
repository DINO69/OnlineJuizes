package br.com.guifr.urionlinejudge.ageindays;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AgeInDays ageInDays =
                new AgeInDays(365, "ano", "(s)",
                    new AgeInDays(30, "mes", "(es)",
                        new AgeInDays(1, "dia", "(s)", null)));

        System.out.println(ageInDays.execute(scanner.nextInt()));

    }

    public static class AgeInDays {

        private int days;
        private String age;
        private String plural;
        private AgeInDays next;

        public AgeInDays(int days, String age, String plural, AgeInDays next) {
            this.days = days;
            this.age = age;
            this.plural = plural;
            this.next = next;
        }

        public String execute(int allDays) {
            int ageIndays = allDays / days;
            int remaining = allDays % days;
            String executeReturn = ageIndays + " " + age + plural;
            return executeReturn + (next != null ? "\n" + next.execute(remaining) : "");
        }

    }

}
