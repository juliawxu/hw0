package uchidb;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;
import java.util.HashMap; 

/**
 * @author aelmore
 */
public class HW0Runner<T,S> implements Containers<T, S>{
    private static Containers<Integer, String> cont = null;
    
    	public Set<T> initSet(T[] tArray) {
    		Set<T> newSet = new HashSet<T>(Arrays.asList(tArray));
    		return newSet;
    	}
    	
    	public List<T> initList(T[] tArray) {
    		List<T> newList = Arrays.asList(tArray);
    		return newList;
    	}
    	
    	public Map<S, T> initEmptyMap() {
    		Map<S,T> newMap = new HashMap<S,T>();
    		return newMap;
    	}
    
    	private Map<S,T> forStorage = null;
    	
    	public void storeMap(Map<S,T> mapToStoreInClass) {
    		forStorage = mapToStoreInClass;
    	}
    	
    	public boolean addToMap(S key, T value, boolean overwriteExistingKey) {
    		if(overwriteExistingKey) {
    			forStorage.put(key, value);
    			return true;
    		}
    		else {
    			return false;
    		}
    	}
    	
    	public T getValueFromMap(S key) {
    		return forStorage.get(key);
    	}
    	
    	public T getValueFromMap(S key, T defaultValue) {
    		if (forStorage.containsKey(key)) {
    			return forStorage.get(key);
    		}
    		else {
    			return defaultValue;
    		}
    	}
    	
	//TODO you likely will need to add member variable
	
	
	// This class is a factory for a singleton containers class.
	// https://www.tutorialspoint.com/java/java_using_singleton.htm
	public static Containers<Integer, String> getContainers() {
		// TODO fix this function
		//do singleton thingy
		if (cont == null) {
			cont = new HW0Runner<Integer, String>();
		}
		return cont;
	}

	public static void main(String[] args){
		
	}
}
