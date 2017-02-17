package repasoPrueba;

public class ListaDobleEncadenada {
	
	private Nodo cabeza;
	private Nodo cola;
	private int tamanio;
	
	public ListaDobleEncadenada(){
		cabeza=new Nodo(null, null, null);
		cola=new Nodo(null, null, cabeza);
		cabeza.setSiguiente(cola);
		tamanio=0;
		
	}
	
	public int getTamanio(){
		
		return tamanio;
		
	}
	
	public void insertarInicio(Nodo nuevo){
		
		if(tamanio==0){
			
			cabeza.setSiguiente(nuevo);
			cola.setAnterior(nuevo);
			nuevo.setAnterior(cabeza);
			nuevo.setSiguiente(cola);
			
		}else{
			
			Nodo aux=cabeza.getSiguiente();
			
			cabeza.setSiguiente(nuevo);
			aux.setAnterior(nuevo);
			nuevo.setAnterior(cabeza);
			nuevo.setSiguiente(aux);
			
			
		}
		
		tamanio++;
		
	}
	
	public void insertarFinal(Nodo nuevo){
		
		if(tamanio==0){
			
			cabeza.setSiguiente(nuevo);
			cola.setAnterior(nuevo);
			nuevo.setAnterior(cabeza);
			nuevo.setSiguiente(cola);
			
		}else{
			
			Nodo aux=cola.getAnterior();
			
			aux.setSiguiente(nuevo);
			cola.setAnterior(nuevo);
			nuevo.setAnterior(aux);
			nuevo.setSiguiente(cola);
			
			
		}
		
		tamanio++;
		
	}
	
	public void eliminarLista(){
		
		cabeza.setSiguiente(cola);
		cola.setAnterior(cabeza);
		tamanio=0;
		
	}
	
	public void eliminarInicio(){
		
		if(tamanio==0){
			
			return;
			
		}		
		
		Nodo aux=cabeza.getSiguiente();
		
		cabeza.setSiguiente(aux.getSiguiente());
		aux.getSiguiente().setAnterior(cabeza);
		aux=null;
		
		tamanio--;
	}
	
	public void eliminarFinal(){
		
		if(tamanio==0){
			
			return;
			
		}		
		
		Nodo aux=cola.getAnterior();
		
		cola.setAnterior(aux.getAnterior());
		aux.getAnterior().setSiguiente(cola);
		aux=null;
		
		tamanio--;
	}
	
	public Nodo buscarContenido(String dato){
		
		Nodo aux = cabeza.getSiguiente();
		
		while(aux.getSiguiente()!=cola || aux.getContenido().equals(dato)){
			
			if(aux.getContenido().equals(dato))
				return aux;
			
			aux=aux.getSiguiente();
			
		}
		
		return null;
	}
	
	public Nodo buscarPosicion(int posicion){
		
		if(posicion>tamanio || posicion<tamanio)
			return null;
		
		Nodo aux = cabeza.getSiguiente();
		int pos=0;
		
		while(aux.getSiguiente()!=cola || posicion!=pos){
			
			if(posicion==pos)
				return aux;
			
			aux=aux.getSiguiente();
			posicion=pos;
			
		}
		
		return null;
	}
	
	public void editarContenido(String dato, String nuevoDato){
		
		Nodo aux=buscarContenido(dato);
		
		aux.setContenido(nuevoDato);
		
	}
	
	public void editarPosicion(int posicion, String nuevoDato){
		
		Nodo aux=buscarPosicion(posicion);
		
		aux.setContenido(nuevoDato);
		
	}
	
	public void insertarNodoPosicion(int posicion, Nodo nuevo){
		
		Nodo aux=buscarPosicion(posicion);
		
		Nodo aux2=buscarPosicion(posicion-1);
		
		aux2.setSiguiente(nuevo);
		aux.setAnterior(nuevo);
		
		nuevo.setAnterior(aux2);
		nuevo.setSiguiente(aux);
		
	}
	
	public void insertarAntesCont(String dato, Nodo nuevo){
		
		Nodo aux = buscarContenido(dato);
		
		Nodo aux2 = aux.getAnterior();
		
		aux2.setSiguiente(nuevo);
		aux.setAnterior(nuevo);
		
		nuevo.setAnterior(aux2);
		nuevo.setSiguiente(aux);
		
	}
	
	public void insertarDespuesCont(String dato, Nodo nuevo){
		
		Nodo aux = buscarContenido(dato);
		
		Nodo aux2 = aux.getSiguiente();
		
		aux2.setAnterior(nuevo);
		aux.setSiguiente(nuevo);
		
		nuevo.setAnterior(aux);
		nuevo.setSiguiente(aux2);
		
	}
	
	public String recorrerLista(){
		
		String lista="";
		
		Nodo aux=cabeza.getSiguiente();
		
		int posicion=0;
		
		if(tamanio==0)
			return lista;
		
		lista="cabeza -> ";
		
		while(aux!=cola){
			
			lista += posicion + ". ["+aux.getContenido()+"] ->";
			aux=aux.getSiguiente();
			posicion++;
			
		}
		
		lista+=" cola";
		
		return lista;
		
	}
	
	public String recorrerListaInverso(){
		
		String lista="";
		
		Nodo aux=cola.getAnterior();
		
		int posicion=tamanio-1;
		
		if(tamanio==0)
			return lista;
		
		lista="cola -> ";
		
		while(aux!=cabeza){
			
			lista += posicion + ". ["+aux.getContenido()+"] ->";
			aux=aux.getAnterior();
			posicion--;
			
		}
		
		lista+=" cabeza";
		
		return lista;
		
	}

}
