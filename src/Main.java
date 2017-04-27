import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		ArrayList<Producto> productos = new ArrayList<Producto>();
		Producto p1 = new Producto(23,6,"harina");
		productos.add(p1);
		Producto p2 = new Producto(23,6,"harina");
		productos.add(p2);
		Producto p3 = new Producto(45,76,"sal");
		productos.add(p3);
		Producto p4 = new Producto(23,6,"harina");
		productos.add(p4);
		Producto p5 = new Producto(23,30,"azucar");
		productos.add(p5);
		Producto p6 = new Producto(40,45,"palta");
		productos.add(p6);
		Producto p7 = new Producto(45,76,"sal");
		productos.add(p7);
		Producto p8 = new Producto(81,56,"tomate");
		productos.add(p8);
		Producto p9 = new Producto(23,30,"azucar");
		productos.add(p9);
		Producto p10 = new Producto(42,3,"salsa");
		productos.add(p10);
		
		Collections.sort(productos);
		Collections.reverse(productos);
		
		Mochila mochila = new Mochila(150);
		mochila.llenarMochila(productos);
		
	}
}
