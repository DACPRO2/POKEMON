
package com.mycompany.poke;


public class Pokemon {
    
   String nombre;
    int vida;
    int defensa;
    int ataque;

    Ataque ataque1;
    Ataque ataque2;

    public Pokemon(String nombre, int vida, int defensa, int ataque, Ataque ataque1, Ataque ataque2) {
        this.nombre = nombre;
        this.vida = vida;
        this.defensa = defensa;
        this.ataque = ataque;
        this.ataque1 = ataque1;
        this.ataque2 = ataque2;
    }
    public void ataque(Pokemon enemigo,Ataque ataque){
        int dañoReal = ataque.daño - enemigo.defensa;
        
        if (dañoReal < 0) {
            dañoReal = 1;
        }
        
        enemigo.vida -= dañoReal;
        
        if (enemigo.vida < 0) {
            enemigo.vida = 0;
        }
        
        System.out.println( nombre +" uso "+ ataque.nombre);
        System.out.println( "Daño realizado:" + dañoReal);
        System.out.println( "Daño realizado:" + dañoReal);
        
    }
    
    
}
