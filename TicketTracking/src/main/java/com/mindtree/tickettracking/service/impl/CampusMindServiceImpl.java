package com.mindtree.tickettracking.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.tickettracking.entity.CampusMind;
import com.mindtree.tickettracking.entity.Genie;
import com.mindtree.tickettracking.exceptions.InvalidMidException;
import com.mindtree.tickettracking.exceptions.ServiceException;
import com.mindtree.tickettracking.repository.CampusMindRepository;
import com.mindtree.tickettracking.repository.GenieRepository;
import com.mindtree.tickettracking.service.CampusMindService;

@Service
public class CampusMindServiceImpl implements CampusMindService {

	@Autowired
	CampusMindRepository campusMindRepository;

	@Autowired
	GenieRepository genieRepository;

	@Override
	public CampusMind addCampusMind(CampusMind campusMind) {
		// TODO Auto-generated method stub
		return campusMindRepository.save(campusMind);
	}

	@Override
	public CampusMind addGenie(String mid, List<Genie> genie) {
		// TODO Auto-generated method stub
		List<Genie> newGenie = genieRepository.saveAll(genie);
		CampusMind cmind = campusMindRepository.getOne(mid);
		cmind.setGenie(newGenie);
		return campusMindRepository.save(cmind);

	}

	@Override
	public List<Genie> getGenie(String mid) {
		List<Genie> geniee = new ArrayList<Genie>();
		// TODO Auto-generated method stub
		List<Genie> g = campusMindRepository.findById(mid).get().getGenie();
		for (Genie genie : g) {
			if (genie.isGenieStatus() == true) {
				geniee.add(genie);
			}
		}
		return geniee;
	}

	@Override
	public void validate(String mid) throws ServiceException  {
		// TODO Auto-generated method stub 
		try {
		if (!campusMindRepository.existsById(mid)) {
			throw new InvalidMidException("invalid mid");
		}
		}
		catch(InvalidMidException e)
		{
			throw new ServiceException(e);
		}
	}

}
