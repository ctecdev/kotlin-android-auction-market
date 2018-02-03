package rs20_2013.kotlin_android_auction_market.model

class Item (
        var id: Long,
        var name: String,
        var description: String,
        var picture: String,
        var sold: Boolean = false,
        var auctions: ArrayList<Auction>
        //public User user;
)