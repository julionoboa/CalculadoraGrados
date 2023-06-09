import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    public void menu() {
        //Declarando variables
        boolean validate = true;
        double caso1 = 0;
        String entrada;
        int repetir = -1;

        //Creando objetos
        CelsiusFahrenheit cf = new CelsiusFahrenheit();
        CelsiusRankine cr = new CelsiusRankine();
        CelsiusKelvin ck = new CelsiusKelvin();
        FahrenheitCelsius fc = new FahrenheitCelsius();
        FahrenheitKelvin fk = new FahrenheitKelvin();
        FahrenheitRankine fr = new FahrenheitRankine();

        //Creando scanner
        Scanner sc = new Scanner(System.in);

//        Ciclo para repetir todo el menu en caso de querer realizar otra operacion
        while (repetir < 0) {

            //Menu
            System.out.println("---CALCULADORA DE GRADOS---");
            System.out.println("Seleccione la opción deseada:");
            System.out.println("1. Celsius a Fahrenheit");
            System.out.println("2. Celsius a Kelvin");
            System.out.println("3. Celsius a Rankine");
            System.out.println("4. Fahrenheit a Celsius");
            System.out.println("5. Fahrenheit a Kelvin");
            System.out.println("6. Fahrenheit a Rankine");
            System.out.println("0. Salir");

            //Variable para guardar el valor que devuelva el metodo que creamos
            int option = validate(sc);

            //Validar que el numero del menu sea correcto
            if (option < 0 || option > 6) {
                while (option < 0 || option > 6) {
                    System.out.println("Introduzca un número del 0 al 6");
                    option = -1;
                    option = validate(sc);
                }
            }

            //Switch para trabajar las diferentes operaciones
            switch (option) {
                case 1:
                    System.out.println("Introduzca el valor en Celsius: ");
                    int optionMenu = validate(sc);
                    System.out.println("El valor de " + optionMenu + " grados Celsius es igual a " + cf.calcular(optionMenu) + " grados Fahrenheit.");
                    break;
                case 2:
                    System.out.println("Introduzca el valor en Celsius: ");
                    optionMenu = validate(sc);
                    System.out.println("El valor de " + optionMenu + " grados Celsius es igual a " + ck.calcular(optionMenu) + " grados Kelvin.");
                    break;
                case 3:
                    System.out.println("Introduzca el valor en Celsius: ");
                    optionMenu = validate(sc);
                    System.out.println("El valor de " + optionMenu + " grados Celsius es igual a " + cr.calcular(optionMenu) + " grados Rankine.");
                    break;
                case 4:
                    System.out.println("Introduzca el valor en Fahrenheit: ");
                    optionMenu = validate(sc);
                    System.out.println("El valor de " + optionMenu + " grados Fahrenheit es igual a " + fc.calcular(optionMenu) + " grados Celsius.");
                    break;
                case 5:
                    System.out.println("Introduzca el valor en Fahrenheit: ");
                    optionMenu = validate(sc);
                    System.out.println("El valor de " + optionMenu + " grados Fahrenheit es igual a " + fk.calcular(optionMenu) + " grados Kelvin.");
                    break;
                case 6:
                    System.out.println("Introduzca el valor en Fahrenheit: ");
                    optionMenu = validate(sc);
                    System.out.println("El valor de " + optionMenu + " grados Fahrenheit es igual a " + fr.calcular(optionMenu) + " grados Rankine.");
                    break;
            }

            //Pregunta de confirmacion
            System.out.println("¿Desea realizar otra operación? Si(Y) No(N)");

            do{
                entrada = sc.nextLine();
                entrada = entrada.toUpperCase();
                if (entrada.equalsIgnoreCase("Y")){
                    repetir = -1;
                    break;
                }
                else if (entrada.equalsIgnoreCase("N")){
                    repetir = 1;
                    break;
                }
                else {
                    System.out.println("Debe ser Y o N");
                }
            }  while (true);


        }
    }

    //Metodo para validar valor numerico
    public int validate(Scanner sc) {
        int i = -1;

        while (i < 0 ) {

            String optionMenu = sc.nextLine();

            try {
                i = Integer.valueOf(optionMenu);
            }
            catch (Exception e){
                System.out.println("Debe introducir un número válido");
                i = -1;
            }

        }

        return i;
    }




}
