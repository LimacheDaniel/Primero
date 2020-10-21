package com.infinito.importadoraWeb.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.infinito.importadoraWeb.model.Pais;

public interface IPaisesService {
	public List<Map<String, Object>> ListaPaises(int start,int estado, String search, int length);
}
