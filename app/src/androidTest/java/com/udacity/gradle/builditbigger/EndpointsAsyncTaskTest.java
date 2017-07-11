package com.udacity.gradle.builditbigger;

import org.junit.Test;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import static junit.framework.Assert.fail;
import static org.junit.Assert.assertTrue;

/**
 * Created by Etman on 7/10/2017.
 */
public class EndpointsAsyncTaskTest implements JokeHandler {
    private String joke = null;

    @Test
    public void doInBackground() throws Exception {
        EndpointsAsyncTask endpointsAsyncTask = new EndpointsAsyncTask(this);
        try {
            endpointsAsyncTask.execute();
            joke = endpointsAsyncTask.get(30, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            fail("Interrupted Exception " + e);
        } catch (ExecutionException e) {
            fail("ExecutionException: " + e);
        } catch (TimeoutException e) {
            fail("Timed out Exception: " + e);
        }
        assertTrue("Error: we found this Joke = " + joke, joke != null);

    }

    @Override
    public void getJoke(String joke) {
        this.joke = joke;
    }
}