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
    public void getUserWithMostLike(){
    Map<Integer,Integer> userLikes=new HashMap<>();
    Map<Integer,User> userMap=DataStore.getInstance().getUsers();
    for(User u: userMap.values()){
        for(Comment comment:u.getComments()){
            if(userLikes.containsKey(u.getId())){
                int commentLikes=userLikes.get(u.getId())+comment.getLikes();
                userLikes.put(u.getId(), commentLikes);
            }
            else{
                userLikes.put(u.getId(), comment.getLikes());
            }      
        }
    }
    int winner=0;
    int maxLikes=0;
    for(Integer i:userLikes.keySet()){
        if(maxLikes<userLikes.get(i)){
            winner=i;
            maxLikes=userLikes.get(i);
        }
    }
    System.out.println("1.user with most like:"+winner+",number of likes:"+maxLikes);
    }
    // find 5 comments which have the most likes
    public void getFiveCommentWithMostLikes(){
        Map<Integer, Comment> commentMap=DataStore.getInstance().getComments();
        List<Comment> comments=new ArrayList<>( commentMap.values());
        Collections.sort(comments,new Comparator<Comment>(){
        //order: descending
        @Override
        public int compare(Comment c1,Comment c2){
            return c2.getLikes()-c1.getLikes();
        }
        });
        for(int i=0;i<5;i++){
            System.out.println("2."+comments.get(i));
        }
    }
        
         public void getAverageLikesperComment(){
             System.out.println("Q1:");
             // Map<Integer,Integer> commentLikesCount=new HashMap<>();
          Map<Integer,Comment> comments=DataStore.getInstance().getComments();
         List<Comment> commentList=new ArrayList<>(comments.values());
         int commenting=0;
         int count=0;
         for(Comment comment:commentList){
             commenting+=comment.getLikes();
             count++;
         }
         System.out.println("average likes per comment "+commenting/count);
         System.out.println();
         }
           //post with most liked comments
//        public void getPostWithMostLikedComments(){
//            System.out.println("Q2:");
//            Map<Integer, Integer> LikedCommentCount=new HashMap<>();
//            Map<Integer, Post> posts = DataStore.getInstance().getPosts();
//            
//            for(Post post:posts.values()){
//                int maxlike=0;
//                for(Comment c: post.getComments()){
//                    int like=0;
//                    if(LikedCommentCount.containsKey(post.getPostId())){
//                        like=LikedCommentCount.get(post.getPostId());
//                    }
//    //               
//                        like=  Math.max(like,c.getLikes());
//                        
//                    
//                    LikedCommentCount.put(post.getPostId(), like);
//                }
//                //LikedCommentCount.put(post.getPostId(), maxlike);
//            }
//            int max=0;
//            int maxId=0;
//            for(int id:LikedCommentCount.keySet()){
//                if(LikedCommentCount.get(id)>max){
//                    max=LikedCommentCount.get(id);
//                    maxId=id;
//                    
//                }
//            }
//            int maxprint=0;
//            int maxIdprint=0;
//            for(int id:LikedCommentCount.keySet()){
//                if(LikedCommentCount.get(id)==max){
//                    maxprint=LikedCommentCount.get(id);
//                    maxIdprint=id;
//                    
//    //            }
//    //        }
//            System.out.println("post with most liked comments-- post id:"+maxIdprint+",likes count:"+maxprint);
//            
//                }}System.out.println();
//        }
            //post with most cpmments
        public void getPostWithMostComments(){
            System.out.println("Q3:");
            Map<Integer, Post> posts=DataStore.getInstance().getPosts();
            //List<Post> postList=new ArrayList<>(posts.values());
            Map<Integer, Integer> postCount=new HashMap<>();
            for(Post post:posts.values()){
                int count=0;
                for(Comment c:post.getComments()){
                    count+=1;
                }
                postCount.put(post.getPostId(), count);
            }
            int max=0;
            int maxId=0;
            for(int id:postCount.keySet()){
                if(postCount.get(id)>max){
                    max=postCount.get(id);
                    maxId=id;
                    //System.out.println("post with most comments-- post id:"+maxId+", comments count:"+max);
                }
            }
            //System.out.println("post with most comments-- post id:"+maxId+", comments count:"+max);
            int maxprint=0;
            int maxIdprint=0;
            for(int id:postCount.keySet()){
                if(postCount.get(id)==max){
                    maxprint=postCount.get(id);
                    maxIdprint=id;
                    System.out.println("post with most comments-- post id:"+maxIdprint+", comments count:"+maxprint);
                }
            }
            //System.out.println("post with most comments-- post id:"+maxId+", comments count:"+max);
        System.out.println();
        }
           public void getInactUser_TotalPostNo(){
            System.out.println("Q4:");
            Map<Integer,Integer> postNoCount=new HashMap<>();
            Map<Integer,Post> posts=DataStore.getInstance().getPosts();
            Map<Integer,User> users=DataStore.getInstance().getUsers();
             
               for(User p:users.values()){
                
                   if(postNoCount.containsKey(p.getId())){
                  
                    }
                else{
                    postNoCount.put(p.getId(),0);
                    //System.out.println("shuruid"+p.getId());
                    }
               }
             
            for(Post p:posts.values()){
                  int postsNo=0;
                   
                    if(postNoCount.containsKey(p.getUserId())){
                       postsNo= postNoCount.get(p.getUserId())+1; 
                       }
                    
                    postNoCount.put(p.getUserId(), postsNo);
               
                      }
            List<Map.Entry<Integer,Integer>> postList =new ArrayList<Map.Entry<Integer,Integer>>(postNoCount.entrySet());
    
            Collections.sort(postList, new Comparator<Map.Entry<Integer,Integer>>(){
                public int compare(Map.Entry<Integer,Integer> o1,Map.Entry<Integer,Integer> o2){
                    return o1.getValue()-o2.getValue();
                }
            });
            System.out.println("Inactive User based on total posts number: ");
            for(int i=0;i<postList.size()&&i<5;i++){
               
                
                System.out.println("UserId: "+postList.get(i).getKey()+" ,total number: "+postList.get(i).getValue());
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
         
         public void UserwithleastEverything(){
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
              return userLikesCount.get(u1.getId())+u1.getComments().size()+postCount.get(u1.getId())-userLikesCount.get(u2.getId())+u2.getComments().size()+postCount.get(u2.getId());
            }
         }
              );
              
              //System.out.println("userList: ");
               for(int i=0;i<userList.size()&&i<5;i++){
             System.out.println("points:"+userLikesCount.get(userList.get(i).getId())+userList.get(i).getComments().size()+postCount.get(userList.get(i).getId()));
             
            
                      }
               System.out.println();
             
         }
        
        public void top5inactiveusersoverall(){
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
              System.out.println("top 5 inactive users overall: ");
             for(int i=0;i<userList.size()&&i<5;i++){
             System.out.println("points:"+userLikesCount.get(userList.get(i).getId())+userList.get(i).getComments().size()+postCount.get(userList.get(i).getId()));
             }
             System.out.println();
         }
        
     
}
