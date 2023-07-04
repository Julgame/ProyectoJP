class ClienteBronce extends Clientes{
    private String atributoAdicionalBronce;

    public ClienteBronce(int cedula, String nombre, String telefono, String atributoAdicionalBronce) {
       super (cedula,nombre,telefono);
       this.atributoAdicionalBronce = atributoAdicionalBronce;
    }
    public String getAtributoAdicionalBronce() {
        return atributoAdicionalBronce;
    }
    public void setAtributoAdicionalBronce(String atributoAdicionalBronce) {
        this.atributoAdicionalBronce = atributoAdicionalBronce;
    }
}