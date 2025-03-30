import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int fileCount = 0;
        while (true) {
            System.out.print("Введите путь к файлу: ");
            String path = scanner.nextLine();
            File file = new File(path);

            if (file.exists() && file.isFile()) {
                System.out.println("Путь указан верно");
                fileCount++;
                System.out.printf("Это файл номер %d%n", fileCount);
            } else {
                if (!file.exists()) {
                    System.out.println("Файл не существует.");
                } else if (file.isDirectory()) {
                    System.out.println("Указанный путь ведёт к папке, а не к файлу.");
                } else {
                    System.out.println("Указанный путь не является файлом.");
                }
            }
        }
    }
}