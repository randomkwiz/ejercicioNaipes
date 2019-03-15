/*
 * 
 * Alumna: Angela Vazquez Dominguez
 * Nombre programa: MenuNaipeExamen
 * 
 * ANALISIS DE BUCLES de pintarRombo:
 * Bucle: pedirValidarNumero
 * 	->Bucle controlado por dato centinela (por suceso)
 * 	->Se inicializa por lectura anticipada y se actualiza por lectura final
 * 	->Al ser una estructura repetir-mientras, coincide fisicamente el lugar donde se inicializa y el lugar donde se actualiza.
 * 	->He llamado numeroPintarRombo a la VCB.
 * 	->La condicion de entrada al bucle es: (numeroPintarRombo<1 || numeroPintarRombo>9 || (numeroPintarRombo %2 == 0).
 * 	->La condicion de salida del bucle es: (numeroPintarRombo>=1 && numeroPintarRombo<=9 && (numeroPintarRombo %2 != 0).
 
 * Bucle: pedirValidarCaracter
 * 	->Bucle controlado por dato centinela (por suceso)
 * 	->Se inicializa por lectura anticipada y se actualiza por lectura final
 * 	->Al ser una estructura repetir-mientras, coincide fisicamente el lugar donde se inicializa y el lugar donde se actualiza.
 * 	->He llamado caracterPintarRombo a la VCB.
 * 	->La condicion de entrada al bucle es: (caracterPintarRombo != '*' && caracterPintarRombo != '+' && caracterPintarRombo != 'x').
 * 	->La condicion de salida del bucle es: (caracterPintarRombo == '*' || caracterPintarRombo == '+' || caracterPintarRombo == 'x').
 * 
 * PSEUDOCODIGO MAS DETALLADO DEL MODULO: pintarRombo
 * 	inicio
 * 		pedirValidarNumero
 * 		pedirValidarCaracter
 * 		pintarRombo
 * 	fin
 * 
 * 
 * 
 * 
 * 
 * ANALISIS DE BUCLES DE LOS BUCLES DEL MODULO juegoNaipeMagico
 * 
 * Bucle: pedirValidarNumeroJugadas
 * 	->Bucle controlado por dato centinela (por suceso)
 * 	->Se inicializa por lectura anticipada y se actualiza por lectura final
 * 	->Al ser una estructura repetir-mientras, coincide fisicamente el lugar donde se inicializa y el lugar donde se actualiza.
 * 	->He llamado numeroJugadasNaipe a la VCB.
 * 	->La condicion de entrada al bucle es: (numeroJugadasNaipe <1 ).
 * 	->La condicion de salida del bucle es: (numeroJugadasNaipe >= 1).
 * 
 * Bucle para:
 * ->Bucle controlado por contador
 * ->Se inicializa, evalua y actualiza por la misma estructura del bucle PARA.
 * ->La VCB es el contador del numero de jugadas, que empieza en 0 y aumenta de 1 en 1 hasta el numero de jugadas que el usuario ha introducido.
 * ->La condicion de entrada es que (VCB < numeroJugadasNaipe).
 * ->La condicion de salida es que (VCB >= numeroJugadasNaipe).
 * 
 * PSEUDOCODIGO MAS DETALLADO DEL MODULO: juegoNaipeMagico
 * 	inicio
 * 		pedirValidarNumeroJugadas
 * 		para (contador igual a 0; contador menor al numero de rondas; aumentar contador)
 * 			generarJugada
 * 			mostrarResultadoParcial
 * 		finPara
 * 		mostrarResultadosFinales
 * 	fin
 * 
 * ----Juego Naipe Magico
 * ->Si el numero generado para la carta es de 1 a 10, es un numero
 * ->Si el numero generado para la carta es de 11 a 13 es una figura (paje, dama o rey respectivamente)
 * ->El numero generado para el palo ira de 1 a 4 y seran corazones (1), picas(2),diamantes(3) y treboles(4).
 * ->El usuario gana si: es figura y corazones, o AS y picas, o cualquier diamante.
 * ->El usuario pierde (gana la maquina) si: saca cualquier pica (que no sea el as), o el 2 de treboles.
 * ->Empate: Cualquier otro caso
 * 
 * ->EN MI UNIVERSO DEL DISCURSO, NO LE VOY A DAR IMPORTANCIA A QUIEN ESTA EMPEZANDO LA PARTIDA. ESO SE IMPLEMENTARA MAS ADELANTE.
 * 
 * 
 */

import java.util.Scanner;
import java.lang.Math;

public class MenuNaipeExamen {
	
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int opcion,numeroPintarRombo,numeroJugadasNaipe,contadorJugadas;
		int victoriasUsuario, victoriasMaquina,empates;
		int victoriaActual;
		int cartaMagica,paloCartaMagica,quienGanoUltimaVez;
		
		char caracterPintarRombo;
		
		do{

			//mostrarMenuPedirValidarOpcion
			do{
				System.out.println("------------MENU-------------");
				System.out.println("     Pulsa 0 para salir");
				System.out.println("       1. Pintar rombo      ");
				System.out.println("       2. Calcular numero hambriento      ");
				System.out.println("       3. Jugar naipe magico      ");
				
				opcion=entrada.nextInt();
			}while(opcion < 0 || opcion >3);
			
			if (opcion >= 1 && opcion <= 3){
			
				switch(opcion){
					
					case 1:
					//pintarRombo
					
						//pedirValidarNumero
						do{
							System.out.println("Introduce un numero. Debe ser impar entre 1 y 9 (incluidos)");
							numeroPintarRombo=entrada.nextInt();
							
						}while(numeroPintarRombo<1 || numeroPintarRombo>9 || (numeroPintarRombo %2 == 0)     );
						//pedirValidarCaracter
						do{
							System.out.println("Introduce un caracter de relleno. Solo se aceptan: '*', '+' o 'x'");
							caracterPintarRombo=entrada.next().charAt(0);
							
						}while(caracterPintarRombo != '*' && caracterPintarRombo != '+' && caracterPintarRombo != 'x');
						
						//pintarRombo
						System.out.println("----------MODULO EN CONSTRUCCION------------");
					break;
					
					case 2:
					//calcularNumeroHambriento
						System.out.println("----MODULO EN CONSTRUCCION----");
					break;
					
					case 3:
					//juegoNaipeMagico
						victoriaActual=0;
						//pedirValidarNumeroJugadas
						do{
							System.out.println("Introduce el numero de jugadas que quieras realizar. Minimo 1.");
							numeroJugadasNaipe=entrada.nextInt();
						}while(numeroJugadasNaipe<1);
						
						//generarJugada
						for(victoriasMaquina=0,empates=0,victoriasUsuario=0,contadorJugadas=0;contadorJugadas <numeroJugadasNaipe;contadorJugadas++ ){
						 
							
							victoriaActual=4; //se inicializa a un numero que no sea ni 1 (gana usuario) ni 2 (gana maquina)
							cartaMagica=(int)Math.floor(Math.random()*13+1);
							paloCartaMagica=(int)Math.floor(Math.random()*4+1);
							
							/*
							 * paloCartaMagica	 -> 1 corazones
							 * 					-> 2 picas
							 * 					-> 3 diamantes
							 * 					-> 4 treboles
							 */

							switch (cartaMagica){
								case 1:
										if(paloCartaMagica == 2){	//si es un as de picas gana el usuario
											victoriasUsuario++;
											victoriaActual=1;
										}
										 if(paloCartaMagica == 3){	//si es un as de diamantes gana el usuario
										victoriasUsuario++;
										victoriaActual=1;
										}
								break;
								case 2:
									if(paloCartaMagica==4){		//si es un dos de treboles gana la maquina
										victoriasMaquina++;
										victoriaActual=2;
									}
								case 3:
								case 4:
								case 5:
								case 6:
								case 7:
								case 8:
								case 9:
								case 10:
									if(paloCartaMagica == 2) {	//si es cualquier numero de picas (menos el as), gana la maquina
										victoriasMaquina++;
										victoriaActual=2;
										}
									if(paloCartaMagica == 3){	//si es cualquier numero de diamantes (incluido el as) gana el usuario 
									victoriasUsuario++;
									victoriaActual=1;
									}
									break;
								case 11:
								case 12:
								case 13:
								
										if ((paloCartaMagica == 1)) {	//es figura y corazones
											victoriasUsuario++;
											victoriaActual=1;
											}
									break;

								
								}
								empates=numeroJugadasNaipe-(victoriasUsuario+victoriasMaquina);	//para todo lo demas, es empate
						 
						 
						//mostrarResultadoParcial
						if(victoriaActual==1){
							System.out.println("Ronda: "+contadorJugadas +"\n"+"la gana el usuario");
						}else if (victoriaActual==2){
							System.out.println("Ronda: "+contadorJugadas +"\n"+ "la gana la maquina");
						} else {
							System.out.println("Ronda: "+contadorJugadas+"\n"+"Esta ronda esta empatada");
							}
						
						}
						
						//mostrarResultadosFinales
						System.out.println("Usuario ha ganado: "+victoriasUsuario+" vece(s).");
						System.out.println("Maquina ha ganado: "+victoriasMaquina+" vece(s).");
						
						System.out.println("Empates: "+empates+".");
						
						if( victoriasUsuario>victoriasMaquina ){
							System.out.println("Ganador final: usuario");
						} else if (victoriasUsuario<victoriasMaquina){
							System.out.println("Ganador final: maquina");
						}else {
							System.out.println("Empatados");
							}
					break;
					
					
				}
			
			}		
			
		}while(opcion > 0 && opcion <4 );
		

		
	}
}

