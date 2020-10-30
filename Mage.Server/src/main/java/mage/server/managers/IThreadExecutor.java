package mage.server.managers;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

public interface IThreadExecutor {
    int getActiveThreads(ExecutorService executerService);

    ExecutorService getCallExecutor();

    ExecutorService getGameExecutor();

    ScheduledExecutorService getTimeoutExecutor();

    ScheduledExecutorService getTimeoutIdleExecutor();
}
