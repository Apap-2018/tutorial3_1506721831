package com.apap.tutorial3.service;

import java.util.ArrayList;
import java.util.List;

import com.apap.tutorial3.model.PilotModel;
import org.springframework.stereotype.Service;

@Service
public class PilotInMemoryService implements PilotService {
	
	private List <PilotModel> archivePilot;
	
	public PilotInMemoryService() {
		archivePilot = new ArrayList<>();
	}

	@Override
	public void addPilot(PilotModel pilot) {
		// TODO Auto-generated method stub
		archivePilot.add(pilot);
	}

	@Override
	public List<PilotModel> getPilotList() {
		// TODO Auto-generated method stub
		return archivePilot;
	}

	@Override
	public PilotModel getDetailPilotByLicenseNumber(String licenseNumber) {
		
		for(int i = 0; i < archivePilot.size(); i++) {
			if(archivePilot.get(i).getLicenseNumber().equals(licenseNumber)) {
				 return archivePilot.get(i);
			}
		}
		return null;
	}
	
    @Override
    public PilotModel getDetailPilotById(String id){
		for(int i = 0; i < archivePilot.size(); i++) {
			if(archivePilot.get(i).getId().equals(id)) {
				 return archivePilot.get(i);
			}
		}
		return null;
    }
}
