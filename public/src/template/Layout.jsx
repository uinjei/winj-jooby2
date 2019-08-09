import m from "mithril";
import Header from "./Header";
import Menu from "./Menu";

export default class Layout {
    constructor(vnode) {
        this.kind = "Layout"
    }
    view(vnode) {
		return  (
			<div>
				<Header/>
				<Menu/>
				{vnode.children}
			</div>
		)
    }
    oncreate() {
        console.log(`A ${this.kind} was created`)
    }
}