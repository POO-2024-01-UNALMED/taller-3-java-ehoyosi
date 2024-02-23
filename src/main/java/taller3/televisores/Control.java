package taller3.televisores;

public class Control {
	
	TV tv;
	
	public void turnOn() {
		
		tv.turnOn();
	}
	
	public void turnOff() {
		
		tv.turnOff();
	}
	
	public void volumenUp() {
		
		tv.volumenUp();
	}
	
	public void volumenDown() {
		
		tv.volumenDown();
	}
	
	public void canalUp() {
		
		tv.canalUp();
	}
	
	public void canalDown() {
		
		tv.canalDown();
	}
	
	public void setCanal(int num) {
		
		tv.setCanal(num);
	}
	
	public void setVolumen(int num) {
		
		tv.setVolumen(num);
	}
	
	public void enlazar(TV tele) {
		
		tv = tele;
		
	}
    
	public TV getTv(TV tv) {
		
		return tv;
		
	}
	
	public void setTv(TV tv) {
		
		this.tv = tv;
	}
}



