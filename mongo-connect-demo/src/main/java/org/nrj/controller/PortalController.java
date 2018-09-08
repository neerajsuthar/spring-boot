package org.nrj.controller;

import java.util.List;
import java.util.Optional;

import javax.websocket.server.PathParam;

import org.nrj.PortalService;
import org.nrj.config.ApplicationConfiguration;
import org.nrj.entities.Clothing;
import org.nrj.entities.Electronics;
import org.nrj.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PortalController {
	
	@Autowired
	private ApplicationConfiguration config;
	
	@Autowired
	private PortalService portalService;
	
	@RequestMapping(value=Constants.TEST_URL, method=RequestMethod.GET)
	public String testPortal() {
		// TODO Auto-generated method stub
		
		return Constants.TEST_STRING;

	}
	
	@RequestMapping(value=Constants.HOME_URL, method=RequestMethod.GET)
	public String defaultMapping() {
		// TODO Auto-generated method stub
		return Constants.HOME_STRING;

	}
	
	@RequestMapping(value=Constants.WELCOME_URL, method=RequestMethod.GET)
	public String portalMessage(@RequestParam(name="name") String name) {
		// TODO Auto-generated method stub
		return Constants.WELCOME_STRING + name;
	}
	
	@RequestMapping(value=Constants.ADD_CLOTHING_URL, method=RequestMethod.POST)
	public String addClothing(@RequestBody List<Clothing> clothList) {
		portalService.insertClothing(clothList);
		return String.format(Constants.ADD_PRODUCT_MESSAGE, clothList.size());
	}
	
	@RequestMapping(value=Constants.DELETE_CLOTHING_URL, method=RequestMethod.DELETE)
	public String deleteClothing(@RequestParam(name="prodId") Integer prodId) {
		portalService.deleteClothing(prodId);
		return String.format(Constants.DELETE_PRODUCT_MESSAGE, prodId);

	}
	
	@RequestMapping(value=Constants.GET_CLOTHING_URL, method=RequestMethod.GET)
	public Optional<Clothing> getClothing(@RequestParam(name="prodId") Integer productId) {
		// TODO Auto-generated method stub
		return portalService.getClothes(productId);
	}
	
	@RequestMapping(value=Constants.GETALL_CLOTHING_URL, method=RequestMethod.GET)
	public List<Clothing> getAllClothing() {
		// TODO Auto-generated method stub
		return portalService.getAllClothing();
	}
	
	@RequestMapping(value=Constants.ADD_ELECTRONICS_URL, method=RequestMethod.POST)
	public String addElectronics(@RequestBody List<Electronics> electList) {
		portalService.insertElectronics(electList);
		return String.format(Constants.ADD_PRODUCT_MESSAGE, electList.size());
	}
	
	@RequestMapping(value=Constants.DELETE_ELECTRONICS_URL, method=RequestMethod.DELETE)
	public String deleteEletronics(@RequestParam(name="prodId") Integer prodId) {
		portalService.deleteElectronics(prodId);
		return String.format(Constants.DELETE_PRODUCT_MESSAGE, prodId);
	}
	
	@RequestMapping(value=Constants.GET_ELECTRONICS_URL, method=RequestMethod.GET)
	public Optional<Electronics> getElectronicsById(@RequestParam(name="prodId") Integer productId) {
		// TODO Auto-generated method stub
		return portalService.getElectronicsById(productId);
	}
	
	@RequestMapping(value=Constants.GETALL_ELECTRONICS_URL, method=RequestMethod.GET)
	public List<Electronics> getAllElectronics() {
		// TODO Auto-generated method stub
		return portalService.getAllElectronics();
	}


	public ApplicationConfiguration getConfig() {
		return config;
	}

	public void setConfig(ApplicationConfiguration config) {
		this.config = config;
	}
	
}


