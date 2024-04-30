import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        runMenu();
    }

    public static void runMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display menu options
            System.out.println("Please choose an option: ");
            System.out.println("1. Insert data");
            System.out.println("2. Retrieve data");
            System.out.println("3. Update data");
            System.out.println("4. Delete data");
            System.out.println("0. Exit");

            // Get user input
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Call method to insert data
                    insertMenu();
                    break;
                case 2:
                    // Call method to retrieve data
                    retrieveMenu();
                    break;
                case 3:
                    // Call method to update data
                    updateMenu();
                    break;
                case 4:
                    // Call method to delete data
                    deleteMenu();
                    break;
                case 0:
                    // Exit the program
                    System.out.println("Exiting...");
                    break;
                default:
                    // Display error message for invalid input
                    System.out.println("Invalid choice. Please enter a number between 0 and 4.");
                    break;
            }
        } while (choice != 0);

        // Close the scanner
        scanner.close();
    }

    // Define methods for performing database operations
    private static void insertMenu() {
        // Implement insertion logic here
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display menu options
            System.out.println("Please choose an option: ");
            System.out.println("1. Insert a new Category");
            System.out.println("2. Insert a new Product");
            System.out.println("3. Insert a new Material");
            System.out.println("4. Insert a new Sale");
            System.out.println("5. Insert a new Recipe");


            System.out.println("0. Go back");

            // Get user input
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            // Perform action based on user input
            switch (choice) {
                case 1:
                    // Call method to insert data
                    Insert.insertData();
                    break;
                case 2:
                    // Call method to retrieve data
                    Insert.insertData();
                    break;
                case 3:
                    // Call method to update data
                    Insert.insertData();
                    break;
                case 4:
                    // Call method to delete data
                    Insert.insertData();
                    break;
                case 5:
                    // Call method to delete data
                    Insert.insertData();
                    break;
                case 0:
                    runMenu();
                    System.out.println("Going back...");
                    break;
                default:
                    // Display error message for invalid input
                    System.out.println("Invalid choice. Please enter a number between 0 and 5.");
                    break;
            }
        } while (choice != 0);
    }

    private static void retrieveMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display menu options
            System.out.println("Please choose an option: ");
            System.out.println("1. Retrieve all Categories");
            System.out.println("2. Retrieve all Products");
            System.out.println("3. Retrieve all Materials");
            System.out.println("4. Retrieve Sales Report");
            System.out.println("5. Retrieve a Recipe");


            System.out.println("0. Go back");

            // Get user input
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            // Perform action based on user input
            switch (choice) {
                case 1:
                    // Call method to insert data
                    Retrieve.retrieveData(DBconnector.getUrl(),"Category");
                    break;
                case 2:
                    // Call method to retrieve data
                    Retrieve.retrieveData();
                    break;
                case 3:
                    // Call method to update data
                    Retrieve.retrieveData();
                    break;
                case 4:
                    // Call method to delete data
                    Retrieve.retrieveData();
                    break;
                case 5:
                    // Call method to delete data
                        Insert.insertData();
                    break;
                case 0:
                    runMenu();
                    System.out.println("Going back...");
                    break;
                default:
                    // Display error message for invalid input
                    System.out.println("Invalid choice. Please enter a number between 0 and 5.");
                    break;
            }
        } while (choice != 0);

    }

    private static void updateMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display menu options
            System.out.println("Please choose an option: ");
            System.out.println("1. Update Category");
            System.out.println("2. Update Products");
            System.out.println("3. Update Materials");
            System.out.println("4. Update Sales");
            System.out.println("5. Update Recipe");


            System.out.println("0. Go back");

            // Get user input
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            // Perform action based on user input
            switch (choice) {
                case 1:
                    // Call method to insert data
                    Update.updateData();
                    break;
                case 2:
                    // Call method to retrieve data
                    Update.updateData();
                    break;
                case 3:
                    // Call method to update data
                    Update.updateData();
                    break;
                case 4:
                    // Call method to delete data
                    Update.updateData();
                    break;
                case 5:
                    // Call method to delete data
                    Update.updateData();
                    break;
                case 0:
                    runMenu();
                    System.out.println("Going back...");
                    break;
                default:
                    // Display error message for invalid input
                    System.out.println("Invalid choice. Please enter a number between 0 and 5.");
                    break;
            }
        } while (choice != 0);

    }

    private static void deleteMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Display menu options
            System.out.println("Please choose an option: ");
            System.out.println("1. Delete a  Category");
            System.out.println("2. Delete a Products");
            System.out.println("3. Delete a Materials");
            System.out.println("4. Delete a Sales");
            System.out.println("5. Delete a Recipe");


            System.out.println("0. Go back");

            // Get user input
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            // Perform action based on user input
            switch (choice) {
                case 1:
                    // Call method to insert data
                    Delete.deleteData();
                    break;
                case 2:
                    // Call method to retrieve data
                    Delete.deleteData();
                    break;
                case 3:
                    // Call method to update data
                    Delete.deleteData();
                    break;
                case 4:
                    // Call method to delete data
                    Delete.deleteData();
                    break;
                case 5:
                    // Call method to delete data
                    Delete.deleteData();
                    break;
                case 0:
                    runMenu();
                    System.out.println("Going back...");
                    break;
                default:
                    // Display error message for invalid input
                    System.out.println("Invalid choice. Please enter a number between 0 and 5.");
                    break;
            }
        } while (choice != 0);

    }



}