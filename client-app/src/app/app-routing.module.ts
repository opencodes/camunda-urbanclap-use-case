import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ServiceQuestionsComponent } from './service-questions/service-questions.component';
import { ServiceSelectionComponent } from './service-selection/service-selection.component';

const routes: Routes = [
  {
    path: '',
    pathMatch: 'full',
    component: ServiceSelectionComponent,
  },
  {
    path: 'services/:id',
    pathMatch: 'full',
    component: ServiceQuestionsComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
