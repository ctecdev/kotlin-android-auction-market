package rs20_2013.kotlin_android_auction_market.model

import android.icu.text.SimpleDateFormat

data class Auction (
        var id: Long,
        var startPrice: Double,
        var startDate: SimpleDateFormat,
        var endDate: SimpleDateFormat,
        var user: User,
        var item: Item,
        var bids: ArrayList<Bid>
)