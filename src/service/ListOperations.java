package service;

import java.util.ArrayList;
import java.util.List;

import model.TouristPlace;

public class ListOperations{
	
	public List<TouristPlace> add(TouristPlace places)
	{
		ArrayList<TouristPlace> al=new ArrayList<>();
		al.add(places);
		return al;
	}
	public List<TouristPlace> remove(TouristPlace places){
		ArrayList<TouristPlace> rl=new ArrayList<>();
		rl.add(places);
		return rl;
	}
	public Object sortByDestination(TouristPlace tp) {
		ArrayList<TouristPlace> sd=new ArrayList<>();
		sd.sort((d1,d2)->d1.getDestination().compareTo(d2.getDestination()));
		return sd;
	}
	public Object sortByRank1(TouristPlace tp) {
		ArrayList<TouristPlace> sr=new ArrayList<>();
		sr.sort((d1,d2)->d1.getRank().compareTo(d2.getRank()));
		return sr;
	}
	public Object clear(TouristPlace tp) {
		ArrayList<TouristPlace> list=new ArrayList<>();
		list.clear();
		return list;
	}
	
}