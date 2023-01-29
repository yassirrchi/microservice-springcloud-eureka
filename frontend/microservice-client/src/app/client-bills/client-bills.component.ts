import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { bill } from '../model/bill.model';
import { BillingService } from '../services/billing.service';

@Component({
  selector: 'app-client-bills',
  templateUrl: './client-bills.component.html',
  styleUrls: ['./client-bills.component.css']
})
export class ClientBillsComponent implements OnInit {
  id!:number;
  sum:number=0;
  Bills!:bill;
  calc:any;


  constructor(private route:ActivatedRoute,private billingService:BillingService) { }

  ngOnInit(): void {

    this.id=this.route.snapshot.params["id"]
    this.billingService.getClientBill(this.id).subscribe((data)=>{
      this.Bills=data
      this.calc=data
      console.log(this.Bills)
    })
    setTimeout(() => {
      this.calculateSum()

    }, 2000);
    
     

    

 
  }

  calculateSum(){
    console.log("hnaya")
    console.log(this.Bills)
    console.log("------------")
    this.Bills.productItems.forEach(p=>{this.sum+=p.price*p.quantity})
     
  }
  

}
