import { Component, OnInit } from '@angular/core';
import { AuthService } from './../../services/auth.service';
import { FormControl, Validators } from '@angular/forms';
import { FormGroup } from '@angular/forms';


@Component({
  selector: 'app-registring',
  templateUrl: './registring.component.html',
  styleUrls: ['../../../assets/css/dashlite.css','../../../assets/css/theme.css']
})
export class RegistringComponent implements OnInit {
  registrForm = new FormGroup({
    username: new FormControl(null,[ Validators.required,Validators.minLength(3), Validators.maxLength(25)]),
    firstname: new FormControl(null,[ Validators.required,Validators.minLength(3), Validators.maxLength(25)]),
    lastname: new FormControl(null,[ Validators.required,Validators.minLength(3), Validators.maxLength(25)]),
    email: new FormControl(null,[ Validators.required,Validators.email]),
    phone: new FormControl(null,[ Validators.required, Validators.pattern("^((\\+91-?)|0)?[0-9]{10}$")]),
    password: new FormControl(null,[Validators.required, Validators.minLength(5), Validators.maxLength(10)])

  
  });
  get registrFormm(){
    return this.registrForm.controls;
  }
  constructor(private authService: AuthService) { }

  ngOnInit(): void {
  }

  login(){
    this.authService.login(this.registrForm.value).subscribe(res => console.log("testing done!!!!"));

  }
}
