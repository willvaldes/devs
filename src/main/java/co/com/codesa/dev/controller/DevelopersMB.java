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

	@PostConstruct
	public void init() {
		for (int i = 0; i < 10; i++) {
			lDevelopers.add(new Dev("DEMO" + i));
		}
		Collections.shuffle(lDevelopers);
	}

	public void reveal(int id) {
		devElegido = lDevelopers.get(id);
		devElegido.setEstilo("pnl-avatar");
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

}
