/**
 * 
 * @author Momo
 * 
**/
public class Maximum {
	
	/**
	 * 
	 * Befüllt Array mit Integern und führt die Berechnungsmethoden aus
	 * 
	 * **/
	public Maximum(int z1,int z2,int z3,int z4,int z5){
		
		nums[0]=z1;
		nums[1]=z2;
		nums[2]=z3;
		nums[3]=z4;
		nums[4]=z5;
		
		Sum();
		Max();
		Min();
	}
	
	int[] nums=new int[5];
	int sum;
	int max;
	int min;
	
	/**
	 * 
	 * Gibt Summe zurück
	 * 
	 * **/
	public int getSum(){
		
		return sum;
		
	}
	
	/**
	 * 
	 * Gibt Maximum zurück
	 * 
	 * **/
	public int getMax(){
		
		return max;
		
	}
	
	/**
	 * 
	 * Gibt Minimum zurück
	 * 
	 * **/
	public int getMin(){
	
		return min;
	
	}
	
	/**
	 * 
	 * Summe berechnen
	 * 
	 * **/
	private void Sum(){
		
		for(int z=0;z<5;z++){
			
			sum=sum+nums[z];
			
		}
		
	}
	
	/**
	 * 
	 * Maximum berechnen
	 * 
	 * **/
	private void Max(){
		
		for(int z=0;z<5;z++){
			
			if(nums[z]>nums[z+1]){
				
				max=nums[z];
				
			}else{
				
				max=nums[z+1];
				
			}
			
		}
		
	}
	
	/**
	 * 
	 * Minumum berechnen
	 * 
	 * **/
	private void Min(){
		
		for(int z=0;z<5;z++){
			
			if(nums[z]<nums[z+1]){
				
				max=nums[z];
				
			}else{
				
				max=nums[z+1];
				
			}
			
		}
		
	}
	
}