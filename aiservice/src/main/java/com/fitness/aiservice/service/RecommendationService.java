package com.fitness.aiservice.service;

import com.fitness.aiservice.entity.Recommendation;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface RecommendationService {
    List<Recommendation> getUserRecommendation(String userId);

    Recommendation getActivityRecommendation(String activityId);
}
