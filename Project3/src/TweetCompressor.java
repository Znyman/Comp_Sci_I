/**
 * Project 3
 * @author Zachery Nyman
 * 25 October 2016
 * Takes a Tweet over 140 characters and compresses it by first removing vowels, then removing random characters.
 */
import java.util.Scanner;
import java.util.Random;

public class TweetCompressor {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		Random randomNumber = new Random();
		
		System.out.println("What is it you would like to Tweet? ");
		String tweet = keyboard.nextLine();
		int tweetLength = tweet.length();
		StringBuilder newTweet= new StringBuilder(tweet);
		
		while (tweetLength > 140 && tweet.contains("a") || tweetLength > 140 && tweet.contains("e") || tweetLength > 140 && tweet.contains("i")
				|| tweetLength > 140 && tweet.contains("o") || tweetLength > 140 && tweet.contains("u")
				|| tweetLength > 140 && tweet.contains("A") || tweetLength > 140 && tweet.contains("E") || tweetLength > 140 && tweet.contains("I")
				|| tweetLength > 140 && tweet.contains("O") || tweetLength > 140 && tweet.contains("U"))
		{
			int randomIndex = randomNumber.nextInt(tweetLength);
			char randomCharacter = tweet.charAt(randomIndex);
			
			if (randomCharacter != ' ' && randomCharacter == 'a' || randomCharacter != ' ' && randomCharacter == 'e' || randomCharacter != ' ' 
					&& randomCharacter == 'i' || randomCharacter != ' ' && randomCharacter == 'o' || randomCharacter != ' ' 
					&& randomCharacter == 'u' || randomCharacter != ' ' && randomCharacter == 'A' || randomCharacter != ' ' 
					&& randomCharacter == 'E' || randomCharacter != ' ' && randomCharacter == 'I'|| randomCharacter != ' ' 
					&& randomCharacter == 'O' || randomCharacter != ' ' && randomCharacter == 'U')
			{
				newTweet.deleteCharAt(randomIndex);
				tweet = newTweet.toString();
				tweetLength = tweet.length();
				randomIndex = randomNumber.nextInt(tweetLength);
				randomCharacter = tweet.charAt(randomIndex);
				
			}
		}
		//System.out.println(tweet);//Prints the tweet once it either equals 140 characters or all vowels are deleted.
		//System.out.println(tweetLength);//Shows the length of the tweet once it either equals 140 characters or all vowels are removed.
		
		while (tweetLength > 140)
		{
			int randomIndex = randomNumber.nextInt(tweetLength);
			char randomCharacter = tweet.charAt(randomIndex);
			
			if (randomCharacter != ' ')
			{
				newTweet.deleteCharAt(randomIndex);
				tweet = newTweet.toString();
				tweetLength = tweet.length();
				randomIndex = randomNumber.nextInt(tweetLength);
				randomCharacter = tweet.charAt(randomIndex);
			}
		}
		System.out.println(tweet);
		//System.out.println(tweetLength);//Used to verify the length of the final tweet once random characters were deleted.
	}
	}
