package hello;

import org.springframework.data.annotation.Id;
import java.util.ArrayList;


public class User {

	@Id private String id;

	private String firstName;
	private String lastName;
    private ArrayList<String> visitedArtist;
    private ArrayList<String> visitedGenre;
    
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
    
    public ArrayList<String> getVisitedArtist() {
        return visitedArtist;
    }
    
    public void setgetVisitedArtist(ArrayList<String> visitedArtist) {
        this.visitedArtist = visitedArtist;
    }
    
    public ArrayList<String> getVisitedGenre() {
        return visitedArtist;
    }
    
    public void setgetVisitedGenre(ArrayList<String> visitedGenre) {
        this.visitedGenre = visitedGenre;
    }
}
