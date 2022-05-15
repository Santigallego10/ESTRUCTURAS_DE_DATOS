package co.edu.cue.ed.parcial1.model4;

public class User {

	private SegmentType segmentType;
	private String name;
	private String id;
	
	
	public User() {
		
	}


	public User(SegmentType segmentType, String name, String id) {
		super();
		this.segmentType = segmentType;
		this.name = name;
		this.id = id;
	}


	public SegmentType getSegmentType() {
		return segmentType;
	}


	public void setSegmentType(SegmentType segmentType) {
		this.segmentType = segmentType;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "User [segmentType=" + segmentType + ", name=" + name + ", id=" + id + "]";
	}
	
	
	
	
}