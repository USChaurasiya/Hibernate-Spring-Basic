package com.uma.bankApp.Util;

import java.util.ArrayList;
import java.util.List;

import com.uma.bankApp.DAO.BankDAO;
import com.uma.bankApp.DTO.BankDTO;
import com.uma.bankApp.DTO.Location;
import com.uma.bankApp.Service.BankService;

public class BankDemo {

	public static void main(String[] args)
	{
		/*Location loc=new Location();
		loc.setCountry("India");
		loc.setState("Bangalore");
	
		
		BankDTO sbi=new BankDTO();
		sbi.setName("State Bank of India");
		sbi.setManager("Arundhati Bhattacharya");
		sbi.setLocation(loc);
		
		BankDTO hdfc=new BankDTO();
		hdfc.setName("HDFC");
		hdfc.setManager("Deepak S. Parekh");
		hdfc.setLocation(loc);

		
		BankDTO ic=new BankDTO();
		ic.setName("ICICI");
		ic.setManager("M K Sharma,");
		ic.setLocation(loc);
		
		BankDTO city=new BankDTO();
		city.setName("Citi Bank");
		city.setManager("Vikram Pandit");
		city.setLocation(loc);
		
		List<BankDTO> list=new ArrayList<>();
		list.add(sbi);
		list.add(hdfc);
		list.add(ic);
		list.add(city);
		
		loc.setBankList(list);
		
		BankDAO dao=new BankDAO();
		dao.saveLocation(loc);*/
		
		BankService bs=new BankService();
		bs.getBank();
		//bs.updateBank();
		bs.deleteBank();
		
	}

}
