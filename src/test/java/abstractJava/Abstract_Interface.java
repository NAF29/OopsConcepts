package abstractJava;


interface Bank{
	float rateOfInterest();
}

class Sbi implements Bank{

	@Override
	public float rateOfInterest() {
		return 9.8f;
	}
}
	class Pnb implements Bank{
		public float rateOfInterest() {
			return 9.5f;
		}
	}

public class Abstract_Interface {

	public static void main(String[] args) {
		Bank objBank = new Sbi();
		System.out.println("ROI:" + objBank.rateOfInterest());
		Bank obBank = new Pnb();
		System.out.println("ROI : " + obBank.rateOfInterest()) ;
		
	}

}
