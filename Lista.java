public class Lista {
    int tamanho;
    int valor[];
    int max;

	public Lista(int tam) {
            tamanho = 0;
            valor = new int[tam];
            max = tam;
	}

   public void insert(int posicao, int chave) {
       int i;
		
            if (posicao <= tamanho) {
		if (posicao != tamanho) {
                    for (i = tamanho - 1; i >= posicao; i--) {
                        valor[i] = valor[i + 1];
                    }
		}
		valor[posicao] = chave;
		tamanho = tamanho + 1;
            }
   }

   public int get(int posicao) {
       return valor[posicao];
   }

   public void set(int posicao, int chave) {
       if (posicao < tamanho) {
           valor[posicao] = chave;
       }
   }

   public void delete(int posicao) {
       int i;
           
       if (posicao < tamanho) {
           tamanho = tamanho - 1;
           for (i = posicao; i < tamanho; i++) {
               valor[i] = valor[i + 1];
           }
       }

   }

   public int lenght() {
       return tamanho;
   }

 
}
