import m from "mithril";
// import 'bootstrap';
import Layout from "./Layout";
import Customer from "./Customer";
import Home from "./Home";
// import './app.scss';

m.route(document.body, "/", {
    "/": {
        render: function() {
            return m(Layout, m(Customer))
        },
    },
    "/home": {
        render: function() {
            return m(Layout, m(Home))
        },
    }
});