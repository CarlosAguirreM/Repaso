package repasoPrueba;

public class Main {

	public static void main(String args[]){
		
		ListaDobleEncadenada listaDoble = new ListaDobleEncadenada();
		
		listaDoble.insertarInicio(new Nodo("0",null,null));
		listaDoble.insertarInicio(new Nodo("1",null,null));
		listaDoble.insertarInicio(new Nodo("2",null,null));
		listaDoble.insertarInicio(new Nodo("3",null,null));
		listaDoble.insertarInicio(new Nodo("4",null,null));
		listaDoble.insertarInicio(new Nodo("5",null,null));
		listaDoble.insertarInicio(new Nodo("6",null,null));
		listaDoble.insertarInicio(new Nodo("7",null,null));
		listaDoble.insertarInicio(new Nodo("8",null,null));
		listaDoble.insertarInicio(new Nodo("9",null,null));
		//listaDoble.insertarInicio(new Nodo("10",null,null));
		
		listaDoble.buscarPosicion(2);
		
		System.out.println(listaDoble.recorrerLista());
		
		System.out.println(listaDoble.recorrerListaInverso());
		
	}
	
}
