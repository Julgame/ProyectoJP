class ClienteBronce {
    private int cedula;
    private String nombre;
    private String telefono;
    private String atributoAdicionalBronce;

    public ClienteBronce(int cedula, String nombre, String telefono, String atributoAdicionalBronce) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.atributoAdicionalBronce = atributoAdicionalBronce;
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

    public String getAtributoAdicionalBronce() {
        return atributoAdicionalBronce;
    }

    public void setAtributoAdicionalBronce(String atributoAdicionalBronce) {
        this.atributoAdicionalBronce = atributoAdicionalBronce;
    }
}