var m = require("mithril")

var CustomerData = {
    list: [],
    loadList: function() {
        return m.request({
            method: "GET",
            url: "/customer",
            withCredentials: false,
        })
        .then(function(result) {
        	CustomerData.list = result;
        })
    },
}

module.exports = CustomerData