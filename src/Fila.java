
public class Fila {
	
	private static Fila _fila;
	
	private Fila() {}
	
	public void imprimeDocumento() {};
	public void removeDocumento() {};
	public void removeTodosDocumentos() {};
	
	public static Fila getInstance() {
		if (_fila==null) {
			_fila=new Fila();
		}
		
		return _fila;
	}
}
