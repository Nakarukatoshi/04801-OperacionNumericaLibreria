package org.japo.java.app;

/*
 * Copyright 2019 Javier Monterde - javier.monterde.alum@iescamp.es.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
import java.util.Random;
import org.japo.java.libraries.UtilesPrimitivos;

/**
 *
 * @author Javier Monterde - javier.monterde.alum@iescamp.es
 */
public final class App {

    //Instanciamos el objeto Random
    public static final Random RND = new Random();

    //Declaramos mínimos y máximos de los Randoms a utilizar
    public static final int N_MIN = 1;
    public static final int N_MAX = 10;
    public static final int OP_MIN = 0;
    public static final int OP_MAX = 7;

    //Declaramos los tres Randoms
    public static final int N1;
    public static final int N2;
    public static final int OP;

    //Y los inicializamos en la sección "static"
    static {
        N1 = RND.nextInt(N_MAX - N_MIN + 1) + N_MIN;
        N2 = RND.nextInt(N_MAX - N_MIN + 1) + N_MIN;
        OP = RND.nextInt(OP_MAX - OP_MIN + 1) + OP_MIN;
    }

    //Método principal, inicio de la aplicación
    public final void launchApp() {
        //Llamamos al método analizar, con los argumentos del resultado de
        //"operar" y el valor de "mainText", el cual también se obtiene en él
        analizar(UtilesPrimitivos.operar(N1, N2, OP),
                UtilesPrimitivos.mainText);
    }

    //Esta es la salida por consola del programa
    public final void analizar(double result, String mainText) {
        System.out.println("OPERACIÓN NUMÉRICA");
        System.out.println("==================");
        System.out.printf("Número 1 ...............: %d%n", N1);
        System.out.printf("Número 2 ...............: %d%n", N2);
        System.out.println("---");
        //Parseamos "result" a tipo int porque no nos interesan
        //los decimales para la realización de este ejercicio
        System.out.printf(mainText + " %d%n", (int) result);
    }
}
