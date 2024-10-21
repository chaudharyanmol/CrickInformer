import { Component, OnInit } from '@angular/core';
import { ApiCallService } from '../../services/api-call.service';
import { error } from 'console';
import { CommonModule } from '@angular/common';
import { MatchCardComponent } from '../../components/match-card/match-card.component';

@Component({
  selector: 'app-live',
  standalone: true,
  imports: [MatchCardComponent],
  templateUrl: './live.component.html',
  styleUrl: './live.component.css'
})


export class LiveComponent implements OnInit {
  liveMatches:any
  jsonData:String | null=null ;
  constructor(private _api:ApiCallService){

  }
  ngOnInit(): void {
    this.loadLiveMatches();
  }

  private loadLiveMatches() {
    this._api.getLiveMatches().subscribe({
      next: data => {
        console.log(data);
        this.liveMatches=data;
        // this.jsonData=JSON.stringify(data,null,2);
      },
      error: error => {
        console.log(error);
      }
    });
  }
}
