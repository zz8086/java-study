
public class Lab03_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int java, mobile, excel;
		double B, A0, A;
		java = 3;
		mobile = 2;
		excel = 1;
		B = 3.5;
		A0 = 4.0;
		A = 4.5;
		double res = ((java * B) + (mobile * A0) + (excel * A)) / (java + mobile + excel);
		res = Math.round(res*100.0) / 100.0;
		System.out.println(res);
	}

}
