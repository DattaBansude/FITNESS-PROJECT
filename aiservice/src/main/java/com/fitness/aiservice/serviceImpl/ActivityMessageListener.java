package com.fitness.aiservice.serviceImpl;

import com.fitness.aiservice.entity.Activity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class ActivityMessageListener {

    @RabbitListener(queues = "activity.queue")
    public void activityListener(Activity activity) {
        log.info("Received activity for processing: {}", activity.getId());
    }
}
