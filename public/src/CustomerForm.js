import m from "mithril";

export default class CustomerForm {
    constructor(vnode) {
        this.kind = "CustomerForm"
    }
    view() {
    	return m("div", {"class":"container"}, 
    	        m("form",
    	                [
    	                  m("div", {"class":"form-group"},
    	                    [
    	                      m("label", {"for":"exampleInputEmail1"}, 
    	                        "Email address"
    	                      ),
    	                      m("input", {"class":"form-control","type":"email","id":"exampleInputEmail1","aria-describedby":"emailHelp","placeholder":"Enter email"}),
    	                      m("small", {"class":"form-text text-muted","id":"emailHelp"}, 
    	                        "We'll never share your email with anyone else."
    	                      )
    	                    ]
    	                  ),
    	                  m("div", {"class":"form-group"},
    	                    [
    	                      m("label", {"for":"exampleInputPassword1"}, 
    	                        "Password"
    	                      ),
    	                      m("input", {"class":"form-control","type":"password","id":"exampleInputPassword1","placeholder":"Password"})
    	                    ]
    	                  ),
    	                  m("div", {"class":"form-group form-check"},
    	                    [
    	                      m("input", {"class":"form-check-input","type":"checkbox","id":"exampleCheck1"}),
    	                      m("label", {"class":"form-check-label","for":"exampleCheck1"}, 
    	                        "Check me out"
    	                      )
    	                    ]
    	                  ),
    	                  m("a", {"class":"btn btn-primary","href":"#!/home","role":"button"}, 
    	                    "Home"
    	                  ),
    	                  m("button", {"class":"btn btn-primary","type":"submit"}, 
    	                    "Submit"
    	                  )
    	                ]
    	              )
    	            )
    }
    oncreate() {
        console.log(`A ${this.kind} was created`)
    }
}
