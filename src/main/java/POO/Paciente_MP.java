/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author marci
 */
public class Paciente_MP extends Persona_MP
{
    private Integer Nro_Historial_MP;
    private String Enfermedad_MP;

    public Paciente_MP(Integer Nro_Historial_MP, String Enfermedad_MP, String Nombre_MP, Integer Edad_MP, String Direccion_MP) {
        super(Nombre_MP, Edad_MP, Direccion_MP);
        this.Nro_Historial_MP = Nro_Historial_MP;
        this.Enfermedad_MP = Enfermedad_MP;
    }

    public Integer getNro_Historial_MP() {
        return Nro_Historial_MP;
    }

    public void setNro_Historial_MP(Integer Nro_Historial_MP) {
        this.Nro_Historial_MP = Nro_Historial_MP;
    }

    public String getEnfermedad_MP() {
        return Enfermedad_MP;
    }

    public void setEnfermedad_MP(String Enfermedad_MP) {
        this.Enfermedad_MP = Enfermedad_MP;
    }
}
