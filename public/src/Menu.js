import m from "mithril";
export default function Menu() {
    return {
        view: () => 
    		m("nav", {"class":"navbar navbar-expand-lg navbar-light bg-light"}, 
    		  m("div", {"class":"collapse navbar-collapse","id":"navbarSupportedContent"},
    		    [
    		      m("ul", {"class":"navbar-nav mr-auto"},
    		        [
    		          m("li", {"class":"nav-item active"}, 
    		            m("a", {"class":"nav-link","href":"#"},
    		              [
    		                "Home",
    		                m("span", {"class":"sr-only"}, 
    		                  "(current)"
    		                )
    		              ]
    		            )
    		          ),
    		          m("li", {"class":"nav-item"}, 
    		            m("a", {"class":"nav-link","href":"#"}, 
    		              "Link"
    		            )
    		          ),
    		          m("li", {"class":"nav-item dropdown"},
    		            [
    		              m("a", {"class":"nav-link dropdown-toggle","href":"#","id":"navbarDropdown","role":"button","data-toggle":"dropdown","aria-haspopup":"true","aria-expanded":"false"}, 
    		                "Dropdown"
    		              ),
    		              m("div", {"class":"dropdown-menu","aria-labelledby":"navbarDropdown"},
    		                [
    		                  m("a", {"class":"dropdown-item","href":"#"}, 
    		                    "Action"
    		                  ),
    		                  m("a", {"class":"dropdown-item","href":"#"}, 
    		                    "Another action"
    		                  ),
    		                  m("div", {"class":"dropdown-divider"}),
    		                  m("a", {"class":"dropdown-item","href":"#"}, 
    		                    "Something else here"
    		                  )
    		                ]
    		              )
    		            ]
    		          ),
    		          m("li", {"class":"nav-item"}, 
    		            m("a", {"class":"nav-link disabled","href":"#","tabindex":"-1","aria-disabled":"true"}, 
    		              "Disabled"
    		            )
    		          )
    		        ]
    		      ),
    		      m("form", {"class":"form-inline my-2 my-lg-0"},
    		        [
    		          m("input", {"class":"form-control mr-sm-2","type":"search","placeholder":"Search","aria-label":"Search"}),
    		          m("button", {"class":"btn btn-outline-success my-2 my-sm-0","type":"submit"}, 
    		            "Search"
    		          )
    		        ]
    		      )
    		    ]
    		  )
    		)
    }
}