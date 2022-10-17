class Car extends Mercedes  {
	
	int carModel = 2003;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		System.out.println(myCar.carModel);
		System.out.println(myCar.model + myCar.name);
		
		Mercedes myMercedes = new Mercedes();
		System.out.println(myMercedes.model + myMercedes.name);
		Mercedes.maxSpeed();

	}

}

