package repasoPrueba;

public class ListaSimpleEncadenada {
	
	private Nodo cabeza;
	private int tamanio;
	
	public ListaSimpleEncadenada(){
		
		cabeza=null;
		tamanio=0;
		
	}
	
	public long getTamanio(){
		
		return tamanio;
		
	}
	
	public void insertarInicio(Nodo nuevo){
		
		if(tamanio==0){
			
			cabeza=nuevo;
			
		}else{
						
			nuevo.setSiguiente(cabeza);
			cabeza=nuevo;
						
		}
		
		tamanio++;
		
	}
	
	public void insertarFinal(Nodo nuevo){
		
		if(tamanio==0){
			
			cabeza=nuevo;
			
		}else{
			
			Nodo aux=cabeza;
			
			while(aux.getSiguiente()!=null){
				
				aux=aux.getSiguiente();
				
			}
			
			aux.setSiguiente(nuevo);
		}
		
		tamanio++;
		
	}
	
	public void eliminarLista(){
		
		cabeza=null;
		tamanio=0;
		
	}
	
	public String eliminarInicio(){
		
		if(tamanio==0){
			
			return cabeza.getContenido();
			
		}
		
		Nodo aux = cabeza;
		cabeza=aux.getSiguiente();
		aux=null;
		tamanio--;
		
		return cabeza.getContenido();
	}
	
	public String eliminarFinal(){
		
		if(tamanio==0){
			
			return cabeza.getContenido();
			
		}
		
		Nodo aux = cabeza;
		
		while(aux.getSiguiente()!=null){
			
			aux=aux.getSiguiente();
			
		}
		
		aux=null;
		
		tamanio--;
		
		return cabeza.getContenido();
	}
	
	public Nodo buscarContenido(int dato){
		
		Nodo aux=cabeza;
		
		while(!aux.getContenido().equals(dato) || aux.getSiguiente()!=null){
			
			if(aux.getContenido().equals(dato))
				return aux;
			
			aux=aux.getSiguiente();
			
						
		}
		
		return null;
		
	}
	
	public Nodo buscarPosicion(int posicion){
		
		if(posicion>tamanio || posicion<tamanio)
			return null;
			
		Nodo aux=cabeza;
		int pos=0;
		
		while(aux.getSiguiente()!=null || pos==posicion){
			
			if(pos==posicion)
				return aux;
			
			aux=aux.getSiguiente();
			pos++;
		}
		
		return null;		
		
	}
	
	public void eliminarNodo(int posOrDat){
		
		Nodo aux=buscarPosicion(posOrDat);
		
		Nodo aux2=cabeza;
		
		while(aux2.getSiguiente()!=buscarPosicion(posOrDat)){
			
			aux2=aux2.getSiguiente();
			
		}
		
		aux2.setSiguiente(aux.getSiguiente());
		aux=null;
		
	}
	
	public int getPosicion(int dato){
		
		Nodo aux= buscarContenido(dato);
		
		Nodo aux2=cabeza;
		
		int posicion=0;
		
		while(aux2.getSiguiente()!=null){
			
			if(aux==aux2)
				return posicion;
			
			aux2=aux2.getSiguiente();
			posicion++;
			
		}
		
		return -1;
	}
	
	public String recorrerLista(){
		
		String lista="";
		
		Nodo aux=cabeza;
		
		int posicion=0;
		
		if(tamanio==0)
			return lista;
		
		while(aux.getSiguiente()!=null){
			
			lista += (posicion+". [ "+aux.getContenido()+" ] -> "); 
			aux=aux.getSiguiente();
			posicion++;
			
		}
		
		lista+= "null";
		
		return lista;
		
	}
	
}
