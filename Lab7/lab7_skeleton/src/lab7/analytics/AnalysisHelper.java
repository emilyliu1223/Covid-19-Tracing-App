/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7.analytics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lab7.entities.Comment;
import lab7.entities.Post;
import lab7.entities.User;

/**
 *
 * @author harshalneelkamal
 */
public class AnalysisHelper {
    // find user with Most Likes
    // TODO
  
    
    // find 5 comments which have the most likes
    // TODO
     public void userWithMostLikes(){
         Map<Integer,Integer> userLikesCount=new HashMap<>();
         Map<Integer,User>users=DataStore.getInstance().getUsers();
         
         for(User user:users.values()){
              for(Comment c: user.getComments()){
              int likes=0;
              if(userLikesCount.containsKey(user.getId())){
              likes=userLikesCount.get(user.getId());  
              }
              likes+=c.getLikes();
              userLikesCount.put(user.getId(), likes);
              }
         }
         int max=0;
         int maxId=0;
         for(int id:userLikesCount.keySet()){
         if(userLikesCount.get(id)>max){
           max=userLikesCount.get(id);
           maxId=id;
         }
         }
         System.out.println("User with most likes  "+ max+"  \n "+users.get(maxId));
         System.out.println();
         }
        public void getFiveMostLIkedComment(){
         Map<Integer,Comment> comments=DataStore.getInstance().getComments();
         List<Comment> commentList=new ArrayList<>(comments.values());
         
         Collections.sort(commentList, new Comparator<Comment>(){
            @Override
            public int compare(Comment o1,Comment o2){
            return o2.getLikes()-o1.getLikes();
            }
         }
              );
                 System.out.println("5 most liked comments");
                 for(int i=0;i<commentList.size()&&i<5;i++){
             System.out.println(commentList.get(i));
    }
    System.out.println();
         }
           public void find5UserwithleastComment(){
            System.out.println("Q5:");
               Map<Integer,User>users=DataStore.getInstance().getUsers();
              List<User> userList=new ArrayList<>(users.values());
           //  Map<Integer,Integer> userLikesCount=new HashMap<>();
             
           Collections.sort(userList,new Comparator<User>(){
                @Override
                  public int compare(User g1,User g2){
              return g1.getComments().size()-g2.getComments().size();
            }
         }
              );
            System.out.println("find least comments users");
                 for(int i=0;i<userList.size()&&i<6;i++){
             System.out.println(userList.get(i));
               
         }System.out.println();
    }
         public void top5proactiveusersoverall(){
            System.out.println("Q7:");
              Map<Integer,User>users=DataStore.getInstance().getUsers();
               final Map<Integer,Post>posts=DataStore.getInstance().getPosts();
              List<User> userList=new ArrayList<>(users.values());
               final Map<Integer,Integer> userLikesCount=new HashMap<>();
               final Map<Integer,Integer> postCount=new HashMap<>();
               final List<Post> postList=new ArrayList<>(posts.values());
            
             
             for(User user:users.values()){
              for(Comment c: user.getComments()){
              int likes=0;
              int commenting=0;
              if(userLikesCount.containsKey(user.getId())){
              likes=userLikesCount.get(user.getId());  
              }
              likes+=c.getLikes();
              userLikesCount.put(user.getId(), likes);
              }
             }
            
              for(Post post:postList){
                  int postaa=0;
                 if(postCount.containsKey(post.getUserId())){
                     postaa=postCount.get(post.getUserId());
                 }
                 postaa+=1;
                   postCount.put(post.getUserId(), postaa);
                 }
              
             
              Collections.sort(userList,new Comparator<User>(){
                @Override
                  public int compare(User u1,User u2){
              return userLikesCount.get(u1.getId())+u1.getComments().size()+postCount.get(u1.getId())-userLikesCount.get(u2.getId())+u2.getComments().size()+postCount.get(u2.getId());
            }
         }
              );
              Collections.reverse(userList);
              System.out.println("top 5 proactive users overall: ");
             for(int i=0;i<userList.size()&&i<5;i++){
             System.out.println("points:"+userLikesCount.get(userList.get(i).getId())+userList.get(i).getComments().size()+postCount.get(userList.get(i).getId()));
             }
             System.out.println();
         }
         
         public void top5inactiveusersoverall(){
            System.out.println("Q6:");
              Map<Integer,User>users=DataStore.getInstance().getUsers();
               final Map<Integer,Post>posts=DataStore.getInstance().getPosts();
              List<User> userList=new ArrayList<>(users.values());
               final Map<Integer,Integer> userLikesCount=new HashMap<>();
               final Map<Integer,Integer> postCount=new HashMap<>();
               final List<Post> postList=new ArrayList<>(posts.values());
            
             
             for(User user:users.values()){
              for(Comment c: user.getComments()){
              int likes=0;
              int commenting=0;
              if(userLikesCount.containsKey(user.getId())){
              likes=userLikesCount.get(user.getId());  
              }
              likes+=c.getLikes();
              userLikesCount.put(user.getId(), likes);
              }
             }
            
              for(Post post:postList){
                  int postaa=0;
                 if(postCount.containsKey(post.getUserId())){
                     postaa=postCount.get(post.getUserId());
                 }
                 postaa+=1;
                   postCount.put(post.getUserId(), postaa);
                 }
              
             
              Collections.sort(userList,new Comparator<User>(){
                @Override
                  public int compare(User u1,User u2){
              return userLikesCount.get(u2.getId())+u2.getComments().size()+postCount.get(u2.getId())-userLikesCount.get(u1.getId())+u1.getComments().size()+postCount.get(u1.getId());
            }
         }
              );
              Collections.reverse(userList);
              System.out.println("top 5 inactive users overall: ");
             for(int i=0;i<userList.size()&&i<5;i++){
             System.out.println("points:"+userLikesCount.get(userList.get(i).getId())+userList.get(i).getComments().size()+postCount.get(userList.get(i).getId()));
             }
             System.out.println();
         }
        
}
