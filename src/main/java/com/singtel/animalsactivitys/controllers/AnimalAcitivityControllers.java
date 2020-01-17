package com.singtel.animalsactivitys.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AnimalAcitivityControllers {
	
	@RequestMapping("/sounded-native-tongue1")
	@ResponseBody
	public static String checkNativeTongue(@RequestParam(value="locale") String locale) {
		
		HashMap<String, String> nativeLanguage = new HashMap<String, String>();
		
		nativeLanguage.put("Danish", "kykyliky");
		nativeLanguage.put("Dutch", "kukeleku");
		nativeLanguage.put("Finnish", "kukko kiekuu");
		nativeLanguage.put("French", "cocorico");
		nativeLanguage.put("German", "kikeriki");
		nativeLanguage.put("Greek", "kikiriki");
		nativeLanguage.put("Hebrew", "coo-koo-ri-koo");
		nativeLanguage.put("Hungarian", "kukuriku");
		nativeLanguage.put("Italian", "chicchirichi");
		nativeLanguage.put("Japanese", "ko-ke-kok-ko-o");
		nativeLanguage.put("Portuguese", "cucurucu");
		nativeLanguage.put("Russian", "kukareku");
		nativeLanguage.put("Swedish", "kuckeliku");
		nativeLanguage.put("Turkish", "kuk-kurri-kuuu");
		nativeLanguage.put("Urdu", "kuklooku");
		
		for(Map.Entry<String, String> entry : nativeLanguage.entrySet()) {
		if(entry.getKey().equals(locale)) {
			 return locale +" : " + entry.getValue(); 
		}
		}
		return "fail";
	}
		
	


}
