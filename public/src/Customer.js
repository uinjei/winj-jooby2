import m from "mithril";
import CustomerForm from "./CustomerForm";
import CustomerTable from "./CustomerTable";

export default class Customer {
    constructor(vnode) {
        this.kind = "Customer"
    }
    view() {
         return m('div', [
        	 m(CustomerForm),
        	 m(CustomerTable)
         ])
    }
    oncreate() {
        console.log(`A ${this.kind} was created`)
    }
}
