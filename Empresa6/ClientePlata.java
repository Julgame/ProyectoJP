class ClientePlata extends Clientes {
    
    private String atributoAdicionalPlata;

    public ClientePlata(int cedula, String nombre, String telefono, String atributoAdicionalPlata) {
        super (cedula, nombre, telefono);
        this.atributoAdicionalPlata = atributoAdicionalPlata;
    }
    public String getAtributoAdicionalPlata() {
        return atributoAdicionalPlata;
    }

    public void setAtributoAdicionalPlata(String atributoAdicionalPlata) {
        this.atributoAdicionalPlata = atributoAdicionalPlata;
    }
}
