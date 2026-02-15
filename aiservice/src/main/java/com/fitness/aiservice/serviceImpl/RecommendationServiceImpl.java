package com.fitness.aiservice.serviceImpl;

import com.fitness.aiservice.entity.Recommendation;
import com.fitness.aiservice.repository.RecommendationRepository;
import com.fitness.aiservice.service.RecommendationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RecommendationServiceImpl implements RecommendationService {

    private final RecommendationRepository repository;


    @Override
    public List<Recommendation> getUserRecommendation(String userId) {
      return repository.findByUserId(userId);
    }

    @Override
    public Recommendation getActivityRecommendation(String activityId) {
        return repository.findByActivityId(activityId)
                .orElseThrow(() -> new RuntimeException("No Recommendation Found for this activity: " + activityId));
    }
}
