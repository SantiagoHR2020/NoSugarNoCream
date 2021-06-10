
public class MethodParams {
	public static void main(String[] args) {
		MethodParams mp = new MethodParams();
		
		double d  = mp.converIntToDouble(44);
		
		System.out.println(d);
		System.out.println(mp.sum(1.0, 2, 3));
	}
	
	public double converIntToDouble(int num) {
		return (double)num;
	}
	
	public double sum(double num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
}
