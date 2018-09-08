package org.nrj;

import java.util.List;
import java.util.Optional;

import org.nrj.entities.Clothing;
import org.nrj.entities.Electronics;
import org.nrj.repo.ClothingRepo;
import org.nrj.repo.ElectronicRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PortalService {

	@Autowired
	private ClothingRepo clothingRepo;

	@Autowired
	private ElectronicRepo electronicsRepo;

	public Optional<Clothing> getClothes(Integer productId){

		return clothingRepo.findById(productId);
	}
	
	public List<Clothing> getAllClothing() {
		return clothingRepo.findAll();
	}
	
	public void insertClothing(List<Clothing> clothList) {
		clothingRepo.insert(clothList);
	}
	
	public void deleteClothing(Integer productId) {
		clothingRepo.deleteById(productId); ;
	}

	public List<Electronics> getAllElectronics(){

		return electronicsRepo.findAll();
	}
	
	public Optional<Electronics> getElectronicsById(Integer productId){

		return electronicsRepo.findById(productId);
	}
	
	public void insertElectronics(List<Electronics> electronicsList) {
		electronicsRepo.insert(electronicsList);
	}
	
	public void deleteElectronics(Integer productId) {
		electronicsRepo.deleteById(productId); ;
	}
	

}
