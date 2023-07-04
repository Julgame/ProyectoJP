class ClienteOro extends Clientes {
    private String atributoAdicionalOro;

    public ClienteOro(int cedula, String nombre, String telefono, String atributoAdicionalOro) {
        super (cedula,nombre,telefono);
        this.atributoAdicionalOro = atributoAdicionalOro;
    }
    public String getAtributoAdicionalOro() {
        return atributoAdicionalOro;
    }

    public void setAtributoAdicionalOro(String atributoAdicionalOro) {
        this.atributoAdicionalOro = atributoAdicionalOro;
    }
}






