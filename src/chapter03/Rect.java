package chapter03;

public class Rect {
	private int width;
	private int height;
	
	public Rect(int width,int height){
		this.width=width;
		this.height=height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public String toString() {
		return "Rect [width=" + width + ", height=" + height + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj==null){
			return false;
		}
		
		if(obj instanceof Rect == false){
			return false;
		}
		if(this==obj){
			return true;
		}
		
		Rect that=(Rect) obj;
		if(this.width==that.width&&
				this.height==that.height){
			return true;
		}
		return false;
	}
		
	
}
