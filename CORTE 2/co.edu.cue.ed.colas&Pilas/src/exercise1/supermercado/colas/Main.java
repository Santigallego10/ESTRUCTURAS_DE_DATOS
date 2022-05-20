package exercise1.supermercado.colas;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Supermarket supermarket= new Supermarket(15);

        int option;
        do {
            option=Integer.parseInt(JOptionPane.showInputDialog("Enter an option of the menu \n" +
                    "1. Take a cart\n" +
                    "2. Make the tail and choice the box\n" +
                    "3. See the Queue for the Box\n" +
                    "4. OUT\n"
            ));

            switch (option) {
                case 1:
                    supermarket.takeCart();
                    break;
                case 2:
                    supermarket.fillQueues();
                    break;
                case 3:
                    supermarket.seeQueueBox();
                    break;
                case 4:
                    break;
                default:
                    break;
            }
        } while (option!=4);



    }
}
