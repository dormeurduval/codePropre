package ex6;

public class Conteneur {

	private boolean readAndWrite;
	
	private Object[] elements;
	private int size;
	private int currentSize;
	
	public void Conteneur(){
		currentSize=0;
		size=10;
		elements = new Object[size];
	}
	
	private void incCurrentSize(){
		currentSize++;
	}
	
	private void incSize(){
		if(currentSize==size){
			size = size + 10;
		}
	}
	
	private void incTab(){
		if (currentSize == size){
			Object[] newElements = new Object[size+10];
			for (int i=0; i<size; i++){
				newElements[i] = elements[i];
			}
			elements = newElements;
		}
	}
	
	private void eltTab(Object element){
		elements[currentSize]=element;
	}
	
	public void add(Object element){
		incTab();
		incSize();
		eltTab(element);
		incCurrentSize();
		
		
	}
	
	public Object getContent(int i){
		return elements[i];
	}
	
	public int getSize(){
		return currentSize;
	}
}
