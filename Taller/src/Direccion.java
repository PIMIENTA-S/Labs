public class Direccion{
    private String calle;
    private String nomenclatura;
    private String barrio;
    private String ciudad;
    private String edificio;
    private String apto;

    public Direccion(String calle, String nomenclatura, String barrio, String ciudad, String edificio, String apto){
        this.calle = calle;
        this.nomenclatura = nomenclatura;
        this.barrio = barrio;
        this.ciudad = ciudad;
        this.edificio = edificio;
        this.apto = apto;
    }
    public void setCalle(String c){
        this.calle = c;
    }
    public void setNomenclatura(String n){
        this.nomenclatura = n;
    }
    public void setBarrio(String b){
        this.barrio = b;
    }
    public void setCiudad(String ci){
        this.ciudad = ci;
    }
    public void setEdificio(String e){
        this.edificio = e;
    }
    public void setApto(String a){
        this.apto = a;
    }
    public String getCalle(){
        return calle;
    }
    public String getNomenclatura(){
        return nomenclatura;
    }
    public String getBarrio(){
        return barrio;
    }
    public String getCiudad(){
        return ciudad;
    }
    public String getEdificio(){
        return edificio;
    }
    public String getApto(){
        return apto;
    }
    @Override
    public String toString() {
        return "Direccion:\n" +
                "calle= " + calle + '\n' +
                "nomenclatura=" + nomenclatura + '\n' +
                "barrio= " + barrio + '\n' +
                "ciudad= " + ciudad + '\n' +
                "edificio= " + edificio + '\n' +
                "apto= " + apto + '\n';
    }
}


