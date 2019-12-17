package com.mindtree.tickettracking.service;

import java.util.List;
import java.util.Set;

import com.mindtree.tickettracking.entity.CampusMind;
import com.mindtree.tickettracking.entity.Genie;
import com.mindtree.tickettracking.exceptions.InvalidMidException;
import com.mindtree.tickettracking.exceptions.ServiceException;


public interface CampusMindService {

	CampusMind addCampusMind(CampusMind campusMind);

	CampusMind addGenie(String mid, List<Genie> genie);

	List<Genie> getGenie(String mid);

	void validate(String mid) throws  ServiceException;

}
