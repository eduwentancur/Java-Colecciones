
package Principal;


import java.util.Objects;




public class Pais implements Comparable<Pais>{

    private String nombrePais ;

    public Pais() {
        
    }

    public Pais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    @Override
    public String toString() {
        return "Pais{" + "nombrePais=" + nombrePais + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.nombrePais);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pais other = (Pais) obj;
        if (!Objects.equals(this.nombrePais, other.nombrePais)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Pais o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
    
    
    
    
    
    
    
    
    
}
