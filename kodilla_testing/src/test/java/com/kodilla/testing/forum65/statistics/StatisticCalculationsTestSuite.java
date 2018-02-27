package com.kodilla.testing.forum65.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticCalculationsTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @After
    public void afterEveryTest() {
        System.out.println("Test end");
    }

    @Test
    public void testCalculateAdvStatistics() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> namesList = new ArrayList<String>();
        namesList.add("Andrew");
        namesList.add("Andrew");
        namesList.add("Andrew");
        namesList.add("Andrew");
        namesList.add("Andrew");

        when(statisticsMock.usersNames()).thenReturn(namesList);
        int mockPostCount = 10;
        when(statisticsMock.postsCount()).thenReturn(mockPostCount);
        int mockCommentsCount = 5;
        when(statisticsMock.commentsCount()).thenReturn(mockCommentsCount);

        //When
        StatisticsCalculations statisticsCalculations = new StatisticsCalculations(statisticsMock);
        statisticsCalculations.calculateAdvStatistics(statisticsMock);

        int numberOfUser = statisticsCalculations.numberOfUser();
        int numberOfPosts = statisticsCalculations.numberOfPosts();
        int numberOfComments = statisticsCalculations.numberOfComments();
        double averageNumberOfPostsPerUser = statisticsCalculations.averageNumberOfPostsPerUser();
        double averageNumberOfCommentsPerUser = statisticsCalculations.averageNumberOfCommentsPerUser();
        double averageNumberOfCommentsPerPost = statisticsCalculations.averageNumberOfCommentsPerPost();

        //Then
        Assert.assertEquals(namesList.size(), numberOfUser);
        Assert.assertEquals(mockPostCount, numberOfPosts);
        Assert.assertEquals(mockCommentsCount, numberOfComments);
        Assert.assertEquals(mockPostCount / numberOfUser, averageNumberOfPostsPerUser, 0);
        Assert.assertEquals(numberOfComments / numberOfUser, averageNumberOfCommentsPerUser, 0);
        Assert.assertEquals(numberOfComments / numberOfPosts, averageNumberOfCommentsPerPost, 0);


    }

    @Test
    public void postNumber0() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> namesList = new ArrayList<String>();
        namesList.add("Andrew");
        namesList.add("Andrew");
        namesList.add("Andrew");
        namesList.add("Andrew");
        namesList.add("Andrew");

        when(statisticsMock.usersNames()).thenReturn(namesList);
        int mockPostCount = 0;
        when(statisticsMock.postsCount()).thenReturn(mockPostCount);
        int mockCommentsCount = 5;
        when(statisticsMock.commentsCount()).thenReturn(mockCommentsCount);

        //When
        StatisticsCalculations statisticsCalculations = new StatisticsCalculations(statisticsMock);
        statisticsCalculations.calculateAdvStatistics(statisticsMock);

        int numberOfUser = statisticsCalculations.numberOfUser();
        int numberOfPosts = statisticsCalculations.numberOfPosts();
        int numberOfComments = statisticsCalculations.numberOfComments();
        double averageNumberOfPostsPerUser = statisticsCalculations.averageNumberOfPostsPerUser();
        double averageNumberOfCommentsPerUser = statisticsCalculations.averageNumberOfCommentsPerUser();
        double averageNumberOfCommentsPerPost = statisticsCalculations.averageNumberOfCommentsPerPost();

        //Then
        Assert.assertEquals(namesList.size(), numberOfUser);
        Assert.assertEquals(mockPostCount, numberOfPosts);
        Assert.assertEquals(mockCommentsCount, numberOfComments);
        Assert.assertEquals(mockPostCount / numberOfUser, averageNumberOfPostsPerUser, 0);
        Assert.assertEquals(numberOfComments / numberOfUser, averageNumberOfCommentsPerUser, 0);
        Assert.assertEquals(mockCommentsCount, averageNumberOfCommentsPerPost, 0);


    }

    @Test
    public void postNumber1000() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> namesList = new ArrayList<String>();
        namesList.add("Andrew");
        namesList.add("Andrew");
        namesList.add("Andrew");
        namesList.add("Andrew");
        namesList.add("Andrew");

        when(statisticsMock.usersNames()).thenReturn(namesList);
        int mockPostCount = 1000;
        when(statisticsMock.postsCount()).thenReturn(mockPostCount);
        int mockCommentsCount = 5;
        when(statisticsMock.commentsCount()).thenReturn(mockCommentsCount);

        //When
        StatisticsCalculations statisticsCalculations = new StatisticsCalculations(statisticsMock);
        statisticsCalculations.calculateAdvStatistics(statisticsMock);

        int numberOfUser = statisticsCalculations.numberOfUser();
        int numberOfPosts = statisticsCalculations.numberOfPosts();
        int numberOfComments = statisticsCalculations.numberOfComments();
        double averageNumberOfPostsPerUser = statisticsCalculations.averageNumberOfPostsPerUser();
        double averageNumberOfCommentsPerUser = statisticsCalculations.averageNumberOfCommentsPerUser();
        double averageNumberOfCommentsPerPost = statisticsCalculations.averageNumberOfCommentsPerPost();

        //Then
        Assert.assertEquals(namesList.size(), numberOfUser);
        Assert.assertEquals(mockPostCount, numberOfPosts);
        Assert.assertEquals(mockCommentsCount, numberOfComments);
        Assert.assertEquals(mockPostCount / numberOfUser, averageNumberOfPostsPerUser, 0);
        Assert.assertEquals(numberOfComments / numberOfUser, averageNumberOfCommentsPerUser, 0);
        Assert.assertEquals(numberOfComments / numberOfPosts, averageNumberOfCommentsPerPost, 0);


    }

    @Test
    public void commentsNumber0() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> namesList = new ArrayList<String>();
        namesList.add("Andrew");
        namesList.add("Andrew");
        namesList.add("Andrew");
        namesList.add("Andrew");
        namesList.add("Andrew");

        when(statisticsMock.usersNames()).thenReturn(namesList);
        int mockPostCount = 1000;
        when(statisticsMock.postsCount()).thenReturn(mockPostCount);
        int mockCommentsCount = 0;
        when(statisticsMock.commentsCount()).thenReturn(mockCommentsCount);

        //When
        StatisticsCalculations statisticsCalculations = new StatisticsCalculations(statisticsMock);
        statisticsCalculations.calculateAdvStatistics(statisticsMock);

        int numberOfUser = statisticsCalculations.numberOfUser();
        int numberOfPosts = statisticsCalculations.numberOfPosts();
        int numberOfComments = statisticsCalculations.numberOfComments();
        double averageNumberOfPostsPerUser = statisticsCalculations.averageNumberOfPostsPerUser();
        double averageNumberOfCommentsPerUser = statisticsCalculations.averageNumberOfCommentsPerUser();
        double averageNumberOfCommentsPerPost = statisticsCalculations.averageNumberOfCommentsPerPost();

        //Then
        Assert.assertEquals(namesList.size(), numberOfUser);
        Assert.assertEquals(mockPostCount, numberOfPosts);
        Assert.assertEquals(mockCommentsCount, numberOfComments);
        Assert.assertEquals(mockPostCount / numberOfUser, averageNumberOfPostsPerUser, 0);
        Assert.assertEquals(numberOfComments / numberOfUser, averageNumberOfCommentsPerUser, 0);
        Assert.assertEquals(numberOfComments / numberOfPosts, averageNumberOfCommentsPerPost, 0);


    }

    @Test
    public void commentsNumberSmallerThanPostNumber() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> namesList = new ArrayList<String>();
        namesList.add("Andrew");
        namesList.add("Andrew");
        namesList.add("Andrew");
        namesList.add("Andrew");
        namesList.add("Andrew");

        when(statisticsMock.usersNames()).thenReturn(namesList);
        int mockPostCount = 900;
        when(statisticsMock.postsCount()).thenReturn(mockPostCount);
        int mockCommentsCount = 5;
        when(statisticsMock.commentsCount()).thenReturn(mockCommentsCount);

        //When
        StatisticsCalculations statisticsCalculations = new StatisticsCalculations(statisticsMock);
        statisticsCalculations.calculateAdvStatistics(statisticsMock);

        int numberOfUser = statisticsCalculations.numberOfUser();
        int numberOfPosts = statisticsCalculations.numberOfPosts();
        int numberOfComments = statisticsCalculations.numberOfComments();
        double averageNumberOfPostsPerUser = statisticsCalculations.averageNumberOfPostsPerUser();
        double averageNumberOfCommentsPerUser = statisticsCalculations.averageNumberOfCommentsPerUser();
        double averageNumberOfCommentsPerPost = statisticsCalculations.averageNumberOfCommentsPerPost();

        //Then
        Assert.assertEquals(namesList.size(), numberOfUser);
        Assert.assertEquals(mockPostCount, numberOfPosts);
        Assert.assertEquals(mockCommentsCount, numberOfComments);
        Assert.assertEquals(mockPostCount / numberOfUser, averageNumberOfPostsPerUser, 0);
        Assert.assertEquals(numberOfComments / numberOfUser, averageNumberOfCommentsPerUser, 0);
        Assert.assertEquals(numberOfComments / numberOfPosts, averageNumberOfCommentsPerPost, 0);


    }

    @Test
    public void commentsNumberBiggerThanPostNumber() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> namesList = new ArrayList<String>();
        namesList.add("Andrew");
        namesList.add("Andrew");
        namesList.add("Andrew");
        namesList.add("Andrew");
        namesList.add("Andrew");

        when(statisticsMock.usersNames()).thenReturn(namesList);
        int mockPostCount = 20;
        when(statisticsMock.postsCount()).thenReturn(mockPostCount);
        int mockCommentsCount = 100;
        when(statisticsMock.commentsCount()).thenReturn(mockCommentsCount);

        //When
        StatisticsCalculations statisticsCalculations = new StatisticsCalculations(statisticsMock);
        statisticsCalculations.calculateAdvStatistics(statisticsMock);

        int numberOfUser = statisticsCalculations.numberOfUser();
        int numberOfPosts = statisticsCalculations.numberOfPosts();
        int numberOfComments = statisticsCalculations.numberOfComments();
        double averageNumberOfPostsPerUser = statisticsCalculations.averageNumberOfPostsPerUser();
        double averageNumberOfCommentsPerUser = statisticsCalculations.averageNumberOfCommentsPerUser();
        double averageNumberOfCommentsPerPost = statisticsCalculations.averageNumberOfCommentsPerPost();

        //Then
        Assert.assertEquals(namesList.size(), numberOfUser);
        Assert.assertEquals(mockPostCount, numberOfPosts);
        Assert.assertEquals(mockCommentsCount, numberOfComments);
        Assert.assertEquals(mockPostCount / numberOfUser, averageNumberOfPostsPerUser, 0);
        Assert.assertEquals(numberOfComments / numberOfUser, averageNumberOfCommentsPerUser, 0);
        Assert.assertEquals(numberOfComments / numberOfPosts, averageNumberOfCommentsPerPost, 0);

    }

    @Test
    public void userNumber0() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> namesList = new ArrayList<String>();

        when(statisticsMock.usersNames()).thenReturn(namesList);
        int mockPostCount = 20;
        when(statisticsMock.postsCount()).thenReturn(mockPostCount);
        int mockCommentsCount = 100;
        when(statisticsMock.commentsCount()).thenReturn(mockCommentsCount);

        //When
        StatisticsCalculations statisticsCalculations = new StatisticsCalculations(statisticsMock);
        statisticsCalculations.calculateAdvStatistics(statisticsMock);

        int numberOfUser = statisticsCalculations.numberOfUser();
        int numberOfPosts = statisticsCalculations.numberOfPosts();
        int numberOfComments = statisticsCalculations.numberOfComments();
        double averageNumberOfPostsPerUser = statisticsCalculations.averageNumberOfPostsPerUser();
        double averageNumberOfCommentsPerUser = statisticsCalculations.averageNumberOfCommentsPerUser();
        double averageNumberOfCommentsPerPost = statisticsCalculations.averageNumberOfCommentsPerPost();

        //Then
        Assert.assertEquals(namesList.size(), numberOfUser);
        Assert.assertEquals(mockPostCount, numberOfPosts);
        Assert.assertEquals(mockCommentsCount, numberOfComments);
        Assert.assertEquals(0, averageNumberOfPostsPerUser, 0);
        Assert.assertEquals(0, averageNumberOfCommentsPerUser, 0);
        Assert.assertEquals(numberOfComments / numberOfPosts, averageNumberOfCommentsPerPost, 0);

    }

    @Test
    public void userNumber100() {
        Statistics statisticsMock = mock(Statistics.class);
        List<String> namesList = new ArrayList<String>();
        for (int n = 0; n < 100; n++) {
            namesList.add(n, "a");
        }
        when(statisticsMock.usersNames()).thenReturn(namesList);
        int mockPostCount = 20;
        when(statisticsMock.postsCount()).thenReturn(mockPostCount);
        int mockCommentsCount = 100;
        when(statisticsMock.commentsCount()).thenReturn(mockCommentsCount);

        //When
        StatisticsCalculations statisticsCalculations = new StatisticsCalculations(statisticsMock);
        statisticsCalculations.calculateAdvStatistics(statisticsMock);

        int numberOfUser = statisticsCalculations.numberOfUser();
        int numberOfPosts = statisticsCalculations.numberOfPosts();
        int numberOfComments = statisticsCalculations.numberOfComments();
        double averageNumberOfPostsPerUser = statisticsCalculations.averageNumberOfPostsPerUser();
        double averageNumberOfCommentsPerUser = statisticsCalculations.averageNumberOfCommentsPerUser();
        double averageNumberOfCommentsPerPost = statisticsCalculations.averageNumberOfCommentsPerPost();

        //Then
        Assert.assertEquals(namesList.size(), numberOfUser);
        Assert.assertEquals(mockPostCount, numberOfPosts);
        Assert.assertEquals(mockCommentsCount, numberOfComments);
        Assert.assertEquals(mockPostCount / numberOfUser, averageNumberOfPostsPerUser, 0);
        Assert.assertEquals(numberOfComments / numberOfUser, averageNumberOfCommentsPerUser, 0);
        Assert.assertEquals(numberOfComments / numberOfPosts, averageNumberOfCommentsPerPost, 0);

    }

}
