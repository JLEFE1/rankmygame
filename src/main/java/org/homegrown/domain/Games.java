/**
 * Created on Nov 29, 2011
 */
package org.homegrown.domain;

import java.io.Serializable;
import java.util.List;

/**
 * @author Clarence
 *
 */
public class Games implements Serializable {

	private List<Game> games;

	public Games() {
	}

	public Games(List<Game> games) {
		this.games = games;
	}
	
	public List<Game> getGames() {
		return games;
	}

	public void setGames(List<Game> games) {
		this.games = games;
	}
	 
}
