package Problema;

import java.util.List;
import java.util.Scanner;

public class ClubDeportivo extends Grupo{
    Scanner sc = new Scanner(System.in);
    String nombre;
    List<Grupo> nGrupos;

    public ClubDeportivo(String nombre) {
        this.nombre = nombre;
    }

    public ClubDeportivo(String nombre, List<Grupo> nGrupos) {
        this.nombre = nombre;
        this.nGrupos = nGrupos;
    }
    private int buscar(Grupo g){
        return nGrupos.indexOf(g);
    }

    public void agregarActividad(String[] actividades){

    }
    public int plazasLibres(String n){
        int suma = 0;
        for(Grupo p: nGrupos){
            if(p.actividad == n){
                suma += p.nPlazas - p.nMAtriculados;
            }
        }
        return suma;

    }
    public double ingresos(){
    }
    @Override
    public String toString() {
        return "ClubDeportivo{" +
                "nombre='" + nombre + '\'' +
                ", nGrupos=" + nGrupos +
                '}';
    }
}

