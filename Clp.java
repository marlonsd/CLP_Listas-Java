public class Clp {

    public static void main(String[] args) {
        
//      -- Lista
        System.out.println("-- Lista");
        int i, op;
        Lista descritor = new Lista(10);
      
		for (i = 0; i < 10; i++){
			op = i * (5) + 8;
			descritor.insert(i,op);
		}
		
		System.out.println();
		System.out.println("Tamanho: " + descritor.lenght());
		System.out.println();
		
		for (i = 0; i < descritor.lenght(); i++){
			op = descritor.get(i);
			System.out.print("Valor ["); System.out.print(i); System.out.println("]:  "+ op);
		}
		
		descritor.delete(5);
		
		System.out.println();
		System.out.println("Tamanho: " + descritor.lenght());
		System.out.println();
		
		for (i = 0; i < descritor.lenght(); i++){
			op = descritor.get(i);
			System.out.print("Valor ["); System.out.print(i); System.out.println("]:  "+ op);
		}
		System.out.println();
		System.out.println();
			
//      -- Fila
        System.out.println("-- Fila");
        int f, opf, tamf;
        Fila descritorf = new Fila(10);
      
		for (f = 0; f < 10; f++){
			opf = f * (5) + 8;
			descritorf.enqueue(opf);
		}
		
		System.out.println();
		System.out.println("Tamanho: " + descritorf.lenght());
		System.out.println();
			
		tamf = descritorf.lenght();
		
		for (f = 0; f < tamf; f++){
			opf = descritorf.dequeue();
			System.out.print("Valor ["); System.out.print(f); System.out.println("]:  "+ opf);
		}
			
		System.out.println();
		tamf = descritorf.lenght();
		System.out.println("Tamanho: " + tamf);
		
		for (f = 0; f < tamf; f++){
			opf = descritorf.dequeue();
			System.out.print("Valor ["); System.out.print(f); System.out.println("]:  "+ opf);
		}
        System.out.println();
        System.out.println();
        
//      -- Pilha
        System.out.println("-- Pilha");
        int p, opp, tamp;
        Pilha descritorp = new Pilha(10);
      
		for (p = 0; p < 10; p++){
			opp = p * (5) + 8;
			descritorp.push(opp);
		}
		
		System.out.println();
		System.out.println("Tamanho: " + descritorp.lenght());
		System.out.println();
			
		tamp = descritorp.lenght();
			
		for (p = 0; p < tamp; p++){
			opp = descritorp.pop();
			System.out.print("Valor ["); System.out.print(p); System.out.println("]:  "+ opp);
		}
			System.out.println();
			System.out.println("Tamanho: " + descritorp.lenght());
			System.out.println();
		}
		
		
}
