package com.mycompany.poke;
import java.util.ArrayList;
import java.util.Scanner;
public class POKE {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        
// creacion de ataques 
        Ataque impactrueno = new Ataque("Impactrueno", 20);
        Ataque colaFeroz = new Ataque("Cola Feroz", 15);
       
        
        Ataque lanzallamas = new Ataque("Lanza llamas", 22);
        Ataque arañazo = new Ataque("Arañazo", 12);

        Ataque pistolaAgua = new Ataque("Pistola Agua", 18);
        Ataque burbuja = new Ataque("Burbuja", 14);

        Ataque hojaAfilada = new Ataque("Hoja Afilada", 19);
        Ataque latigoCepa = new Ataque("Látigo Cepa", 13);

        Ataque confusion = new Ataque("Confusión", 25);
        Ataque golpeMental = new Ataque("Golpe Mental", 17);

        Ataque rocaAfilada = new Ataque("Roca Afilada", 23);
        Ataque cabezazo = new Ataque("Cabezazo", 16);
        
        // ahora creare los pokemones para depues poderlos poner en el arraylist
        
        Pokemon pikachu = new Pokemon("Pikachu", 100, 5);
        // ahora llamaremos al metodo agregarataque para que guarde los ataques
        // de pikachu y asi haremos con todos
        // lo ue hacemos es poner el pokemon.el metodo para agregar el ataque al arraylist y como parametro pues el ataque del personaje
        
        pikachu.agregarAtaque(impactrueno);
        pikachu.agregarAtaque(colaFeroz);
        // y asi con todos 
        
        Pokemon charmander = new Pokemon("Charmander", 100, 3);

        charmander.agregarAtaque(lanzallamas);
        charmander.agregarAtaque(arañazo);

        Pokemon squirtle = new Pokemon("Squirtle", 110, 6);

        squirtle.agregarAtaque(pistolaAgua);
        squirtle.agregarAtaque(burbuja);

        Pokemon bulbasaur = new Pokemon("Bulbasaur", 105, 4);

        bulbasaur.agregarAtaque(hojaAfilada);
        bulbasaur.agregarAtaque(latigoCepa);

        Pokemon mewtwo = new Pokemon("Mewtwo", 120, 7);

        mewtwo.agregarAtaque(confusion);
        mewtwo.agregarAtaque(golpeMental);

        Pokemon onix = new Pokemon("Onix", 130, 10);

        onix.agregarAtaque(rocaAfilada);
        onix.agregarAtaque(cabezazo);
        
        //ahora haremos un nuevo arraylist para agregar los pokemones
        // y poderlos poner y llamar de una manera mas facil

        ArrayList<Pokemon> pokemones = new ArrayList<>();
        
        pokemones.add(pikachu);
        pokemones.add(charmander);
        pokemones.add(squirtle);
        pokemones.add(bulbasaur);
        pokemones.add(mewtwo);
        pokemones.add(onix);
        
        // ahora crearemos todo lo que vera el usuario y el funcionamiento del juego
        
        System.out.println("-----BIENVENIDO A LA BATALLA POKEMON-----");
        System.out.println("===== POKEMON =====");
        System.out.println("Elige tu Pokémon:");
        // con este for nos mostrara todos los pokemones guardados en el arraylist
        // de pokemones
        for (int i = 0; i < pokemones.size(); i++) {
            System.out.println( (i + 1)+ ". "+ pokemones.get(i).nombre);
            
        }
        
        // ahora queremos la opcion del jugador a elegir
        
        int opcionPokemon = sc.nextInt();
        
        // jugador
        Pokemon jugador =
                pokemones.get(opcionPokemon - 1);

        // enemigo aleatorio
        int random =
                (int)(Math.random() * pokemones.size());

        Pokemon enemigo =
                pokemones.get(random);

        // evitar mismo pokemon
        while (enemigo == jugador) {

            random =
                    (int)(Math.random() * pokemones.size());

            enemigo =
                    pokemones.get(random);
        }

        System.out.println("\nTu Pokémon es: "
                + jugador.nombre);

        System.out.println("El enemigo eligió: "
                + enemigo.nombre);

        // =====================================
        // BATALLA
        // =====================================

        while (jugador.estaVivo() &&
               enemigo.estaVivo()) {

            // =====================================
            // TURNO JUGADOR
            // =====================================

            System.out.println("\n===== TU TURNO =====");

            System.out.println("Tu vida: "
                    + jugador.vida);

            System.out.println("Vida enemigo: "
                    + enemigo.vida);

            // mostrar ataques
            System.out.println("\nAtaques:");

            for (int i = 0;
                 i < jugador.ataques.size();
                 i++) {

                System.out.println(
                        (i + 1) + ". "
                        + jugador.ataques.get(i).nombre
                );
            }

            int opcionAtaque =
                    sc.nextInt();

            Ataque ataqueElegido =
                    jugador.ataques.get(
                            opcionAtaque - 1
                    );

            jugador.atacar(
                    enemigo,
                    ataqueElegido
            );

            // =====================================
            // TURNO ENEMIGO
            // =====================================

            if (enemigo.estaVivo()) {

                System.out.println(
                        "\n===== TURNO ENEMIGO ====="
                );

                int ataqueRandom =
                        (int)(Math.random()
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

        // =====================================
        // RESULTADO FINAL
        // =====================================

        System.out.println("\n===== RESULTADO =====");

        if (jugador.estaVivo()) {

            System.out.println("¡Ganaste!");

        } else {

            System.out.println("Perdiste...");
        }
         
    }
}
