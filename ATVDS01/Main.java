import java.util.ArrayList;
import java.util.Scanner;

public class Main {
 public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Produto> products = new ArrayList<>();
    
    while (true) {
        System.out.println("Choose an option:");
        System.out.println("1-Create a product");
        System.out.println("2-Alter a product");
        System.out.println("3-Delete a product");
        System.out.println("4-List all products");
        System.out.println("5-Leave");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                    
                System.out.print("Enter product code: ");
                int code = scanner.nextInt();
                System.out.print("Enter product stock: ");
                int stock = scanner.nextInt();
                scanner.nextLine(); 
                System.out.print("Enter product type: ");
                String type = scanner.nextLine();
                System.out.print("Enter product name: ");
                String name = scanner.nextLine();
                System.out.print("Enter product price: ");
                double price = scanner.nextDouble();

                Produto newProduct = new Produto(code, stock, type, name, price);
                products.add(newProduct);
                System.out.println("Product created successfully!");
                break;


            case 2:
                
                System.out.print("Enter the code of the product to alter: ");
                int codeToAlter = scanner.nextInt();
                scanner.nextLine();

                Produto productToAlter = null;
                for (Produto p : products) {
                    if (p.getCode() == codeToAlter) {
                        productToAlter = p;
                        break;
                    }
                }

                if (productToAlter != null) {
                    System.out.println("Product found. Enter new details:");
                    System.out.print("Enter new stock: ");
                    productToAlter.setStock(scanner.nextInt());
                    scanner.nextLine();
                    System.out.print("Enter new type: ");
                    productToAlter.setType(scanner.nextLine());
                    System.out.print("Enter new name: ");
                    productToAlter.setName(scanner.nextLine());
                    System.out.print("Enter new price: ");
                    productToAlter.setPrice(scanner.nextDouble());
                    System.out.println("Product updated successfully!");
                } else {
                    System.out.println("Product not found!");
                }
                break;


            case 3:
                System.out.print("Enter the code of the product to delete: ");
                int codeToDelete = scanner.nextInt();

                Produto productToDelete = null;
                for (Produto p : products) {
                    if (p.getCode() == codeToDelete) {
                        productToDelete = p;
                        break;
                    }
                }

                if (productToDelete != null) {
                    products.remove(productToDelete);
                    System.out.println("Product deleted successfully!");
                } else {
                    System.out.println("Product not found!");
                }
                break;


            case 4:

                if (products.isEmpty()) {
                    System.out.println("No products available.");
                } else {
                    System.out.println("List of all products:");
                    for (Produto p : products) {
                        System.out.println(p);
                    }
                }
                break;

            
            case 5:
                System.out.println("Goodbye!");
                scanner.close();
                return;
        
            default:
                System.out.println("Invalid option! Please choose again.");
                break;
         }
        }  
    }
}