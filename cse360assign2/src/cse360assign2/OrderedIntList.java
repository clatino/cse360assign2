/*
 * Cory Latino
 * pin 31
 * This program implements a list as an array of integers 
 * it inserts into the list and keeps the list in ascending order
 */

package cse360assign2;

/**
 * Takes an array and and inserts while keeping 
 * the list in ascending order
 * 
 */
public class OrderedIntList 
{
	/**
	 * initialize array and count
	 */
	protected int[] array;  
	protected int count; 
	OrderedIntList ()
	{
		array = new int[10];
	}
	
	/**
	 * This insert function inserts integers into an array
	 * while keeping the array in ascending order.
	 */
	public void insert (int temp) 
	{
		boolean done = false;
		if(count == array.length) 
			grow();
		if(count == 0)
		{
			array[0] = temp;
			count++;
		}
		else 
		{
			int index = 0;	
			int index2 = 0;
				while (!done && index < count)
					{
						if(temp < array[index]) 
							done = true;
						else 
							{
								index++;
								index2++;
							}
					}
		for (index = count; index > index2; index--) 
			array[index] = array[index - 1];
			array[index2] = temp; 
			count++;
		}
	}
	
	/**
	 *Grows the size of the array by doubling the size.  
	 */
	private void grow()
	{
		int []count2 = new int[count * 2];
		for (int index = 0; index < count; index++ )
			count2[index] = array[index];
			array = count2;
	}
	
	/**
	 * Prints out the numbers in the array.
	 */
	public void print () 
	{
		for (int index = 0; index < count; ) 
		{
			if (index % 5 == 0) System.out.println();
				System.out.print(array[index++] + "\t");	
		}
		System.out.println();;
	}
	
	
}