		public class AirConditioner{
	
		private boolean isOn;
		private String productName;
		private int temperature;
		
		public AirConditioner (String productName){
			this.productName = productName;
			}
		public void decreaseTemperature (int decrease){
			decrease = temperature - decrease;
			}
		public String getProductName(){		
			return productName;
			}		
		public int getTemperature(){
			return temperature;
			}
		public void increaseTemperature (int increase){
			increase = temperature + increase;
			}
		public boolean isOn(){
			return isOn;
			}
		public void setOn (boolean isOn){
			this.isOn = isOn;
			}
		public void setProductName (String productName){
			this.productName =  productName;
			}
		public void setTemperature (int temperature){
			this.temperature = temperature;
			}
			
			
}
