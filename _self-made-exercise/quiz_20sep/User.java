public class User{
	private String username;
	String name;
	int followers;
	int following;
	public int rewardPoints;

	User(String user, String name, int followers, int following){
		this.username = user;
		this.name = name;
		this.followers = followers;
		this.following = following;
	}

	public String fetchUsername(){
		return this.username;
	}
}