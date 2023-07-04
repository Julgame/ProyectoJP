class ClientePlata {
    private int cedula;
    private String nombre;
    private String telefono;
    private String atributoAdicionalPlata;

    public ClientePlata(int cedula, String nombre, String telefono, String atributoAdicionalPlata) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.atributoAdicionalPlata = atributoAdicionalPlata;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getAtributoAdicionalPlata() {
        return atributoAdicionalPlata;
    }

    public void setAtributoAdicionalPlata(String atributoAdicionalPlata) {
        this.atributoAdicionalPlata = atributoAdicionalPlata;
    }
}
