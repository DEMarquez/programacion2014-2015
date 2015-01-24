package Ejercicios_con_Vectores;

import java.util.*;

public class ejercicio5 {
	public static void main(String args[]) {

		int facultad[], sexo[], trabaja[], sueldo[];
		int m_trabajan = 0, h_trabajan = 0, m_facultad = 0, h_facultad = 0, hombre = 0, mujer = 0, tsueldo_m = 0, tsueldo_h = 0;
		double media_uni_m, media_uni_h, media_sueldo_m, media_sueldo_h,promedio_m, promedio_h;
	

		Scanner teclado = new Scanner(System.in);

		System.out.println("introduzca alumnos");
		int N = teclado.nextInt();

		facultad = new int[N];
		sexo = new int[N];
		trabaja = new int[N];
		sueldo = new int[N];

		for (int i = 0; i < N; i++) {

			System.out.println("introduzca si estudia un 1 si no estudia un 2");
			facultad[i] = teclado.nextInt();

			System.out.println("introduzca hombre un 1 mujer un 2");
			sexo[i] = teclado.nextInt();

			System.out.println("introduzca si trabaja un 1 si no trabaja un 2");
			trabaja[i] = teclado.nextInt();

			System.out.println("intruduce el sueldo de los que trabajan");
			sueldo[i] = teclado.nextInt();

			if (sexo[i] == 1) {// hombres
				hombre++;// numero de hombres en total

				if (trabaja[i] == 1) {
					h_trabajan++;// contador hombres que trabajan
					tsueldo_h = tsueldo_h + sueldo[i];// operacion sueldos de
														// hombres que trabajan
				}
				if (facultad[i] == 1) {
					h_facultad++;// contador hombres en facultad
				}
			} else {// mujeres

				if (trabaja[i] == 1) {
					m_trabajan++;// contador mujeres que trabajan
					tsueldo_m = tsueldo_m + sueldo[i];// operacion sueldos de
														// mujeres que trabajan
				}
				if (facultad[i] == 1) {
					m_facultad++;// contador mujeres en facultad
				}
			}

		}// for

		mujer = sexo.length - hombre;// numero de mujeres en total

		media_uni_m = (m_facultad / (double) mujer) * 100;// media de hombres que estudian
		media_uni_h = (h_facultad / (double) hombre) * 100;// media de mujeres que estudian
		media_sueldo_m = (tsueldo_m / (double) m_trabajan);// media de las mujeres que trabajan y su sueldo
		media_sueldo_h = (tsueldo_h / (double) h_trabajan);// media de las hombre que trabajan y su sueldo
		
		promedio_m = m_trabajan / (double) mujer * 100;
		promedio_h = h_trabajan/(double)hombre*100;

		System.out.println("el porcentaje de mujeres en la universidad es "
				+ media_uni_m);

		System.out.println("el porcentaje de hombres en la universidad es "
				+ media_uni_h);

		System.out.println("hombres que trabajan "+ promedio_h+" % y promedio de los sueldos "
				+media_sueldo_h );

		System.out.println("mujeres que trabajan " + promedio_m+ " % y promedio de los sueldos "
			+media_sueldo_m);
	}
}
