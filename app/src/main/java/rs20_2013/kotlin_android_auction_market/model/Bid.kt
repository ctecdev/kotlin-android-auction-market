package rs20_2013.kotlin_android_auction_market.model

import java.text.SimpleDateFormat

data class Bid (
        var id: Long,
        var price: Double,
        var dateTime: SimpleDateFormat,
        var auction: Auction,
        var user: User
)