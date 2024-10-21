import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from '../../environments/environment.development';

@Injectable({
  providedIn: 'root'
})
export class ApiCallService {

  constructor(private _httpClient:HttpClient) { }

  getAllMatches(){
      return this._httpClient.get(`${environment.apiUrl}/match/all`)
  }

  getLiveMatches(){
    // alert(this._httpClient.get(`${environment.apiUrl}/match/live`));
    return this._httpClient.get(`${environment.apiUrl}/match/live`)

  }

  getPointTable(){
    return this._httpClient.get(`${environment.apiUrl}/match/point-table`)

  }
}
