import java.util.*;
import java.io.*;

public class todoApp {
    static final String DO_IT = "todo.txt";


    public static void main(String[] args) throws IOException {
        
        Scanner scanner = new Scanner(System.in);

        while ( true ) {
            System.out.println("\nTo-Do List App");
            System.out.println("1. View Todo: ");
            System.out.println("2. Add: ");
            System.out.println("3. Edit: ");
            System.out.println("4. Delete: ");
            System.out.println("5. Exit: ");
            System.out.println(" Choice: (1-5)");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    viewTodo();
                    break;
                case "2":
                    addTodo(scanner);
                    break;
                case "3":
                    editTodo(scanner);
                    break;
                case "4":
                    deleteTodo(scanner);
                    break;
                case "5":
                    System.exit(0);

            
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        }

    }

    static void viewTodo() throws IOException {
        List<String> list = bacaFile();
        if (list.isEmpty()) {
            System.out.println("Empty list.");
        } else {
            for ( int i = 0; i < list.size(); i++) {
                System.out.println((i + 1 ) + ". " + list.get(i));
            }
        }
    }

    static void addTodo(Scanner scanner) throws IOException {
        System.out.println("Write new task: ");
        String task = scanner.nextLine();
        FileWriter fw = new FileWriter(DO_IT, true);
        fw.write(task + "\n");
        fw.close();
        System.out.println("Task added. ");
    }

    static void deleteTodo(Scanner scanner) throws IOException {
        List<String> list = bacaFile();
        viewTodo();
        System.out.println("Number to be deleted: ");

        int index = Integer.parseInt(scanner.nextLine()) -1;
        if ( index >= 0 && index < list.size()) {
            list.remove(index);
            simpanFile(list);
            System.out.println("Task deleted.");
        } else {
            System.out.println("Invalid number. ");
        }
    }

    static void editTodo (Scanner scanner) throws IOException {
        List<String> list = bacaFile();
        viewTodo();
        System.out.println("Number to be deleted: ");

        int index = Integer.parseInt(scanner.nextLine()) -1;
        if ( index >= 0 && index < list.size()) {
            System.out.println("New task: ");
            String baru = scanner.nextLine();
            list.set(index, baru);
            System.out.println("Task updated. ");
        } else {
            System.out.println("Invalid number. ");
        }
    }

    static List<String> bacaFile() throws IOException {
        List<String> list = new ArrayList<> ();
        File file = new File(DO_IT);
        if ( file.exists()) {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String baris;
            while ((baris = br.readLine()) != null) {
                list.add(baris);
            }
            br.close();
        }
        return list;
    }

    static void simpanFile (List<String> list) throws IOException {
        FileWriter fw = new FileWriter(DO_IT);
        for ( String item : list) {
            fw.write(item + "\n");
        }
        fw.close();
    }

}
