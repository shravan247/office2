package practice;

class fibonacci {
	public static void main(String[] args) {
		int firstnum = 0, secondnum = 1;
		for (int i = 1; i <= 5; i++) {
			System.out.println(firstnum);
			int nextnum = firstnum + secondnum;
			firstnum = secondnum;
			secondnum = nextnum;
		}
	}
}