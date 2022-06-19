package beans;

public class RandomBean {
	private double R;
	
	
	
	
	public RandomBean() {
		setR(0);
		
	}
	
	
	public double getR() {
		return R;
	}
	public void setR(double r) {
		R = r;
	}
	
public double Random(double R){
return R=(double) Math.random()*R;
		
	}



	
}

