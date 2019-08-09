import m from "mithril";
import { CustomerData } from "../components";

export default class CustomerTable {
    
	constructor(vnode) {
		this.kind = "CustomerTable"
	}
	
	view() {

		const Customers = CustomerData.list.map((customer) => {
			const {id,name,address} = customer;
			return (
				<tr>
					<th scope="row">{id}</th>
					<td>{name}</td>
					<td>{address}</td>
				</tr>
			)
		});
		return (
			<div class="container">
				<table class="table table-hover">
				  <thead>
				    <tr>
					  <th scope="col">Id</th>
				      <th scope="col">Name</th>
				      <th scope="col">Address</th>
				    </tr>
				  </thead>
				  <tbody>
				    {Customers}
				  </tbody>
				</table> 
			</div>
		)
		
	}
	oncreate() {
		console.log(`A ${this.kind} was created`)
	}
	oninit(vnode) {
	    CustomerData.loadList();
	}
}
