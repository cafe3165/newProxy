
package runtime;

/**
 * @author chenshihong02
 * @version 1.0
 * @created 2018/12/23 下午6:38
 **/
public class AirConditionImpl implements AirCondition {

    //空调类型
    private String type;
    private float Temperature ;

    @Override
    public void cool() {
    

    }


	@Override
	public void setT(float temperature) {
		// TODO Auto-generated method stub
		Temperature=temperature;
	}


	@Override
	public float getT() {
		// TODO Auto-generated method stub
		return Temperature;
	}
}