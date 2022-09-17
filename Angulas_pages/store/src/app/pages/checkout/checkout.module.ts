import { FormsModule } from '@angular/forms';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { MaterialModule } from "../../material.module";

import { CheckoutRoutingModule } from './checkout-routing.module';
import { CheckoutComponent } from './checkout.component';


@NgModule({
  declarations: [
    CheckoutComponent
  ],
  imports: [
    CommonModule,
    CheckoutRoutingModule,
    FormsModule,
    MaterialModule,
  ]
})
export class CheckoutModule { }
