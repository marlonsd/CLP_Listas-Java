public class Pilha extends Lista {
    int ultimo;

	public Pilha (int tam){
            super(tam);
            ultimo = 0;
	}

	public void push(int chave){
            super.insert(ultimo, chave);
            ultimo++;
	}

	public int pop(){
            int aux;

            aux = super.get(ultimo - 1);
            super.delete(ultimo - 1);
                
            ultimo --;
            return aux;
	}

	public int top(){
            return super.get(ultimo - 1);
	}

	public int lenght(){
            return super.lenght();
	}
}
