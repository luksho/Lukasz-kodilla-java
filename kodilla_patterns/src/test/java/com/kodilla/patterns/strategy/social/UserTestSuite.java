package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UserTestSuite {
    private static int n = 0;

    @Before
    public void before() {
        n++;
        System.out.println("Test: " + n);
    }

    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User jan = new Millenials("Jan");
        User tomasz = new YGeneration("Tomasz");
        User kamil = new ZGeneration("Kamil");

        //When
        String janAddPost = jan.sharePost();
        System.out.println("Jan share: " + janAddPost);
        String tomaszAddPost = tomasz.sharePost();
        System.out.println("Tomasz share: " + tomaszAddPost);
        String kamilAddPost = kamil.sharePost();
        System.out.println("Kamil share: " + kamilAddPost + "\n");


        //Then
        Assert.assertEquals("FacebookPublisher", janAddPost);
        Assert.assertEquals("SnapchatPublisher", tomaszAddPost);
        Assert.assertEquals("TwitterPublisher", kamilAddPost);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User jan = new Millenials("Jan");

        //When
        String janAddPost = jan.sharePost();
        System.out.println("Jan share: " + janAddPost);
        jan.setSocialService(new TwitterPublisher());
        janAddPost = jan.sharePost();
        System.out.println("Jan share: " + janAddPost);

        //Then
        Assert.assertEquals("TwitterPublisher", janAddPost);
    }
}