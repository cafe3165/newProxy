
package device;

/**
 * @author chenshihong02
 * @version 1.0
 * @created 2018/12/23 下午6:34
 **/
public class Gree {
	
	private float Temperature;
    
	public void cool() {
		Temperature-=0.5;
        System.out.println("格力空调降温");
    }
 
	public float getTemperature() {
		return Temperature;
	}

	public void setTemperature(float t) {
		Temperature = t;
	}
	
	
}