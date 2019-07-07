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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.inject.Model;

import co.com.codesa.dev.model.Dev;

@Model
public class DevelopersMB {

	private List<Dev> lDevelopers = new ArrayList<>();
	private Dev devElegido;
	private String styleBtn1 = "";
	private String styleBtn2 = "display:none;";

	@PostConstruct
	public void init() {
		lDevelopers.add(new Dev("ANGULO QUIROZ JOARIS"));
		lDevelopers.add(new Dev("ARTEAGA RAMIREZ JHON STEEVENS"));
		lDevelopers.add(new Dev("ASPRILLA VARELA MIGUEL ANGEL"));
		lDevelopers.add(new Dev("BARCO PINO LINA MARCELA"));
		lDevelopers.add(new Dev("BORJA BURBANO MILTON FABIAN"));
		lDevelopers.add(new Dev("CABUYALES BECA JUAN FERNANDO"));
		lDevelopers.add(new Dev("CAMELO BOGOYA ANDREA CAROLINA"));
		lDevelopers.add(new Dev("CASTAÑO FIGUEROA MIGUEL ANGEL"));
		lDevelopers.add(new Dev("CORDOBA MOSQUERA RUBEN DARIO"));
		lDevelopers.add(new Dev("CRUZ BUITRON CRISTIAN FELIPE"));
		lDevelopers.add(new Dev("CUENCA MADRID HECTOR FABIO"));
		lDevelopers.add(new Dev("DELGADO BRITTO LUIS EVELIO"));
		lDevelopers.add(new Dev("DELGADO HERNANDEZ EYNER ORLANDO"));
		lDevelopers.add(new Dev("ECHEVERRY PINEDA JONATAN ESTI"));
		lDevelopers.add(new Dev("ESCOBAR RODAS ESTEBAN"));
		lDevelopers.add(new Dev("ESTUPINAN SALCEDO ROMAN"));
		lDevelopers.add(new Dev("FERREIRA DAVALOS JULIO CESAR"));
		lDevelopers.add(new Dev("GAMBOA ROA JULIAN DAVID"));
		lDevelopers.add(new Dev("GARCIA BUITRAGO HENRY"));
		lDevelopers.add(new Dev("GARCIA ESPINOZA MAURICIO"));
		lDevelopers.add(new Dev("GIRALDO SANCHEZ ANGEL RICARDO"));
		lDevelopers.add(new Dev("GOMEZ CUELLAR JORGE ANDRES"));
		lDevelopers.add(new Dev("GOMEZ RUIZ CRISTIAN BERNARDO"));
		lDevelopers.add(new Dev("GUTIERREZ GARZON EDWIN FABIAN"));
		lDevelopers.add(new Dev("GUTIERREZ REYES JORGE ENRIQUE"));
		lDevelopers.add(new Dev("HERNANDEZ CUESTA CARLOS JULIO"));
		lDevelopers.add(new Dev("HERNANDEZ QUINTANA FABIO NELSON"));
		lDevelopers.add(new Dev("HIDALGO ROTAVISQUI WILLIAM DAVID"));
		lDevelopers.add(new Dev("HURTADO BALANTA JESUS EIDER"));
		lDevelopers.add(new Dev("JARAMILLO LLANOS RICARDO ARTURO"));
		lDevelopers.add(new Dev("LOPEZ PIEDRAHITA JESUS DAVID"));
		lDevelopers.add(new Dev("LOPEZ SALAZAR ISAIAS ANTONIO"));
		lDevelopers.add(new Dev("MARTINEZ VARGAS ROBERTH"));
		lDevelopers.add(new Dev("MONTILLA GETIAL DUVAN"));
		lDevelopers.add(new Dev("MUÑOZ DELGADO EDWIN FERNANDO"));
		lDevelopers.add(new Dev("MURILLO MONTANO JOHN EDER"));
		lDevelopers.add(new Dev("MURILLO POLANCO BRYAN LEONIDAS"));
		lDevelopers.add(new Dev("NIETO RUIZ JHON EDINSON"));
		lDevelopers.add(new Dev("PALOMINO VILLADA JONATHAN STIVENS"));
		lDevelopers.add(new Dev("PANESSO TASCON ALFREDO"));
		lDevelopers.add(new Dev("PAZOS CLAVIJO OSCAR EDUARDO"));
		lDevelopers.add(new Dev("PINO VICTORIA DIEGO FERNANDO"));
		lDevelopers.add(new Dev("POLANCO TRUJILLO JUAN CAMILO"));
		lDevelopers.add(new Dev("PUERTA SIMBAQUEBA ANDRES FELIPE"));
		lDevelopers.add(new Dev("PULIDO NEIRA ERICK"));
		lDevelopers.add(new Dev("QUINTERO GARCIA ENELIA YOANA"));
		lDevelopers.add(new Dev("REVELLON GUERRERO JEAN PAULO"));
		lDevelopers.add(new Dev("RIVERA BOLAÑOS JHEISSON DAVID"));
		lDevelopers.add(new Dev("RODRIGUEZ LUCERO DAVID STEVEN"));
		lDevelopers.add(new Dev("ROMERO BERNAL DIANA ALEXANDRA"));
		lDevelopers.add(new Dev("ROSERO ALOMIA DEIVID ARTURO"));
		lDevelopers.add(new Dev("SANCHEZ GALLEGO LUIS FERNANDO"));
		lDevelopers.add(new Dev("SANDOVAL CANDELO EDUARDO JOSE"));
		lDevelopers.add(new Dev("SARRIA REVELO JHONY"));
		lDevelopers.add(new Dev("SILVA SANCHEZ DIDIER FABIAN"));
		lDevelopers.add(new Dev("TELLEZ ACOSTA JUAN FELIPE"));
		lDevelopers.add(new Dev("TIERRADENTRO OROZCO JUAN JOSE"));
		lDevelopers.add(new Dev("VALENZUELA PARDO RICHARD EDUARDO"));
		lDevelopers.add(new Dev("VEGA VEGA DANIEL ALBERTO"));
		lDevelopers.add(new Dev("YAIMA GOMEZ MILTON RODOLFO"));
		lDevelopers.add(new Dev("ZAMBRANO TABORDA BRIAN EDUARDO"));

		Collections.shuffle(lDevelopers);
	}

	public void reveal() {

		Collections.shuffle(lDevelopers);
		devElegido = lDevelopers.get(0);
		devElegido.setEstilo("pnl-avatar");
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

}
