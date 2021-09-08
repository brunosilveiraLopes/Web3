import java.util.Scanner;

	public class Main {
	    private static final String RESULTADO = "resultado � %s (Bruno Silveira Lopes)";

	    public static void main(String[] args) {
	        System.out.println("Calculos F�sicos\n========");

	        try {
	            System.out.println(
	                    "Escolha a opera��o: \n[1] - For�a Peso\n[2] - For�a Centripeta\n[3] - Impulso\n[4] - For�a El�stica\n[5] - Velocidade M�dia\n[6] - Movimento Retil�neo Uniforme(MRU)\n[7] - Movimento Retil�neo Uniformemte Variado(MRUV) ");
	            Scanner teclado = new Scanner(System.in);
	            int op = teclado.nextInt();

	            if (op == 1) {

	                System.out.println("Digite o valor da massa: ");
	                Float num1 = teclado.nextFloat();
	                System.out.println("Digite o valor da acelera��o: ");
	                Float num2 = teclado.nextFloat();

	                forcaPeso(num1, num2);

	                teclado.close();

	            } else if (op == 2) {

	                System.out.println("Digite o valor da massa: ");
	                Float num1 = teclado.nextFloat();
	                System.out.println("Digite o valor da velocidade: ");
	                Float num2 = teclado.nextFloat();
	                System.out.println("Digite o valor do raio: ");
	                Float num3 = teclado.nextFloat();

	                forcaCentripeta(num1, num2, num3);

	                teclado.close();
	            } else if (op == 3) {

	                System.out.println("Digite o valor da for�a aplicada: ");
	                Float num1 = teclado.nextFloat();
	                System.out.println("Digite o tempo: ");
	                Float num2 = teclado.nextFloat();

	                impulso(num1, num2);

	                teclado.close();
	            } else if (op == 4) {

	                System.out.println("Digite a constante el�stica: ");
	                Float num1 = teclado.nextFloat();
	                System.out.println("Digite a varia��o el�stica: ");
	                Float num2 = teclado.nextFloat();

	                forcaElastica(num1, num2);

	                teclado.close();
	            } else if (op == 5) {

	                System.out.println("Digite a distancia percorrida: ");
	                Float num1 = teclado.nextFloat();
	                System.out.println("Digite o tempo decorrido: ");
	                Float num2 = teclado.nextFloat();

	                velocidadeMedia(num1, num2);

	                teclado.close();
	            } else if (op == 6) {

	                System.out.println("Digite a posi��o inicial: ");
	                Float num1 = teclado.nextFloat();
	                System.out.println("Digite a velocidade: ");
	                Float num2 = teclado.nextFloat();
	                System.out.println("Digite o tempo: ");
	                Float num3 = teclado.nextFloat();

	                funcaoMRU(num1, num2, num3);

	                teclado.close();
	            } else if (op == 7) {

	                System.out.println("Digite a velocidade inicial: ");
	                Float num1 = teclado.nextFloat();
	                System.out.println("Digite a acelera��o: ");
	                Float num2 = teclado.nextFloat();
	                System.out.println("Digite o tempo decorrido: ");
	                Float num3 = teclado.nextFloat();

	                funcaoMRUV(num1, num2, num3);

	                teclado.close();
	            } else
	                System.out.println("Digito incorreto. Programa encerrado");

	        } catch (Exception ex) {
	            int op = 0;
	            System.out.println("Digito incorreto. Programa encerrado");

	        }

	    }

	    public static float forcaPeso(float massa, float acelGrav) {
	        float fpeso = massa * acelGrav;
	        System.out.printf(RESULTADO, fpeso);
	        return fpeso;

	    }

	    public static float forcaCentripeta(float massa, float velocidade, float raio) {
	        float fCent = massa * (velocidade * velocidade) / raio;
	        System.out.printf(RESULTADO, fCent);
	        return fCent;
	    }

	    public static float impulso(float forcaV, float tempo) {
	        float imp = forcaV * tempo;
	        System.out.printf(RESULTADO, imp);
	        return imp;
	    }

	    public static float forcaElastica(float constanteElastica, float variacaoElastica) {
	        float forcaEl = constanteElastica * variacaoElastica;
	        System.out.printf(RESULTADO, forcaEl);
	        return forcaEl;
	    }

	    public static float velocidadeMedia(float distancia, float tempo) {
	        float velMedia = distancia / tempo;
	        System.out.printf(RESULTADO, velMedia);
	        return velMedia;
	    }

	    public static float funcaoMRU(float posicaoInicial, float velocidade, float tempo) {
	        float funcMRU = posicaoInicial + velocidade * tempo;
	        System.out.printf(RESULTADO, funcMRU);
	        return funcMRU;
	    }

	    public static float funcaoMRUV(float velocidadeInicial, float aceleracao, float tempo) {
	        float funcMRUV = velocidadeInicial + aceleracao * tempo;
	        System.out.printf(RESULTADO, funcMRUV);
	        return funcMRUV;
	    }

	}

