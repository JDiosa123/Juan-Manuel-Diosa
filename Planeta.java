import javax.swing.*;

class Planeta {
   
    private String nombre;
    private int cantidadSatelites;
    private double masa;  
    private double volumen;  
    private double diametro;  
    private double distanciaSol; 
    private boolean observable;

    
    public Planeta(String nombre, int cantidadSatelites, double masa, double volumen, double diametro, double distanciaSol, boolean observable) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.observable = observable;
    }

    
    public double calcularDensidad() {
        return masa / volumen;
    }

    
    public void imprimirDatos() {
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre);
        JOptionPane.showMessageDialog(null, "Cantidad de Satélites: " + cantidadSatelites);
        JOptionPane.showMessageDialog(null, "Masa: " + masa + " kg");
        JOptionPane.showMessageDialog(null, "Volumen: " + volumen + " km^3");
        JOptionPane.showMessageDialog(null, "Diámetro: " + diametro + " km");
        JOptionPane.showMessageDialog(null, "Distancia al Sol: " + distanciaSol + " km");
        JOptionPane.showMessageDialog(null, "Es observable: " + (observable ? "Sí" : "No"));
        JOptionPane.showMessageDialog(null, "Densidad: " + calcularDensidad() + " kg/km^3");
    }

   
    public static void main(String[] args) {
        
        Planeta p1 = new Planeta("Tierra", 1, 5.9736E24, 1.08321E12, 12742, 150000000, true);
        Planeta p2 = new Planeta("Jupiter", 1, 1.899E27, 1.4313E15, 139820, 750000000, true);

       
        JOptionPane.showMessageDialog(null,"Datos del planeta 1 (Tierra):");
        p1.imprimirDatos();
       

        JOptionPane.showMessageDialog(null, "Datos del planeta 2 (Júpiter):");
        p2.imprimirDatos();
    }
}
