package com.juliobeani.workshopmongo.resources.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class URL {
	
	// Ou retorna o string decodificado ou retorna vazio caso de algum problema
	public static String decodeParam(String text) {
		try {
			return URLDecoder.decode(text, "UTF-8"); //UTF-8 eh o padrao de decodificacao da web
		} catch (UnsupportedEncodingException e) {
			return "";
		}
	}
	
}
