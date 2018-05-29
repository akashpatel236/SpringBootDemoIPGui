package com.kpn.test.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.kpn.test.entity.TieServiceProvider;
import com.kpn.test.entity.Wip5Response;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;




@CrossOrigin
@Controller
@RequestMapping("/kpn-wholesale")
@Api(value="TieServiceProvider micro services", description="Operations pertaining TieServiceProvider Data ")
public class TieServiceController {

	
	@RequestMapping(value="/")
    public String showMainPage(){
        return "start";
    }
	
	@RequestMapping(value="/wip1")
    public String showWip1(){
        return "index";
    }
	
	@RequestMapping(value="/wip5")
    public String showWip5(){
        return "index2";
    }
	
	@ApiOperation(value = "To know whether microservices is up and running or not")
	@RequestMapping(value="/ping", method = RequestMethod.GET)
    public String showApplicationStatus(Model model){
        //return "Yes!!! TieGUIServiceProvider micro service is up and running you can send your request";
		TieServiceProvider objTieServiceProvider = null;
		RestTemplate restTemplate=null;
		try {
		restTemplate = new RestTemplate();
		objTieServiceProvider = restTemplate.getForObject("http://localhost:9000/kpn-wholesale/ping", TieServiceProvider.class);
		model.addAttribute("Instance1WIP1", "Service is Up and Running");
		}catch(Exception e) {
			model.addAttribute("Instance1WIP1", "Service is Down");
			System.out.println("WIP1 Error: "+e.getMessage());
		}
		try {
			restTemplate = new RestTemplate();
			objTieServiceProvider = restTemplate.getForObject("http://localhost:9001/kpn-wholesale/ping", TieServiceProvider.class);
			model.addAttribute("Instance2WIP1", "Service is Up and Running");
			}catch(Exception e) {
				model.addAttribute("Instance2WIP1", "Service is Down");
				System.out.println("WIP1 Error: "+e.getMessage());
			}
		
		Wip5Response objWip5Response =null;
		try {
			restTemplate = new RestTemplate();
			objWip5Response = restTemplate.getForObject("http://localhost:8090/wip5/ping", Wip5Response.class);

			model.addAttribute("WIP5", "Service is Up and Running");
			}catch(Exception e) {
				model.addAttribute("WIP5", "Service is Down");
				if("404 null".equalsIgnoreCase(e.getMessage()));
					model.addAttribute("WIP5", "Service is Up and Running");
				System.out.println("WIP5 Error: "+e.getMessage());
			}
		
		return "yes";
    }
	
	
	@PostMapping("/wip1Action")
	public String wip1Resp(@RequestParam("telephonenumber") String telephone,
			@RequestParam("postalcode") String postalcode, @RequestParam("housenumber") String houseNumber,
			@RequestParam("housenumberadd") String houseNumberaddinput, Model model) {
		RestTemplate restTemplate = new RestTemplate();
		TieServiceProvider objTieServiceProvider =null;
		String strResponseReceivedFrom="";
		try {
			objTieServiceProvider = restTemplate
					.getForObject("http://localhost:9000/kpn-wholesale/wipservices/wip1/" + telephone + "/" + postalcode
							+ "/" + houseNumber, TieServiceProvider.class);
			// model.addAttribute("postalcode", postalcode);
			strResponseReceivedFrom ="WIP1-Instance1";
			System.out.println("wip1Action-->");
			
		} catch (Exception e) {
			model.addAttribute("Down", "Service Down");
			System.out.println("Exception1-->" + e.getMessage());
			try {
			objTieServiceProvider = restTemplate
					.getForObject("http://localhost:9001/kpn-wholesale/wipservices/wip1/" + telephone + "/" + postalcode
							+ "/" + houseNumber, TieServiceProvider.class);
			strResponseReceivedFrom ="WIP1-Instance2";
			}catch (Exception e1) {
				model.addAttribute("Down", "Service Down");
				System.out.println("Exception2-->" + e1.getMessage());
				strResponseReceivedFrom ="Both Instance Down";
				return "wip1ResponseError";
			}
		}
		
		if (null != objTieServiceProvider) {
			model.addAttribute("strResponseReceivedFrom",strResponseReceivedFrom);
			model.addAttribute("telephonenumber", objTieServiceProvider.getTelephone());
			model.addAttribute("postalcode", objTieServiceProvider.getPostalCode());
			model.addAttribute("houseNumber", objTieServiceProvider.getHouseNumber());
			model.addAttribute("houseNumberadd", objTieServiceProvider.getHouseNumberAddition());
			model.addAttribute("houseNumberaddinput", houseNumberaddinput);
			model.addAttribute("currentFuture", objTieServiceProvider.getCurrentFuture());
			model.addAttribute("orderinfo", objTieServiceProvider.getOrderInformation());
			model.addAttribute("street", objTieServiceProvider.getStraat());
			model.addAttribute("residence", objTieServiceProvider.getResidence());
			model.addAttribute("servicetype", objTieServiceProvider.getServiceTypeTelephony());
			model.addAttribute("statusconnection", objTieServiceProvider.getStatusConnection());
			model.addAttribute("broadband", objTieServiceProvider.getBroadband());
			model.addAttribute("highcapacity", objTieServiceProvider.getHighCapacity());
			model.addAttribute("numberOfGridLines", objTieServiceProvider.getNumberOfGridLines());
			model.addAttribute("role", objTieServiceProvider.getRol());
			model.addAttribute("status", objTieServiceProvider.getStatus());

		}
		return "wip1Response";

	}


	@PostMapping("/wip5Action")
	 public String wip5Resp(@RequestParam("telephonenumber") String telephone,@RequestParam("postalcode") String postalcode,@RequestParam("housenumber") String houseNumber,@RequestParam("housenumberadd") String houseNumberaddinput, Model model) {
		RestTemplate restTemplate = new RestTemplate();
		Wip5Response objWip5Response =null;
		try {
		objWip5Response = restTemplate.getForObject("http://localhost:8090/getWip5Response/"+telephone+"/"+postalcode+"/"+houseNumber, Wip5Response.class);
	      //model.addAttribute("postalcode", postalcode);
		
		System.out.println("objWip5Response-->");
		if(null !=objWip5Response) {
	      model.addAttribute("telephonenumber", telephone);
	      model.addAttribute("postalcode", objWip5Response.getPostalCode());
	      model.addAttribute("houseNumber", objWip5Response.getHouseNumber());
	      model.addAttribute("houseNumberadd", objWip5Response.getHouseNumberExtension());
	      model.addAttribute("houseNumberaddinput", objWip5Response.getHouseNumber());
	      model.addAttribute("currentFuture", objWip5Response.getPresentFutureIndicator());
	      model.addAttribute("orderinfo", "OK");
	      model.addAttribute("street", objWip5Response.getStreetName());
	      model.addAttribute("residence", objWip5Response.getResidence());
	      model.addAttribute("servicetype", objWip5Response.getNumberOfConnections());
	      /*model.addAttribute("statusconnection", objTieServiceProvider.getStatusConnection());
	      model.addAttribute("broadband", objTieServiceProvider.getBroadband());
	      model.addAttribute("highcapacity", objTieServiceProvider.getHighCapacity());
	      model.addAttribute("numberOfGridLines", objTieServiceProvider.getNumberOfGridLines());
	      model.addAttribute("role", objTieServiceProvider.getRol());
	      model.addAttribute("status", objTieServiceProvider.getStatus());*/
	      
		}
		}catch(Exception e) {
			 model.addAttribute("Down", "Service Down");
			System.out.println("Exception-->"+e.getMessage());
			return "wip5ResponseError";
		}
	      
	      return "wip5Response";
	   }
	
	
}
