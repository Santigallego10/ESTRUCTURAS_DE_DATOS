package co.edu.cue.ed.tablaHash.model;

public class MusicExercise1 {

	private String name;
	private String gender;
	private String singer;
	private int yearPublic;
	private int mothPublic;
	private String album;
	
	public MusicExercise1() {
	}

	public MusicExercise1(String name,String gender, String singer, int yearPublic, int mothPublic, String album) {
		super();
		this.name = name;
		this.gender = gender;
		this.singer = singer;
		this.yearPublic = yearPublic;
		this.mothPublic = mothPublic;
		this.album = album;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public int getYearPublic() {
		return yearPublic;
	}

	public void setYearPublic(int yearPublic) {
		this.yearPublic = yearPublic;
	}

	public int getMothPublic() {
		return mothPublic;
	}

	public void setMothPublic(int mothPublic) {
		this.mothPublic = mothPublic;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}
	
	
	
	
}
