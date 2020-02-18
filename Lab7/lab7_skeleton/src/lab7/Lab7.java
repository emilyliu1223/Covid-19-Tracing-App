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
        int userID=Integer.parseInt(row[0]);
        String firstName=row[1];
        String lastName=row[2];
        User user=new User(userID,firstName, lastName);
        Map<Integer, User>usermap=DataStore.getInstance().getUsers();
        if(!usermap.containsKey(userID)){
            usermap.put(userID, user);
        }
    }
    
    private Comment generateComment(String[] row){
        // TODO
        int commentId=Integer.parseInt(row[0]);
        int postId=Integer.parseInt(row[1]);
        int userId=Integer.parseInt(row[4]);
        String text=row[5];
        int likes=Integer.parseInt(row[3]);
        Comment c=new Comment (commentId, userId, postId, text, likes);
         Map<Integer, Comment>commentMap=DataStore.getInstance().getComments();
         commentMap.put(commentId, c);
         //filling up the comment list for every user
         Map<Integer, User>userMap=DataStore.getInstance().getUsers();
         List<Comment> commentList=userMap.get(userId).getComments();
         commentList.add(c);
         
         return c;
        }
    
    private void generatePost(String[] row, Comment comment){
        // TODO
         int postId=Integer.parseInt(row[1]);
        int userId=Integer.parseInt(row[4]);
        Post post=new Post(postId, userId);
        Map<Integer, Post>postmap=DataStore.getInstance().getPosts();
        if(!postmap.containsKey(postId)){
            post.getComments().add(comment);
        postmap.put(postId, post);
        }else{
        Post p= postmap.get(postId);
        p.getComments().add(comment);
        }
    }
    
    private void runAnalysis(){
        // TODO
        helper.userWithMostLikes();
        helper.getFiveMostLIkedComment();
        helper.find5UserwithleastComment();;
        helper.top5inactiveusersoverall();
        helper.top5proactiveusersoverall();
    }
}
