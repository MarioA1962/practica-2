package Problema;

public class GrupoMain {
    public GrupoMain() {
    }
    public static void main(String[] args) {
        Grupo grupo1 = new Grupo("456B", "Pilates", 8, 5, 50.0f);
        System.out.println(grupo1);
        Grupo grupo2 = new Grupo("123A", "Aerobic", 15, 10, 30.0f);
        System.out.println(grupo2);
        if(grupo1.equals(grupo2) == true){
            System.out.println("Los grupos analizados son iguales");
        }else{
            System.out.println("Los grupos analizados no son iguales");
        }
        grupo2.matricular(10);
    }
}
