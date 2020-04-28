package leetcode.Twitter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName: dailyTest
 * @Descripton:
 * @author: liuhao
 * @date: 2020/4/13 17:06
 */
public class Twitter {

    private static  Info headInfo;

    private  static  Map<Integer, Set<Integer>> followings;

    private  static  int count;

    public Twitter() {
        headInfo=null;
        followings=new HashMap<Integer, Set<Integer>>();
    }


    public void postTweet(int userId, int tweetId) {
        Info info =new Info(userId,tweetId);
        Info temp = new Info();
        if(headInfo!=null){
            temp = headInfo;
            headInfo = info;
            info.next = temp;
        }else{
            headInfo=info;
            info.next = null;
        }
    }

    public List<Integer> getNewsFeed(int userId) {
        count=0;
        List<Integer> result =new ArrayList<>();
        Set<Integer> setFollower =followings.get(userId);
        if(setFollower==null){
            setFollower = new HashSet<>();
        }
        setFollower.add(userId);
        Info temp=headInfo;
        while (temp!=null &&  count < 10){
            if(setFollower.contains(temp.userId)){
                count++;
                result.add(temp.tweetId);
            }
            temp=temp.next;
        }
        return result;
    }


    public void follow(int followerId, int followeeId) {
        //
        if(followerId==followeeId){
            return;
        }
        Set<Integer> setFollower =followings.get(followerId);
        if(setFollower!=null){
            setFollower.add(followeeId);
        }else{
            setFollower = new HashSet<>();
            setFollower.add(followeeId);
            followings.put(followerId,setFollower);
        }

    }

    public void unfollow(int followerId, int followeeId) {
        Set<Integer> setFollower =followings.get(followerId);
        if(setFollower!=null){
            setFollower.remove(followeeId);
        }
    }

    private class Info {
        int userId;
        int tweetId;
        private Info next;

        public Info() {
        }

        public Info(int userId, int tweetId) {
            this.userId = userId;
            this.tweetId = tweetId;
        }

        public int getUserId() {
            return userId;
        }

        public void setUserId(int userId) {
            this.userId = userId;
        }

        public int getTweetId() {
            return tweetId;
        }

        public void setTweetId(int tweetId) {
            this.tweetId = tweetId;
        }


    }

    public static void main(String[] args) {
        Twitter twitter =new Twitter();
       // ["Twitter","postTweet","getNewsFeed","follow","postTweet","getNewsFeed","unfollow","getNewsFeed"]
     //[[],[1,5],[1],[1,2],[2,6],[1],[1,2],[1]]
        twitter.postTweet(1,5);
        twitter.getNewsFeed(1);
        twitter.follow(1,2);
        twitter.postTweet(2,6);
        twitter.getNewsFeed(1);
        twitter.unfollow(1,2);
        twitter.getNewsFeed(1);
    }

}
