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
package co.com.codesa.dev.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import co.com.codesa.dev.model.Dev;

@ViewScoped
@ManagedBean
public class PreguntasMB implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Dev> lDevelopers = new ArrayList<>();
	private Dev devElegido;
	private String styleBtn1 = "";
	private String styleBtn2 = "display:none;";

	@PostConstruct
	public void init() {
		lDevelopers.add(new Dev("PREGUNTA # 1"));
		lDevelopers.add(new Dev("PREGUNTA # 2"));
		lDevelopers.add(new Dev("PREGUNTA # 3"));
		lDevelopers.add(new Dev("PREGUNTA # 4"));
		lDevelopers.add(new Dev("PREGUNTA # 5"));
		lDevelopers.add(new Dev("PREGUNTA # 6"));
		lDevelopers.add(new Dev("PREGUNTA # 7"));
		lDevelopers.add(new Dev("PREGUNTA # 8"));

		Collections.shuffle(lDevelopers);
	}

	public void reveal() {

		devElegido = lDevelopers.get(0);
		lDevelopers.remove(0);
		devElegido.setEstilo("pnl-avatar");
		Collections.shuffle(lDevelopers);
	}

	public void renderizarBotones() {
		styleBtn1 = "display:none;";
		styleBtn2 = "";
	}

	public List<Dev> getlDevelopers() {
		return lDevelopers;
	}

	public void setlDevelopers(List<Dev> lDevelopers) {
		this.lDevelopers = lDevelopers;
	}

	public Dev getDevElegido() {
		return devElegido;
	}

	public void setDevElegido(Dev devElegido) {
		this.devElegido = devElegido;
	}

	public String getStyleBtn1() {
		return styleBtn1;
	}

	public void setStyleBtn1(String styleBtn1) {
		this.styleBtn1 = styleBtn1;
	}

	public String getStyleBtn2() {
		return styleBtn2;
	}

	public void setStyleBtn2(String styleBtn2) {
		this.styleBtn2 = styleBtn2;
	}

	public static void main(String[] args) {
		int x = 2, y = 3;
		x = y++ + x++;
		y = ++y + ++x;
		System.out.println(x+y);
	}
}
