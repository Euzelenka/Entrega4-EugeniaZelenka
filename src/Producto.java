
public class Producto implements Comparable<Producto>{
	private int peso;
	private int valor;
	private String nombre;
	
	public Producto(int p, int v, String nom) {
		peso = p;
		nombre = nom;
		valor = v;
	}
	
	public int getValor() {
		return valor;
	}
	
	public int getPeso() {
		return peso;
	}
	
	public void setPeso(int p) {
		peso = p;
	}
	
	public void setValor(int v) {
		valor = v;
	}
	
	public void setNombre(String nom) {
		nombre = nom;
	}
	
	public String getNombre() {
		return nombre;
	}

	@Override
	public int compareTo(Producto p) {
		double val = ((this.getValor()/(this.getPeso()*1.0)) - (p.getValor()/(p.getPeso()*1.0))); 
		return val == 0 ? 0 : (val > 0 ? 1 : -1);
	}
}
