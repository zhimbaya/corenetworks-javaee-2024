package principal;

public class TestInstanceOf {

	public static void main(String[] args) {
		Object ob ="300";
		if (ob instanceof String s) {
			System.out.println(s);
		}else if (ob instanceof Integer in) {
			in++;
		}
	}
}
