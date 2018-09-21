class Television{
	private int channel = 0;
	private int volume = 0;
	boolean isTurnedOn = false;

	// Constants
	final int maxChannel = 100;
	final int minChannel = 1;
	final int maxVolume = 15;
	final int minVolume = 1;

	public Television(){
		this.isTurnedOn = false;
		this.channel = minChannel;
		this.volume = minVolume;
	}

	public void onOffTelevision(){
		if (!this.isTurnedOn){
			System.out.println("Television is now on!");
			this.isTurnedOn = true;
			return;
		}
		System.out.println("Television is now off!");
		this.isTurnedOn = false;
	}

	// Channel Things
	public void increaseChannel(){
		if (this.isTurnedOn){
			if (this.channel==maxChannel){
				this.channel=minChannel;
				printChannel();
				return;
			}
			this.channel+=1;
			printChannel();
		}
		else{
			System.out.println("Please turn on the TV first!");
		}
	}
	public void decreaseChannel(){
		if (this.isTurnedOn){
			if (this.channel==minChannel){
				this.channel=maxChannel;
				printChannel();
				return;
			}
			this.channel-=1;
			printChannel();
		}
		else{
			System.out.println("Please turn on the TV first!");
		}
	}
	public void setChannel(int chan){
		if (this.isTurnedOn){
			if ((chan>=1) && (chan<=100)){
				this.channel = chan;
				printChannel();
				return;
			}
			System.out.println("Invalid channel! Please input channel between 1 and 100");
		}
		else{
			System.out.println("Please turn on the TV first!");
		}
	}
	private void printChannel(){
		System.out.println("Your TV channel is now "+fetchChannel());
	}

	// Volume Things
	public void increaseVolume(){
		if (this.isTurnedOn){
				if (this.volume==15){
				System.out.println("Maximum volume reached!");
				printVolume();
				return;
			}
			this.volume+=1;
			printVolume();
		}
		else{
			System.out.println("Please turn on the TV first!");
		}
	}
	public void decreaseVolume(){
		if (this.isTurnedOn){
			if (this.volume==1){
				System.out.println("Minimum volume reached!");
				printVolume();
				return;
			}
			this.volume-=1;
			printVolume();
		}
		else{
			System.out.println("Please turn on the TV first!");
		}
	}
	private void printVolume(){
		System.out.println("Your TV volume is now "+fetchVolume());
	}

	// Fetching data
	public int fetchVolume(){
		return this.volume;
	}
	public int fetchChannel(){
		return this.channel;
	}
	public void fetchStatus(){
		String stringOn = "";
		if (this.isTurnedOn){
			stringOn = "On";
		}
		else{
			stringOn = "Off";
		}
		System.out.println("Your TV is "+stringOn);
		System.out.println("You are in channel "+fetchChannel()+" and with volume "+fetchVolume());
	}
}