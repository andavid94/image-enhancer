/*
 * BufferedImageStack.java
 * by David An
 * This program creates a stack class that is used by the ImageEnhancerWithUndoAndRedo class 
 * in order to implement the undo and redo functions. 
 */

import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Iterator;

public class BufferedImageStack {
	
	private ArrayList<BufferedImage> stackOfImages;			//declare variable stackOfImages
	
	public BufferedImageStack(){
		stackOfImages = new ArrayList<>();					//construct new stackOfImages object
	}
	
	/*
	 * Adds the passed picture to the stackOfImages array
	 * 
	 * @param  picture	a BufferedImage to be added to the stackOfImages array
	 */
	public void push(BufferedImage picture){	
		stackOfImages.add(picture);				//add picture to the stackOfImages array
	}
	
	/*
	 * Removes and returns the last image from stackOfImages
	 * 
	 * @return		the last image from stackOfImages
	 */
	public BufferedImage pop(){
		if (stackOfImages.isEmpty()){
			throw new EmptyStackException();			//throw an exception if stackOfImages is empty
		}
		return stackOfImages.remove(stackOfImages.size()-1); //remove and return the last image from 
															 // stackOfImages
	}
	
	/*
	 * Returns the last image from stackOfImages
	 * 
	 * @return		the last image from stackOfImages
	 */
	public BufferedImage peek(){
		if (stackOfImages.isEmpty()){
			throw new EmptyStackException();			//throw an exception if stackOfImages is empty
		}	
		return stackOfImages.get(stackOfImages.size()-1);	//return the last image from stackOfImages
	}
	
	/*
	 * Returns whether the array is empty
	 * 
	 * @return		true if stackOfImages is empty, false otherwise
	 */
	public boolean isEmpty(){
		return (stackOfImages.isEmpty());				//return true if stackOfImages is empty
	}
	
	/*
	 * Clears all elements in the stackOfImages
	 */
	public void clearAll(){
		Iterator<BufferedImage> i = stackOfImages.iterator();	//initialize iterator
		while(i.hasNext()){
			BufferedImage temp = i.next();						//remove all elements of stackOfImages
			i.remove();
		}
	}
	
	/*
	 * Returns the image at the given index
	 * 
	 * @param  index	the index of the image to be returned
	 * @return 			the image at the given index
	 */
	public BufferedImage get(int index){
		if (index < 0 || index >= stackOfImages.size()){
			throw new IndexOutOfBoundsException();	//throw an exception if given index is out of bounds
		}
		return stackOfImages.get(index);			//return the image at the given index
	}
	
	/*
	 * Returns the integer size of stackOfImages
	 * 
	 * @return 		the size of stackOfImages
	 */
	public int getSize(){
		return stackOfImages.size();				//return the size of stackOfImages
	}
	
}
	

