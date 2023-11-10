public class Song{
  private String title;
  private String genre;
	
  public Song(String _title, String _genre){
    title = _title;
    genre = _genre;
  }
  public void Play(){
    System.out.println(getTitle() + " is Playing!");
  }
  public String getTitle(){
    return title;
  }
  public void setTitle(String title){
    this.title = title;
  }
  public String getGenre(){
    return genre;
  }
  public void setGenre(String genre){
    this.genre = genre;
  }
}