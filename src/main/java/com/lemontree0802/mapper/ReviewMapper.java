package com.lemontree0802.mapper;

public interface ReviewMapper {

    // 用户输入对dish的评价，其中rating是等级（可以理解为星数）
    void userReviewDish(int userId, int dishId, int rating, int reviewText);

    // 用户输入对merchant的评价
    void userReviewMerchant(int userId, int merchantId, int rating, int reviewText);
}
