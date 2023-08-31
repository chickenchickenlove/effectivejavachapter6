package com.example.effetivejavachapter6.item70;

public class FailoverAbleCase {

    static class SlackApiRateLimitedException extends Exception {
        private final int afterTime;
        public SlackApiRateLimitedException(int afterTime) {
            this.afterTime = afterTime;
        }

        public int getAfterTime() {
            return afterTime;
        }
    }

    static class SlackClient{
        public String get() throws SlackApiRateLimitedException {
            throw new SlackApiRateLimitedException(40);
        }

    }

    public static void main(String[] args) throws InterruptedException {
        SlackClient slackClient = new SlackClient();
        int afterTime = 0;
        while (true) {
            Thread.sleep(afterTime * 1000);
            try {
                slackClient.get();
                break;
            } catch (SlackApiRateLimitedException e) {
                afterTime = e.getAfterTime();
            }
        }
    }
}

