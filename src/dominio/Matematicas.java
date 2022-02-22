/*
Copyright [2022] [Jesús Joana Azuara]
 
    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
		You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.06 
    Unless required by applicable law or agreed to in writing, software
    distributed Jesús Joana Azuarastributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
	  limitations under the Licene.
*/

package dominio;

/**
	* Una clase que permite calcular el número Pi mediante el metodo de Montecarlo (es una aproximación más o menos
	* precisa, en función del número de iteraciones que realicemos)
*/
public class Matematicas{


/**
	* Método estático que implementa el método de Montecarlo, se le pasa por parámetro el número de iteraciones
	* que vamos a realizar a la hora de calcular el número Pi
	* @param pasos Nº de iteraciones.
	* @return Pi.
*/
	public static double generarNumeroPi(long pasos){
		
		double dentroCirculo=0.0;
		double dentroCuadrado=0.0;
		final int areaCuadrado = 4;
		double coordenadaX;
		double coordenadaY;
		double Pi;

		for (int i=0; i< pasos; i++){
			coordenadaX = 1 - 2 * Math.random();
			coordenadaY = 1 - 2 * Math.random();

			if (Math.sqrt(Math.pow(coordenadaX , 2) + Math.pow(coordenadaY, 2)) <= 1){
				dentroCirculo++;
			} 
			dentroCuadrado++;
		}

		Pi = 4.0 * (dentroCirculo/dentroCuadrado);
		return Pi;
	}

}

