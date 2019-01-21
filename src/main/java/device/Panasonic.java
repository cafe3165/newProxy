
package device;

/**
 * @author chenshihong02
 * @version 1.0
 * @created 2018/12/23 下午6:36
 **/
public class Panasonic {

	private float Temperature;
    public void down() {
    	Temperature-=0.5;
        System.out.println("松下空调降温");
    }
    
   
	public float getTemperature() {
		return Temperature;
	}

	public void setTemperature(float t) {
		Temperature = t;
	}
}