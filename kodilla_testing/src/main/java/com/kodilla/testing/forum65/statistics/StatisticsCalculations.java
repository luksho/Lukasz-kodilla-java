package com.kodilla.testing.forum65.statistics;

public class StatisticsCalculations {
    private Statistics statistics;
    private int numberOfUser;
    private int numberOfPosts;
    private int numberOfComments;
    private double averageNumberOfPostsPerUser;
    private double averageNumberOfCommentsPerUser;
    private double averageNumberOfCommentsPerPost;

    public StatisticsCalculations(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        numberOfUser = statistics.usersNames().size();
        numberOfPosts = statistics.postsCount();
        numberOfComments = statistics.commentsCount();

        if (numberOfPosts == 0) {
            averageNumberOfPostsPerUser = 0;
            averageNumberOfCommentsPerUser = numberOfComments / numberOfUser;
            averageNumberOfCommentsPerPost = numberOfComments;

        } else if (numberOfComments == 0) {
            averageNumberOfPostsPerUser = numberOfPosts / numberOfUser;
            averageNumberOfCommentsPerUser = 0;
            averageNumberOfCommentsPerPost = 0;

        } else if (numberOfUser == 0) {
            averageNumberOfPostsPerUser = 0;
            averageNumberOfCommentsPerUser = 0;
            averageNumberOfCommentsPerPost = numberOfComments / numberOfPosts;

        } else {
            averageNumberOfPostsPerUser = numberOfPosts / numberOfUser;
            averageNumberOfCommentsPerUser = numberOfComments / numberOfUser;
            averageNumberOfCommentsPerPost = numberOfComments / numberOfPosts;
        }
    }

    public int numberOfUser() {
        return numberOfUser;
    }

    public int numberOfPosts() {
        return numberOfPosts;
    }

    public int numberOfComments() {
        return numberOfComments;
    }

    public double averageNumberOfPostsPerUser() {
        return averageNumberOfPostsPerUser;

    }

    public double averageNumberOfCommentsPerUser() {
        return averageNumberOfCommentsPerUser;

    }

    public double averageNumberOfCommentsPerPost() {
        return averageNumberOfCommentsPerPost;
    }

    public void showStatistics() {
        System.out.println("Number of user: " + numberOfUser + "\nNumber of posts: " + numberOfPosts + "\nNumber of comments: " +
                numberOfComments + "\nAverage number of posts per user: " + averageNumberOfPostsPerUser +
                "\nAverage number of comments per user: " + averageNumberOfCommentsPerUser + "\nAverage number of comments per post: " +
                averageNumberOfCommentsPerPost);


    }
}
