package com.lemontree0802.mapper;

public interface FavoriteMapper {
    void userFavoriteDish(int userId, int dishId);

    void userFavoriteMerchant(int userId, int merchantId);

    void userDeleteFavoriteDish(int userId, int dishId);

    void userDeleteFavoriteMerchant(int userId, int merchantId);
}
