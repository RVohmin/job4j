package ru.job4j.inheritance;

public class ReportUsage {
    public static void main(String[] args) {
        JSONReport report1 = new JSONReport();
        String text = report1.generate("Report's name", "Report's body");
        System.out.println(text);
    }
}
