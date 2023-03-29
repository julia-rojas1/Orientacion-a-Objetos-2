package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String screenName;
	private List<Tweet> tweets;
	
	public Usuario(String screenName) {
		this.screenName = screenName;
		tweets = new ArrayList<>();
	}
	
	public Tweet crearTweet(String texto, Tweet origen) {
		if ((texto.length()) > 0 && (texto.length() < 5)) {
			Tweet tweet = new Tweet(texto, origen);
			this.tweets.add(tweet);
			return tweet;
		}
		return null;
	}
	
	public int cantTweets() {
		return tweets.size();
	}
	
	public void leerTweet(Tweet tweet) {
		tweet.informarTexto();
	}
	
	public boolean nombreRepe(Usuario us2) {
		return screenName.equals(us2.screenName);
	}
	
	public void heSidoEliminado() {
		tweets.removeAll(tweets);
	}
}
