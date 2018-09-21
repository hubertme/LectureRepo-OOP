class Car{
	final double fullFuelCapacity = 45;

	private int distanceTravelled = 0;
	int changeOilDistance = 0;
	private double fuelCapacity = 0.0;
	double kmPerLitre = 0.0;
	
	Car(){
		this.kmPerLitre = 14;
		this.fuelCapacity = this.fullFuelCapacity;
		this.changeOilDistance = 1000;
	}

	Car(double kmPerLitre){
		if (kmPerLitre<=0){
			System.out.println("Invalid number!");
		}
		else{
			this.kmPerLitre = kmPerLitre;
			this.fuelCapacity = this.fullFuelCapacity;
			this.changeOilDistance = 1000;
		}
	}

	public boolean checkOil(){
		if (distanceTravelled>=changeOilDistance){
			return true;
		}
		return false;
	}

	public int checkOdometer(){
		return distanceTravelled;
	}

	public double checkFuel(){
		return fuelCapacity;
	}

	public void drive(int distance){
		double fuelConsumed = distance/kmPerLitre;

		if (fuelCapacity<=0){
			System.out.println("Car is out of petrol!");
		}
		else if (fuelCapacity-fuelConsumed<0){
			System.out.println("Car cannot finish the journey");
			System.out.format("The maximum distance reached is %.2f\n",fuelCapacity*kmPerLitre);
			
			distanceTravelled+=(fuelCapacity*kmPerLitre);
			fuelCapacity=0;
		}
		else{
			System.out.println("Arrived as well, you drove "+distance);
			fuelCapacity-=fuelConsumed;
			distanceTravelled+=distance;
		}
	}

	public void refillFuel(double value){
		if (value<=0){
			System.out.println("Invalid number!");
		}
		else if (fuelCapacity+value>fullFuelCapacity){
			System.out.format("Too much fuel! Excessive: %.2f litre\n",(fuelCapacity+value-fullFuelCapacity));
			fuelCapacity = fullFuelCapacity;
			System.out.println("But don't worry, your fuel is now full");
		}
		else{
			fuelCapacity+=value;
			System.out.println("Success! Your fuel capacity is now "+fuelCapacity);
		}
	}

	public void horn(){
		System.out.println("Om telolet Om...!");
	}

	public void changeOil(){
		if (checkOil()){
			changeOilDistance+=1000;
			System.out.println("Oil changed! You need to change oil again when your distance is "+changeOilDistance);
			System.out.println("Your current travelled distance is "+this.checkOdometer());
		}
		else{
			System.out.println("You don't need to change oil right now!");
		}
	}
}