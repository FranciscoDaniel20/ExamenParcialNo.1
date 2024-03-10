package com.mycompany.clasesjava.controller;

public class Empleado extends AbstractPersona {

    private int codigo;
    private String curso;
    private int ciclo;

    public Empleado(int id, String nombre, String apellido, String direccion, int telefono, int codigo, String curso, int ciclo) {
        super(id, nombre, apellido, direccion, telefono);
        this.codigo = codigo;
        this.curso = curso;
        this.ciclo = ciclo;
    }

    @Override
    public void ConsultarPersona() {
        System.out.println(this.getId() + " " + this.getNombre() + " " + this.getApellido() + " "
                + this.getDireccion() + " " + this.getTelefono());
    }

    public void GuardarAlumno(Empleado alumno) {
        this.setCodigo(alumno.getCodigo());
        this.setCurso(alumno.getCurso());
        this.setCiclo(alumno.getCiclo());
    }

    public void ObtenerAlumno() {
        System.out.println(this.codigo + " " + this.ciclo + " " + this.curso);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getCiclo() {
        return ciclo;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

}
