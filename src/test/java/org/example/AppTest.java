package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest
{
    @Test
    public void verifyForeignPlayer()
    {
        Assert.assertTrue(App.calculateForeignPlayers()<5,"Number of player is greater than 4");
    }
    @Test
    public void verifyWeeketKeeper(){
        Assert.assertTrue(App.calculateWicketkeeper()>0,"No weeketKeeper present");
    }
}
