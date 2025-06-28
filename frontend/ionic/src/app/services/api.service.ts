import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class ApiService {

  private backendUrl = 'http://localhost:8080'; // Update with AWS URL when deployed

  constructor(private http: HttpClient) {}

  requestRide(rideData: any): Observable<any> {
    return this.http.post(`${this.backendUrl}/rides`, rideData);
  }

  getAllDrivers(): Observable<any> {
    return this.http.get(`${this.backendUrl}/drivers`);
  }

  getAllRides(): Observable<any> {
    return this.http.get(`${this.backendUrl}/rides`);
  }
}
