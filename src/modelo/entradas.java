package modelo;

public class entradas {
    
    int identrada;
    int idProducto; 
    int stock;
    int idCategoria;       
    String fecha;
    int idproveedor;
    double precioEntrada;  
    double PrecioVenta;
    double total;
    private String nomProdTemporal;

    public entradas() {
    }

    public entradas(int identrada, int idProducto, int stock, int idCategoria, String fecha, int idproveedor, double precioEntrada, double PrecioVenta, double total) {
        this.identrada = identrada;
        this.idProducto = idProducto;
        this.stock = stock;
        this.idCategoria = idCategoria;
        this.fecha = fecha;
        this.idproveedor = idproveedor;
        this.precioEntrada = precioEntrada;
        this.PrecioVenta = PrecioVenta;
        this.total = total;
    }

    public int getIdentrada() {
        return identrada;
    }

    public void setIdentrada(int identrada) {
        this.identrada = identrada;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int IdProducto) {
        this.idProducto = IdProducto;
    }

   

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdproveedor() {
        return idproveedor;
    }

    public void setIdproveedor(int idproveedor) {
        this.idproveedor = idproveedor;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public double getPrecioVenta() {
        return PrecioVenta;
    }

    public void setPrecioVenta(double PrecioVenta) {
        this.PrecioVenta = PrecioVenta;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getNomProdTemporal() {
        return nomProdTemporal;
    }

    public void setNomProdTemporal(String nomProdTemporal) {
        this.nomProdTemporal = nomProdTemporal;
    }
    
}

    