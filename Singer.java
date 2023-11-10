class Singer {
	private String name;
  private Singer newSinger;
	private int noOfPerformances;
	private double earnings;
	private Song favoriteSong;
  private static int totalPerformances;

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
  
  public void performForAudience(Singer newSinger, int noOfAudience) {
		earnings += (noOfAudience * 100) / 2;
		newSinger.earnings += (noOfAudience * 100) / 2;
		totalPerformances++;

		System.out.print("Earnings after performing for " + noOfAudience + " people:" + '\n' + name + " = " + earnings + '\n' + newSinger.getName() + " = " + newSinger.earnings + '\n' + "Total Performances: " + totalPerformances);
	}
}