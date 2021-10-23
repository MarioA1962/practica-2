package Problema;

import java.util.Objects;

public class Grupo {
    String codigo;
    String actividad;
    int nPlazas;
    int nMAtriculados;
    double tarifa;
    public Grupo(String codigo, String actividad, int nPlazas, int nMAtriculados, double tarifa) {
        this.codigo = codigo;
        this.actividad = actividad;
        this.nPlazas = nPlazas;
        this.nMAtriculados = nMAtriculados;
        this.tarifa = tarifa;
    }
    protected void validaCampos(){
        if(this.nPlazas<=0){
            throw new ClubException("En numero de plazas no puede ser menor o igual a cero");
        }
        if(this.nMAtriculados<=0){
            throw new ClubException("En numero de matriculados no puede ser menor o igual a cero");
        }
        if(this.tarifa<=0){
            throw new ClubException("La tarifa no puede ser menor o igual a cero");
        }
        if(this.nMAtriculados>nPlazas){
            throw new ClubException("En numero de matriculados no puede ser mayor que el numero de plazas");
        }
    }
    public Grupo(){
    }

    public String getCodigo(String s) {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public int getnPlazas() {
        return nPlazas;
    }

    public void setnPlazas(int nPlazas) {
        this.nPlazas = nPlazas;
    }

    public int getnMAtriculados() {
        return nMAtriculados;
    }

    public void setnMAtriculados(int nMAtriculados) {
        this.nMAtriculados = nMAtriculados;
    }

    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }
    public int plazasLibres(){
        int resto;
        resto = this.nPlazas-this.nMAtriculados;
        return resto;
    }
    public void actualizarPlaza(int n){
        nPlazas -= nMAtriculados;
        if(n<=0||n<nMAtriculados){
            throw new ClubException("Excepcion para actualizar plazas");
        }
    }
    public void matricular(int n){

    }

    @Override
    public String toString() {
        return codigo+" - "+actividad+" - "+tarifa+" soles - P: "+nPlazas+" - M: "+nMAtriculados;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Grupo grupo = (Grupo) o;
        return codigo.equals(grupo.codigo) && actividad.equals(grupo.actividad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo, actividad);
    }
}
