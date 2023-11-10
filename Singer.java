class Singer {
	private String name;
	private int noOfPerformances;
	private double earnings;
	private Song favoriteSong;

	public Singer(String name) {
		this.name = name;
		this.noOfPerformances = 0;
		this.earnings = 0;
		this.favoriteSong = null;
	}

	public void performForAudience(int numberOfPeople) {
		this.noOfPerformances++;
		this.earnings += numberOfPeople * 100;

		System.out.println("Earnings after Performance: " + earnings);
	}

  public void setFavSong(Song favoriteSong) {
		this.favoriteSong = favoriteSong;
		System.out.println("Favorite Song: " + favoriteSong.getTitle());
  }

	public void changeFavSong(Song newFavoriteSong) {
		this.favoriteSong = newFavoriteSong;
		System.out.println("New Favorite Song: " + newFavoriteSong.getTitle());
	}

	public String getName() {
		return name;
	}

	public int getNoOfPerformances() {
		return noOfPerformances;
	}

	public double getEarnings() {
		return earnings;
	}

	public Song getFavoriteSong() {
		return favoriteSong;
	}

  
}