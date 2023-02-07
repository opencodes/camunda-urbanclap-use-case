import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

@Component({
  selector: 'app-service-selection',
  templateUrl: './service-selection.component.html',
  styleUrls: ['./service-selection.component.css']
})
export class ServiceSelectionComponent {
  services: any[] = []
  constructor (private http: HttpClient) { }

  ngOnInit() {
    this.http.get('http://localhost:8080/api/v1/services').subscribe((data: any) => {
      this.services = data;
    })
  }
}
