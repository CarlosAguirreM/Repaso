package repasoPrueba;

public class Nodo {
	
/*	private int contenido;
	private Nodo siguiente;
	private Nodo anterior;
	
	public Nodo(){
		
		this.contenido=0;
		this.siguiente=null;
		this.anterior=null;
		
	}
	
	public Nodo(int cont, Nodo sig, Nodo ant){
		
		this.contenido=cont;
		this.siguiente=sig;
		this.anterior=ant;
		
	}
	
	public Nodo(int cont, Nodo sig){
	
		this.contenido=cont;
		this.siguiente=sig;
		this.anterior=null;
		
	}	
	
	public int getContenido() {
		return contenido;
	}
	public void setContenido(int contenido) {
		this.contenido = contenido;
	}
	public Nodo getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	public Nodo getAnterior() {
		return anterior;
	}
	public void setAnterior(Nodo anterior) {
		this.anterior = anterior;
	}*/
	
	private String contenido;
	private Nodo siguiente;
	private Nodo anterior;
	
	public Nodo(){
		
		this.contenido=null;
		this.siguiente=null;
		this.anterior=null;
		
	}
	
	public Nodo(String cont, Nodo sig, Nodo ant){
		
		this.contenido=cont;
		this.siguiente=sig;
		this.anterior=ant;
		
	}
	
	public Nodo(String cont, Nodo sig){
	
		this.contenido=cont;
		this.siguiente=sig;
		this.anterior=null;
		
	}	
	
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	public Nodo getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	public Nodo getAnterior() {
		return anterior;
	}
	public void setAnterior(Nodo anterior) {
		this.anterior = anterior;
	}
	
	@Override
	public String toString() {
		return "Contenido=" + contenido 
				+ "\nSiguiente=" + siguiente.getContenido()
				+ " \nAnterior=" + anterior.getContenido();
	}
	
	

}
