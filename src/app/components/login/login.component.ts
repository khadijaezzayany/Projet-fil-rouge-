import { AuthService } from './../../services/auth.service';
import { Component, OnInit } from '@angular/core';
import { FormControl, Validators } from '@angular/forms';
import { FormGroup } from '@angular/forms';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['../../../assets/css/dashlite.css','../../../assets/css/theme.css']
})
export class LoginComponent implements OnInit {


  

  loginForm = new FormGroup({
    username: new FormControl(null,[ Validators.required,Validators.minLength(3), Validators.maxLength(25)]),
    password: new FormControl(null,[Validators.required, Validators.minLength(5), Validators.maxLength(10)])

  
  });

  get loginFormm(){
    return this.loginForm.controls;
  }
  constructor(private authService: AuthService) { }

  ngOnInit(): void {
  }

  login(){
    this.authService.login(this.loginForm.value).subscribe(res => console.log("testing done!!!!"));

  }

}
