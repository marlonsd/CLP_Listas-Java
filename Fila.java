public class Fila extends Lista {
	int ultimo;
	

	public Fila(int tam){
            super(tam);
            ultimo = 0;

	}

	public void enqueue (int chave){
            super.insert(ultimo, chave);
            ultimo++;
	}

	public int dequeue (){
            int aux;

            aux = super.get(0);

            super.delete(0);
               
            return aux;
	}

	public int lenght(){
            return super.lenght();
	}
}
