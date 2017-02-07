package com.uma.countryApp.Util;

import java.util.ArrayList;


import com.uma.countryApp.DAO.CountryDAO;
import com.uma.countryApp.DTO.CountryDTO;
import com.uma.countryApp.DTO.StateDTO;

public class CountryDemo 
{
	public static void main(String[] args)
	{
		CountryDTO dto=new CountryDTO();
		dto.setName("USA");
		dto.setState(14);
		dto.setCurrency("Dollor");
		
		
		
		StateDTO sdto=new StateDTO();
		sdto.setsName("Washington DC");
		sdto.setLanguage("American English");
		
		
		StateDTO sdto1=new StateDTO();
		sdto1.setsName("California");
		sdto1.setLanguage("American English");
		
		
		java.util.List<StateDTO> set=new ArrayList<StateDTO>();
		set.add(sdto);
		set.add(sdto1);
		dto.setStateDTO(set);
		
		
		CountryDAO dao=new CountryDAO();
		dao.saveCountry(dto);
		
		
		
	}
}
