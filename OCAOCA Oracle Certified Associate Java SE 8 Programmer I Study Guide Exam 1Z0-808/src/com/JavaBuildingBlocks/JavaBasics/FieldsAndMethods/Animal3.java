package com.JavaBuildingBlocks.JavaBasics.FieldsAndMethods;

public class Animal3 {
	//campo (field) -> variable
	String name;
	
	/**
	 * metodo: public
	 * retorna:	String
	 * nombre(firma): getName
	 * parametros: vacio
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * metodo: public
	 * retorno: nada o empty o vacio
	 * nombre(firma): setName
	 * parametros: recibe un String y lo almacena en newName
	 * @param newName
	 */
	public void setName(String newName) {
		name = newName;
	}
}
