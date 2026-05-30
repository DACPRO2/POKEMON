package com.mycompany.poke;

import java.util.ArrayList;
import java.util.Scanner;

public class POKE {

    public static int pedirOpcionValida(Scanner sc, int minimo, int maximo) {

        int opcion;

        while (true) {

            if (sc.hasNextInt()) {

                opcion = sc.nextInt();

                if (opcion >= minimo && opcion <= maximo) {
                    return opcion;
                }
            } else {
                sc.next();
            }

            System.out.print("❌ Opción inválida. Intenta nuevamente: ");
        }
    }
// metodo para mostrar una quepeña barra de vida
    public static String barraVida(int vida) {

        String barra = "";

        for (int i = 0; i < vida / 10; i++) {
            barra += "█";
        }

        return barra;
    }
// metodo para mostrar un estado del pokemon mas amigable
    public static void mostrarEstado(Pokemon jugador, Pokemon enemigo) {

        System.out.println("\n═══════════════════════════════════════");

        System.out.println("⚡ " + jugador.nombre);
        System.out.println("❤️ Vida: " + jugador.vida);
        System.out.println(barraVida(jugador.vida));

        System.out.println();

        System.out.println("👹 " + enemigo.nombre);
        System.out.println("❤️ Vida: " + enemigo.vida);
        System.out.println(barraVida(enemigo.vida));

        System.out.println("═══════════════════════════════════════");
    }

    public static void main(String[] args) {

        System.out.println(
"████████╗ ██████╗ ██████╗ ███╗   ██╗███████╗ ██████╗ \n" +
"╚══██╔══╝██╔═══██╗██╔══██╗████╗  ██║██╔════╝██╔═══██╗\n" +
"   ██║   ██║   ██║██████╔╝██╔██╗ ██║█████╗  ██║   ██║\n" +
"   ██║   ██║   ██║██╔══██╗██║╚██╗██║██╔══╝  ██║   ██║\n" +
"   ██║   ╚██████╔╝██║  ██║██║ ╚████║███████╗╚██████╔╝\n" +
"   ╚═╝    ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝╚══════╝ ╚═════╝ \n");

System.out.println(
"██████╗  ██████╗ ██╗  ██╗███████╗███╗   ███╗ ██████╗ ███╗   ██╗\n" +
"██╔══██╗██╔═══██╗██║ ██╔╝██╔════╝████╗ ████║██╔═══██╗████╗  ██║\n" +
"██████╔╝██║   ██║█████╔╝ █████╗  ██╔████╔██║██║   ██║██╔██╗ ██║\n" +
"██╔═══╝ ██║   ██║██╔═██╗ ██╔══╝  ██║╚██╔╝██║██║   ██║██║╚██╗██║\n" +
"██║     ╚██████╔╝██║  ██╗███████╗██║ ╚═╝ ██║╚██████╔╝██║ ╚████║\n" +
"╚═╝      ╚═════╝ ╚═╝  ╚═╝╚══════╝╚═╝     ╚═╝ ╚═════╝ ╚═╝  ╚═══╝");

System.out.println("\n⚔️ ¡BIENVENIDO AL TORNEO POKÉMON! ⚔️\n");
        Scanner sc = new Scanner(System.in);

        // CREACIÓN DE ATAQUES

        Ataque impactrueno = new Ataque("Impactrueno", 20);
        Ataque colaFeroz = new Ataque("Cola Feroz", 15);
        Ataque rayo = new Ataque("Rayo", 28);
        Ataque ataqueRapido = new Ataque("Ataque Rápido", 18);


        Ataque lanzallamas = new Ataque("Lanzallamas", 22);
        Ataque arañazo = new Ataque("Arañazo", 12);
        Ataque giroFuego = new Ataque("Giro Fuego", 26);
        Ataque ascuas = new Ataque("Ascuas", 16);


        Ataque pistolaAgua = new Ataque("Pistola Agua", 18);
        Ataque burbuja = new Ataque("Burbuja", 14);
        Ataque hidroBomba = new Ataque("Hidrobomba", 30);
        Ataque acuaCola = new Ataque("Acua Cola", 20);


        Ataque hojaAfilada = new Ataque("Hoja Afilada", 19);
        Ataque latigoCepa = new Ataque("Látigo Cepa", 13);
        Ataque rayoSolar = new Ataque("Rayo Solar", 29);
        Ataque drenadoras = new Ataque("Drenadoras", 17);


        Ataque confusion = new Ataque("Confusión", 25);
        Ataque golpeMental = new Ataque("Golpe Mental", 17);
        Ataque psiquico = new Ataque("Psíquico", 32);
        Ataque ondaMental = new Ataque("Onda Mental", 22);

        Ataque rocaAfilada = new Ataque("Roca Afilada", 23);
        Ataque cabezazo = new Ataque("Cabezazo", 16);
        Ataque terremoto = new Ataque("Terremoto", 31);
        Ataque avalancha = new Ataque("Avalancha", 24);

        // POKÉMONS

        Pokemon pikachu = new Pokemon("Pikachu", 100, 5);
        pikachu.agregarAtaque(impactrueno);
        pikachu.agregarAtaque(colaFeroz);
        pikachu.agregarAtaque(rayo);
        pikachu.agregarAtaque(ataqueRapido);

        Pokemon charmander = new Pokemon("Charmander", 100, 3);
        charmander.agregarAtaque(lanzallamas);
        charmander.agregarAtaque(arañazo);
        charmander.agregarAtaque(giroFuego);
        charmander.agregarAtaque(ascuas);

        Pokemon squirtle = new Pokemon("Squirtle", 110, 6);
        squirtle.agregarAtaque(pistolaAgua);
        squirtle.agregarAtaque(burbuja);
        squirtle.agregarAtaque(hidroBomba);
        squirtle.agregarAtaque(acuaCola);

        Pokemon bulbasaur = new Pokemon("Bulbasaur", 105, 4);
        bulbasaur.agregarAtaque(hojaAfilada);
        bulbasaur.agregarAtaque(latigoCepa);
        bulbasaur.agregarAtaque(rayoSolar);
        bulbasaur.agregarAtaque(drenadoras);

        Pokemon mewtwo = new Pokemon("Mewtwo", 120, 7);
        mewtwo.agregarAtaque(confusion);
        mewtwo.agregarAtaque(golpeMental);
        mewtwo.agregarAtaque(psiquico);
        mewtwo.agregarAtaque(ondaMental);

        Pokemon onix = new Pokemon("Onix", 130, 10);
        onix.agregarAtaque(rocaAfilada);
        onix.agregarAtaque(cabezazo);
        onix.agregarAtaque(terremoto);
        onix.agregarAtaque(avalancha);

        // ARRAYLIST

        ArrayList<Pokemon> pokemones = new ArrayList<>();

        pokemones.add(pikachu);
        pokemones.add(charmander);
        pokemones.add(squirtle);
        pokemones.add(bulbasaur);
        pokemones.add(mewtwo);
        pokemones.add(onix);

        // MENÚ

        System.out.println("═══════════════════════════════════════");
        System.out.println("           TORNEO POKÉMON");
        System.out.println("═══════════════════════════════════════");
        System.out.println();

        System.out.println("🎯 Elige tu Pokémon:\n");

        for (int i = 0; i < pokemones.size(); i++) {

            System.out.println(
                    (i + 1) + ". "
                    + pokemones.get(i).nombre
                    + " ❤️ "
                    + pokemones.get(i).vida
            );
        }

        System.out.print("\nSelecciona un Pokémon: ");

        int opcionPokemon =
                pedirOpcionValida(
                        sc,
                        1,
                        pokemones.size()
                );

        Pokemon jugador =
                pokemones.get(opcionPokemon - 1);

        int random =
                (int) (Math.random() * pokemones.size());

        Pokemon enemigo =
                pokemones.get(random);

        while (enemigo == jugador) {

            random =
                    (int) (Math.random() * pokemones.size());

            enemigo =
                    pokemones.get(random);
        }

        System.out.println("\n⚡ Tu Pokémon es: "
                + jugador.nombre);

        System.out.println("👹 El enemigo eligió: "
                + enemigo.nombre);

        System.out.println("\n═══════════════════════════════════════");
        System.out.println("         ¡COMIENZA LA BATALLA!");
        System.out.println("═══════════════════════════════════════");

        while (jugador.estaVivo() &&
                enemigo.estaVivo()) {

            mostrarEstado(jugador, enemigo);

            System.out.println("\n🔥 TU TURNO 🔥");

            System.out.println("\nAtaques disponibles:");

            for (int i = 0;
                    i < jugador.ataques.size();
                    i++) {

                System.out.println(
                        (i + 1) + ". "
                        + jugador.ataques.get(i).nombre
                );
            }

            System.out.print("\nSelecciona un ataque: ");

            int opcionAtaque =
                    pedirOpcionValida(
                            sc,
                            1,
                            jugador.ataques.size()
                    );

            Ataque ataqueElegido =
                    jugador.ataques.get(
                            opcionAtaque - 1
                    );

            jugador.atacar(
                    enemigo,
                    ataqueElegido
            );

            if (enemigo.estaVivo()) {

                System.out.println(
                        "\n⚔️ TURNO DEL ENEMIGO ⚔️"
                );

                int ataqueRandom =
                        (int) (Math.random()
                        * enemigo.ataques.size());

                Ataque ataqueEnemigo =
                        enemigo.ataques.get(
                                ataqueRandom
                        );

                enemigo.atacar(
                        jugador,
                        ataqueEnemigo
                );
            }
        }

        System.out.println("\n═══════════════════════════════════════");
        System.out.println("          RESULTADO FINAL");
        System.out.println("═══════════════════════════════════════");

        if (jugador.estaVivo()) {

            System.out.println("🏆 ¡GANASTE EL TORNEO!");

        } else {

            System.out.println("💀 HAS SIDO DERROTADO");
        }

        System.out.println("═══════════════════════════════════════");
    }
}