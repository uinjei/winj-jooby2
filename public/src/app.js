import m from "mithril";
import { Layout } from "./template";
import { CustomerPage } from "./customer";
import Home from "./Home";

m.route(document.body, "/", {
    "/": {
        render: function() {
            return m(Layout, m(CustomerPage))
        },
    },
    "/home": {
        render: function() {
            return m(Layout, m(Home))
        },
    }
});