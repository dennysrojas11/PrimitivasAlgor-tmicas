package primitivas.algorítmicas;
//librerías importadas
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import static java.lang.Math.tan;
import java.util.Scanner;
/*
  @author Wolfie
*/
public class PrimitivasAlgorítmicas {   
    public static void main(String[] args) {
    //función para leer datos por consola        
    Scanner in=new Scanner(System.in);
    //variables globales
    int n,op,i,k;
    double res;
        //estructura do-while para repetición de menú
        do{
        //título del programa
        System.out.println("**********************************************");
        System.out.println("Programación de ejercicios realizados en clase");
        System.out.println("**********************************************");
        //menú del programa
        System.out.println("---------MENÚ DE EJERCICIOS---------");
        System.out.println("1. Chequeo número par");
        System.out.println("2. Conversión de temperaturas");
        System.out.println("3. Calcular el valor absoluto de un número");
        System.out.println("4. Conversor de notas cuantitativas");
        System.out.println("5. Elección del mayor de tres números");
        System.out.println("6. Administrador de funciones trigonométricas");
        System.out.println("7. Factorial de un número entero positivo");
        System.out.println("8. Tabla de multiplicar");
        System.out.println("9. Número de potencia de n");
        System.out.println("10. SALIR");        
        //impresión de solicitud de ingreso de datos
        System.out.println("¿Qué ejercicio desea ejecutar?");
        //ingreso por teclado de la selección de menú
        op=in.nextInt();
        //estructura switch para ejecución de ejercicios acorde a la elección de menú
        switch(op){
            case 1:
                //dado un número n, el cual es leído, diseñe un algoritmo para chequear si el número es par
                //Título del ejercicio
                System.out.println("-----------------------------------------");
                System.out.println("Chequeo número par");
                System.out.println("-----------------------------------------");
                //solicitud de ingreso de número
                System.out.println("Ingrese un número para determinar si es par");
                //ingreso por consola de número
                n=in.nextInt();
                //Estructura IF para determinar si el número es par o no
                if((n%2)==0){
                    //impresión de mensaje
                    System.out.println("El número es par");
                }
                break;
            case 2:
                //Diseñe un algoritmo que lea la temperatura en grados centígrados y la convierta a grados farenheit y kelvin
                //siempre y cuando la temperatura dada en grados centígrados sea positiva
                //declaración de variables
                double c,f,ke;
                //título del ejercicio
                System.out.println("-----------------------------------------");
                System.out.println("Calcular el valor absoluto");
                System.out.println("-----------------------------------------");
                //solicitud de ingreso de temperatura en grados centígrados
                System.out.println("Ingrese la temperatura en grados centígrados");
                //ingreso por consola de temperatura
                c=in.nextDouble();
                //estructura IF para determinar si la temperatura ingresada es un número positivo
                if(c>=0){
                    //cuando la temperatura es positiva se realiza la conversión
                    f=(9/5)*(c+32);
                    ke=c+273.15;
                    //imprisión de las conversiones
                    System.out.println("La temperatura en grados centígrados es: "+c+" C");
                    System.out.println("La temperatura en grados farenheit es: "+f+ " F");
                    System.out.println("La temperatura en grados kelvin es: "+ke+" K");
                }else{
                    //no es un número positivo no se realiza la conversión
                    System.out.println("La temperatura ingresada está por debajo de 0");
                }
                break;
            case 3:
                //Diseñe un algoritmo para calcular el valor absoluto de un número leído n
                //declaración de variables
                int a,b;
                //título del ejercicio
                System.out.println("-----------------------------------------");
                System.out.println("Calcular el valor absoluto");
                System.out.println("-----------------------------------------");
                //solicitar ingreso del número
                System.out.println("Ingrese el número del que desea conocer el valor absoluto");
                //ingreso por consola del número
                a=in.nextInt();
                //estructura IF para saber si el número es positivo o negativo
                if(a>=0){
                    //el valor absoluto de un número positivo y cero es el mismo valor
                    System.out.println("El valor absoluto de: "+a+" es: "+a);
                }else{
                    //el valor absoluto de un número negativo es el valor del número multiplicado por -1
                    b=a*(-1);
                    System.out.println("El valor absoluto de: "+a+" es: "+b);
                }
                break;
            case 4:
                //diseñe un algoritmo que escriba la equivalencia cualitativa de una nota numérica leída n
                //título del ejercicio
                System.out.println("-----------------------------------------");
                System.out.println("Conversor de notas cuantitativas");
                System.out.println("-----------------------------------------");
                //solicitud de ingreso de la nota
                System.out.println("Ingrese la nota");
                //ingreso por consola de la nota
                n=in.nextInt();
                //estructura IF para convertir nota cuantitativa en cualitativa
                if(n>70){
                    //la nota es satisfactoria y mostramos mensaje
                    System.out.println("La nota es satisfactoria");
                }else{
                    if (n>35){
                        //la nota es cuasisatisfactoria y mostramos mensaje
                        System.out.println("La nota es cuasi satisfactoria");
                    }else{
                        if(n>1){
                            //la nota es poco satisfactoria y mostramos mensaje
                            System.out.println("La nota es poco satisfactoria");
                        }else{
                            //la nota es deficiente y mostramos mensaje
                            System.out.println("La nota es deficiente");
                        }
                    }
                }
                break;
            case 5:
                //Dados tres números distintos, los cuales son leídos, diseñe un algirtmo utilizando primitivas lógicas de tipo condicional compuesta
                //para seleccionar el mayor de los tres números
                //declaración de variables
                int m;
                //titulo del ejercicio
                System.out.println("-----------------------------------------");
                System.out.println("Elección del mayor de tres números");
                System.out.println("-----------------------------------------");
                //solicitud de ingreso y lectura de los números
                System.out.println("Ingrese el número 1: ");
                n=in.nextInt();
                System.out.println("Ingrese el número 2: ");
                m=in.nextInt();
                System.out.println("Ingrese el número 3: ");
                k=in.nextInt();
                //estructura condicional IF ELSE para determinar el mayor de los tres números ingresados
                if(n>m){
                    if(n>k){
                        //n es el número mayor, se imprime el mensaje
                        System.out.println("El número mayor es: "+n);
                    }else{
                        //k es el número mayor, se imprime el mensaje
                        System.out.println("El número mayor es: "+k);
                    }
                }else{
                    if (m>k){
                        //m es el número mayor, se imprime el mensaje
                        System.out.println("El número mayor es: "+m);
                    }else{
                        //k es el número mayor, se imprime el mensaje
                        System.out.println("El número mayor es: "+k);
                    }
                }
                break;
            case 6:
                //Diseñe un algoritmo que ejecute las funciones trigonométricas sin(x). cos(x) y tan(x) sujetas a la selección del usuario
                //declaración de variables
                int opc; 
                double x;
                //título del ejercicio
                System.out.println("-----------------------------------------");
                System.out.println("Funciones trigonométricas");
                System.out.println("-----------------------------------------");
                //estrucutra DO WHILE para validar la opción ingresada
                do{
                //menú de opciones del ejercicio
                System.out.println("Menú de funciones trigonométricas");
                System.out.println("1. Seno");
                System.out.println("2. Coseno");
                System.out.println("3. Tangente");
                //solicitud de ingreso de opción seleccionada
                System.out.println("Ingrese la función trigonométrica seleccionada");
                //ingreso por consola de opción seleccionada
                opc=in.nextInt();
                }while(opc<1 ||opc>3);
                //solicitud de ingreso del ángulo
                System.out.println("Ingrese l valor del ángulo a calcular");
                //ingreso por consola del valor del ángulo
                x=in.nextInt();
                //estructura SWITCH para obtención de resultados
                switch(opc){
                    case 1:
                        //obtener el seno de x
                        res= sin(x);
                        //impresión de resultado
                        System.out.println("El seno de "+x+" es: "+res);
                        break;
                    case 2:
                        //obtener el coseno de x
                        res= cos(x);
                        //impresión de resultado
                        System.out.println("El coseno de "+x+" es: "+res);
                        break;
                    case 3:
                        //obtener la tangente de x
                        res= tan(x);
                        //impresión de resultado
                        System.out.println("El tangente de "+x+" es: "+res);
                        break;
                }
                
                break;
            case 7:
                //Construya un algoritmo para calcular el factorial de un número n que pertenece a los enteros positivos
                //declaración de variables
                int factorial;
                //titulo del ejercicio
                System.out.println("-----------------------------------------");
                System.out.println("Factorial de un número");
                System.out.println("-----------------------------------------");
                //solicitud de ingreso del número del cual se quiere obtener el factorial
                System.out.println("Ingrese el número del cual desea obtener el factorial");
                //ingreso por consola del número del cual se va a obtener el factorial
                n=in.nextInt();
                //estructura IF para determinar si un número es positivo o no
                if(n>0){
                    //proceso cuando se cumple la condición del IF
                    factorial=1;
                    //estructura FOR para obtener el factorial del número
                    for(i=1;i<=n;i++){
                        factorial=factorial*i;
                    }
                    //impresión de resultado
                    System.out.println("El factorial de "+n+"! es: "+factorial);
                }else{
                    //proceso cuando no se cumple la condición del IF
                    System.out.println("El número no es un entero positivo");
                }
                break;
            case 8:
                //Dados dos números n y k, pertenecientes a los enteros positivos diseñe un algoritmo que imprima la tabla de multiplicar
                //título del ejercicio
                System.out.println("-----------------------------------------");
                System.out.println("Tabla de multiplicar");
                System.out.println("-----------------------------------------");
                //solicitud de ingreso del número del que se va a hacer la tabla
                System.out.println("Ingrese el número del cual desea obtener su tabla de multiplicar");
                //ingreso por consola del número del que se va a hacer la tabla
                n=in.nextInt();
                //solicitud de ingreso del número límite de la tabla
                System.out.println("¿Hasta qué número desea generar la tabla de multiplicar?");
                //ingreso por consola del número límite
                k= in.nextInt();
                //titulo de la tabla
                System.out.println("Tabla de multiplicar del número: "+n);
                //estructura FOR para generación de tabla
                for(i=1; i<=k; i++){
                    res=n*i;
                    System.out.println(n+"*"+i+"="+res);                            
                }
                break;
            case 9:
                //Dado un número n, par y potencia de dos, perteneciente a los enteros positivos, diseñe un algoritmo utilizando la estructura MIENTRAS QUE
                // para calcular el número de potencia de n
                //declaración de variables
                int aux,p=0;
                //titulo del ejercicio
                System.out.println("-----------------------------------------");
                System.out.println("Función log2 n para potencias de 2");
                System.out.println("-----------------------------------------");
                //solicitud de ingreso de datos
                System.out.println("Ingrese en número del cual desea conocer su potencia");
                //ingreso de datos por consola
                n= in.nextInt();
                //asignación de valor a una variable auxiliar
                aux=n;
                //estructura MIENTRAS QUE que cuenta las potencias de 2
                while(aux!=1){
                    aux=aux/2;
                    p=p+1;
                }
                //impresión de resultado
                System.out.println("El logaritmo de base 2 de "+ n+ " es "+ p);
                break;
        }
        }while(op!=10);
    }
}