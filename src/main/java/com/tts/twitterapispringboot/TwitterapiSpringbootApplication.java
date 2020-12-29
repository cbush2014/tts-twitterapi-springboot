package com.tts.twitterapispringboot;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tts.twitterapispringboot.service.Twitter4j;

import twitter4j.IDs;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;

@SpringBootApplication
public class TwitterapiSpringbootApplication implements CommandLineRunner {
	
	@Autowired
	private Twitter4j apiService;

	public static void main(String[] args) {
		SpringApplication.run(TwitterapiSpringbootApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
//		List<String> tweets = Twitter4j.getTimeLine();	

//		for (String tweet : tweets) {
//			System.out.println(tweet);
//	        
//	    }		
		
		// TODO Auto-generated method stub
		
//		Twitter twitter = new TwitterFactory().getInstance();
		//My Applications Consumer and Auth Access Token
//		twitter.verifyCredentials();
//		twitter.friendsFollowers();
		
//		try {
		
		 // The factory instance is re-useable and thread safe.
	   // Twitter twitter = TwitterFactory.getSingleton();
	   // User user = twitter.verifyCredentials();
	    
//		twitter.verifyCredentials();
		//twitter.friendsFollowers();

	    //send a direct message
//	    String myMsg = "Dig that, a Direct Message from Stopher";
//	    String myResp = "";
	    
//	    myResp = sendDirectMessage("PutUserNameHere", myMsg);

//	    myResp = createTweet("test this");
		
		// get friend followers
//		https://bugsdb.com/_en/debug/3e9d849e4337da4b396bdf112fc4d491		
//		      long cursor = -1;
//		      IDs ids;
//		      System.out.println("Listing followers's ids.");
//		      do {
//		              ids = twitter.getFollowersIDs("@UserNameGoesHere", cursor);
//		          for (long id : ids.getIDs()) {
//		              System.out.println(id);
//		              User user1 = twitter.showUser(id);
//		              System.out.println(user1.getName());
//		          }
//		      } while ((cursor = ids.getNextCursor()) != 0);
	    
//	    List<Status> statuses = twitter.getHomeTimeline();
//	    List<Status> statuses = twitter.getUserTimeline("@ChicagoBears");
//	    List<Status> status2 = twitter.getUserTimeline("@Cubs");
//	    List<Status> status3 = twitter.getUserTimeline("@NHLBlackhawks");
	    //System.out.println("Showing @"+user.getScreenName()+ "'s home timeline.");

//	    for (Status status : statuses) {
//	        System.out.println("@" + status.getUser().getScreenName() + " - " +
//	                           status.getText());
//	    }
//
//	    for (Status status : status2) {
//	        System.out.println("@" + status.getUser().getScreenName() + " - " +
//	                           status.getText());
//	    }
//
//	    for (Status status : status3) {
//	        System.out.println("@" + status.getUser().getScreenName() + " - " +
//	                           status.getText());
//	    }
//		} catch (TwitterException te) {
//			te.printStackTrace();
//			System.out.println("Failed to get timeline: " + te.getMessage());
//			System.exit(-1);
//		}
	       
//	}

}
}
