package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

import model.TouristPlace;

public class SetOperations{
	public HashSet<TouristPlace> add(TouristPlace places){
		Map<Integer,TouristPlace> add=new HashMap<>();
		add.put( null, places);
		return (HashSet<TouristPlace>) add;
	}
	public HashSet<TouristPlace> remove(TouristPlace places){
		Map<Integer,TouristPlace> remove=new HashMap<>();
		remove.remove(remove);
		return (HashSet<TouristPlace>) remove;
	}
	public Object sortByDestination(TouristPlace tp) {
		HashSet<TouristPlace> sort=new HashSet<>();
		((List<TouristPlace>) sort).sort((d1,d2)->d1.getDestination().compareTo(d2.getDestination()));
		return sort;
	}
	public Object sortByRank(TouristPlace tp) {
		HashSet<TouristPlace> sortByRank=new HashSet<>();
		((List<TouristPlace>) sortByRank).sort((d1,d2)->d1.getRank().compareTo(d2.getRank()));
		return sortByRank;
	}
	public Object reset(TouristPlace tp) {
		Map<Integer,TouristPlace> clear=new HashMap<>();
		clear.clear();
		return clear;
	}
}