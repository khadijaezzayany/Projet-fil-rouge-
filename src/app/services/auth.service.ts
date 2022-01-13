import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  constructor(private http: HttpClient) { }

  login(data: {username: string, password: string}){
    return this.http.post("localhost:8000/api/auth/signin", data);
  }
}
