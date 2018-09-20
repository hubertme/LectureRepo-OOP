class Addition{
	static int add(int...trailing){
		int sum=0;
		for (int num:trailing){
			sum+=num;
		}
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(add(1,5,6,4,2));
	}
}