/*
 * JBoss, Home of Professional Open Source
 * Copyright 2013, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package co.com.codesa.dev.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Dev implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nombre;
	private String imagen;
	private String demo;
	private String efecto1;
	private String efecto2;
	private String efecto3;
	private String efecto4;
	
	
	
	public Dev() {
		super();
	}


	public Dev(String nombre) {
		super();
		this.nombre = nombre;
		List<String> lEfectos = new ArrayList<>();
		lEfectos.add("'up'");
		lEfectos.add("'right'");
		lEfectos.add("'down'");
		lEfectos.add("'left'");
		
		Collections.shuffle(lEfectos);

		this.efecto1 = lEfectos.get(0);
		this.efecto2 = lEfectos.get(1);
		this.efecto3 = lEfectos.get(2);
		this.efecto4 = lEfectos.get(3);
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	public String getDemo() {
		return demo;
	}
	public void setDemo(String demo) {
		this.demo = demo;
	}
	public String getEfecto1() {
		return efecto1;
	}
	public void setEfecto1(String efecto1) {
		this.efecto1 = efecto1;
	}
	public String getEfecto2() {
		return efecto2;
	}
	public void setEfecto2(String efecto2) {
		this.efecto2 = efecto2;
	}
	public String getEfecto3() {
		return efecto3;
	}
	public void setEfecto3(String efecto3) {
		this.efecto3 = efecto3;
	}
	public String getEfecto4() {
		return efecto4;
	}
	public void setEfecto4(String efecto4) {
		this.efecto4 = efecto4;
	}
	
}
