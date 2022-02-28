import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CotizacionesComponenteComponent } from './cotizaciones-componente.component';

describe('CotizacionesComponenteComponent', () => {
  let component: CotizacionesComponenteComponent;
  let fixture: ComponentFixture<CotizacionesComponenteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CotizacionesComponenteComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CotizacionesComponenteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
