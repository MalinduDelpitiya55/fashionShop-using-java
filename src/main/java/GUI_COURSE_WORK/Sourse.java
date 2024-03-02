/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI_COURSE_WORK;

/**
 *
 * @author pc
 */
import java.util.*;
import java.util.Scanner;
public class Sourse {


    public static Scanner input = new Scanner(System.in);
    public static final String[] size = {"XS", "S", "M", "L", "XL", "XXL"};
    public static final int[] price = {600, 800, 900, 1000, 1100, 1200};
    public static final String[] status = {"Processing", "Delivering", "Delivered"};
    public static String odr = "";
    public static int order = 0;
    static ArrayList<CustomerDetails> CustomerList = new ArrayList<>();

    public static void placeOrder() {
        System.out.println("\t\t _____  _                        ____          _                 ");
        System.out.println("\t\t|  __ \\| |                      / __ \\        | |                                  ");
        System.out.println("\t\t| |__) | | __ _  ____ ____     | |  | |_ __ __| | ____ _ __                     ");
        System.out.println("\t\t|  ___/| |/ _' |/ __/  _  \\    | |  | | '__/ _' |/  _ \\ '__|                    ");
        System.out.println("\t\t| |    | | (_| | (_|    __/    | |__| | | | (_| |   __/ |                     ");
        System.out.println("\t\t|_|    |_|\\__,_|\\___\\_____|     \\____/|_|  \\__,_|\\____|_|                       \n");
        System.out.println("\t\t_________________________________________________________________\n");
        while (true) {
            String generativeId = generateOrderId();
            System.out.println("\n\n\t\tEnter Order ID : " + generativeId);
            String phoneNum;
            while (true) {
                System.out.print("\t\tEnter Customer Phone Number : ");
                phoneNum = input.next();
                input.nextLine();
                if (phoneNum.charAt(0) != '0' || phoneNum.length() != 10) {
                    System.out.print("\t\tDo you want to enter phone number again? (y/n) :");
                    char try1 = input.next().charAt(0);
                    if (try1 == 'y' || try1 == 'Y') {
                        clearLines(2);
                        continue;
                    } else {
                        order = order - 1;
                        Menu();
                        break;
                    }

                } else {
                    break;
                }
            }
            System.out.print("\n\t\tEnter T-Shirt  Size (XS,S,M,L,XL,XXL) : ");
            String size1 = input.next();

            System.out.print("\n\t\tEnter QTY : ");
            int qty = input.nextInt();
            System.out.println("");
            double amount = 0;
            switch (size1.toLowerCase()) {
                case "xs":
                    amount = (600 * qty);
                    System.out.println("\t\tAmount : " + String.format("%.2f", amount));
                    System.out.println("");
                    System.out.println("");

                    break;

                case "s":

                    amount = (800 * qty);
                    System.out.println("\t\tAmount : " + String.format("%.2f", amount));
                    System.out.println("");
                    System.out.println("");
                    break;
                case "m":
                    amount = (900 * qty);
                    System.out.println("\t\tAmount : " + String.format("%.2f", amount));
                    System.out.println("");
                    System.out.println("");
                    break;
                case "l":
                    amount = (1000 * qty);
                    System.out.println("\t\tAmount : " + String.format("%.2f", amount));
                    System.out.println("");
                    System.out.println("");
                    break;
                case "xl":
                    amount = (1100 * qty);
                    System.out.println("\t\tAmount : " + String.format("%.2f", amount));
                    System.out.println("");
                    System.out.println("");
                    break;
                case "xxl":
                    amount = (1200 * qty);
                    System.out.println("\t\tAmount : " + String.format("%.2f", amount));
                    System.out.println("");
                    System.out.println("");
                    break;
                default:
                    System.out.println("invalid inpit..!");
            }
            System.out.print("\t\tDo you want place this order? (y/n) : ");
            char place = input.next().charAt(0);
            if (place == 'y' || place == 'Y') {
                CustomerList.add(new CustomerDetails(generativeId, phoneNum, amount, qty, size1, status[0]));
                System.out.println("\t\t\tOrder placed ");
            } else {
                order = order - 1;
                System.out.println("\t\t\tOrder NOT placed ");
            }
            System.out.print("\n\t\tDo you want to place anothe order? (y/n) : ");
            char newOrder = input.next().charAt(0);
            if (newOrder == 'y' || newOrder == 'Y') {
                clearLines(14);
            } else {
                Menu();
                break;
            }
        }
    }
    public static void searchCustomer() {
        System.out.println("\t\t   _____                     _           ____           _   ");
        System.out.println("\t\t  / ____|                   | |         / ___|         | |   ");
        System.out.println("\t\t | (___   ___  __ _ _ __ ___| |_       | |    _   _ ___| |_ ___  _ __ __    ___ _ __");
        System.out.println("\t\t  \\___ \\ / _ \\/ _' | '__/ __| '_ \\     | |   | | | /  _| __/ _ \\| '_ ' _ \\ / _ \\ '__|");
        System.out.println("\t\t  ____) |  __/ (_| | | | (__| | | |    | |___| |_| \\__ \\ || (_) | | | | | |  __/ |        ");
        System.out.println("\t\t |_____/ \\___|\\__,_|_|  \\___|_| |_|     \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_| ");
        System.out.println("\t\t_____________________________________________________________________________________________");

        while (true) {
            System.out.print("\n\n\t\tEnter Customer Phone Number : ");
            String phoneNum = input.next();
            if (phoneNum.charAt(0) != '0' || phoneNum.length() != 10) {
                System.out.println("\t\t\t\tInvalid input..!");
                System.out.print("\n\t\tDo you want to search another customer report? (y/n) : ");
                char try1 = input.next().charAt(0);
                if (try1 == 'y' || try1 == 'Y') {
                    clearLines(4);
                    continue;
                } else {
                    clearLines(3);
                    break;
                }
            } else {
                int qxs = 0, qs = 0, qm = 0, ql = 0, qxl = 0, qxxl = 0;
                Iterator<CustomerDetails> customers = CustomerList.iterator();
                while (customers.hasNext()) {
                    CustomerDetails customer = customers.next();
                    if (customer.getCusID().equalsIgnoreCase(phoneNum)) {
                        switch (customer.getSize().toLowerCase()) {
                            case "xs":
                                qxs += customer.getQTY();
                                break;
                            case "s":
                                qs += customer.getQTY();
                                break;
                            case "m":
                                qm += customer.getQTY();
                                break;
                            case "l":
                                ql += customer.getQTY();
                                break;
                            case "xl":
                                qxl += customer.getQTY();
                                break;
                            case "xxl":
                                qxxl += customer.getQTY();
                                break;
                        }
                    }
                }
                String[] CountSizelist = new String[size.length];

                for (int i = 0; i < size.length; i++) {
                    CountSizelist[i] = size[i];
                }

                int[] countedSize = {qxs, qs, qm, ql, qxl, qxxl};
                double[] counteAmount = new double[countedSize.length];

                for (int i = 0; i < countedSize.length; i++) {
                    counteAmount[i] = countedSize[i] * price[i];
                }

                double amount = 0;
                for (double value : counteAmount) {
                    amount += value;
                }

                for (int i = 0; i < countedSize.length; i++) {
                    for (int j = i; j < countedSize.length; j++) {
                        if (countedSize[i] < countedSize[j]) {
                            int tempvalue = countedSize[i];
                            countedSize[i] = countedSize[j];
                            countedSize[j] = tempvalue;

                            String tempvalue1 = CountSizelist[i];
                            CountSizelist[i] = CountSizelist[j];
                            CountSizelist[j] = tempvalue1;

                            double tempvalue3 = counteAmount[i];
                            counteAmount[i] = counteAmount[j];
                            counteAmount[j] = tempvalue3;
                        }

                    }

                }

                System.out.printf("\t\t+%-7s+%-6s+%-15s+\n", "-------", "------", "---------------");
                System.out.printf("\t\t|%-7s|%-6s|%-15s|\n", " size", "  QTY", "      Total");
                System.out.printf("\t\t+%-7s+%-6s+%-15s+\n", "-------", "------", "---------------");

                for (int i = 0; i < CountSizelist.length; i++) {
                    System.out.printf("\t\t|  %-5s|  %-4d|%13.2f  |\n", CountSizelist[i], countedSize[i], counteAmount[i]);
                }

                System.out.printf("\t\t+%-7s+%-6s+%-15s+\n", "-------", "------", "---------------");
                System.out.printf("\t\t| %-10s |%13.2f  |\n", "Total Amount", amount);
                System.out.printf("\t\t+%-7s+%-6s+%-15s+\n", "-------", "------", "---------------");

                System.out.print("\n\t\tDo you want to search anothe customer report? (y/n) : ");
                char newOrder = input.next().charAt(0);

                if (newOrder == 'y' || newOrder == 'Y') {
                    clearLines(13);

                } else {
                    Menu();
                    break;
                }
            }
        }
    }

    public static void searchOrder() {

        System.out.println("\t\t  _____                     _          ____          _                          ");
        System.out.println("\t\t  / ____|                   | |        / __ \\        | |                         ");
        System.out.println("\t\t | (___   ___  __ _ _ __ ___| |_      | |  | |_ __ __| | ____ _ __               ");
        System.out.println("\t\t  \\___ \\ / _ \\/ _' | '__/ __| '_ \\    | |  | | '__/ _' |/  _ \\ '__|              ");
        System.out.println("\t\t  ____) |  __/ (_| | | | (__| | | |   | |__| | | | (_| |   __/ |                 ");
        System.out.println("\t\t |_____/ \\___|\\__,_|_|  \\___|_| |_|    \\____/|_|  \\__,_|\\____|_|                 ");
        System.out.println("\t\t__________________________________________________________________    ");

        System.out.println();

        while (true) {
            System.out.print("\t\tEnter order ID : ");
            String searchId = input.next();
            printOrderDetails(searchId);
            System.out.print("\t\tDo you want another Order? (y/n)  : ");
            char op = input.next().charAt(0);

            if (op == 'y' || op == 'Y') {
                clearLines(14);
                continue;
            } else {
                break;
            }
        }

    }

    public static int viewReports() {

        System.out.println("\t\t   _____                        _          ");
        System.out.println("\t\t  |  __ \\                      | |         ");
        System.out.println("\t\t  | |__) |___  _ __   ___  _ __| |_ ___    ");
        System.out.println("\t\t  |  _  // _  \\ '_ \\ / _ \\| '__|  _/ __|   ");
        System.out.println("\t\t  | | \\ \\   __/ |_) | (_) | |  | |_\\__ \\   ");
        System.out.println("\t\t  |_|  \\_\\____| .__/ \\___/|_|   \\__|___/   ");
        System.out.println("\t\t              | |                          ");
        System.out.println("\t\t              |_|                          ");
        System.out.println("\n\t\t-----------------------------------------------\n\n");

        System.out.printf("\n\t\t[1] Customer Reports \n\t\t[2] Item Reports \n\t\t[3] Order Reports \n\n\tEnter option : ");

        int option = input.nextInt();

        return option;

    }

    public static int customerReports() {

        System.out.println("\t\t      ____           _                                  _____                        _        ");
        System.out.println("\t\t     / ___|         | |                                |  __ \\                      | |      ");
        System.out.println("\t\t    | |    _   _ ___| |_ ___  _ __ __    ___ _ __      | |__) |___  _ __   ___  _ __| |_ ___   ");
        System.out.println("\t\t    | |   | | | /  _| __/ _ \\| '_ ' _ \\ / _ \\ '__|     |  _  // _  \\ '_ \\ / _ \\| '__|  _/ __| ");
        System.out.println("\t\t    | |___| |_| \\__ \\ || (_) | | | | | |  __/ |        | | \\ \\   __/ |_) | (_) | |  | |_\\__ \\      ");
        System.out.println("\t\t     \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|        |_|  \\_\\____| .__/ \\___/|_|   \\__|___/     ");
        System.out.println("\t\t                                                                   | |                          ");
        System.out.println("\t\t                                                                   |_|                          \n");

        System.out.printf("\n\t\t[1] Best in Customer  \n\t\t[2] View Customer  \n\t\t[3] All Customer Report \n\n\tEnter option : ");
        int option = input.nextInt();
        return option;
    }

    public static int itemReports() {

        System.out.println("\t\t    _____ _                      _____                        _       ");
        System.out.println("\t\t   |_   _| |                    |  __ \\                      | |   ");
        System.out.println("\t\t     | | | |_ ____ _ _ ___      | |__) |___  _ __   ___  _ __| |_ ___ ");
        System.out.println("\t\t     | | | __/ _  \\ '_`  _ \\    |  _  // _  \\ '_ \\ / _ \\| '__|  _/ __| ");
        System.out.println("\t\t    _| |_| ||  ___/ | | | | |   | | \\ \\   __/ |_) | (_) | |  | |_\\__ \\ ");
        System.out.println("\t\t   |_____|\\__\\____|_| |_| |_|   |_|  \\_\\____| .__/ \\___/|_|   \\__|___/");
        System.out.println("\t\t                                            | |    ");
        System.out.println("\t\t                                            |_|");
        System.out.println("_______________________________________________________________________________");

        System.out.printf("\n\n\t\t[1]  Best Selling Categories Sorted by QTY \n\t\t[2] Best selling Categories sorted by Amount \n\n\tEnter option : ");
        int option = input.nextInt();
        return option;
    }

    public static int orderReports() {

        System.out.println("\t\t     ____          _                _____                        _       ");
        System.out.println("\t\t    / __ \\        | |              |  __ \\                      | |   ");
        System.out.println("\t\t   | |  | |_ __ __| | ____ _ __    | |__) |___  _ __   ___  _ __| |_ ___ ");
        System.out.println("\t\t   | |  | | '__/ _' |/  _ \\ '__|   |  _  // _  \\ '_ \\ / _ \\| '__|  _/ __| ");
        System.out.println("\t\t   | |__| | | | (_| |   __/ |      | | \\ \\   __/ |_) | (_) | |  | |_\\__ \\ ");
        System.out.println("\t\t    \\____/|_|  \\__,_|\\____|_|      |_|  \\_\\____| .__/ \\___/|_|   \\__|___/");
        System.out.println("\t\t                                               | |    ");
        System.out.println("\t\t                                               |_|");
        
        System.out.printf("\n\t\t[1] All Orders \n\t\t[2] Order By Amount \n\n\tEnter option : ");
        int option = input.nextInt();
        return option;
    }

    public static void bestInCostomer() {

        System.out.println("\t ____            _      _____             ____           _                                          ");
        System.out.println("\t|  _ \\          | |    |_   _|           / ___|         | |                                        ");
        System.out.println("\t| (_| | ___  ___| |_     | |  _ __      | |    _   _ ___| |_ ___  _ __ __    ___ _ __ ___          ");
        System.out.println("\t|  _ < / _ \\/ __|  _|    | | | '_  \\    | |   | | | /  _| __/ _ \\| '_ ' _ \\ / _ \\ '__/ __|      ");
        System.out.println("\t| (_| |  __/\\__ \\ |_    _| |_| | | |    | |___| |_| \\__ \\ || (_) | | | | | |  __/ |  \\__ \\     ");
        System.out.println("\t|____/ \\___||___/\\__|  |_____|_| |_|     \\_____\\_,_|___/\\__\\___/|_| |_| |_|\\___|_|  |___/     ");
        System.out.printf("\n\t\t+%-15s+%-7s+%-15s+\n", "---------------", "-------", "---------------");
        System.out.printf("\t\t|%-15s|%-7s|%-15s|\n", "Phone Number", "All QTY", "Total Amount");
        System.out.printf("\t\t+%-15s+%-7s|%-15s+\n", "---------------", "-------", "---------------");
        ArrayList<CustomerDetails> copiedPeople = new ArrayList<>();
        copiedPeople = removeDuplicates(CustomerList);
        String[] customerId = new String[0];
        int[] totalqtQTY = new int[0];
        double[] totalAmount = new double[0];
        for (int i = 0; i < copiedPeople.size(); i++) {
            CustomerDetails uniqueCostomer = copiedPeople.get(i);
            int qty = 0;
            double total = 0;
            for (CustomerDetails costomer : CustomerList) {
                if (costomer.getCusID().equalsIgnoreCase(uniqueCostomer.getCusID())) {
                    qty += costomer.getQTY();
                    total += costomer.getAmount();
                }
            }
            customerId = extendArrays(customerId);
            totalqtQTY = extendArrays(totalqtQTY);
            totalAmount = extendArrays(totalAmount);

            customerId[i] = uniqueCostomer.getCusID();
            totalqtQTY[i] = qty;
            totalAmount[i] = total;

        }
        for (int i = 0; i < customerId.length; i++) {

            for (int j = i; j < customerId.length; j++) {

                if (totalAmount[i] < totalAmount[j]) {

                    int tempvalue = totalqtQTY[i];

                    totalqtQTY[i] = totalqtQTY[j];

                    totalqtQTY[j] = tempvalue;

                    double tempvalue1 = totalAmount[i];

                    totalAmount[i] = totalAmount[j];

                    totalAmount[j] = tempvalue1;

                    String tempvalue3 = customerId[i];

                    customerId[i] = customerId[j];

                    customerId[j] = tempvalue3;

                }

            }
        }
        for (int i = 0; i < customerId.length; i++) {
            System.out.printf("\t\t|%-15s|%-7d|%-15s|", customerId[i], totalqtQTY[i], totalAmount[i]);
        }
        System.out.printf("\t\t+%-15s+%-7s|%-15s+\n", "---------------", "-------", "---------------");
        while (true) {

            System.out.print("To access the main menu, Please enter 0 : ");
            char op = input.next().charAt(0);

            if (op == '0') {

                Menu();

                break;

            } else {

                continue;
            }

        }
    }

    public static void ViewCustomer() {

        System.out.println("\t\t  _        __                      ____           _                                ");
        System.out.println("\t\t  \\ \\    / (_)                    / ___|         | |                                 ");
        System.out.println("\t\t   \\ \\  / / _  _____        __   | |    _   _ ___| |_ ___  _ __ __    ___ _ __      ");
        System.out.println("\t\t    \\ \\/ / | |/ _ \\ \\  /\\  / /   | |   | | | /  _| __/ _ \\| '_ ' _ \\ / _ \\ '__|");
        System.out.println("\t\t     \\  /  | |  __/\\ \\/  \\/ /    | |___| |_| \\__ \\ || (_) | | | | | |  __/ |     ");
        System.out.println("\t\t      \\/   |_|\\___| \\__/\\__/      \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|  \n\n");

        System.out.printf("\t\t+%-15s+%-7s+%-15s+\n", "---------------", "-------", "---------------");
        System.out.printf("\t\t|%-15s|%-7s|%-15s|\n", "Phone Number", "All QTY", "Total Amount");
        System.out.printf("\t\t+%-15s+%-7s|%-15s+\n", "---------------", "-------", "---------------");
        ArrayList<CustomerDetails> copiedPeople = new ArrayList<>();
        copiedPeople = removeDuplicates(CustomerList);

        for (CustomerDetails uniqueCostomer : copiedPeople) {
            int qty = 0;
            double total = 0;
            for (CustomerDetails customer : CustomerList) {
                if (customer.getCusID().equalsIgnoreCase(uniqueCostomer.getCusID())) {
                    qty += customer.getQTY();
                    total += customer.getAmount();
                }
            }
            System.out.printf("\t\t|%-15s|%-7d|%-15s|\n", uniqueCostomer.getCusID(), qty, total);

        }
        System.out.printf("\t\t+%-15s+%-7s|%-15s+\n", "---------------", "-------", "---------------");
        while (true) {
            System.out.print("To access the main menu, Please enter 0 : ");
            char op = input.next().charAt(0);
            if (op == '0') {
                Menu();
                break;
            } else {
                continue;
            }
        }
    }

    public static void allCustomerDetails() {

        System.out.println("\t\t              _ _       ____           _                                  _____                        _        ");
        System.out.println("\t\t        /\\   | | |     / ___|         | |                                |  __ \\                      | |      ");
        System.out.println("\t\t       /  \\  | | |    | |    _   _ ___| |_ ___  _ __ __    ___ _ __      | |__) |___  _ __   ___  _ __| |_ ___   ");
        System.out.println("\t\t      / /\\ \\ | | |    | |   | | | /  _| __/ _ \\| '_ ' _ \\ / _ \\ '__|     |  _  // _  \\ '_ \\ / _ \\| '__|  _/ __| ");
        System.out.println("\t\t     / ____ \\| | |    | |___| |_| \\__ \\ || (_) | | | | | |  __/ |        | | \\ \\   __/ |_) | (_) | |  | |_\\__ \\      ");
        System.out.println("\t\t    /_/    \\_\\_|_|     \\_____\\__,_|___/\\__\\___/|_| |_| |_|\\___|_|        |_|  \\_\\____| .__/ \\___/|_|   \\__|___/     ");
        System.out.println("\t\t                                                                                     | |                          ");
        System.out.println("\t\t                                                                                     |_|                          ");
        System.out.printf("\t\t+%-15s+%-7s+%-7s+%-7s+%-7s+%-7s+%-7s+%-15s+\n", "---------------", "-------", "-------", "-------", "-------", "-------", "-------", "---------------");
        System.out.printf("\t\t|%-15s|%-7s|%-7s|%-7s|%-7s|%-7s|%-7s|%-15s|\n", "Phone Number", "XS", "S", "M", "L", "XL", "XXL", "Total");
        System.out.printf("\t\t+%-15s+%-7s+%-7s+%-7s+%-7s+%-7s+%-7s+%-15s+\n", "---------------", "-------", "-------", "-------", "-------", "-------", "-------", "---------------");
        ArrayList<CustomerDetails> copiedPeople = new ArrayList<>();
        copiedPeople = removeDuplicates(CustomerList);

        for (CustomerDetails uniqueCostomer : copiedPeople) {
            int[] tempSizes = new int[6];
            for (CustomerDetails customer : CustomerList) {
                if (customer.getCusID().equalsIgnoreCase(uniqueCostomer.getCusID())) {
                    switch (customer.getSize().toLowerCase()) {
                        case "xs":
                            tempSizes[0] += customer.getQTY();
                            break;
                        case "s":
                            tempSizes[1] += customer.getQTY();
                            break;
                        case "m":
                            tempSizes[2] += customer.getQTY();
                            break;
                        case "l":
                            tempSizes[3] += customer.getQTY();
                            break;
                        case "xl":
                            tempSizes[4] += customer.getQTY();
                            break;
                        case "xxl":
                            tempSizes[5] += customer.getQTY();
                            break;
                    }
                }
            }
            double total = 0;
            total += tempSizes[0] * price[0];
            total += tempSizes[1] * price[1];
            total += tempSizes[2] * price[2];
            total += tempSizes[3] * price[3];
            total += tempSizes[4] * price[4];
            total += tempSizes[5] * price[5];

            System.out.printf("\n\t\t|%-15s|%-7d|%-7d|%-7d|%-7d|%-7d|%-7d|%-15s|\n", uniqueCostomer.getCusID(), tempSizes[0], tempSizes[1], tempSizes[2], tempSizes[3], tempSizes[4], tempSizes[5], total);
        }
        System.out.printf("\t\t+%-15s+%-7s+%-7s+%-7s+%-7s+%-7s+%-7s+%-15s+\n", "---------------", "-------", "-------", "-------", "-------", "-------", "-------", "---------------");
        while (true) {
            System.out.print("To access the main menu, Please enter 0 : ");
            char op = input.next().charAt(0);
            if (op == '0') {
                Menu();
                break;
            } else {
                continue;
            }
        }
    }

    public static void bestInItemByQTY() {

        System.out.println("\t\t      _____            _           _     _____             ____ _______     _ ");
        System.out.println("\t\t     / ____|          | |         | |   |  _  \\           / _  \\_   _\\ \\   / /");
        System.out.println("\t\t    | (___   ___  _ __| |_ ___  __| |   | |_)  |_   _    | | | | | |  \\ \\_/ /");
        System.out.println("\t\t     \\___ \\ / _ \\| '__| __/ _ \\/ _  |   |  _  <| | | |   | | | | | |   \\   / ");
        System.out.println("\t\t     ____) | (_) | |  | ||  __/ (_| |   | |_)  | |_| |   | |_| | | |    | |");
        System.out.println("\t\t    |_____/ \\___/|_|   \\__\\___|\\__,_|   |_____/ \\__, |    \\__\\_\\ |_|    |_| ");
        System.out.println("\t\t                                                 __/ |                      ");
        System.out.println("\t\t                                                |___/                        ");
        System.out.println();

        System.out.printf("\t\t+%-7s+%-6s+%-15s+\n", "-------", "------", "---------------");
        System.out.printf("\t\t|%-7s|%-6s|%-15s|\n", " size", "  QTY", "      Total");
        System.out.printf("\t\t+%-7s+%-6s+%-15s+\n", "-------", "------", "---------------");
        String[] sizesList = {"XS", "S", "M", "L", "XL", "XXL"};
        int[] QTY = new int[6];
        double[] Total = {0, 0, 0, 0, 0, 0};
        for (CustomerDetails customer : CustomerList) {
            switch (customer.getSize().toLowerCase()) {
                case "xs":
                    QTY[0] += customer.getQTY();
                    Total[0] += customer.getAmount();
                    break;
                case "s":
                    QTY[1] += customer.getQTY();
                    Total[1] = customer.getAmount();
                    break;
                case "m":
                    QTY[2] += customer.getQTY();
                    Total[2] = customer.getAmount();
                    break;
                case "l":
                    QTY[3] += customer.getQTY();
                    Total[3] = customer.getAmount();
                    break;
                case "xl":
                    QTY[4] += customer.getQTY();
                    Total[4] = customer.getAmount();
                    break;
                case "xxl":
                    QTY[5] += customer.getQTY();
                    Total[5] = customer.getAmount();
                    break;
            }
        }

        for (int i = 0; i < sizesList.length; i++) {
            for (int j = i; j < sizesList.length; j++) {
                if (QTY[i] < QTY[j]) {

                    int tempvalue = QTY[i];
                    QTY[i] = QTY[j];
                    QTY[j] = tempvalue;

                    double tempvalue1 = Total[i];
                    Total[i] = Total[j];
                    Total[j] = tempvalue1;

                    String tempvalue2 = sizesList[i];
                    sizesList[i] = sizesList[j];
                    sizesList[j] = tempvalue2;
                }
            }
        }

        for (int i = 0; i < sizesList.length; i++) {
            System.out.printf("\t\t|  %-5s|  %-4d|%13.2f  |\n", sizesList[i], QTY[i], Total[i]);
        }
        System.out.printf("\t\t+%-7s+%-6s+%-15s+\n", "-------", "------", "---------------");

        while (true) {

            System.out.print("To access the main menu, Please enter 0 : ");

            char op = input.next().charAt(0);

            if (op == '0') {

                Menu();

                break;

            } else {

                continue;

            }
        }
    }

    public static void bestInItemByAmount() {

        System.out.println("\t\t      _____            _           _     _____                                                  _     ");
        System.out.println("\t\t     / ____|          | |         | |   |  _  \\               /\\                               | |    ");
        System.out.println("\t\t    | (___   ___  _ __| |_ ___  __| |   | |_)  |_   _        /  \\   _ __ ___   ___  _   _ _ __ | |_   ");
        System.out.println("\t\t     \\___ \\ / _ \\| '__| __/ _ \\/ _  |   |  _  <| | | |      / /\\ \\ | '_ ' _ \\ / _ \\| | | | '_ \\| __|  ");
        System.out.println("\t\t     ____) | (_) | |  | ||  __/ (_| |   | |_)  | |_| |     / ____ \\| | | | | | (_) | |_| | | | | |_   ");
        System.out.println("\t\t    |_____/ \\___/|_|   \\__\\___|\\__,_|   |_____/ \\__, |    /_/    \\_\\_| |_| |_|\\___/ \\__,_|_| |_|\\__|  ");
        System.out.println("\t\t                                                 __/ |                                                ");
        System.out.println("\t\t                                                |___/                                                 \n\n");

        System.out.printf("\t\t+%-7s+%-6s+%-15s+\n", "-------", "------", "---------------");
        System.out.printf("\t\t|%-7s|%-6s|%-15s|\n", " size", "  QTY", "      Total");
        System.out.printf("\t\t+%-7s+%-6s+%-15s+\n", "-------", "------", "---------------");
        String[] sizesList = {"XS", "S", "M", "L", "XL", "XXL"};
        int[] QTY = new int[6];
        double[] Total = {0, 0, 0, 0, 0, 0};
        for (CustomerDetails customer : CustomerList) {
            switch (customer.getSize().toLowerCase()) {
                case "xs":
                    QTY[0] += customer.getQTY();
                    Total[0] += customer.getAmount();
                    break;
                case "s":
                    QTY[1] += customer.getQTY();
                    Total[1] = customer.getAmount();
                    break;
                case "m":
                    QTY[2] += customer.getQTY();
                    Total[2] = customer.getAmount();
                    break;
                case "l":
                    QTY[3] += customer.getQTY();
                    Total[3] = customer.getAmount();
                    break;
                case "xl":
                    QTY[4] += customer.getQTY();
                    Total[4] = customer.getAmount();
                    break;
                case "xxl":
                    QTY[5] += customer.getQTY();
                    Total[5] = customer.getAmount();
                    break;
            }
        }
        for (int i = 0; i < sizesList.length; i++) {
            for (int j = i; j < sizesList.length; j++) {
                if (Total[i] < Total[j]) {

                    int tempvalue = QTY[i];
                    QTY[i] = QTY[j];
                    QTY[j] = tempvalue;

                    double tempvalue1 = Total[i];
                    Total[i] = Total[j];
                    Total[j] = tempvalue1;

                    String tempvalue2 = sizesList[i];
                    sizesList[i] = sizesList[j];
                    sizesList[j] = tempvalue2;
                }
            }
        }
        for (int i = 0; i < sizesList.length; i++) {
            System.out.printf("\t\t|  %-5s|  %-4d|%13.2f  |\n", sizesList[i], QTY[i], Total[i]);
        }
        System.out.printf("\t\t+%-7s+%-6s+%-15s+\n", "-------", "------", "---------------");
        while (true) {
            System.out.print("To access the main menu, Please enter 0 : ");
            char op = input.next().charAt(0);
            if (op == '0') {
                Menu();
                break;
            } else {
                continue;
            }
        }
    }

    public static void AllOrders() {
        System.out.println("\t\t  _        __                       ____          _                          ");
        System.out.println("\t\t  \\ \\    / (_)                     / __ \\        | |                         ");
        System.out.println("\t\t   \\ \\  / / _  _____        __    | |  | |_ __ __| | ____ _ __               ");
        System.out.println("\t\t    \\ \\/ / | |/ _ \\ \\  /\\  / /    | |  | | '__/ _' |/  _ \\ '__|              ");
        System.out.println("\t\t     \\  /  | |  __/\\ \\/  \\/ /     | |__| | | | (_| |   __/ |                 ");
        System.out.println("\t\t      \\/   |_|\\___| \\__/\\__/       \\____/|_|  \\__,_|\\____|_|                 ");
        System.out.printf("\t\t+%-15s+%-15s+%-7s+%-7s+%-15s+%-15s+\n", "---------------", "---------------", "-------", "-------", "---------------", "---------------");
        System.out.printf("\t\t|%-15s|%-15s|%-7s|%-7s|%-15s|%-15s|\n", "Order ID", "Phone Number", "Size", "QTY", "Amount", "Status");
        System.out.printf("\t\t+%-15s+%-15s+%-7s+%-7s+%-15s+%-15s+\n", "---------------", "---------------", "-------", "-------", "---------------", "---------------");
        String[] ODRId = new String[CustomerList.size()];
        for (int i = 0; i < CustomerList.size(); i++) {
            ODRId[i] = CustomerList.get(i).getOdrId();
        }
        for (int i = CustomerList.size() - 1; i >= 0; i--) {
            for (CustomerDetails customer : CustomerList) {
                if (ODRId[i].equals(customer.getOdrId())) {
                    System.out.printf("\t\t|%-15s|%-15s|%-7s|%-7d|%-15.2f|%-15s|\n", customer.getOdrId(), customer.getCusID(), customer.getSize(), customer.getQTY(), customer.getAmount(), customer.getStatus());
                }
            }
        }
        System.out.printf("\t\t+%-15s+%-7s+%-7s+%-7s+%-7s+%-7s+%-7s+%-15s+\n", "---------------", "-------", "-------", "-------", "-------", "-------", "-------", "---------------");
        while (true) {
            System.out.print("To access the main menu, Please enter 0 : ");
            char op = input.next().charAt(0);
            if (op == '0') {
                Menu();
                break;
            } else {
                continue;
            }
        }
    }

    public static void orderByAmount() {

        System.out.println("\t\t     ____          _                    _____                                                  _");
        System.out.println("\t\t    / __ \\        | |                  |  _  \\               /\\                               | |    ");
        System.out.println("\t\t   | |  | |_ __ __| | ____ _ __ ___    | |_)  |_   _        /  \\   _ ___ ___  ___  _   _ _ __ | |_ ");
        System.out.println("\t\t   | |  | | '__/ _' |/  _ \\ '__/ __|   |  _  <| | | |      / /\\ \\ | '_ ` _  \\/ _ \\| | | | '_ \\| __|  ");
        System.out.println("\t\t   | |__| | | | (_| |   __/ |  \\__ \\   | |_)  | |_| |     / ____ \\| | | | | | (_) | |_| | | | | |_          ");
        System.out.println("\t\t    \\____/|_|  \\__,_|\\____|_|  |___/   |_____/ \\__, |    /_/    \\_\\_| |_| |_|\\___/ \\__,_|_| |_|\\__|  ");
        System.out.println("\t\t                                                __/ |                                                ");
        System.out.println("\t\t                                               |___/  \n\n");

        System.out.printf("\t\t+%-15s+%-15s+%-7s+%-7s+%-15s+%-15s+\n", "---------------", "---------------", "-------", "-------", "---------------", "---------------");
        System.out.printf("\t\t|%-15s|%-15s|%-7s|%-7s|%-15s|%-15s|\n", "Order ID", "Phone Number", "Size", "QTY", "Amount", "Status");
        System.out.printf("\t\t+%-15s+%-15s+%-7s+%-7s+%-15s+%-15s+\n", "---------------", "---------------", "-------", "-------", "---------------", "---------------");
        double[] amount = new double[CustomerList.size()];
        for (int i = 0; i < CustomerList.size(); i++) {
            amount[i] = CustomerList.get(i).getAmount();
        }
        for (int i = 0; i < amount.length; i++) {
            for (int j = i; j < amount.length; j++) {
                if (amount[i] < amount[j]) {
                    double tempvalue = amount[i];
                    amount[i] = amount[j];
                    amount[j] = tempvalue;
                }
            }
        }
        for (int i = 0; i < CustomerList.size(); i--) {
            for (CustomerDetails customer : CustomerList) {
                if (amount[i] == (customer.getAmount())) {
                    System.out.printf("\t\t|%-15s|%-15s|%-7s|%-7d|%-15.2f|%-15s|\n", customer.getOdrId(), customer.getCusID(), customer.getSize(), customer.getQTY(), customer.getAmount(), customer.getStatus());
                }
            }
        }
        System.out.printf("\t\t+%-15s+%-7s+%-7s+%-7s+%-7s+%-7s+%-7s+%-15s+\n", "---------------", "-------", "-------", "-------", "-------", "-------", "-------", "---------------");
        while (true) {
            System.out.print("To access the main menu, Please enter 0 : ");
            char op = input.next().charAt(0);
            if (op == '0') {
                Menu();
                break;
            } else {
                continue;
            }
        }
    }

    public static void changeStatus() {
        System.out.println("\t\t      ___           _                   ______ _        _                         ");
        System.out.println("\t\t    / __ \\        | |                 / _____| |      | |                        ");
        System.out.println("\t\t   | |  | |_ __ __| | ____ _ __      | (____ | |_ __ _| |_ _   _ ____                         ");
        System.out.println("\t\t   | |  | | '__/ _' |/  _ \\ '__|      \\___  \\| __/ _` |  _| | | / ___|                  ");
        System.out.println("\t\t   | |__| | | | (_| |   __/ |         ____)  | || (_| | |_| |_| \\___ \\                  ");
        System.out.println("\t\t    \\____/|_|  \\__,_|\\____|_|        |______/ \\__\\__,_|\\__|\\__,_|____/                        \n\n");
        while (true) {
            System.out.print("\t\tEnter order ID : ");
            String searchId = input.next();
            printOrderDetails(searchId);
            for (CustomerDetails customer : CustomerList) {
                if (customer.getOdrId().equalsIgnoreCase(searchId)) {
                    System.out.print("\tDo you want to change this status? (y/n) : ");
                    char op = input.next().charAt(0);
                    if (op == 'y' || op == 'Y') {
                        if (customer.getStatus().equalsIgnoreCase("Processing")) {
                            System.out.printf("\n\t\t[1]  Order Delivering  \n\t\t[2] Order Delivered \n\n\tEnter option : ");
                            int option = input.nextInt();
                            switch (option) {
                                case 1:
                                    customer.setStatus(status[1]);
                                    System.out.println("\t\t****Status Changed Delivering****");
                                    break;
                                case 2:
                                    customer.setStatus(status[2]);
                                    System.out.println("\t\t****Status Changed Delivered****");
                                    break;
                            }
                            break;
                        } else if (customer.getStatus().equalsIgnoreCase("Delivering")) {
                            System.out.println("Do you want to change this status? (y/n) : ");
                            char op2 = input.next().charAt(0);
                            if (op2 == 'y' || op2 == 'Y') {
                                System.out.printf("\n\t\t[1] Order Delivered \n\n\tEnter option");
                                int option = input.nextInt();
                                switch (option) {
                                    case 1:
                                        customer.setStatus(status[2]);
                                        System.out.println("\t\t****Status Changed Delivered****");
                                        break;
                                }
                            }
                        } else {
                            System.out.println("Can't change this order status, Order already delivered...!!");
                        }
                    }
                }
            }
            System.out.println("Do you want to change another Order? (y/n)  : ");
            char op = input.next().charAt(0);
            if (op == 'y' || op == 'Y') {
                continue;
            } else {
                break;
            }
        }
    }

    public static void deleteOrder() {
        System.out.println("\t\t ______       _      _            ____          _                          ");
        System.out.println("\t\t|  __  \\     | |    | |          / __ \\        | |                         ");
        System.out.println("\t\t| |  |  | ___| | ___| |_ ___    | |  | |_ __ __| | ____ _ __               ");
        System.out.println("\t\t| |  |  |/ _ \\ |/ _ \\ __/ _ \\   | |  | | '__/ _' |/  _ \\ '__|              ");
        System.out.println("\t\t| |__|  |  __/ |  __/ ||  __/   | |__| | | | (_| |   __/ |                 ");
        System.out.println("\t\t|______/ \\___|_|\\___|\\__\\___|    \\____/|_|  \\__,_|\\____|_|                 \n\n");
        while (true) {
            System.out.print("\t\tEnter order ID : ");
            String searchId = input.next();
            int checked = checkID(searchId);
            if (checked == 1) {
                printOrderDetails(searchId);
                for (CustomerDetails customer : CustomerList) {
                    if (customer.getOdrId().equalsIgnoreCase(searchId)) {
                        if (customer.getStatus().equalsIgnoreCase("Processing")) {
                            System.out.print("Do you want to delete this Order? (y/n)  : ");
                            char op = input.next().charAt(0);
                            if (op == 'y' || op == 'Y') {
                                CustomerList.remove(customer);
                                System.out.println("\t\t\t\tOrder Deleted..!\n");
                                break;
                            } else {
                                Menu();
                            }
                        } else {
                            System.out.println("This order already procesed...!!");
                        }
                    }
                }
            } else if (checked == -1) {
                Menu();
                break;
            }
            System.out.print("\t\tDo you want to delete another Order? (y/n)  : ");

            char op1 = input.next().charAt(0);
            if (op1 == 'y' || op1 == 'Y') {
                continue;
            } else {
                break;
            }
        }
    }

    //------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public static void printOrderDetails(String searchId) {
        int cus = 0;
        for (CustomerDetails customer : CustomerList) {
            if (customer.getOdrId().equalsIgnoreCase(searchId)) {
                System.out.println(customer.toString());
                cus = 1;
            }
        }
        if (cus == 0) {
            System.out.println("Oder Not Found..!!");
        }
    }

    public static int checkID(String odrID) {
        int x = 0;
        if (odrID.charAt(0) != 'O' || odrID.length() != 9) {
            System.out.println("\t\t\t\tInvalid input..!");
            char try1 = input.next().charAt(0);

            if (try1 == 'y' || try1 == 'Y') {
                clearLines(4);
                return 0;

            } else {
                return -1;
            }
        } else {
            return 1;
        }

    }

    public static ArrayList<CustomerDetails> removeDuplicates(ArrayList<CustomerDetails> list) {
        ArrayList<CustomerDetails> newList = new ArrayList<>();
        l1:
        for (CustomerDetails element : list) {
            for (CustomerDetails uniqueCostomer : newList) {
                if (element.getCusID().equals(uniqueCostomer.getCusID())) {
                    continue l1;
                }
            }
            newList.add(element);

        }
        return newList;
    }

    public final static void clearConsole() {
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (final Exception e) {
            e.printStackTrace();
        }
    }

    public static void clearLines(int lines) {
        // Move the cursor up five lines
        System.out.print("\033[" + lines + "A");
        // Clear the lines
        System.out.print("\033[0J");
    }

    public static String generateOrderId() {
        order++;
        odr = String.format("%05d", order);
        return "ODR#" + odr;
    }

    public static String[] extendArrays(String[] ar) {
        String[] temp = new String[ar.length + 1];
        for (int i = 0; i < ar.length; i++) {
            temp[i] = ar[i];
        }
        return temp;
    }

    public static int[] extendArrays(int[] ar) {
        int[] temp = new int[ar.length + 1];
        for (int i = 0; i < ar.length; i++) {
            temp[i] = ar[i];
        }
        return temp;
    }

    public static double[] extendArrays(double[] ar) {
        double[] temp = new double[ar.length + 1];
        for (int i = 0; i < ar.length; i++) {
            temp[i] = ar[i];
        }
        return temp;
    }

    public static void Menu() {
        clearConsole();
        System.out.println("\t    /$$$$$$$$                 /$$       /$$                            /$$$$$$  /$$                     						 ");
        System.out.println("\t   | $$_____/                | $$      |__/                           /$$__  $$| $$                            				 ");
        System.out.println("\t   | $$    /$$$$$$   /$$$$$$$| $$$$$$$  /$$  /$$$$$$  /$$$$$$$       | $$  \\__/| $$$$$$$   /$$$$$$   /$$$$$$                  ");
        System.out.println("\t   | $$$$$|____  $$ /$$_____/| $$__  $$| $$ /$$__  $$| $$__  $$      |  $$$$$$ | $$__  $$ /$$__  $$ /$$__  $$                  ");
        System.out.println("\t   | $$__/ /$$$$$$$|  $$$$$$ | $$  \\ $$| $$| $$  \\ $$| $$  \\ $$       \\____  $$| $$  \\ $$| $$  \\ $$| $$  \\ $$           ");
        System.out.println("\t   | $$   /$$__  $$ \\____  $$| $$  | $$| $$| $$  | $$| $$  | $$       /$$  \\ $$| $$  | $$| $$  | $$| $$  | $$                ");
        System.out.println("\t   | $$  |  $$$$$$$ /$$$$$$$/| $$  | $$| $$|  $$$$$$/| $$  | $$      |  $$$$$$/| $$  | $$|  $$$$$$/| $$$$$$$/                  ");
        System.out.println("\t   | __/  \\_______/|_______/ |__/  |__/|__/ \\______/ |__/  |__/       \\______/ |__/  |__/ \\______/ | $$$$$$/               ");
        System.out.println("                                                                                                           | $$                  ");
        System.out.println("                                                                                                           | $$                  ");
        System.out.println("                                                                                                           |__/                  \n");
        System.out.println("\t--------------------------------------------------------------------------------------------------------------------\n\n");
        System.out.printf("\t\t%-25s\t\t%-25s\n\t\t%-25s\t\t%-25s\n\t\t%-25s\t\t%-25s\n\n", "[1] Place Order", "[2] Search Customer", "[3] Search Order", "[4] View Reports", "[5] Change Order Status", "[6] Delete Order");

        int option;

        L1:

        {
            do {
                System.out.print("\t\t Input Option : ");
                option = input.nextInt();
                if (option < 0 || option > 7) {
                    clearLines(1);
                }
            } while (1 <= option && option >= 7);
            clearConsole();
            switch (option) {
                case 1:
                    clearConsole();
                    placeOrder();
                    Menu();
                    break;
                case 2:
                    clearConsole();
                    searchCustomer();
                    Menu();
                    break;
                case 3:
                    clearConsole();
                    searchOrder();
                    Menu();
                    break;
                case 4:
                    clearConsole();
                    switch (viewReports()) {
                        case 1:
                            clearConsole();
                            switch (customerReports()) {
                                case 1:
                                    clearConsole();
                                    bestInCostomer();
                                    Menu();
                                    break;
                                case 2:
                                    clearConsole();
                                    ViewCustomer();
                                    Menu();
                                    break;
                                case 3:
                                    clearConsole();
                                    allCustomerDetails();
                                    Menu();
                                    break;
                            }
                            break;
                        case 2:
                            clearConsole();
                            switch (itemReports()) {
                                case 1:
                                    clearConsole();
                                    bestInItemByQTY();
                                    Menu();
                                    break;
                                case 2:
                                    clearConsole();
                                    bestInItemByAmount();
                                    Menu();
                                    break;
                            }
                            break;
                        case 3:
                            clearConsole();
                            switch (orderReports()) {
                                case 1:
                                    clearConsole();
                                    AllOrders();
                                    Menu();
                                    break;
                                case 2:
                                    clearConsole();
                                    orderByAmount();
                                    Menu();
                                    break;
                            }
                            break;
                    }
                    break;
                case 5:
                    clearConsole();
                    changeStatus();
                    Menu();
                    break;
                case 6:
                    clearConsole();
                    deleteOrder();
                    Menu();
                    break;
                default:
                    System.out.println("\t\t\tinvalid input...!");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Menu();
    }
}


