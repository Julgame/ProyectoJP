class ClienteOro {
    private int cedula;
    private String nombre;
    private String telefono;
    private String atributoAdicionalOro;

    public ClienteOro(int cedula, String nombre, String telefono, String atributoAdicionalOro) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.atributoAdicionalOro = atributoAdicionalOro;
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

    public String getAtributoAdicionalOro() {
        return atributoAdicionalOro;
    }

    public void setAtributoAdicionalOro(String atributoAdicionalOro) {
        this.atributoAdicionalOro = atributoAdicionalOro;
    }
}






