import java.util.ArrayList;
import java.util.Scanner;

public class DemoPabellonCirugia {

    private ArrayList<PabellonCirugia> lista;

    public DemoPabellonCirugia() {
        lista = new ArrayList<>();
    }

    public static void main(String[] args) {
        DemoPabellonCirugia demo = new DemoPabellonCirugia();
        demo.procesa();
    }

    public void procesa() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            System.out.println("Pabellon " + i);

            int numero;
            do {
                System.out.print("Ingrese numero (>0): ");
                numero = sc.nextInt();
            } while (numero <= 0);

            sc.nextLine();

            String especialidad;
            do {
                System.out.print("Ingrese especialidad: ");
                especialidad = sc.nextLine();
            } while (especialidad.isEmpty());

            PabellonCirugia p = new PabellonCirugia(numero, especialidad);
            lista.add(p);
        }

        for (int i = 0; i < lista.size(); i++) {
            if (i % 2 == 0) {
                lista.get(i).setEstado("ocupado");
            }
        }

        System.out.println("\n--- LISTA DE PABELLONES ---");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println("Posicion " + i + ": " + lista.get(i));
        }

        System.out.println("\n--- PABELLONES IGUALES ---");
        boolean hayIguales = false;

        for (int i = 0; i < lista.size(); i++) {
            for (int j = i + 1; j < lista.size(); j++) {
                if (lista.get(i).equals(lista.get(j))) {
                    System.out.println("Iguales en posiciones: " + i + " y " + j);
                    hayIguales = true;
                }
            }
        }

        if (!hayIguales) {
            System.out.println("No hay pabellones iguales");
        }
    }
}