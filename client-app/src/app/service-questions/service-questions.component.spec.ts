import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ServiceQuestionsComponent } from './service-questions.component';

describe('ServiceQuestionsComponent', () => {
  let component: ServiceQuestionsComponent;
  let fixture: ComponentFixture<ServiceQuestionsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ServiceQuestionsComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ServiceQuestionsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
