/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author marci
 */
public class Medico_MP extends Persona_MP
{
    private String Especialidad_MP;
    private String Anios_Experiencia_MP;

    public Medico_MP(String Especialidad_MP, String Anios_Experiencia_MP, String Nombre_MP, String Edad_MP, String Direccion_MP) {
        super(Nombre_MP, Edad_MP, Direccion_MP);
        this.Especialidad_MP = Especialidad_MP;
        this.Anios_Experiencia_MP = Anios_Experiencia_MP;
    }

    public String getEspecialidad_MP() {
        return Especialidad_MP;
    }

    public void setEspecialidad_MP(String Especialidad_MP) {
        this.Especialidad_MP = Especialidad_MP;
    }

    public String getAniosExperiencia_MP() {
        return Anios_Experiencia_MP;
    }

    public void setAniosExperiencia_MP(String AniosExperiencia_MP) {
        this.Anios_Experiencia_MP = Anios_Experiencia_MP;
    }
}
