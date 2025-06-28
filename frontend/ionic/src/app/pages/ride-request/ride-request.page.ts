import { Component } from '@angular/core';
import { ApiService } from '../../services/api.service';

@Component({
  selector: 'app-ride-request',
  templateUrl: './ride-request.page.html',
  styleUrls: ['./ride-request.page.scss'],
})
export class RideRequestPage {
  passengerName = '';
  pickupLocation = '';
  dropoffLocation = '';

  constructor(private apiService: ApiService) {}

  requestRide() {
    const rideData = {
      passengerName: this.passengerName,
      pickupLocation: this.pickupLocation,
      dropoffLocation: this.dropoffLocation
    };

    this.apiService.requestRide(rideData).subscribe(response => {
      console.log('Ride requested:', response);
      alert('Ride requested successfully!');
    }, error => {
      console.error('Error requesting ride:', error);
      alert('Error requesting ride');
    });
  }
}
