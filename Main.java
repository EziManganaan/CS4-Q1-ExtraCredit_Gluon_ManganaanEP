class Main {
  public static void main(String[] args) {
		VMA vmas1 = new VMA("Taylor Swift", 14);
		VMA vmas2 = new VMA("Nicki Minaj", 1);
		VMA vmas3 = new VMA("Ariana Grande", 5);
		
		Song song1 = new Song("Traitor by Olivia Rodrigo", "Pop");
		Song song2 = new Song("All I Want for Christmas is You by Mariah Carey", "Pop");
		song1.Play();	
		
		Singer singer1 = new Singer("Katy Perry");
    Singer singer2 = new Singer("Jennifer Hudson");
		singer1.setFavSong(song1);
		singer1.changeFavSong(song2);
		singer1.performForAudience(12);
    singer2.performForAudience(12);
    singer2.performForAudience(singer2, 13);
    singer2.performForAudience(13);
  }
}