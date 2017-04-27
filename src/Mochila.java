import java.util.ArrayList;

public class Mochila {
	ArrayList<Producto> mochila;
	public int pesoMochila;

	public Mochila(int peso) {
		this.pesoMochila = peso;
		this.mochila = new ArrayList<Producto>();
	}
	
	public void mejorProd(Producto mejor, ArrayList<Producto> productos) {
		mejor = productos.get(0); //como estan ordenados siempre el primero es el mejor
		productos.remove(0);
	}
	
	public boolean factible(Producto mejor) {
		return ((pesoMochila - mejor.getPeso()) >= 0);
	}
	
	public void llenarMochila(ArrayList<Producto> productos) {
		while(!mochila.isEmpty() && !productos.isEmpty()) {
			Producto mejor = new Producto(0,0,"");
			mejorProd(mejor, productos);
			if(factible(mejor)) {
				mochila.add(mejor);
			}
		}
	}
}
