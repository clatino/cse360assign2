package cse360assign2;


public class Analytics extends OrderedIntList
{

	public static void main(String[] args) 
	{
		Analytics number = new Analytics();
		
		System.out.println(number.mean());
		System.out.println(number.median());
		System.out.println(number.high());
		System.out.println(number.low());
		System.out.println(number.numInts());
	}
	
	/**
	 *returns the mean of the array 
	 */
	
	public double mean()
	{
		if(array.length == 0)
			return -1;
		
		int sum = 0;
		
		for(int index = 0; index < array.length; index++)
		{
			sum += array[index];
		}
		
		return (double) sum/array.length;
	}
	
	/**
	 * returns the median of the array
	 */
	
	public int median()
	{
		if(array.length == 0)
			return -1;
		
		if(array.length == 1)
		{
			return array[0];
		}
		
		return array[(int) Math.ceil(((float) array.length/2))];
	}
	
	/**
	 * returns the highest value in the array
	 */
	
	public int high()
	{
		if(array.length == 0)
			return -1;
		
		int high = Integer.MIN_VALUE;
		
		for(Integer num : array)
		{
			if(num > high)
			{
				high = num;
			}
		}
		
		return high;
	}
	
	/**
	 * return the lowest value of the array 
	 */
	
	public int low()
	{
		if(array.length == 0)
			return -1;
		
		int low = Integer.MAX_VALUE;
		
		for(Integer num : array)
		{
			if(num < low)
			{
				low = num;
			}
		}
		
		return low;
	}
	
	/**
	 * returns the number of values in the array
	 */
	
	public int numInts()
	{
		return array.length;	
	}
}