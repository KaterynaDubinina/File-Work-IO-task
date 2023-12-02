package app;

import app.readService.FileReadService;
import app.writeService.FileWriteService;

import java.util.Scanner;

public class Main {

    static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.print("\n\uD83D\uDDA5\uFE0F   Введи своє ім'я: ");
        String userName = scanner.nextLine();
        System.out.printf("""
                               
                             \uD83D\uDC9B Слава Україні \uD83D\uDC99
                %s, вітаю у застосунку для запису і читання файлів!
                
                """, userName);
        String option;
        boolean exitRequested = false;
        do {
            option = getOption();
            switch (option) {
                case "1" -> {
                    System.out.print("\uD83D\uDDA5\uFE0F   Введи текст: ");
                    String content = scanner.nextLine();
                    System.out.print("\uD83D\uDDA5\uFE0F   Введи назву .txt файлу: ");
                    String fileName = scanner.nextLine();
                    getOutput(handleDataRead(content, fileName));
                    exitRequested = true;
                }
                case "2" -> {
                    System.out.print("\uD83D\uDDA5\uFE0F   Введи назву .txt файлу: ");
                    String file = scanner.nextLine();
                    getOutput(handleDataWrite(file));
                    exitRequested = true;
                }
                default -> System.out.println("\uD83D\uDC7F   Не ламай мені прогу" +
                        "\n\n\uD83D\uDE42   Гаразд, ще одна спроба");
            }
        } while (!exitRequested);
    }

    private static String getOption() {
        System.out.print("""
          \uD83D\uDDA5\uFE0F   Тисни:
          1\uFE0F\u20E3   Щоб створити і записати \uD83D\uDCE8
          2\uFE0F\u20E3   Щоб читати \uD83D\uDCE9
           """);
        return scanner.nextLine().trim();
    }

    private static String handleDataRead(String content, String fileName) {
        return new FileReadService().handleFile(content, fileName);
    }

    private static String handleDataWrite(String file) {
        return new FileWriteService().readFile(file);
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
