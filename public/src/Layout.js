import m from "mithril";
import Header from "./Header";
import Menu from "./Menu";

export default class Layout {
    constructor(vnode) {
        this.kind = "Layout"
    }
    view(vnode) {
    	return m("div", [
    			 m(Header),
    			 m(Menu),
    			 vnode.children
    		   ])
    }
    oncreate() {
        console.log(`A ${this.kind} was created`)
    }
}