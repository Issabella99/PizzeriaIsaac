import javax.swing.*;

public class Main {


    String[][] factura;
    int valorTotal = 0;

    public Main() {
        cantidadPizzas();
    }

    public void cantidadPizzas() {

        int numPizzas = Integer.parseInt(JOptionPane.showInputDialog("¡BIENVENIDO A PIZZAS ISAAC\n"
                + "\n¿Cuantas pizzas desea llevar?"));
        factura = new String[numPizzas][6];

        if (numPizzas >= 5) {
            JOptionPane.showInternalMessageDialog(null, "No puedes llevar mas de 5 pizzas");
            cantidadPizzas();
        } else {
            menu();
        }
    }

    public void menu() {


        for (int i = 0; i < factura.length; i++) {
            boolean control = true;
            int ingrediente = 1, cerrar = 0;
            int total = 5000;
            factura[i][0] = Integer.toString(i + 1);

            while (control) {

                String sms = "Bienvenido a Pizzas Isaac\n\n "
                        + "Digite la opcion que desee\n\n"+
                         + (i + 1) + "° Pizza" + "\n\n";
                sms += "Ingredientes:\n";
                sms += "1. $500 - Jamon\n";
                sms += "2. $900 - Peperoni\n";
                sms += "3. $700 - Pollo\n";
                sms += "4. $300 - Tomate\n";
                sms += "5. $1200 - Atun\n";
                sms += "6. $400 - Albaca\n";
                sms += "7. $800 - Champiñones\n";
                sms += "8. No mas ingredientes\n";

                int opcion = Integer.parseInt(JOptionPane.showInputDialog(sms));

                if (opcion == 1) {
                    factura[i][ingrediente] = "Jamon";
                    total += 500;
                    factura[i][5] = Integer.toString(total);
                    ingrediente++;
                    cerrar++;

                } else if (opcion == 2) {
                    factura[i][ingrediente] = "Peperoni";
                    total += 900;
                    factura[i][5] = Integer.toString(total);
                    ingrediente++;
                    cerrar++;

                } else if (opcion == 3) {
                    factura[i][ingrediente] = "Pollo";
                    total += 700;
                    factura[i][5] = Integer.toString(total);
                    ingrediente++;
                    cerrar++;

                } else if (opcion == 4) {
                    factura[i][ingrediente] = "Tomate";
                    total += 300;
                    factura[i][5] = Integer.toString(total);
                    ingrediente++;
                    cerrar++;

                } else if (opcion == 5) {
                    factura[i][ingrediente] = "Atun";
                    total += 1200;
                    factura[i][5] = Integer.toString(total);
                    ingrediente++;
                    cerrar++;

                } else if (opcion == 6) {
                    factura[i][ingrediente] = "Albaca";
                    total += 400;
                    factura[i][5] = Integer.toString(total);
                    ingrediente++;
                    cerrar++;

                } else if (opcion == 7) {
                    factura[i][ingrediente] = "Champinones";
                    total += 800;
                    factura[i][5] = Integer.toString(total);
                    ingrediente++;
                    cerrar++;

                } else if (opcion == 8) {
                    control = false;

                } else {
                    JOptionPane.showInternalMessageDialog(null, "La opcion ingresada no es correcta");
                    menu();
                }
                if (cerrar >= 4) {
                    control = false;

                }

            }
            valorTotal += total;
        }
        mostrar();
    }

    public void mostrar() {

        for (int i = 0; i < factura.length; i++) {

            for (int j = 0; j < factura[i].length; j++) {
                System.out.print(factura[i][j] + " | ");
            }
            System.out.println("");
        }
        System.out.println("Total: " + valorTotal);
    }

    public static void main(String[] args) {
        new Main();
    }

}


