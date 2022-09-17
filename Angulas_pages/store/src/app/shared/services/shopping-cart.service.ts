import { Product } from './../../pages/products/Interfaces/product.interface';
import { Injectable } from '@angular/core';
import { Subject, Observable } from 'rxjs';

@Injectable({
   providedIn: 'root'
  })
export class shoppingCartService {
  products: Product[] = [];

/**
 * Dividimos las responsabilidades, estilo reactivo de programacion, las funciones peranecen privadas y son llaadas en una unica funcion q luego llaareos desde products.component.ts
 */
  private cartSubject = new Subject<Product[]>();
  private totalSubject = new Subject<number>();
  private quantitySubject = new Subject<number>();

  get totalAction$(): Observable<number> {
    return this.totalSubject.asObservable();
  }
  get quantityAction$(): Observable<number> {
    return this.quantitySubject.asObservable();
  }
  get cartAction$(): Observable<Product[]> {
    return this.cartSubject.asObservable();
  }


  updateCart(product: Product): void{
    this.addToCart(product);
    this.quantityProduct();
    this.calcTotal();
  }

  private quantityProduct(): void{
    const quiantity = this.products.length;
    this.quantitySubject.next(quiantity);
  }

  private addToCart(product: Product): void{
    this.products.push(product);
    this.cartSubject.next(this.products)
  }

  private calcTotal (): void{
    const total = this.products.reduce((acc, prod)=> acc+=prod.price, 0);
    this.totalSubject.next(total);
  }
}
