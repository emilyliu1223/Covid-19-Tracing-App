/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import lab7.analytics.AnalysisHelper;
import lab7.analytics.DataStore;
import lab7.entities.Comment;
import lab7.entities.Post;
import lab7.entities.User;

/**
 *
 * @author harshalneelkamal
 */
public class Lab7 {

    DataReader commentReader;
    DataReader userReader;
    AnalysisHelper helper;
    
    public Lab7() throws IOException {
        DataGenerator generator = DataGenerator.getInstance();
        commentReader = new DataReader(generator.getCommentFilePath());
        userReader = new DataReader(generator.getUserCataloguePath());
        helper = new AnalysisHelper();
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {     
        Lab7 inst = new Lab7();
        inst.readData();
    }
    
    private void readData() throws IOException{
        String[] row;
        while((row = userReader.getNextRow()) != null ){
            generateUser(row);
        }
        while((row = commentReader.getNextRow()) != null ){
            Comment comment = generateComment(row);
            generatePost(row, comment);
        }
        runAnalysis();
    }
    
    private void generateUser(String[] row){
        // TODO
        int userId=Integer.parseInt(row[0]);
        String firstName=row[1];
        String lastName=row[2];
        User user=new User(userId,firstName,lastName);
        Map<Integer, User> usermap=DataStore.getInstance().getUsers();
        if(!usermap.containsKey(userId)){
            usermap.put(userId, user);
        }
    }
    
    private Comment generateComment(String[] row){
        // TODO
        int commentId=Integer.parseInt(row[0]);
        int userId=Integer.parseInt(row[4]);
        int postId=Integer.parseInt(row[1]);
        String text=row[5];
        int like=Integer.parseInt(row[3]);
        Comment c=new Comment(commentId,userId,postId,text,like);
        Map<Integer, Comment> commentmap=DataStore.getInstance().getComments();
        commentmap.put(commentId, c);
        
        Map<Integer,User> userMap=DataStore.getInstance().getUsers();
        List<Comment> commentlist=userMap.get(userId).getComments();
        commentlist.add(c);
        return null;
    }
    
    private void generatePost(String[] row, Comment comment){
        // TODO
        int postId=Integer.parseInt(row[1]);
        int userId=Integer.parseInt(row[4]);
        
        Map<Integer, Post> postmap=DataStore.getInstance().getPosts();
        if(!postmap.containsKey(postId)){
            Post post=new Post(postId,userId);
            post.getComments().add(comment);
            postmap.put(postId, post);
        }else{
            Post post2=postmap.get(postId); 
            post2.getComments().add(comment);
        }
    }
    
    private void runAnalysis(){
        // TODO
        helper.getUserWithMostLike();
        helper.getFiveCommentWithMostLikes();
    }
}
