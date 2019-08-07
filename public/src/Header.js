import m from "mithril";
export default function Header() {
    return {
        view: () => 
    		m("nav", {class: "navbar navbar-light bg-light"},
    		  m("span", {class: "navbar-brand mb-0 h1"}, "Navbar")
    		)
    }
}