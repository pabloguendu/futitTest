import documents.HumanResource.CV;
import documents.HumanResource.Contract;
import documents.Invoice;
import documents.Order;
import documents.UrgentOrder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Invoice invoice=new Invoice();
        Order order=new Order();
        System.out.println(invoice);
        System.out.println(order);
        System.out.println("type Document:");
        Scanner sc = new Scanner(System.in);
        String typeDocument = sc.nextLine();
        switch (typeDocument) {
            case "Order":
                System.out.println(new Order());
            case "Invoice":
                System.out.println(new Invoice());
                break;
            case "UrgentOrder":
                System.out.println(new UrgentOrder());
                break;
            case "Contract":
                System.out.println(new Contract());
                break;
            case "Cv":
                System.out.println(new CV());
                break;
        }
    }
}