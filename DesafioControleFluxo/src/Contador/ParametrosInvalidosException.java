package Contador;

public class ParametrosInvalidosException {

	public static void main(String[] args) throws ParametrosInvalidosExcception, ParametrosInvalosException {
		try {
			int parametroUm = Integer.parseInt(args[0]);
			int parametroDois = Integer.parseInt(args[1]);
			
			if(parametroUm > parametroDois) {
				throw new ParametrosInvalosException("O segundo parametro deve ser maior que o primeiro");
				
			}
			
			for (int i = parametroUm;i <= parametroDois; i++) {
			System.out.println("Imprimindo o numero" + i);
			
		    }
			
		}catch (ArrayIndexOutOfBoundsException e) {	
			
			System.out.println("Informe dois numeros inteiros como parametro");
		}catch (NumberFormatException e) {
			
			System.out.println("Informe numeros inteiros validos como paramtros");
		
		}

	}

	private char[] getMessage() {
		// TODO Auto-generated method stub
		return null;
	}

}
