package Problema;

public class ClubException extends RuntimeException{
    public ClubException(){ super();}
    public ClubException(String mensaje){ super(mensaje);}
    public ClubException(String mensaje,Throwable p){ super(mensaje, p);}
}
