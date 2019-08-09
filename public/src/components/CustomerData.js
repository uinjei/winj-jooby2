import m from "mithril"

const CustomerData = {
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

export default CustomerData;

//module.exports = CustomerData