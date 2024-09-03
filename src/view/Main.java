package view;

import model.Pilha;

public class Main {

	public static void main(String[] args) {
		Pilha p = new Pilha();
		
		
		int[] vetor = {19, 44, -1, 8, -10, 75, -15, 0};
		int menor = vetor[0];
		
		for(int i:vetor) {
			p.push(i);
		}
		
		try {
			while(!p.isEmpty()) {
				if(p.top() < menor) {
					menor = p.pop();
				} else {
					p.pop();
				}
			}	
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		p.push(menor);
		
		try {
			System.out.println(p.top());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
