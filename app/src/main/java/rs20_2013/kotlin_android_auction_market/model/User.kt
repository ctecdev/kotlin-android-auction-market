package rs20_2013.kotlin_android_auction_market.model

data class User(
        var id: Long,
        var name: String,
        var email: String,
        var password: String,
        var picture: String,
        var address: String,
        var phone: String,
        var auctions: Array<Auction>,
        var bids: Array<Bid>
)