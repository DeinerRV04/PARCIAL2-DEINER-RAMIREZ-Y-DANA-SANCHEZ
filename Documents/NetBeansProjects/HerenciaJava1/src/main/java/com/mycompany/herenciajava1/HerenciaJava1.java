package com.mycompany.herenciajava1;


public class HerenciaJava1 {

    public static void main(String[] args) {
        Humano adulto=new Humano();
        adulto.setNombre("freddy");
        adulto.comer(adulto.getNombre());
        adulto.dormir();
        System.out.println();
        //Crear Objeto Clase Hija -> HOmbre
        Hombre padre=new Hombre();
        padre.setNombre("Nicolas");
        padre.comer(padre.getNombre());
        padre.dormir();
        padre.afeitarce();
        System.out.println();
        //CrearmObjeto Hija -> Mujer
        Mujer madre=new Mujer();
        madre.setNombre("Gloria");
        madre.comer(madre.getNombre());
        madre.dormir();
        madre.maquillarse(madre.getNombre());
        
    }
}
