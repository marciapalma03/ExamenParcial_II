/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POO;

/**
 *
 * @author marci
 */
public class Persona_MP 
{
    private String Nombre_MP;
    private Integer Edad_MP;
    private String Direccion_MP;

    public Persona_MP(String Nombre_MP, Integer Edad_MP, String Direccion_MP) {
        this.Nombre_MP = Nombre_MP;
        this.Edad_MP = Edad_MP;
        this.Direccion_MP = Direccion_MP;
    }

    public String getNombre_MP() {
        return Nombre_MP;
    }

    public void setNombre_MP(String Nombre_MP) {
        this.Nombre_MP = Nombre_MP;
    }

    public Integer getEdad_MP() {
        return Edad_MP;
    }

    public void setEdad_MP(Integer Edad_MP) {
        this.Edad_MP = Edad_MP;
    }

    public String getDireccion_MP() {
        return Direccion_MP;
    }

    public void setDireccion_MP(String Direccion_MP) {
        this.Direccion_MP = Direccion_MP;
    }
}
