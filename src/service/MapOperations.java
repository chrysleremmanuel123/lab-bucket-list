package service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import model.TouristPlace;

public class MapOperations{
	public Map<Integer, TouristPlace> add(TouristPlace tp) {
		Map<Integer,TouristPlace> am=new HashMap<>();
		am.put( null, tp);
		return am;
	}
	public Map<Integer,TouristPlace> sortRandomly(TouristPlace tp){
		Map<Integer,TouristPlace> sRan=new HashMap<>();
		sRan.put( null, tp);
		return sRan;
	}
	public HashMap<Integer,TouristPlace> sortInEntryOrder(TouristPlace tp){
		Map<Integer,TouristPlace> sEnt=new HashMap<>();
		sEnt.put( null, tp);
		return (HashMap<Integer, TouristPlace>) sEnt;
	}
	public HashMap<Integer,TouristPlace> sortAlphabetically(TouristPlace tp){
		Map<Integer,TouristPlace> sAlpha=new HashMap<>();
		sAlpha.put( null, tp);
		return (HashMap<Integer, TouristPlace>) sAlpha;
	}
	public Object reset(TouristPlace tp) {
		Map<Integer,TouristPlace> cl=new HashMap<>();
		cl.clear();
		return cl;
	}
	public HashMap<Integer,TouristPlace> remove(TouristPlace places){
		Map<Integer,TouristPlace> rem=new HashMap<>();
		rem.remove(rem);
		return (HashMap<Integer, TouristPlace>) rem;
	}
}