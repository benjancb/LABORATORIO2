import java.util.Objects;

public class PabellonCirugia{
    private int numero;
    private String especialidad;
    private Estado estado;

    public PabellonCirugia(int numero, String especialidad) {
        this.numero = numero;
        this.especialidad = especialidad;
        this.estado=Estado.Disponible;

    }
    public int getNumero(){
        return numero;
    }
    public String getEspecialidad(){
        return especialidad;
    }
    public Estado getEstado(){
        return estado;
    }
    public void setEstado(String estado){
        if (estado=="disponible") {
            this.estado=Estado.Disponible;

        }
        if (estado=="ocupado"){
            this.estado=Estado.Ocupado;
        }
    }

    @Override
    public String toString() {
        return "PabellonCirugia{"+ "numero=" + numero + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        PabellonCirugia otro = (PabellonCirugia) obj;
        return this.numero == otro.numero;
    }
}
