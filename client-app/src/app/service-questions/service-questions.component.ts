import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-service-questions',
  templateUrl: './service-questions.component.html',
  styleUrls: ['./service-questions.component.css']
})
export class ServiceQuestionsComponent {

  serviceId: string = '';
  questions: Array<any> = [];
  form!: FormGroup;
  total: number = 0;
  constructor (private route: ActivatedRoute, private http: HttpClient) { }

  ngOnInit() {
    this.route.params.subscribe(params => {
      this.serviceId = params['id'];
      this.getQuestions(this.serviceId)
    });
  }

  getQuestions(id: string) {
    this.http.get('http://localhost:8080/api/v1/services/question/' + id).subscribe((data: any) => {
      this.questions = data;
      const fields: any = {}
      this.questions.map(q => {
        fields[q.id] = new FormControl(false)
      })
      this.form = new FormGroup(fields);
    })
  }
  onSubmit() {
    const selection = Object.keys(this.form.value).filter(q => this.form.value[q] === true)
    const answers = this.questions.filter(q => selection.includes(q.id.toString()));
    let sum = answers.reduce((accumulator, currentValue) => {
      return accumulator + currentValue.cost;
    }, 0);
    this.total = sum
  }
}
