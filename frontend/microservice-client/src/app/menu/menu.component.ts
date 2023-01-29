import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {
  @Input() token:any;
  clicked!:boolean;

  constructor() { }

  ngOnInit(): void {
    this.clicked=false;
  }
  clickedmenu(){
    this.clicked=true;

  }



}
