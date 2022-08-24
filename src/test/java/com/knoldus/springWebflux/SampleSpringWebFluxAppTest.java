package com.knoldus.springWebflux;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

class SampleSpringWebFluxAppTest {
    /**
     * Method under test: {@link SampleSpringWebFluxApp#taskExecutor()}
     */
    @Test
    void testTaskExecutor() {
        ThreadPoolTaskExecutor actualTaskExecutorResult = (new SampleSpringWebFluxApp()).taskExecutor();
        assertEquals(0, actualTaskExecutorResult.getActiveCount());
        assertFalse(actualTaskExecutorResult.isDaemon());
        assertEquals(5, actualTaskExecutorResult.getThreadPriority());
        assertEquals("slow-", actualTaskExecutorResult.getThreadNamePrefix());
        assertEquals(5, actualTaskExecutorResult.getCorePoolSize());
        assertEquals(10, actualTaskExecutorResult.getMaxPoolSize());
        assertEquals(60, actualTaskExecutorResult.getKeepAliveSeconds());
    }

    /**
     * Method under test: {@link SampleSpringWebFluxApp#webClient()}
     */
    @Test
    void testWebClient() {
        // TODO: Complete this test.

        (new SampleSpringWebFluxApp()).webClient();
    }

    /**
     * Method under test: {@link SampleSpringWebFluxApp#init()}
     */
    @Test
    void testInit() {

        (new SampleSpringWebFluxApp()).init();
    }
}

