package mx.utng.s09;

public class Vehiculo {
    private Combustible combustible;
    private Llanta[] llanta = new Llanta[4];
    private String marca;
    private String modelo;
    private int anioFabricacion;
    
    public Combustible getCombustible() {
        return combustible;
    }
    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }
    public Llanta[] getLlanta() {
        return llanta;
    }
    public void setLlanta(Llanta[] llanta) {
        this.llanta = llanta;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAnioFabricacion() {
        return anioFabricacion;
    }
    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    
}
